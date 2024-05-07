package com.PanCard.ema.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class PanVerifyDtl {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String successCode;

	public String getSuccessCode() {
		return successCode;
	}

	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}

	@Override
	public String toString() {
		return "PanVerifyDtl [successCode=" + successCode + "]";
	}

	public PanVerifyDtl(String successCode) {
		super();
		this.successCode = successCode;
	}

	public PanVerifyDtl() {
		super();
	}
	
	
}
