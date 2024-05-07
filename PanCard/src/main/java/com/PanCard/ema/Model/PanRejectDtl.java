package com.PanCard.ema.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class PanRejectDtl {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String ReasonCode;

	public String getReasonCode() {
		return ReasonCode;
	}

	public void setReasonCode(String reasonCode) {
		ReasonCode = reasonCode;
	}

	@Override
	public String toString() {
		return "PanRejectDtl [ReasonCode=" + ReasonCode + "]";
	}

	public PanRejectDtl(String reasonCode) {
		super();
		ReasonCode = reasonCode;
	}

	public PanRejectDtl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
