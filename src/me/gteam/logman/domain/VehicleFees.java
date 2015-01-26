package me.gteam.logman.domain;

import java.util.Date;

/**
 * VehicleFees entity. @author MyEclipse Persistence Tools
 */

public class VehicleFees implements java.io.Serializable {

	// Fields

	private Integer vehicleFeesId;
	private Date feesDate;
	private String vehicle;
	private String feeType;
	private Double amount;
	private Date expireDate;
	private Double cashpay;
	private String account;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public VehicleFees() {
	}

	/** full constructor */
	public VehicleFees(Date feesDate, String vehicle, String feeType,
			Double amount, Date expireDate, Double cashpay, String account,
			String operator, String remark) {
		this.feesDate = feesDate;
		this.vehicle = vehicle;
		this.feeType = feeType;
		this.amount = amount;
		this.expireDate = expireDate;
		this.cashpay = cashpay;
		this.account = account;
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

	public Date getFeesDate() {
		return this.feesDate;
	}

	public void setFeesDate(Date feesDate) {
		this.feesDate = feesDate;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getFeeType() {
		return this.feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
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