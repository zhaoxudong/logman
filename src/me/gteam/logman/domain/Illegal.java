package me.gteam.logman.domain;

import java.util.Date;

/**
 * Illegal entity. @author MyEclipse Persistence Tools
 */

public class Illegal implements java.io.Serializable {

	// Fields

	private Integer illegalId;
	private Date illegalDate;
	private Date expendDate;
	private String vehicle;
	private String driver;
	private String location;
	private String type;
	private Double point;
	private Double fine;
	private Double companyCost;
	private String account;
	private Double driverCost;
	private String remark;

	// Constructors

	/** default constructor */
	public Illegal() {
	}

	/** full constructor */
	public Illegal(Date illegalDate, Date expendDate, String vehicle,
			String driver, String location, String type, Double point,
			Double fine, Double companyCost, String account, Double driverCost,
			String remark) {
		this.illegalDate = illegalDate;
		this.expendDate = expendDate;
		this.vehicle = vehicle;
		this.driver = driver;
		this.location = location;
		this.type = type;
		this.point = point;
		this.fine = fine;
		this.companyCost = companyCost;
		this.account = account;
		this.driverCost = driverCost;
		this.remark = remark;
	}

	// Property accessors

	public Integer getIllegalId() {
		return this.illegalId;
	}

	public void setIllegalId(Integer illegalId) {
		this.illegalId = illegalId;
	}

	public Date getIllegalDate() {
		return this.illegalDate;
	}

	public void setIllegalDate(Date illegalDate) {
		this.illegalDate = illegalDate;
	}

	public Date getExpendDate() {
		return this.expendDate;
	}

	public void setExpendDate(Date expendDate) {
		this.expendDate = expendDate;
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPoint() {
		return this.point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	public Double getFine() {
		return this.fine;
	}

	public void setFine(Double fine) {
		this.fine = fine;
	}

	public Double getCompanyCost() {
		return this.companyCost;
	}

	public void setCompanyCost(Double companyCost) {
		this.companyCost = companyCost;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Double getDriverCost() {
		return this.driverCost;
	}

	public void setDriverCost(Double driverCost) {
		this.driverCost = driverCost;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}