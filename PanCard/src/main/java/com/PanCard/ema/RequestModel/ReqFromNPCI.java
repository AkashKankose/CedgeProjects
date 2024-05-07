package com.PanCard.ema.RequestModel;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.PanCard.ema.Model.MandateAuthDtls;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Component
public class ReqFromNPCI {

	@JsonProperty("mandateAuthDtls")
	@NotNull(message = "mandateAuthDtls can not be null..")
	@NotBlank(message = "mandateAuthDtls can not be Blank..")
	private MandateAuthDtls mandateAuthDtls;

	public MandateAuthDtls getMandateAuthDtls() {
		return mandateAuthDtls;
	}

	public void setMandateAuthDtls(MandateAuthDtls mandateAuthDtls) {
		this.mandateAuthDtls = mandateAuthDtls;
	}

	@Override
	public String toString() {
		return "ReqFromNPCI [mandateAuthDtls=" + mandateAuthDtls + "]";
	}

	public ReqFromNPCI(
			@NotNull(message = "mandateAuthDtls can not be null..") @NotBlank(message = "mandateAuthDtls can not be Blank..") 
			MandateAuthDtls mandateAuthDtls) {
		super();
		this.mandateAuthDtls = mandateAuthDtls;
	}

	public ReqFromNPCI() {
		super();
	}
	
}
