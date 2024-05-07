package com.PanCard.ema.DbEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="eman_panconfig")
public class Eman_panconfig {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int panid;
	
	@NotNull
	@NotBlank
	private String bankcode;

	@NotNull
	@NotBlank
	private String bankname;

	@NotNull
	@NotBlank
	private String certname;

	@NotNull
	@NotBlank	
	private String certpass;

	@NotNull
	@NotBlank	
	private String rootpath;

  	@NotNull
  	@NotBlank
	private String npcikey;

  	@NotNull
  	@NotBlank
	private String cbsdbip;

  	@NotNull
  	@NotBlank
	private String cbsdbport;

  	@NotNull
  	@NotBlank
	private String cbssid;

  	@NotNull
  	@NotBlank
	private String cbsuname;

  	@NotNull
  	@NotBlank
	private String cbspass;

  	@NotNull
  	@NotBlank
	private String smstemplate;

  	@NotNull
  	@NotBlank
	private String senderid;

  	@NotNull
  	@NotBlank
	private String smsuname;

  	@NotNull
  	@NotBlank
	private String smspass;

  	@NotNull
  	@NotBlank
	private String home_branch_ifsc;

  	@NotNull
  	@NotBlank
	private String bankregion;

	public int getPanid() {
		return panid;
	}

	public void setPanid(int panid) {
		this.panid = panid;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getCertname() {
		return certname;
	}

	public void setCertname(String certname) {
		this.certname = certname;
	}

	public String getCertpass() {
		return certpass;
	}

	public void setCertpass(String certpass) {
		this.certpass = certpass;
	}

	public String getRootpath() {
		return rootpath;
	}

	public void setRootpath(String rootpath) {
		this.rootpath = rootpath;
	}

	public String getNpcikey() {
		return npcikey;
	}

	public void setNpcikey(String npcikey) {
		this.npcikey = npcikey;
	}

	public String getCbsdbip() {
		return cbsdbip;
	}

	public void setCbsdbip(String cbsdbip) {
		this.cbsdbip = cbsdbip;
	}

	public String getCbsdbport() {
		return cbsdbport;
	}

	public void setCbsdbport(String cbsdbport) {
		this.cbsdbport = cbsdbport;
	}

	public String getCbssid() {
		return cbssid;
	}

	public void setCbssid(String cbssid) {
		this.cbssid = cbssid;
	}

	public String getCbsuname() {
		return cbsuname;
	}

	public void setCbsuname(String cbsuname) {
		this.cbsuname = cbsuname;
	}

	public String getCbspass() {
		return cbspass;
	}

	public void setCbspass(String cbspass) {
		this.cbspass = cbspass;
	}

	public String getSmstemplate() {
		return smstemplate;
	}

	public void setSmstemplate(String smstemplate) {
		this.smstemplate = smstemplate;
	}

	public String getSenderid() {
		return senderid;
	}

	public void setSenderid(String senderid) {
		this.senderid = senderid;
	}

	public String getSmsuname() {
		return smsuname;
	}

	public void setSmsuname(String smsuname) {
		this.smsuname = smsuname;
	}

	public String getSmspass() {
		return smspass;
	}

	public void setSmspass(String smspass) {
		this.smspass = smspass;
	}

	public String getHome_branch_ifsc() {
		return home_branch_ifsc;
	}

	public void setHome_branch_ifsc(String home_branch_ifsc) {
		this.home_branch_ifsc = home_branch_ifsc;
	}

	public String getBankregion() {
		return bankregion;
	}

	public void setBankregion(String bankregion) {
		this.bankregion = bankregion;
	}

	@Override
	public String toString() {
		return "Eman_panconfig [panid=" + panid + ", bankcode=" + bankcode + ", bankname=" + bankname + ", certname="
				+ certname + ", certpass=" + certpass + ", rootpath=" + rootpath + ", npcikey=" + npcikey + ", cbsdbip="
				+ cbsdbip + ", cbsdbport=" + cbsdbport + ", cbssid=" + cbssid + ", cbsuname=" + cbsuname + ", cbspass="
				+ cbspass + ", smstemplate=" + smstemplate + ", senderid=" + senderid + ", smsuname=" + smsuname
				+ ", smspass=" + smspass + ", home_branch_ifsc=" + home_branch_ifsc + ", bankregion=" + bankregion
				+ "]";
	}

	public Eman_panconfig(int panid, String bankcode, String bankname, String certname, String certpass,
			String rootpath, String npcikey, String cbsdbip, String cbsdbport, String cbssid, String cbsuname,
			String cbspass, String smstemplate, String senderid, String smsuname, String smspass,
			String home_branch_ifsc, String bankregion) {
		super();
		this.panid = panid;
		this.bankcode = bankcode;
		this.bankname = bankname;
		this.certname = certname;
		this.certpass = certpass;
		this.rootpath = rootpath;
		this.npcikey = npcikey;
		this.cbsdbip = cbsdbip;
		this.cbsdbport = cbsdbport;
		this.cbssid = cbssid;
		this.cbsuname = cbsuname;
		this.cbspass = cbspass;
		this.smstemplate = smstemplate;
		this.senderid = senderid;
		this.smsuname = smsuname;
		this.smspass = smspass;
		this.home_branch_ifsc = home_branch_ifsc;
		this.bankregion = bankregion;
	}

	public Eman_panconfig() {
		super();
	}

	
	
}


