package com.PanCard.ema.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MandateResponseDtl {

//	@JsonProperty("ErrorDesc")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String accptRefNo;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String dbtrIfsc;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String dbtrAcctType;

	public String getAccptRefNo() {
		return accptRefNo;
	}

	public void setAccptRefNo(String accptRefNo) {
		this.accptRefNo = accptRefNo;
	}

	public String getDbtrIfsc() {
		return dbtrIfsc;
	}

	public void setDbtrIfsc(String dbtrIfsc) {
		this.dbtrIfsc = dbtrIfsc;
	}

	public String getDbtrAcctType() {
		return dbtrAcctType;
	}

	public void setDbtrAcctType(String dbtrAcctType) {
		this.dbtrAcctType = dbtrAcctType;
	}

	@Override
	public String toString() {
		return "MandateResponseDtl [accptRefNo=" + accptRefNo + ", dbtrIfsc=" + dbtrIfsc + ", dbtrAcctType="
				+ dbtrAcctType + "]";
	}

	public MandateResponseDtl(String accptRefNo, String dbtrIfsc, String dbtrAcctType) {
		super();
		this.accptRefNo = accptRefNo;
		this.dbtrIfsc = dbtrIfsc;
		this.dbtrAcctType = dbtrAcctType;
	}

	public MandateResponseDtl() {
		super();
	}
	
	
	
}
