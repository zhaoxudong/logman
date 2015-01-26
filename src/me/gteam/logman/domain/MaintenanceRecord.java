package me.gteam.logman.domain;

import java.util.Date;

/**
 * MaintenanceRecord entity. @author MyEclipse Persistence Tools
 */

public class MaintenanceRecord implements java.io.Serializable {

	// Fields

	private Integer maintId;
	private Date maintDate;
	private String vehicle;
	private String driver;
	private String maintPlace;
	private String maintProject;
	private Double lasttimekm;
	private Double currentkm;
	private Double nextkm;
	private Double amount;
	private String account;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public MaintenanceRecord() {
	}

	/** full constructor */
	public MaintenanceRecord(Date maintDate, String vehicle, String driver,
			String maintPlace, String maintProject, Double lasttimekm,
			Double currentkm, Double nextkm, Double amount, String account,
			String operator, String remark) {
		this.maintDate = maintDate;
		this.vehicle = vehicle;
		this.driver = driver;
		this.maintPlace = maintPlace;
		this.maintProject = maintProject;
		this.lasttimekm = lasttimekm;
		this.currentkm = currentkm;
		this.nextkm = nextkm;
		this.amount = amount;
		this.account = account;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getMaintId() {
		return this.maintId;
	}

	public void setMaintId(Integer maintId) {
		this.maintId = maintId;
	}

	public Date getMaintDate() {
		return this.maintDate;
	}

	public void setMaintDate(Date maintDate) {
		this.maintDate = maintDate;
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

	public String getMaintPlace() {
		return this.maintPlace;
	}

	public void setMaintPlace(String maintPlace) {
		this.maintPlace = maintPlace;
	}

	public String getMaintProject() {
		return this.maintProject;
	}

	public void setMaintProject(String maintProject) {
		this.maintProject = maintProject;
	}

	public Double getLasttimekm() {
		return this.lasttimekm;
	}

	public void setLasttimekm(Double lasttimekm) {
		this.lasttimekm = lasttimekm;
	}

	public Double getCurrentkm() {
		return this.currentkm;
	}

	public void setCurrentkm(Double currentkm) {
		this.currentkm = currentkm;
	}

	public Double getNextkm() {
		return this.nextkm;
	}

	public void setNextkm(Double nextkm) {
		this.nextkm = nextkm;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
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