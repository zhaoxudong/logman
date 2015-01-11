package me.gteam.logman.domain;

import java.util.Date;

/**
 * CashRefuel entity. @author MyEclipse Persistence Tools
 */

public class CashRefuel implements java.io.Serializable {

	// Fields

	private Integer cashrefuelId;
	private Fuel fuel;
	private Driver driver;
	private Vehicle vehicle;
	private Account account;
	private Date refuelDate;
	private Integer vehicle_1;
	private Integer driver_1;
	private Double unitPrice;
	private Double amount;
	private Double weight;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public CashRefuel() {
	}

	/** minimal constructor */
	public CashRefuel(Integer cashrefuelId) {
		this.cashrefuelId = cashrefuelId;
	}

	/** full constructor */
	public CashRefuel(Integer cashrefuelId, Fuel fuel, Driver driver,
			Vehicle vehicle, Account account, Date refuelDate,
			Integer vehicle_1, Integer driver_1, Double unitPrice,
			Double amount, Double weight, String operator, String remark) {
		this.cashrefuelId = cashrefuelId;
		this.fuel = fuel;
		this.driver = driver;
		this.vehicle = vehicle;
		this.account = account;
		this.refuelDate = refuelDate;
		this.vehicle_1 = vehicle_1;
		this.driver_1 = driver_1;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.weight = weight;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getCashrefuelId() {
		return this.cashrefuelId;
	}

	public void setCashrefuelId(Integer cashrefuelId) {
		this.cashrefuelId = cashrefuelId;
	}

	public Fuel getFuel() {
		return this.fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getRefuelDate() {
		return this.refuelDate;
	}

	public void setRefuelDate(Date refuelDate) {
		this.refuelDate = refuelDate;
	}

	public Integer getVehicle_1() {
		return this.vehicle_1;
	}

	public void setVehicle_1(Integer vehicle_1) {
		this.vehicle_1 = vehicle_1;
	}

	public Integer getDriver_1() {
		return this.driver_1;
	}

	public void setDriver_1(Integer driver_1) {
		this.driver_1 = driver_1;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
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

}