package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Dispatch entity. @author MyEclipse Persistence Tools
 */

public class Dispatch implements java.io.Serializable {

	// Fields

	private Integer dispatchId;
	private Date chucheDate;
	private Date huichangDate;
	private String fleet;
	private String vehicle;
	private String guache;
	private String driver;
	private String zhuangxieyuan;
	private String remark;
	private Set dispatchDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dispatch() {
	}

	/** full constructor */
	public Dispatch(Date chucheDate, Date huichangDate, String fleet,
			String vehicle, String guache, String driver, String zhuangxieyuan,
			String remark, Set dispatchDetails) {
		this.chucheDate = chucheDate;
		this.huichangDate = huichangDate;
		this.fleet = fleet;
		this.vehicle = vehicle;
		this.guache = guache;
		this.driver = driver;
		this.zhuangxieyuan = zhuangxieyuan;
		this.remark = remark;
		this.dispatchDetails = dispatchDetails;
	}

	// Property accessors

	public Integer getDispatchId() {
		return this.dispatchId;
	}

	public void setDispatchId(Integer dispatchId) {
		this.dispatchId = dispatchId;
	}

	public Date getChucheDate() {
		return this.chucheDate;
	}

	public void setChucheDate(Date chucheDate) {
		this.chucheDate = chucheDate;
	}

	public Date getHuichangDate() {
		return this.huichangDate;
	}

	public void setHuichangDate(Date huichangDate) {
		this.huichangDate = huichangDate;
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

	public String getZhuangxieyuan() {
		return this.zhuangxieyuan;
	}

	public void setZhuangxieyuan(String zhuangxieyuan) {
		this.zhuangxieyuan = zhuangxieyuan;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getDispatchDetails() {
		return this.dispatchDetails;
	}

	public void setDispatchDetails(Set dispatchDetails) {
		this.dispatchDetails = dispatchDetails;
	}

}