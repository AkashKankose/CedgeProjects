package com.EmanSponser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustDetails_Banker {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String loan_Number;
	private String name;
	private String mobile;
	private String email;
	private String loan_amt;
	private String mandate_type;//not mentioned in frontend
	private String debit_Account_number;
	private String confirm_debit_account;
	private String account_type;//not mentioned.....
	private String ifsc;
	private String collection_amt;
	private String max_coll_amt;
	private String frequesncy;//not mentioned
	private String coll_first_date;
	private String coll_last_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoan_Number() {
		return loan_Number;
	}
	public void setLoan_Number(String loan_Number) {
		this.loan_Number = loan_Number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoan_amt() {
		return loan_amt;
	}
	public void setLoan_amt(String loan_amt) {
		this.loan_amt = loan_amt;
	}
	public String getMandate_type() {
		return mandate_type;
	}
	public void setMandate_type(String mandate_type) {
		this.mandate_type = mandate_type;
	}
	public String getDebit_Account_number() {
		return debit_Account_number;
	}
	public void setDebit_Account_number(String debit_Account_number) {
		this.debit_Account_number = debit_Account_number;
	}
	public String getConfirm_debit_account() {
		return confirm_debit_account;
	}
	public void setConfirm_debit_account(String confirm_debit_account) {
		this.confirm_debit_account = confirm_debit_account;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getCollection_amt() {
		return collection_amt;
	}
	public void setCollection_amt(String collection_amt) {
		this.collection_amt = collection_amt;
	}
	public String getMax_coll_amt() {
		return max_coll_amt;
	}
	public void setMax_coll_amt(String max_coll_amt) {
		this.max_coll_amt = max_coll_amt;
	}
	public String getFrequesncy() {
		return frequesncy;
	}
	public void setFrequesncy(String frequesncy) {
		this.frequesncy = frequesncy;
	}
	public String getColl_first_date() {
		return coll_first_date;
	}
	public void setColl_first_date(String coll_first_date) {
		this.coll_first_date = coll_first_date;
	}
	public String getColl_last_date() {
		return coll_last_date;
	}
	public void setColl_last_date(String coll_last_date) {
		this.coll_last_date = coll_last_date;
	}
	@Override
	public String toString() {
		return "CustDetails_Banker [id=" + id + ", loan_Number=" + loan_Number + ", name=" + name + ", mobile=" + mobile
				+ ", email=" + email + ", loan_amt=" + loan_amt + ", mandate_type=" + mandate_type
				+ ", debit_Account_number=" + debit_Account_number + ", confirm_debit_account=" + confirm_debit_account
				+ ", account_type=" + account_type + ", ifsc=" + ifsc + ", collection_amt=" + collection_amt
				+ ", max_coll_amt=" + max_coll_amt + ", frequesncy=" + frequesncy + ", coll_first_date="
				+ coll_first_date + ", coll_last_date=" + coll_last_date + "]";
	}
	public CustDetails_Banker(int id, String loan_Number, String name, String mobile, String email, String loan_amt,
			String mandate_type, String debit_Account_number, String confirm_debit_account, String account_type,
			String ifsc, String collection_amt, String max_coll_amt, String frequesncy, String coll_first_date,
			String coll_last_date) {
		super();
		this.id = id;
		this.loan_Number = loan_Number;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.loan_amt = loan_amt;
		this.mandate_type = mandate_type;
		this.debit_Account_number = debit_Account_number;
		this.confirm_debit_account = confirm_debit_account;
		this.account_type = account_type;
		this.ifsc = ifsc;
		this.collection_amt = collection_amt;
		this.max_coll_amt = max_coll_amt;
		this.frequesncy = frequesncy;
		this.coll_first_date = coll_first_date;
		this.coll_last_date = coll_last_date;
	}
	public CustDetails_Banker() {
		super();
	}
	
	
}
