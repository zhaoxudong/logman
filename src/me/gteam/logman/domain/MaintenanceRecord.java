package me.gteam.logman.domain;

import java.util.Date;

/**
 * MaintenanceRecord entity. @author MyEclipse Persistence Tools
 */

public class MaintenanceRecord implements java.io.Serializable {

	// Fields

	private Integer maintId;
	private Vehicle vehicle;
	private MaintenanceItem maintenanceItem;
	private Supplier supplier;
	private Account account;
	private Driver driver;
	private Date maintDate;
	private Double lasttimekm;
	private Double currentkm;
	private Double nextkm;
	private Double amount;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public MaintenanceRecord() {
	}

	/** minimal constructor */
	public MaintenanceRecord(Integer maintId) {
		this.maintId = maintId;
	}

	/** full constructor */
	public MaintenanceRecord(Integer maintId, Vehicle vehicle,
			MaintenanceItem maintenanceItem, Supplier supplier,
			Account account, Driver driver, Date maintDate, Double lasttimekm,
			Double currentkm, Double nextkm, Double amount, String operator,
			String remark) {
		this.maintId = maintId;
		this.vehicle = vehicle;
		this.maintenanceItem = maintenanceItem;
		this.supplier = supplier;
		this.account = account;
		this.driver = driver;
		this.maintDate = maintDate;
		this.lasttimekm = lasttimekm;
		this.currentkm = currentkm;
		this.nextkm = nextkm;
		this.amount = amount;
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

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public MaintenanceItem getMaintenanceItem() {
		return this.maintenanceItem;
	}

	public void setMaintenanceItem(MaintenanceItem maintenanceItem) {
		this.maintenanceItem = maintenanceItem;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Date getMaintDate() {
		return this.maintDate;
	}

	public void setMaintDate(Date maintDate) {
		this.maintDate = maintDate;
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