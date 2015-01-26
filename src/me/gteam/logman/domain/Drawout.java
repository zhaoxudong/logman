package me.gteam.logman.domain;

import java.util.Date;

/**
 * Drawout entity. @author MyEclipse Persistence Tools
 */

public class Drawout implements java.io.Serializable {

	// Fields

	private Integer drawoutId;
	private Integer dispatchId;
	private String have;
	private String fleet;
	private String vehicle;
	private String guache;
	private String driver;
	private Date date;
	private Double prepay;
	private String drawMan;
	private String remark;

	// Constructors

	/** default constructor */
	public Drawout() {
	}

	/** full constructor */
	public Drawout(Integer dispatchId, String have, String fleet,
			String vehicle, String guache, String driver, Date date,
			Double prepay, String drawMan, String remark) {
		this.dispatchId = dispatchId;
		this.have = have;
		this.fleet = fleet;
		this.vehicle = vehicle;
		this.guache = guache;
		this.driver = driver;
		this.date = date;
		this.prepay = prepay;
		this.drawMan = drawMan;
		this.remark = remark;
	}

	// Property accessors

	public Integer getDrawoutId() {
		return this.drawoutId;
	}

	public void setDrawoutId(Integer drawoutId) {
		this.drawoutId = drawoutId;
	}

	public Integer getDispatchId() {
		return this.dispatchId;
	}

	public void setDispatchId(Integer dispatchId) {
		this.dispatchId = dispatchId;
	}

	public String getHave() {
		return this.have;
	}

	public void setHave(String have) {
		this.have = have;
	}

	public String getFleet() {
		return this.fleet;
	}

	public void setFleet(String fleet) {
		this.fleet = fleet;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getGuache() {
		return this.guache;
	}

	public void setGuache(String guache) {
		this.guache = guache;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getPrepay() {
		return this.prepay;
	}

	public void setPrepay(Double prepay) {
		this.prepay = prepay;
	}

	public String getDrawMan() {
		return this.drawMan;
	}

	public void setDrawMan(String drawMan) {
		this.drawMan = drawMan;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}