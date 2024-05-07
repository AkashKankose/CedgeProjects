package com.PanCard.ema.Model;

public class MandateVerifyBuisnessFailResp implements Response{
	
	private MandateVerifyDtlsPanFail mandateVerifyDtls;
	private String signature;
	private String checkSumVal;
	public MandateVerifyDtlsPanFail getMandateVerifyDtls() {
		return mandateVerifyDtls;
	}
	public void setMandateVerifyDtls(MandateVerifyDtlsPanFail mandateVerifyDtls) {
		this.mandateVerifyDtls = mandateVerifyDtls;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getCheckSumVal() {
		return checkSumVal;
	}
	public void setCheckSumVal(String checkSumVal) {
		this.checkSumVal = checkSumVal;
	}
	@Override
	public String toString() {
		return "MandateVerifyBuisnessFailResp [mandateVerifyDtls=" + mandateVerifyDtls + ", signature=" + signature
				+ ", checkSumVal=" + checkSumVal + "]";
	}
	public MandateVerifyBuisnessFailResp(MandateVerifyDtlsPanFail mandateVerifyDtls, String signature,
			String checkSumVal) {
		super();
		this.mandateVerifyDtls = mandateVerifyDtls;
		this.signature = signature;
		this.checkSumVal = checkSumVal;
	}
	public MandateVerifyBuisnessFailResp() {
		super();
	}
	
	

}
