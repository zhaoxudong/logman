package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer accountId;
	private String name;
	private String type;
	private String bank;
	private String account;
	private Double initAmount;
	private String remark;
	private Set fittingPurchases = new HashSet(0);
	private Set oilpurchaseNeedtopaySettles = new HashSet(0);
	private Set vehicleFeeses = new HashSet(0);
	private Set otherouts = new HashSet(0);
	private Set repairs = new HashSet(0);
	private Set otherins = new HashSet(0);
	private Set freightNeedtopaies = new HashSet(0);
	private Set repairNeedtopaies = new HashSet(0);
	private Set freightNeedtoreceives = new HashSet(0);
	private Set lucaRecharges = new HashSet(0);
	private Set oilcardRecharges = new HashSet(0);
	private Set cashRefuels = new HashSet(0);
	private Set oilProcurements = new HashSet(0);
	private Set maintenanceRecords = new HashSet(0);
	private Set illegals = new HashSet(0);
	private Set fittingNeedtopaySettles = new HashSet(0);
	private Set addoilNeedtopaysettles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** minimal constructor */
	public Account(Integer accountId) {
		this.accountId = accountId;
	}

	/** full constructor */
	public Account(Integer accountId, String name, String type, String bank,
			String account, Double initAmount, String remark,
			Set fittingPurchases, Set oilpurchaseNeedtopaySettles,
			Set vehicleFeeses, Set otherouts, Set repairs, Set otherins,
			Set freightNeedtopaies, Set repairNeedtopaies,
			Set freightNeedtoreceives, Set lucaRecharges, Set oilcardRecharges,
			Set cashRefuels, Set oilProcurements, Set maintenanceRecords,
			Set illegals, Set fittingNeedtopaySettles,
			Set addoilNeedtopaysettles) {
		this.accountId = accountId;
		this.name = name;
		this.type = type;
		this.bank = bank;
		this.account = account;
		this.initAmount = initAmount;
		this.remark = remark;
		this.fittingPurchases = fittingPurchases;
		this.oilpurchaseNeedtopaySettles = oilpurchaseNeedtopaySettles;
		this.vehicleFeeses = vehicleFeeses;
		this.otherouts = otherouts;
		this.repairs = repairs;
		this.otherins = otherins;
		this.freightNeedtopaies = freightNeedtopaies;
		this.repairNeedtopaies = repairNeedtopaies;
		this.freightNeedtoreceives = freightNeedtoreceives;
		this.lucaRecharges = lucaRecharges;
		this.oilcardRecharges = oilcardRecharges;
		this.cashRefuels = cashRefuels;
		this.oilProcurements = oilProcurements;
		this.maintenanceRecords = maintenanceRecords;
		this.illegals = illegals;
		this.fittingNeedtopaySettles = fittingNeedtopaySettles;
		this.addoilNeedtopaysettles = addoilNeedtopaysettles;
	}

	// Property accessors

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Double getInitAmount() {
		return this.initAmount;
	}

	public void setInitAmount(Double initAmount) {
		this.initAmount = initAmount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getFittingPurchases() {
		return this.fittingPurchases;
	}

	public void setFittingPurchases(Set fittingPurchases) {
		this.fittingPurchases = fittingPurchases;
	}

	public Set getOilpurchaseNeedtopaySettles() {
		return this.oilpurchaseNeedtopaySettles;
	}

	public void setOilpurchaseNeedtopaySettles(Set oilpurchaseNeedtopaySettles) {
		this.oilpurchaseNeedtopaySettles = oilpurchaseNeedtopaySettles;
	}

	public Set getVehicleFeeses() {
		return this.vehicleFeeses;
	}

	public void setVehicleFeeses(Set vehicleFeeses) {
		this.vehicleFeeses = vehicleFeeses;
	}

	public Set getOtherouts() {
		return this.otherouts;
	}

	public void setOtherouts(Set otherouts) {
		this.otherouts = otherouts;
	}

	public Set getRepairs() {
		return this.repairs;
	}

	public void setRepairs(Set repairs) {
		this.repairs = repairs;
	}

	public Set getOtherins() {
		return this.otherins;
	}

	public void setOtherins(Set otherins) {
		this.otherins = otherins;
	}

	public Set getFreightNeedtopaies() {
		return this.freightNeedtopaies;
	}

	public void setFreightNeedtopaies(Set freightNeedtopaies) {
		this.freightNeedtopaies = freightNeedtopaies;
	}

	public Set getRepairNeedtopaies() {
		return this.repairNeedtopaies;
	}

	public void setRepairNeedtopaies(Set repairNeedtopaies) {
		this.repairNeedtopaies = repairNeedtopaies;
	}

	public Set getFreightNeedtoreceives() {
		return this.freightNeedtoreceives;
	}

	public void setFreightNeedtoreceives(Set freightNeedtoreceives) {
		this.freightNeedtoreceives = freightNeedtoreceives;
	}

	public Set getLucaRecharges() {
		return this.lucaRecharges;
	}

	public void setLucaRecharges(Set lucaRecharges) {
		this.lucaRecharges = lucaRecharges;
	}

	public Set getOilcardRecharges() {
		return this.oilcardRecharges;
	}

	public void setOilcardRecharges(Set oilcardRecharges) {
		this.oilcardRecharges = oilcardRecharges;
	}

	public Set getCashRefuels() {
		return this.cashRefuels;
	}

	public void setCashRefuels(Set cashRefuels) {
		this.cashRefuels = cashRefuels;
	}

	public Set getOilProcurements() {
		return this.oilProcurements;
	}

	public void setOilProcurements(Set oilProcurements) {
		this.oilProcurements = oilProcurements;
	}

	public Set getMaintenanceRecords() {
		return this.maintenanceRecords;
	}

	public void setMaintenanceRecords(Set maintenanceRecords) {
		this.maintenanceRecords = maintenanceRecords;
	}

	public Set getIllegals() {
		return this.illegals;
	}

	public void setIllegals(Set illegals) {
		this.illegals = illegals;
	}

	public Set getFittingNeedtopaySettles() {
		return this.fittingNeedtopaySettles;
	}

	public void setFittingNeedtopaySettles(Set fittingNeedtopaySettles) {
		this.fittingNeedtopaySettles = fittingNeedtopaySettles;
	}

	public Set getAddoilNeedtopaysettles() {
		return this.addoilNeedtopaysettles;
	}

	public void setAddoilNeedtopaysettles(Set addoilNeedtopaysettles) {
		this.addoilNeedtopaysettles = addoilNeedtopaysettles;
	}

}