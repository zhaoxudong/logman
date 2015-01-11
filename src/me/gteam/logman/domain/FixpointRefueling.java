package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FixpointRefueling entity. @author MyEclipse Persistence Tools
 */

public class FixpointRefueling implements java.io.Serializable {

	// Fields

	private Integer refuelingId;
	private Fuel fuel;
	private Driver driver;
	private Vehicle vehicle;
	private Supplier supplier;
	private Date refuelingDate;
	private Double unitPrice;
	private Double amont;
	private Double weight;
	private String operator;
	private String remark;
	private Set addoilPayDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public FixpointRefueling() {
	}

	/** minimal constructor */
	public FixpointRefueling(Integer refuelingId) {
		this.refuelingId = refuelingId;
	}

	/** full constructor */
	public FixpointRefueling(Integer refuelingId, Fuel fuel, Driver driver,
			Vehicle vehicle, Supplier supplier, Date refuelingDate,
			Double unitPrice, Double amont, Double weight, String operator,
			String remark, Set addoilPayDetails) {
		this.refuelingId = refuelingId;
		this.fuel = fuel;
		this.driver = driver;
		this.vehicle = vehicle;
		this.supplier = supplier;
		this.refuelingDate = refuelingDate;
		this.unitPrice = unitPrice;
		this.amont = amont;
		this.weight = weight;
		this.operator = operator;
		this.remark = remark;
		this.addoilPayDetails = addoilPayDetails;
	}

	// Property accessors

	public Integer getRefuelingId() {
		return this.refuelingId;
	}

	public void setRefuelingId(Integer refuelingId) {
		this.refuelingId = refuelingId;
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

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Date getRefuelingDate() {
		return this.refuelingDate;
	}

	public void setRefuelingDate(Date refuelingDate) {
		this.refuelingDate = refuelingDate;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getAmont() {
		return this.amont;
	}

	public void setAmont(Double amont) {
		this.amont = amont;
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

	public Set getAddoilPayDetails() {
		return this.addoilPayDetails;
	}

	public void setAddoilPayDetails(Set addoilPayDetails) {
		this.addoilPayDetails = addoilPayDetails;
	}

}