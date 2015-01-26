package me.gteam.logman.domain;

import java.util.Date;

/**
 * FixpointRefueling entity. @author MyEclipse Persistence Tools
 */

public class FixpointRefueling implements java.io.Serializable {

	// Fields

	private Integer refuelingId;
	private Date refuelingDate;
	private String vehicle;
	private String driver;
	private String oilStation;
	private String oilType;
	private Double unitPrice;
	private Double amont;
	private Double weight;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public FixpointRefueling() {
	}

	/** full constructor */
	public FixpointRefueling(Date refuelingDate, String vehicle, String driver,
			String oilStation, String oilType, Double unitPrice, Double amont,
			Double weight, String operator, String remark) {
		this.refuelingDate = refuelingDate;
		this.vehicle = vehicle;
		this.driver = driver;
		this.oilStation = oilStation;
		this.oilType = oilType;
		this.unitPrice = unitPrice;
		this.amont = amont;
		this.weight = weight;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getRefuelingId() {
		return this.refuelingId;
	}

	public void setRefuelingId(Integer refuelingId) {
		this.refuelingId = refuelingId;
	}

	public Date getRefuelingDate() {
		return this.refuelingDate;
	}

	public void setRefuelingDate(Date refuelingDate) {
		this.refuelingDate = refuelingDate;
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

	public String getOilStation() {
		return this.oilStation;
	}

	public void setOilStation(String oilStation) {
		this.oilStation = oilStation;
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

}