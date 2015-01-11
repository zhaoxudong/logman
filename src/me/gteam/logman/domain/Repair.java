package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Repair entity. @author MyEclipse Persistence Tools
 */

public class Repair implements java.io.Serializable {

	// Fields

	private Integer repairId;
	private Vehicle vehicle;
	private Maintenance maintenance;
	private Account account;
	private Driver driver;
	private Supplier supplier;
	private Date repairDate;
	private String isinternal;
	private String warrantyNumber;
	private Double fittingCost;
	private Double laborCost;
	private Double amount;
	private Double cashpay;
	private String operator;
	private String remark;
	private Set repairDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Repair() {
	}

	/** minimal constructor */
	public Repair(Integer repairId) {
		this.repairId = repairId;
	}

	/** full constructor */
	public Repair(Integer repairId, Vehicle vehicle, Maintenance maintenance,
			Account account, Driver driver, Supplier supplier, Date repairDate,
			String isinternal, String warrantyNumber, Double fittingCost,
			Double laborCost, Double amount, Double cashpay, String operator,
			String remark, Set repairDetails) {
		this.repairId = repairId;
		this.vehicle = vehicle;
		this.maintenance = maintenance;
		this.account = account;
		this.driver = driver;
		this.supplier = supplier;
		this.repairDate = repairDate;
		this.isinternal = isinternal;
		this.warrantyNumber = warrantyNumber;
		this.fittingCost = fittingCost;
		this.laborCost = laborCost;
		this.amount = amount;
		this.cashpay = cashpay;
		this.operator = operator;
		this.remark = remark;
		this.repairDetails = repairDetails;
	}

	// Property accessors

	public Integer getRepairId() {
		return this.repairId;
	}

	public void setRepairId(Integer repairId) {
		this.repairId = repairId;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Maintenance getMaintenance() {
		return this.maintenance;
	}

	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Date getRepairDate() {
		return this.repairDate;
	}

	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}

	public String getIsinternal() {
		return this.isinternal;
	}

	public void setIsinternal(String isinternal) {
		this.isinternal = isinternal;
	}

	public String getWarrantyNumber() {
		return this.warrantyNumber;
	}

	public void setWarrantyNumber(String warrantyNumber) {
		this.warrantyNumber = warrantyNumber;
	}

	public Double getFittingCost() {
		return this.fittingCost;
	}

	public void setFittingCost(Double fittingCost) {
		this.fittingCost = fittingCost;
	}

	public Double getLaborCost() {
		return this.laborCost;
	}

	public void setLaborCost(Double laborCost) {
		this.laborCost = laborCost;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getCashpay() {
		return this.cashpay;
	}

	public void setCashpay(Double cashpay) {
		this.cashpay = cashpay;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getRepairDetails() {
		return this.repairDetails;
	}

	public void setRepairDetails(Set repairDetails) {
		this.repairDetails = repairDetails;
	}

}