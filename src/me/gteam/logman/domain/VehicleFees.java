package me.gteam.logman.domain;

import java.util.Date;

/**
 * VehicleFees entity. @author MyEclipse Persistence Tools
 */

public class VehicleFees implements java.io.Serializable {

	// Fields

	private Integer vehicleFeesId;
	private Vehicle vehicle;
	private Account account;
	private VehiclefeesType vehiclefeesType;
	private Date feesDate;
	private Double amount;
	private Date expireDate;
	private Double cashpay;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public VehicleFees() {
	}

	/** minimal constructor */
	public VehicleFees(Integer vehicleFeesId) {
		this.vehicleFeesId = vehicleFeesId;
	}

	/** full constructor */
	public VehicleFees(Integer vehicleFeesId, Vehicle vehicle, Account account,
			VehiclefeesType vehiclefeesType, Date feesDate, Double amount,
			Date expireDate, Double cashpay, String operator, String remark) {
		this.vehicleFeesId = vehicleFeesId;
		this.vehicle = vehicle;
		this.account = account;
		this.vehiclefeesType = vehiclefeesType;
		this.feesDate = feesDate;
		this.amount = amount;
		this.expireDate = expireDate;
		this.cashpay = cashpay;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getVehicleFeesId() {
		return this.vehicleFeesId;
	}

	public void setVehicleFeesId(Integer vehicleFeesId) {
		this.vehicleFeesId = vehicleFeesId;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public VehiclefeesType getVehiclefeesType() {
		return this.vehiclefeesType;
	}

	public void setVehiclefeesType(VehiclefeesType vehiclefeesType) {
		this.vehiclefeesType = vehiclefeesType;
	}

	public Date getFeesDate() {
		return this.feesDate;
	}

	public void setFeesDate(Date feesDate) {
		this.feesDate = feesDate;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Double getCashpay() {
		return this.cashpay;
	}

	public void setCashpay(Double cashpay) {
		this.cashpay = cashpay;
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