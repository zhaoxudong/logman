package me.gteam.logman.domain;

import java.util.Date;

/**
 * TankRefuel entity. @author MyEclipse Persistence Tools
 */

public class TankRefuel implements java.io.Serializable {

	// Fields

	private Integer tankrefuelId;
	private Date refuelDate;
	private String vehicle;
	private String driver;
	private String oilTank;
	private String oilType;
	private Double unitPrice;
	private Double amount;
	private Double weight;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public TankRefuel() {
	}

	/** full constructor */
	public TankRefuel(Date refuelDate, String vehicle, String driver,
			String oilTank, String oilType, Double unitPrice, Double amount,
			Double weight, String operator, String remark) {
		this.refuelDate = refuelDate;
		this.vehicle = vehicle;
		this.driver = driver;
		this.oilTank = oilTank;
		this.oilType = oilType;
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

	public Date getRefuelDate() {
		return this.refuelDate;
	}

	public void setRefuelDate(Date refuelDate) {
		this.refuelDate = refuelDate;
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

	public String getOilTank() {
		return this.oilTank;
	}

	public void setOilTank(String oilTank) {
		this.oilTank = oilTank;
	}

	public String getOilType() {
		return this.oilType;
	}

	public void setOilType(String oilType) {
		this.oilType = oilType;
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