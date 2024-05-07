package com.PanCard.ema.Model;

import org.springframework.stereotype.Component;

@Component
public class XmlRequestModel {
	private String NPCI_RefMsgId;
	private String CreDtTm;
	private String Id;
	private String UtilCode;
	private String CatCode;
	private String Name;
	private String Spn_Bnk_Nm;
	private String CatDesc;
	private String MndtReqId;
	private String MndtId;
	private String Mndt_Type;
	private String Schm_Nm;
	private String SeqTp;
	private String Frqcy;
	private String FrstColltnDt;
	private String FnlColltnDt;
	private String ColltnAmt;
	private String MaxAmt;
	private String Debtor_Nm;
	private String Debtor_Acc_No;
	private String Acct_Type;
	private String Cons_Ref_No;
	private String Phone;
	
	private String ISACCEPT;
	private String APRV_DCLN;
	private String EMST;
	private String TRANSACTION_ID;
	private String OTPCOUNT;
	private String IS_SMS_SENT;
	
	private String bank_code;
	private String Mobile;
	private  String Email;
	private String Pan;
	private String Creditor_Nm;
	private String Creditor_AccNo;
	private String MmbId;
	
	private String Npci_cert;
	private String Bank_cert;
	private String Bank_pass;
	private String Pri_key;
	private String Decry_sts;
	public String getNPCI_RefMsgId() {
		return NPCI_RefMsgId;
	}
	public void setNPCI_RefMsgId(String nPCI_RefMsgId) {
		NPCI_RefMsgId = nPCI_RefMsgId;
	}
	public String getCreDtTm() {
		return CreDtTm;
	}
	public void setCreDtTm(String creDtTm) {
		CreDtTm = creDtTm;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getUtilCode() {
		return UtilCode;
	}
	public void setUtilCode(String utilCode) {
		UtilCode = utilCode;
	}
	public String getCatCode() {
		return CatCode;
	}
	public void setCatCode(String catCode) {
		CatCode = catCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSpn_Bnk_Nm() {
		return Spn_Bnk_Nm;
	}
	public void setSpn_Bnk_Nm(String spn_Bnk_Nm) {
		Spn_Bnk_Nm = spn_Bnk_Nm;
	}
	public String getCatDesc() {
		return CatDesc;
	}
	public void setCatDesc(String catDesc) {
		CatDesc = catDesc;
	}
	public String getMndtReqId() {
		return MndtReqId;
	}
	public void setMndtReqId(String mndtReqId) {
		MndtReqId = mndtReqId;
	}
	public String getMndtId() {
		return MndtId;
	}
	public void setMndtId(String mndtId) {
		MndtId = mndtId;
	}
	public String getMndt_Type() {
		return Mndt_Type;
	}
	public void setMndt_Type(String mndt_Type) {
		Mndt_Type = mndt_Type;
	}
	public String getSchm_Nm() {
		return Schm_Nm;
	}
	public void setSchm_Nm(String schm_Nm) {
		Schm_Nm = schm_Nm;
	}
	public String getSeqTp() {
		return SeqTp;
	}
	public void setSeqTp(String seqTp) {
		SeqTp = seqTp;
	}
	public String getFrqcy() {
		return Frqcy;
	}
	public void setFrqcy(String frqcy) {
		Frqcy = frqcy;
	}
	public String getFrstColltnDt() {
		return FrstColltnDt;
	}
	public void setFrstColltnDt(String frstColltnDt) {
		FrstColltnDt = frstColltnDt;
	}
	public String getFnlColltnDt() {
		return FnlColltnDt;
	}
	public void setFnlColltnDt(String fnlColltnDt) {
		FnlColltnDt = fnlColltnDt;
	}
	public String getColltnAmt() {
		return ColltnAmt;
	}
	public void setColltnAmt(String colltnAmt) {
		ColltnAmt = colltnAmt;
	}
	public String getMaxAmt() {
		return MaxAmt;
	}
	public void setMaxAmt(String maxAmt) {
		MaxAmt = maxAmt;
	}
	public String getDebtor_Nm() {
		return Debtor_Nm;
	}
	public void setDebtor_Nm(String debtor_Nm) {
		Debtor_Nm = debtor_Nm;
	}
	public String getDebtor_Acc_No() {
		return Debtor_Acc_No;
	}
	public void setDebtor_Acc_No(String debtor_Acc_No) {
		Debtor_Acc_No = debtor_Acc_No;
	}
	public String getAcct_Type() {
		return Acct_Type;
	}
	public void setAcct_Type(String acct_Type) {
		Acct_Type = acct_Type;
	}
	public String getCons_Ref_No() {
		return Cons_Ref_No;
	}
	public void setCons_Ref_No(String cons_Ref_No) {
		Cons_Ref_No = cons_Ref_No;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getISACCEPT() {
		return ISACCEPT;
	}
	public void setISACCEPT(String iSACCEPT) {
		ISACCEPT = iSACCEPT;
	}
	public String getAPRV_DCLN() {
		return APRV_DCLN;
	}
	public void setAPRV_DCLN(String aPRV_DCLN) {
		APRV_DCLN = aPRV_DCLN;
	}
	public String getEMST() {
		return EMST;
	}
	public void setEMST(String eMST) {
		EMST = eMST;
	}
	public String getTRANSACTION_ID() {
		return TRANSACTION_ID;
	}
	public void setTRANSACTION_ID(String tRANSACTION_ID) {
		TRANSACTION_ID = tRANSACTION_ID;
	}
	public String getOTPCOUNT() {
		return OTPCOUNT;
	}
	public void setOTPCOUNT(String oTPCOUNT) {
		OTPCOUNT = oTPCOUNT;
	}
	public String getIS_SMS_SENT() {
		return IS_SMS_SENT;
	}
	public void setIS_SMS_SENT(String iS_SMS_SENT) {
		IS_SMS_SENT = iS_SMS_SENT;
	}
	public String getBank_code() {
		return bank_code;
	}
	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPan() {
		return Pan;
	}
	public void setPan(String pan) {
		Pan = pan;
	}
	public String getCreditor_Nm() {
		return Creditor_Nm;
	}
	public void setCreditor_Nm(String creditor_Nm) {
		Creditor_Nm = creditor_Nm;
	}
	public String getCreditor_AccNo() {
		return Creditor_AccNo;
	}
	public void setCreditor_AccNo(String creditor_AccNo) {
		Creditor_AccNo = creditor_AccNo;
	}
	public String getMmbId() {
		return MmbId;
	}
	public void setMmbId(String mmbId) {
		MmbId = mmbId;
	}
	public String getNpci_cert() {
		return Npci_cert;
	}
	public void setNpci_cert(String npci_cert) {
		Npci_cert = npci_cert;
	}
	public String getBank_cert() {
		return Bank_cert;
	}
	public void setBank_cert(String bank_cert) {
		Bank_cert = bank_cert;
	}
	public String getBank_pass() {
		return Bank_pass;
	}
	public void setBank_pass(String bank_pass) {
		Bank_pass = bank_pass;
	}
	public String getPri_key() {
		return Pri_key;
	}
	public void setPri_key(String pri_key) {
		Pri_key = pri_key;
	}
	public String getDecry_sts() {
		return Decry_sts;
	}
	public void setDecry_sts(String decry_sts) {
		Decry_sts = decry_sts;
	}
	@Override
	public String toString() {
		return "XmlRequestModel [NPCI_RefMsgId=" + NPCI_RefMsgId + ", CreDtTm=" + CreDtTm + ", Id=" + Id + ", UtilCode="
				+ UtilCode + ", CatCode=" + CatCode + ", Name=" + Name + ", Spn_Bnk_Nm=" + Spn_Bnk_Nm + ", CatDesc="
				+ CatDesc + ", MndtReqId=" + MndtReqId + ", MndtId=" + MndtId + ", Mndt_Type=" + Mndt_Type
				+ ", Schm_Nm=" + Schm_Nm + ", SeqTp=" + SeqTp + ", Frqcy=" + Frqcy + ", FrstColltnDt=" + FrstColltnDt
				+ ", FnlColltnDt=" + FnlColltnDt + ", ColltnAmt=" + ColltnAmt + ", MaxAmt=" + MaxAmt + ", Debtor_Nm="
				+ Debtor_Nm + ", Debtor_Acc_No=" + Debtor_Acc_No + ", Acct_Type=" + Acct_Type + ", Cons_Ref_No="
				+ Cons_Ref_No + ", Phone=" + Phone + ", ISACCEPT=" + ISACCEPT + ", APRV_DCLN=" + APRV_DCLN + ", EMST="
				+ EMST + ", TRANSACTION_ID=" + TRANSACTION_ID + ", OTPCOUNT=" + OTPCOUNT + ", IS_SMS_SENT="
				+ IS_SMS_SENT + ", bank_code=" + bank_code + ", Mobile=" + Mobile + ", Email=" + Email + ", Pan=" + Pan
				+ ", Creditor_Nm=" + Creditor_Nm + ", Creditor_AccNo=" + Creditor_AccNo + ", MmbId=" + MmbId
				+ ", Npci_cert=" + Npci_cert + ", Bank_cert=" + Bank_cert + ", Bank_pass=" + Bank_pass + ", Pri_key="
				+ Pri_key + ", Decry_sts=" + Decry_sts + "]";
	}
	public XmlRequestModel(String nPCI_RefMsgId, String creDtTm, String id, String utilCode, String catCode,
			String name, String spn_Bnk_Nm, String catDesc, String mndtReqId, String mndtId, String mndt_Type,
			String schm_Nm, String seqTp, String frqcy, String frstColltnDt, String fnlColltnDt, String colltnAmt,
			String maxAmt, String debtor_Nm, String debtor_Acc_No, String acct_Type, String cons_Ref_No, String phone,
			String iSACCEPT, String aPRV_DCLN, String eMST, String tRANSACTION_ID, String oTPCOUNT, String iS_SMS_SENT,
			String bank_code, String mobile, String email, String pan, String creditor_Nm, String creditor_AccNo,
			String mmbId, String npci_cert, String bank_cert, String bank_pass, String pri_key, String decry_sts) {
		super();
		NPCI_RefMsgId = nPCI_RefMsgId;
		CreDtTm = creDtTm;
		Id = id;
		UtilCode = utilCode;
		CatCode = catCode;
		Name = name;
		Spn_Bnk_Nm = spn_Bnk_Nm;
		CatDesc = catDesc;
		MndtReqId = mndtReqId;
		MndtId = mndtId;
		Mndt_Type = mndt_Type;
		Schm_Nm = schm_Nm;
		SeqTp = seqTp;
		Frqcy = frqcy;
		FrstColltnDt = frstColltnDt;
		FnlColltnDt = fnlColltnDt;
		ColltnAmt = colltnAmt;
		MaxAmt = maxAmt;
		Debtor_Nm = debtor_Nm;
		Debtor_Acc_No = debtor_Acc_No;
		Acct_Type = acct_Type;
		Cons_Ref_No = cons_Ref_No;
		Phone = phone;
		ISACCEPT = iSACCEPT;
		APRV_DCLN = aPRV_DCLN;
		EMST = eMST;
		TRANSACTION_ID = tRANSACTION_ID;
		OTPCOUNT = oTPCOUNT;
		IS_SMS_SENT = iS_SMS_SENT;
		this.bank_code = bank_code;
		Mobile = mobile;
		Email = email;
		Pan = pan;
		Creditor_Nm = creditor_Nm;
		Creditor_AccNo = creditor_AccNo;
		MmbId = mmbId;
		Npci_cert = npci_cert;
		Bank_cert = bank_cert;
		Bank_pass = bank_pass;
		Pri_key = pri_key;
		Decry_sts = decry_sts;
	}
	public XmlRequestModel() {
		super();
	}
	
		
}