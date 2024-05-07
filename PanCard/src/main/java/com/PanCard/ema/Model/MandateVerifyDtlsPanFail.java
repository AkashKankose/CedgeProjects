package com.PanCard.ema.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MandateVerifyDtlsPanFail {
	
	 @JsonProperty("transactionID")
//	 @JsonInclude(JsonInclude.Include.NON_NULL)
	 private String transactionID;
	 
	 @JsonProperty("mandateValidation")
//	 @JsonInclude(JsonInclude.Include.NON_NULL)
	 private String mandateValidation;
	 
	 @JsonProperty("panValidation")
//	 @JsonInclude(JsonInclude.Include.NON_NULL)
	 private String panValidation;
	 
	 @JsonProperty("mandateResponseDtl")
	 @JsonInclude(JsonInclude.Include.NON_NULL)
	 private MandateResponseDtl mandateResponseDtl;
	 
	 @JsonProperty("mandateRejectDtl")
	 @JsonInclude(JsonInclude.Include.NON_NULL)
	 private MandateRejectDtl mandateRejectDtl;
	 
	 @JsonProperty("panRejectDtl")
	 @JsonInclude(JsonInclude.Include.NON_NULL)
	 private PanRejectDtl panRejectDtl;
	 
	 @JsonProperty("panVerifyDtl")
	 @JsonInclude(JsonInclude.Include.NON_NULL)
	 private PanVerifyDtl panVerifyDtl;

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getMandateValidation() {
		return mandateValidation;
	}

	public void setMandateValidation(String mandateValidation) {
		this.mandateValidation = mandateValidation;
	}

	public String getPanValidation() {
		return panValidation;
	}

	public void setPanValidation(String panValidation) {
		this.panValidation = panValidation;
	}

	public MandateResponseDtl getMandateResponseDtl() {
		return mandateResponseDtl;
	}

	public void setMandateResponseDtl(MandateResponseDtl mandateResponseDtl) {
		this.mandateResponseDtl = mandateResponseDtl;
	}

	public MandateRejectDtl getMandateRejectDtl() {
		return mandateRejectDtl;
	}

	public void setMandateRejectDtl(MandateRejectDtl mandateRejectDtl) {
		this.mandateRejectDtl = mandateRejectDtl;
	}

	public PanRejectDtl getPanRejectDtl() {
		return panRejectDtl;
	}

	public void setPanRejectDtl(PanRejectDtl panRejectDtl) {
		this.panRejectDtl = panRejectDtl;
	}

	public PanVerifyDtl getPanVerifyDtl() {
		return panVerifyDtl;
	}

	public void setPanVerifyDtl(PanVerifyDtl panVerifyDtl) {
		this.panVerifyDtl = panVerifyDtl;
	}

	@Override
	public String toString() {
		return "MandateVerifyDtlsPanFail [transactionID=" + transactionID + ", mandateValidation=" + mandateValidation
				+ ", panValidation=" + panValidation + ", mandateResponseDtl=" + mandateResponseDtl
				+ ", mandateRejectDtl=" + mandateRejectDtl + ", panRejectDtl=" + panRejectDtl + ", panVerifyDtl="
				+ panVerifyDtl + "]";
	}

	public MandateVerifyDtlsPanFail(String transactionID, String mandateValidation, String panValidation,
			MandateResponseDtl mandateResponseDtl, MandateRejectDtl mandateRejectDtl, PanRejectDtl panRejectDtl,
			PanVerifyDtl panVerifyDtl) {
		super();
		this.transactionID = transactionID;
		this.mandateValidation = mandateValidation;
		this.panValidation = panValidation;
		this.mandateResponseDtl = mandateResponseDtl;
		this.mandateRejectDtl = mandateRejectDtl;
		this.panRejectDtl = panRejectDtl;
		this.panVerifyDtl = panVerifyDtl;
	}

	public MandateVerifyDtlsPanFail() {
		super();
	}
	 
	 
	 
	
	 

}
