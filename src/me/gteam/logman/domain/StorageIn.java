package me.gteam.logman.domain;

import java.util.Date;

/**
 * StorageIn entity. @author MyEclipse Persistence Tools
 */

public class StorageIn implements java.io.Serializable {

	// Fields

	private Integer inId;
	private Vehicle vehicle;
	private Costumer costumer;
	private Storehouse storehouse;
	private Driver driver;
	private Goods goods;
	private Date date;
	private String lotNumber;
	private String measurement;
	private Double quantity;
	private Double weight;
	private String remark;

	// Constructors

	/** default constructor */
	public StorageIn() {
	}

	/** minimal constructor */
	public StorageIn(Integer inId) {
		this.inId = inId;
	}

	/** full constructor */
	public StorageIn(Integer inId, Vehicle vehicle, Costumer costumer,
			Storehouse storehouse, Driver driver, Goods goods, Date date,
			String lotNumber, String measurement, Double quantity,
			Double weight, String remark) {
		this.inId = inId;
		this.vehicle = vehicle;
		this.costumer = costumer;
		this.storehouse = storehouse;
		this.driver = driver;
		this.goods = goods;
		this.date = date;
		this.lotNumber = lotNumber;
		this.measurement = measurement;
		this.quantity = quantity;
		this.weight = weight;
		this.remark = remark;
	}

	// Property accessors

	public Integer getInId() {
		return this.inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Costumer getCostumer() {
		return this.costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	public Storehouse getStorehouse() {
		return this.storehouse;
	}

	public void setStorehouse(Storehouse storehouse) {
		this.storehouse = storehouse;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLotNumber() {
		return this.lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getMeasurement() {
		return this.measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}