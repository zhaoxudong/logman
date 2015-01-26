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
	private Date repairDate;
	private String repairFactory;
	private String isinternal;
	private String vehicle;
	private String driver;
	private String warrantyNumber;
	private String repairman;
	private Double fittingCost;
	private Double laborCost;
	private Double amount;
	private Double cashpay;
	private String account;
	private String operator;
	private String remark;
	private Set repairDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Repair() {
	}

	/** full constructor */
	public Repair(Date repairDate, String repairFactory, String isinternal,
			String vehicle, String driver, String warrantyNumber,
			String repairman, Double fittingCost, Double laborCost,
			Double amount, Double cashpay, String account, String operator,
			String remark, Set repairDetails) {
		this.repairDate = repairDate;
		this.repairFactory = repairFactory;
		this.isinternal = isinternal;
		this.vehicle = vehicle;
		this.driver = driver;
		this.warrantyNumber = warrantyNumber;
		this.repairman = repairman;
		this.fittingCost = fittingCost;
		this.laborCost = laborCost;
		this.amount = amount;
		this.cashpay = cashpay;
		this.account = account;
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

	public Date getRepairDate() {
		return this.repairDate;
	}

	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}

	public String getRepairFactory() {
		return this.repairFactory;
	}

	public void setRepairFactory(String repairFactory) {
		this.repairFactory = repairFactory;
	}

	public String getIsinternal() {
		return this.isinternal;
	}

	public void setIsinternal(String isinternal) {
		this.isinternal = isinternal;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getWarrantyNumber() {
		return this.warrantyNumber;
	}

	public void setWarrantyNumber(String warrantyNumber) {
		this.warrantyNumber = warrantyNumber;
	}

	public String getRepairman() {
		return this.repairman;
	}

	public void setRepairman(String repairman) {
		this.repairman = repairman;
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

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
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