package me.gteam.logman.domain;

import java.util.Date;

/**
 * Otherout entity. @author MyEclipse Persistence Tools
 */

public class Otherout implements java.io.Serializable {

	// Fields

	private Integer outId;
	private Vehicle vehicle;
	private OtheroutType otheroutType;
	private Account account;
	private Date date;
	private Double amount;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Otherout() {
	}

	/** minimal constructor */
	public Otherout(Integer outId) {
		this.outId = outId;
	}

	/** full constructor */
	public Otherout(Integer outId, Vehicle vehicle, OtheroutType otheroutType,
			Account account, Date date, Double amount, String operator,
			String remark) {
		this.outId = outId;
		this.vehicle = vehicle;
		this.otheroutType = otheroutType;
		this.account = account;
		this.date = date;
		this.amount = amount;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getOutId() {
		return this.outId;
	}

	public void setOutId(Integer outId) {
		this.outId = outId;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public OtheroutType getOtheroutType() {
		return this.otheroutType;
	}

	public void setOtheroutType(OtheroutType otheroutType) {
		this.otheroutType = otheroutType;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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