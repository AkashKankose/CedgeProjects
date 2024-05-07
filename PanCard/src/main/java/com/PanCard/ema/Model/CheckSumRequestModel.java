package com.PanCard.ema.Model;

public class CheckSumRequestModel {
	private String debtorAccNo;
	private String frstColltnDt;
	private String fnlColltnDt;
	private String colltnAmt;
	private String maxAmt;
	
	
	
	public CheckSumRequestModel(String debtorAccNo, String frstColltnDt, String fnlColltnDt, String colltnAmt,
			String maxAmt) {
		super();
		this.debtorAccNo = debtorAccNo;
		this.frstColltnDt = frstColltnDt;
		this.fnlColltnDt = fnlColltnDt;
		this.colltnAmt = colltnAmt;
		this.maxAmt = maxAmt;
	}
	public String getDebtorAccNo() {
		return debtorAccNo;
	}
	public void setDebtorAccNo(String debtorAccNo) {
		this.debtorAccNo = debtorAccNo;
	}
	public String getFrstColltnDt() {
		return frstColltnDt;
	}
	public void setFrstColltnDt(String frstColltnDt) {
		this.frstColltnDt = frstColltnDt;
	}
	public String getFnlColltnDt() {
		return fnlColltnDt;
	}
	public void setFnlColltnDt(String fnlColltnDt) {
		this.fnlColltnDt = fnlColltnDt;
	}
	public String getColltnAmt() {
		return colltnAmt;
	}
	public void setColltnAmt(String colltnAmt) {
		this.colltnAmt = colltnAmt;
	}
	public String getMaxAmt() {
		return maxAmt;
	}
	public void setMaxAmt(String maxAmt) {
		this.maxAmt = maxAmt;
	}
	
	

}
