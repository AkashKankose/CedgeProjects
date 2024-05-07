package com.PanCard.ema.Model;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Component
public class PanInfo {

	@NotNull(message = "pan can not be Null..")
	@NotBlank(message = "pan can not be Blank")
	private String pan;

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "PanInfo [pan=" + pan + "]";
	}

	public PanInfo(String pan) {
		super();
		this.pan = pan;
	}

	public PanInfo() {
		super();
	}
	
}
