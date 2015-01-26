package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Costumer entity. @author MyEclipse Persistence Tools
 */

public class Costumer implements java.io.Serializable {

	// Fields

	private Integer cosumerId;
	private String costumerAbbr;
	private String type;
	private String fullName;
	private String classification;
	private String code;
	private String contact;
	private String tel;
	private String phone;
	private String faxNumber;
	private String addr;
	private String taxNumber;
	private String bank;
	private String bankAccount;
	private String remark;
	private Set unloadLocations = new HashSet(0);
	private Set loadLocations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Costumer() {
	}

	/** full constructor */
	public Costumer(String costumerAbbr, String type, String fullName,
			String classification, String code, String contact, String tel,
			String phone, String faxNumber, String addr, String taxNumber,
			String bank, String bankAccount, String remark,
			Set unloadLocations, Set loadLocations) {
		this.costumerAbbr = costumerAbbr;
		this.type = type;
		this.fullName = fullName;
		this.classification = classification;
		this.code = code;
		this.contact = contact;
		this.tel = tel;
		this.phone = phone;
		this.faxNumber = faxNumber;
		this.addr = addr;
		this.taxNumber = taxNumber;
		this.bank = bank;
		this.bankAccount = bankAccount;
		this.remark = remark;
		this.unloadLocations = unloadLocations;
		this.loadLocations = loadLocations;
	}

	// Property accessors

	public Integer getCosumerId() {
		return this.cosumerId;
	}

	public void setCosumerId(Integer cosumerId) {
		this.cosumerId = cosumerId;
	}

	public String getCostumerAbbr() {
		return this.costumerAbbr;
	}

	public void setCostumerAbbr(String costumerAbbr) {
		this.costumerAbbr = costumerAbbr;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getUnloadLocations() {
		return this.unloadLocations;
	}

	public void setUnloadLocations(Set unloadLocations) {
		this.unloadLocations = unloadLocations;
	}

	public Set getLoadLocations() {
		return this.loadLocations;
	}

	public void setLoadLocations(Set loadLocations) {
		this.loadLocations = loadLocations;
	}

}