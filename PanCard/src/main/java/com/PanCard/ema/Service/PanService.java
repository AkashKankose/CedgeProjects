package com.PanCard.ema.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.validation.ValidationException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.PanCard.ema.DbEntity.Eman_panconfig;
import com.PanCard.ema.Model.MandateRejectDtl;
import com.PanCard.ema.Model.MandateVerifyDtlsPanFail;
import com.PanCard.ema.Model.PanRejectDtl;
import com.PanCard.ema.Model.PanVerifyDtl;
import com.PanCard.ema.Repository.Eman_Panconfig_Repo;
import com.PanCard.ema.RequestModel.ReqFromNPCI;
import com.PanCard.ema.ResponseModel.FinalResponse;
import com.PanCard.ema.Util.CheckSumUtil;
import com.PanCard.ema.Util.CryptograpyUtil;
import com.PanCard.ema.Util.XmlValidatior;
//import com.cedge.adhaarcardapi.util.CheckSumUtil;
import com.PanCard.ema.Util.JWSTokenGenerator;

@Service
public class PanService {

	private final static Logger logger = Logger.getLogger(PanService.class);

	@Autowired
	private Eman_Panconfig_Repo repo;

	@Autowired
	private XmlValidatior xmlvalidate;

	@Autowired
	private CryptograpyUtil enc;

	@Autowired
	private JWSTokenGenerator tokenUtil;

