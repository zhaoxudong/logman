package me.gteam.logman.domain;

import java.util.Date;

/**
 * TankRefuel entity. @author MyEclipse Persistence Tools
 */

public class TankRefuel implements java.io.Serializable {

	// Fields

	private Integer tankrefuelId;
	private Fuel fuel;
	private Vehicle vehicle;
	private Oiltank oiltank;
	private Driver driver;
	private Date refuelDate;
	private Double unitPrice;
	private Double amount;
	private Double weight;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public TankRefuel() {
	}

	/** minimal constructor */
	public TankRefuel(Integer tankrefuelId) {
		this.tankrefuelId = tankrefuelId;
	}

	/** full constructor */
	public TankRefuel(Integer tankrefuelId, Fuel fuel, Vehicle vehicle,
			Oiltank oiltank, Driver driver, Date refuelDate, Double unitPrice,
			Double amount, Double weight, String operator, String remark) {
		this.tankrefuelId = tankrefuelId;
		this.fuel = fuel;
		this.vehicle = vehicle;
		this.oiltank = oiltank;
		this.driver = driver;
		this.refuelDate = refuelDate;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.weight = weight;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getTankrefuelId() {
		return this.tankrefuelId;
	}

	public void setTankrefuelId(Integer tankrefuelId) {
		this.tankrefuelId = tankrefuelId;
	}

	public Fuel getFuel() {
		return this.fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Oiltank getOiltank() {
		return this.oiltank;
	}

	public void setOiltank(Oiltank oiltank) {
		this.oiltank = oiltank;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Date getRefuelDate() {
		return this.refuelDate;
	}

	public void setRefuelDate(Date refuelDate) {
		this.refuelDate = refuelDate;
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