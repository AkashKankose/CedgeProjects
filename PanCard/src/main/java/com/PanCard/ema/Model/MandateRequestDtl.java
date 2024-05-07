package com.PanCard.ema.Model;

import org.springframework.stereotype.Component;

@Component
public class MandateRequestDtl {

	private String MandateReqDoc;

	public String getMandateReqDoc() {
		return MandateReqDoc;
	}

	public void setMandateReqDoc(String mandateReqDoc) {
		MandateReqDoc = mandateReqDoc;
	}

	@Override
	public String toString() {
		return "MandateRequestDtl [MandateReqDoc=" + MandateReqDoc + "]";
	}

	public MandateRequestDtl(String mandateReqDoc) {
		super();
		MandateReqDoc = mandateReqDoc;
	}

	public MandateRequestDtl() {
		super();
	}
	
}
