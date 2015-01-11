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
	private Integer fleet;
	private Integer vehicle;
	private Integer guache;
	private Integer driver;
	private String zhuangxieyuan;
	private String remark;
	private Set freightNeedtopayDetails = new HashSet(0);
	private Set freightReceiveDetails = new HashSet(0);
	private Set dispatchDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dispatch() {
	}

	/** minimal constructor */
	public Dispatch(Integer dispatchId) {
		this.dispatchId = dispatchId;
	}

	/** full constructor */
	public Dispatch(Integer dispatchId, Date chucheDate, Date huichangDate,
			Integer fleet, Integer vehicle, Integer guache, Integer driver,
			String zhuangxieyuan, String remark, Set freightNeedtopayDetails,
			Set freightReceiveDetails, Set dispatchDetails) {
		this.dispatchId = dispatchId;
		this.chucheDate = chucheDate;
		this.huichangDate = huichangDate;
		this.fleet = fleet;
		this.vehicle = vehicle;
		this.guache = guache;
		this.driver = driver;
		this.zhuangxieyuan = zhuangxieyuan;
		this.remark = remark;
		this.freightNeedtopayDetails = freightNeedtopayDetails;
		this.freightReceiveDetails = freightReceiveDetails;
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

	public Integer getFleet() {
		return this.fleet;
	}

	public void setFleet(Integer fleet) {
		this.fleet = fleet;
	}

	public Integer getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Integer vehicle) {
		this.vehicle = vehicle;
	}

	public Integer getGuache() {
		return this.guache;
	}

	public void setGuache(Integer guache) {
		this.guache = guache;
	}

	public Integer getDriver() {
		return this.driver;
	}

	public void setDriver(Integer driver) {
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

	public Set getFreightNeedtopayDetails() {
		return this.freightNeedtopayDetails;
	}

	public void setFreightNeedtopayDetails(Set freightNeedtopayDetails) {
		this.freightNeedtopayDetails = freightNeedtopayDetails;
	}

	public Set getFreightReceiveDetails() {
		return this.freightReceiveDetails;
	}

	public void setFreightReceiveDetails(Set freightReceiveDetails) {
		this.freightReceiveDetails = freightReceiveDetails;
	}

	public Set getDispatchDetails() {
		return this.dispatchDetails;
	}

	public void setDispatchDetails(Set dispatchDetails) {
		this.dispatchDetails = dispatchDetails;
	}

}