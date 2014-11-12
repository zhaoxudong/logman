package me.gteam.logman.domain;

/**
 * Enterprise entity. @author MyEclipse Persistence Tools
 */

public class Enterprise implements java.io.Serializable {

	// Fields

	private String enterprisename;
	private String organizationcode;
	private String legalrepresentative;
	private String bankofdeposit;
	private String bankaccount;
	private String taxaccount;
	private String address;
	private String postalcode;
	private String tel;

	// Constructors

	/** default constructor */
	public Enterprise() {
	}

	/** minimal constructor */
	public Enterprise(String enterprisename, String legalrepresentative) {
		this.enterprisename = enterprisename;
		this.legalrepresentative = legalrepresentative;
	}

	/** full constructor */
	public Enterprise(String enterprisename, String organizationcode,
			String legalrepresentative, String bankofdeposit,
			String bankaccount, String taxaccount, String address,
			String postalcode, String tel) {
		this.enterprisename = enterprisename;
		this.organizationcode = organizationcode;
		this.legalrepresentative = legalrepresentative;
		this.bankofdeposit = bankofdeposit;
		this.bankaccount = bankaccount;
		this.taxaccount = taxaccount;
		this.address = address;
		this.postalcode = postalcode;
		this.tel = tel;
	}

	// Property accessors

	public String getEnterprisename() {
		return this.enterprisename;
	}

	public void setEnterprisename(String enterprisename) {
		this.enterprisename = enterprisename;
	}

	public String getOrganizationcode() {
		return this.organizationcode;
	}

	public void setOrganizationcode(String organizationcode) {
		this.organizationcode = organizationcode;
	}

	public String getLegalrepresentative() {
		return this.legalrepresentative;
	}

	public void setLegalrepresentative(String legalrepresentative) {
		this.legalrepresentative = legalrepresentative;
	}

	public String getBankofdeposit() {
		return this.bankofdeposit;
	}

	public void setBankofdeposit(String bankofdeposit) {
		this.bankofdeposit = bankofdeposit;
	}

	public String getBankaccount() {
		return this.bankaccount;
	}

	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}

	public String getTaxaccount() {
		return this.taxaccount;
	}

	public void setTaxaccount(String taxaccount) {
		this.taxaccount = taxaccount;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}