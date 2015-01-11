package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Supplier entity. @author MyEclipse Persistence Tools
 */

public class Supplier implements java.io.Serializable {

	// Fields

	private Integer supplierId;
	private String abbr;
	private String fullname;
	private String type;
	private String contact;
	private String tel;
	private String addr;
	private String taxNumber;
	private String bankOfDeposit;
	private String bankaccount;
	private String remark;
	private Set fixpointRefuelings = new HashSet(0);
	private Set oilpurchaseNeedtopaySettles = new HashSet(0);
	private Set fittingPurchases = new HashSet(0);
	private Set repairNeedtopaies = new HashSet(0);
	private Set oilProcurements = new HashSet(0);
	private Set fittingNeedtopaySettles = new HashSet(0);
	private Set repairs = new HashSet(0);
	private Set tireDates = new HashSet(0);
	private Set maintenanceRecords = new HashSet(0);
	private Set addoilNeedtopaysettles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Supplier() {
	}

	/** minimal constructor */
	public Supplier(Integer supplierId) {
		this.supplierId = supplierId;
	}

	/** full constructor */
	public Supplier(Integer supplierId, String abbr, String fullname,
			String type, String contact, String tel, String addr,
			String taxNumber, String bankOfDeposit, String bankaccount,
			String remark, Set fixpointRefuelings,
			Set oilpurchaseNeedtopaySettles, Set fittingPurchases,
			Set repairNeedtopaies, Set oilProcurements,
			Set fittingNeedtopaySettles, Set repairs, Set tireDates,
			Set maintenanceRecords, Set addoilNeedtopaysettles) {
		this.supplierId = supplierId;
		this.abbr = abbr;
		this.fullname = fullname;
		this.type = type;
		this.contact = contact;
		this.tel = tel;
		this.addr = addr;
		this.taxNumber = taxNumber;
		this.bankOfDeposit = bankOfDeposit;
		this.bankaccount = bankaccount;
		this.remark = remark;
		this.fixpointRefuelings = fixpointRefuelings;
		this.oilpurchaseNeedtopaySettles = oilpurchaseNeedtopaySettles;
		this.fittingPurchases = fittingPurchases;
		this.repairNeedtopaies = repairNeedtopaies;
		this.oilProcurements = oilProcurements;
		this.fittingNeedtopaySettles = fittingNeedtopaySettles;
		this.repairs = repairs;
		this.tireDates = tireDates;
		this.maintenanceRecords = maintenanceRecords;
		this.addoilNeedtopaysettles = addoilNeedtopaysettles;
	}

	// Property accessors

	public Integer getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getAbbr() {
		return this.abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getBankOfDeposit() {
		return this.bankOfDeposit;
	}

	public void setBankOfDeposit(String bankOfDeposit) {
		this.bankOfDeposit = bankOfDeposit;
	}

	public String getBankaccount() {
		return this.bankaccount;
	}

	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getFixpointRefuelings() {
		return this.fixpointRefuelings;
	}

	public void setFixpointRefuelings(Set fixpointRefuelings) {
		this.fixpointRefuelings = fixpointRefuelings;
	}

	public Set getOilpurchaseNeedtopaySettles() {
		return this.oilpurchaseNeedtopaySettles;
	}

	public void setOilpurchaseNeedtopaySettles(Set oilpurchaseNeedtopaySettles) {
		this.oilpurchaseNeedtopaySettles = oilpurchaseNeedtopaySettles;
	}

	public Set getFittingPurchases() {
		return this.fittingPurchases;
	}

	public void setFittingPurchases(Set fittingPurchases) {
		this.fittingPurchases = fittingPurchases;
	}

	public Set getRepairNeedtopaies() {
		return this.repairNeedtopaies;
	}

	public void setRepairNeedtopaies(Set repairNeedtopaies) {
		this.repairNeedtopaies = repairNeedtopaies;
	}

	public Set getOilProcurements() {
		return this.oilProcurements;
	}

	public void setOilProcurements(Set oilProcurements) {
		this.oilProcurements = oilProcurements;
	}

	public Set getFittingNeedtopaySettles() {
		return this.fittingNeedtopaySettles;
	}

	public void setFittingNeedtopaySettles(Set fittingNeedtopaySettles) {
		this.fittingNeedtopaySettles = fittingNeedtopaySettles;
	}

	public Set getRepairs() {
		return this.repairs;
	}

	public void setRepairs(Set repairs) {
		this.repairs = repairs;
	}

	public Set getTireDates() {
		return this.tireDates;
	}

	public void setTireDates(Set tireDates) {
		this.tireDates = tireDates;
	}

	public Set getMaintenanceRecords() {
		return this.maintenanceRecords;
	}

	public void setMaintenanceRecords(Set maintenanceRecords) {
		this.maintenanceRecords = maintenanceRecords;
	}

	public Set getAddoilNeedtopaysettles() {
		return this.addoilNeedtopaysettles;
	}

	public void setAddoilNeedtopaysettles(Set addoilNeedtopaysettles) {
		this.addoilNeedtopaysettles = addoilNeedtopaysettles;
	}

}