	@Autowired
	private CheckSumUtil checksumUtil;

//	
	public ResponseEntity<FinalResponse> processRequest(ReqFromNPCI request, String bankcode) {

		Eman_panconfig bankDetails;
		String npciCert = "";
		String bankcert = "";
		String bankPass = "";
		
		//getting details from db
		try {
			bankDetails = findByBankcode(bankcode);

			npciCert = bankDetails.getRootpath() + bankDetails.getNpcikey();
			bankcert = bankDetails.getRootpath() + bankDetails.getCertname();
			bankPass = bankDetails.getCertpass();
		} catch (DataAccessException e) {
			logger.error("Database access error while fetching bank details", e);
			return new ResponseEntity<>(technicalErrorResponse(request, npciCert,bankcert, bankPass), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("Npci public certificate: " + npciCert + " Bank certificate: " + bankcert + " Bank password: "
				+ bankPass);

		//decoding the mandateReqDoc
		String decodeddoc;
		try {
			decodeddoc = URLDecoder.decode(request.getMandateAuthDtls().getMandateRequestDtl().getMandateReqDoc(),
					"UTF-8");
		} catch (UnsupportedEncodingException e) {
			logger.error("Error decoding the document", e);
			return new ResponseEntity<>(unableToParseUnsign(request, npciCert,bankcert, bankPass), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		 // Validate the decoded document
        boolean mdtvalstatus;
        try {
            mdtvalstatus = xmlvalidate.validateRequestDoc(decodeddoc, npciCert);
        } catch (ValidationException e) {
            logger.error("Validation error", e);
			return new ResponseEntity<>(unableToParseUnsign(request, npciCert,bankcert, bankPass), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        //if mdtvalstatus is false
        if (!mdtvalstatus) {
            logger.info("Signature validation failed: " + bankcode);
			return new ResponseEntity<>(unableToParseUnsign(request, npciCert,bankcert, bankPass), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        FinalResponse response = new FinalResponse();

		// Populate response object if necessary
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	public FinalResponse technicalErrorResponse(ReqFromNPCI request, String npciCert,String bankcert,String bankPass) {
		MandateVerifyDtlsPanFail mandateVerifyDtls = new MandateVerifyDtlsPanFail();
		mandateVerifyDtls.setTransactionID(request.getMandateAuthDtls().getTransactionID());
		mandateVerifyDtls.setMandateValidation(enc.encryptText("failure", npciCert));
		mandateVerifyDtls.setPanValidation(enc.encryptText("none", npciCert));
		mandateVerifyDtls.setMandateResponseDtl(null);
		
		MandateRejectDtl mandateRejectDtl = new MandateRejectDtl();
		mandateRejectDtl.setErrorCode(null);
		mandateRejectDtl.setErrorDesc(null);
		mandateRejectDtl.setReasonCode(enc.encryptText("AP29", npciCert));
		mandateRejectDtl.setReasonDesc(enc.encryptText("Technical errors or connectivity issues at bankend", npciCert));
		mandateVerifyDtls.setMandateRejectDtl(mandateRejectDtl);
		
		PanRejectDtl panRejectDtl = new PanRejectDtl();
		panRejectDtl.setReasonCode(null);
		mandateVerifyDtls.setPanRejectDtl(panRejectDtl);
		
		PanVerifyDtl panVerifyDtl = new PanVerifyDtl();
		panVerifyDtl.setSuccessCode(null);
		mandateVerifyDtls.setPanVerifyDtl(panVerifyDtl);

		
		String sign;
        String checksum;
        try {
            sign = tokenUtil.genrateToken(mandateVerifyDtls, bankcert, bankPass);
            checksum = URLEncoder.encode(checksumUtil.signatureValidationFailed(mandateVerifyDtls, sign), "UTF-8");
            checksum = enc.encryptText(checksum, npciCert);
        } catch (Exception e) {
            logger.error("Error generating signature/checksum", e);
            sign = "signature error";
            checksum = "checksum error";
        }
		
		FinalResponse f1 = new FinalResponse();
		f1.setMandateVerifyDtls(mandateVerifyDtls);
		f1.setCheckSumVal(checksum);
		f1.setSignature(sign);
		   
		return f1;
	}

	public FinalResponse unableToParseUnsign(ReqFromNPCI request, String npciCert,String bankcert,String bankPass) {
		MandateVerifyDtlsPanFail mandateVerifyDtls = new MandateVerifyDtlsPanFail();
		mandateVerifyDtls.setTransactionID(request.getMandateAuthDtls().getTransactionID());
		mandateVerifyDtls.setMandateValidation(enc.encryptText("failure", npciCert));
		mandateVerifyDtls.setPanValidation(enc.encryptText("none", npciCert));
		mandateVerifyDtls.setMandateResponseDtl(null);
		MandateRejectDtl mandateRejectDtl = new MandateRejectDtl();
		mandateRejectDtl.setErrorCode(enc.encryptText("AP29", npciCert));
		mandateRejectDtl.setErrorDesc(enc.encryptText("Technical errors or connectivity issues at bankend", npciCert));
		mandateRejectDtl.setReasonCode(null);
		mandateRejectDtl.setReasonDesc(null);
		mandateVerifyDtls.setMandateRejectDtl(mandateRejectDtl);
		PanRejectDtl panRejectDtl = new PanRejectDtl();
		panRejectDtl.setReasonCode(null);
		mandateVerifyDtls.setPanRejectDtl(panRejectDtl);
		PanVerifyDtl panVerifyDtl = new PanVerifyDtl();
		panVerifyDtl.setSuccessCode(null);
		mandateVerifyDtls.setPanVerifyDtl(panVerifyDtl);

		String sign;
        String checksum;
        try {
            sign = tokenUtil.genrateToken(mandateVerifyDtls, bankcert, bankPass);
            checksum = URLEncoder.encode(checksumUtil.signatureValidationFailed(mandateVerifyDtls, sign), "UTF-8");
            checksum = enc.encryptText(checksum, npciCert);
        } catch (Exception e) {
            logger.error("Error generating signature/checksum", e);
            sign = "signature error";
            checksum = "checksum error";
        }
		
		FinalResponse f1 = new FinalResponse();
		f1.setMandateVerifyDtls(mandateVerifyDtls);
		f1.setCheckSumVal(checksum);
		f1.setSignature(sign);
		   
		return f1;
	}

	public Eman_panconfig saveService(Eman_panconfig eman_pan) {
		return repo.save(eman_pan);
	}

//	
	public Eman_panconfig findByBankcode(String bankcode) {
		return repo.findBybankcode(bankcode);
	}

}
