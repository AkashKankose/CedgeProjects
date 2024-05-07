package com.PanCard.ema.ResponseModel;

import com.PanCard.ema.Model.MandateVerifyDtlsPanFail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FinalResponse {

	@JsonProperty("mandateVerifyDtls")
	@JsonInclude(JsonInclude.Include.NON_NULL)
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
		return "FinalResponse [mandateVerifyDtls=" + mandateVerifyDtls + ", signature=" + signature + ", checkSumVal="
				+ checkSumVal + "]";
	}
	public FinalResponse(MandateVerifyDtlsPanFail mandateVerifyDtls, String signature, String checkSumVal) {
		super();
		this.mandateVerifyDtls = mandateVerifyDtls;
		this.signature = signature;
		this.checkSumVal = checkSumVal;
	}
	public FinalResponse() {
		super();
	}
	
	
	
	
}
