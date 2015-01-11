package me.gteam.logman.domain;

/**
 * Enterprise entity. @author MyEclipse Persistence Tools
 */

public class Enterprise implements java.io.Serializable {

	// Fields

	private String enterpriseName;
	private String institutionCode;
	private String corporateRepresentative;
	private String bankOfDeposit;
	private String bankAccount;
	private String taxAccount;
	private String mailingAddress;
	private String postalCode;
	private String contactNumber;

	// Constructors

	/** default constructor */
	public Enterprise() {
	}

	/** minimal constructor */
	public Enterprise(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	/** full constructor */
	public Enterprise(String enterpriseName, String institutionCode,
			String corporateRepresentative, String bankOfDeposit,
			String bankAccount, String taxAccount, String mailingAddress,
			String postalCode, String contactNumber) {
		this.enterpriseName = enterpriseName;
		this.institutionCode = institutionCode;
		this.corporateRepresentative = corporateRepresentative;
		this.bankOfDeposit = bankOfDeposit;
		this.bankAccount = bankAccount;
		this.taxAccount = taxAccount;
		this.mailingAddress = mailingAddress;
		this.postalCode = postalCode;
		this.contactNumber = contactNumber;
	}

	// Property accessors

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getInstitutionCode() {
		return this.institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getCorporateRepresentative() {
		return this.corporateRepresentative;
	}

	public void setCorporateRepresentative(String corporateRepresentative) {
		this.corporateRepresentative = corporateRepresentative;
	}

	public String getBankOfDeposit() {
		return this.bankOfDeposit;
	}

	public void setBankOfDeposit(String bankOfDeposit) {
		this.bankOfDeposit = bankOfDeposit;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getTaxAccount() {
		return this.taxAccount;
	}

	public void setTaxAccount(String taxAccount) {
		this.taxAccount = taxAccount;
	}

	public String getMailingAddress() {
		return this.mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}