package com.PanCard.ema.Model;
//
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Component
public class MandateAuthDtls {

	@NotNull(message = "transactionID can not be null..")
	@NotBlank(message = "transactionID can not be Blank..")
	private String transactionID;
	
	@NotNull(message = "mandateRequestDtl can not be null..")
	@NotBlank(message = "mandateRequestDtl can not be Blank..")
	@JsonProperty("mandateRequestDtl")
	private MandateRequestDtl mandateRequestDtl;
	
	@NotNull(message = "authMode can not be Null..")
	@NotBlank(message = "authMode can not be Blank..")
	@JsonProperty("authMode")
	private String authMode;
	
	@JsonProperty("panInfo")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private PanInfo panInfo;

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public MandateRequestDtl getMandateRequestDtl() {
		return mandateRequestDtl;
	}

	public void setMandateRequestDtl(MandateRequestDtl mandateRequestDtl) {
		this.mandateRequestDtl = mandateRequestDtl;
	}

	public String getAuthMode() {
		return authMode;
	}

	public void setAuthMode(String authMode) {
		this.authMode = authMode;
	}

	public PanInfo getPanInfo() {
		return panInfo;
	}

	public void setPanInfo(PanInfo panInfo) {
		this.panInfo = panInfo;
	}

	@Override
	public String toString() {
		return "MandateAuthDtls [transactionID=" + transactionID + ", mandateRequestDtl=" + mandateRequestDtl
				+ ", authMode=" + authMode + ", panInfo=" + panInfo + "]";
	}

	public MandateAuthDtls(
			@NotNull(message = "transactionID can not be null..") @NotBlank(message = "transactionID can not be Blank..") String transactionID,
			@NotNull(message = "mandateRequestDtl can not be null..") @NotBlank(message = "mandateRequestDtl can not be Blank..") MandateRequestDtl mandateRequestDtl,
			@NotNull(message = "authMode can not be Null..") @NotBlank(message = "authMode can not be Blank..") String authMode,
			PanInfo panInfo) {
		super();
		this.transactionID = transactionID;
		this.mandateRequestDtl = mandateRequestDtl;
		this.authMode = authMode;
		this.panInfo = panInfo;
	}

	public MandateAuthDtls() {
		super();
	}
	 
	
	
}
