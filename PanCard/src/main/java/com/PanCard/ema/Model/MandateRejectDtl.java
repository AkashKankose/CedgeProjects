package com.PanCard.ema.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonInclude;

public class MandateRejectDtl {
    @JsonProperty("ErrorCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorCode;

    @JsonProperty("ErrorDesc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorDesc;

    @JsonProperty("ReasonCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reasonCode;

    @JsonProperty("ReasonDesc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reasonDesc;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonDesc() {
		return reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	@Override
	public String toString() {
		return "MandateRejectDtl [errorCode=" + errorCode + ", errorDesc=" + errorDesc + ", reasonCode=" + reasonCode
				+ ", reasonDesc=" + reasonDesc + "]";
	}

	public MandateRejectDtl(String errorCode, String errorDesc, String reasonCode, String reasonDesc) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		this.reasonCode = reasonCode;
		this.reasonDesc = reasonDesc;
	}

	public MandateRejectDtl() {
		super();
	}

 


}