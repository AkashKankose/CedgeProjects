package com.PanCard.ema.Controller;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PanCard.ema.DbEntity.Eman_panconfig;
import com.PanCard.ema.RequestModel.ReqFromNPCI;
import com.PanCard.ema.ResponseModel.FinalResponse;
import com.PanCard.ema.Service.PanService;

//import jakarta.validation.Valid;

@RestController
public class PanVerifyController {

    private final static Logger log = Logger.getLogger(PanVerifyController.class);

    @Autowired
    public PanService ser;

    @PostMapping(value = "verifyPanCard/{bankname}")
    public ResponseEntity<FinalResponse> verifyPanCard(@Valid @RequestBody ReqFromNPCI request,
                                                       @PathVariable String bankname, BindingResult bindingResult) throws Exception {
        log.info("inside verifyPanCard method...");

        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException("Invalid request parameters...");
        }
        log.info("Received Request..");
        log.info("Transaction Id >>" + request.getMandateAuthDtls().getTransactionID());
        log.info("Encrypted and encoded mandateRequestDoc >>" + request.getMandateAuthDtls().getMandateRequestDtl().getMandateReqDoc());
        log.info("Auth Mode >>" + request.getMandateAuthDtls().getAuthMode());
        log.info("Pan Number Encrypted >>" + request.getMandateAuthDtls().getPanInfo().getPan());

        try {
            ResponseEntity<FinalResponse> responseEntity = ser.processRequest(request, bankname);
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("Response from bank", bankname);
            responseEntity.getHeaders().addAll(responseHeaders); // Add the custom headers to the ResponseEntity
            return responseEntity;
        } catch (Exception e) {
            log.error("Exception occurred...", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


	
	@PostMapping(value = "/save")
	public Eman_panconfig saveController(@Valid @RequestBody Eman_panconfig eman)
	{
//		System.out.println("Data="+eman.getBANKCODE());
		return ser.saveService(eman);
	}
//	
	@GetMapping("/find/{bankcode}")
	public Eman_panconfig findBYBankcode(@PathVariable String bankcode)
	{
		return ser.findByBankcode(bankcode);
	}
}
