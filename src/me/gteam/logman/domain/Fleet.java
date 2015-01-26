package me.gteam.logman.domain;

/**
 * Fleet entity. @author MyEclipse Persistence Tools
 */

public class Fleet implements java.io.Serializable {

	// Fields

	private Integer fleetId;
	private String fleetName;
	private String isPlugin;
	private String mnemonic;
	private String contact;
	private String contactNumber;
	private String faxNumber;
	private String contactAddress;
	private String bankOfDeposit;
	private String bankAccount;
	private String remarks;

	// Constructors

	/** default constructor */
	public Fleet() {
	}

	/** full constructor */
	public Fleet(String fleetName, String isPlugin, String mnemonic,
			String contact, String contactNumber, String faxNumber,
			String contactAddress, String bankOfDeposit, String bankAccount,
			String remarks) {
		this.fleetName = fleetName;
		this.isPlugin = isPlugin;
		this.mnemonic = mnemonic;
		this.contact = contact;
		this.contactNumber = contactNumber;
		this.faxNumber = faxNumber;
		this.contactAddress = contactAddress;
		this.bankOfDeposit = bankOfDeposit;
		this.bankAccount = bankAccount;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getFleetId() {
		return this.fleetId;
	}

	public void setFleetId(Integer fleetId) {
		this.fleetId = fleetId;
	}

	public String getFleetName() {
		return this.fleetName;
	}

	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
	}

	public String getIsPlugin() {
		return this.isPlugin;
	}

	public void setIsPlugin(String isPlugin) {
		this.isPlugin = isPlugin;
	}

	public String getMnemonic() {
		return this.mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}