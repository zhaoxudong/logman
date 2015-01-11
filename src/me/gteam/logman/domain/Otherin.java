package me.gteam.logman.domain;

import java.util.Date;

/**
 * Otherin entity. @author MyEclipse Persistence Tools
 */

public class Otherin implements java.io.Serializable {

	// Fields

	private Integer inId;
	private Vehicle vehicle;
	private Account account;
	private OtherinType otherinType;
	private Date date;
	private Double amount;
	private Integer account_1;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Otherin() {
	}

	/** minimal constructor */
	public Otherin(Integer inId) {
		this.inId = inId;
	}

	/** full constructor */
	public Otherin(Integer inId, Vehicle vehicle, Account account,
			OtherinType otherinType, Date date, Double amount,
			Integer account_1, String operator, String remark) {
		this.inId = inId;
		this.vehicle = vehicle;
		this.account = account;
		this.otherinType = otherinType;
		this.date = date;
		this.amount = amount;
		this.account_1 = account_1;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getInId() {
		return this.inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
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

	public OtherinType getOtherinType() {
		return this.otherinType;
	}

	public void setOtherinType(OtherinType otherinType) {
		this.otherinType = otherinType;
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

	public Integer getAccount_1() {
		return this.account_1;
	}

	public void setAccount_1(Integer account_1) {
		this.account_1 = account_1;
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