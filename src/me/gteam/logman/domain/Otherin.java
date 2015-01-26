package me.gteam.logman.domain;

import java.util.Date;

/**
 * Otherin entity. @author MyEclipse Persistence Tools
 */

public class Otherin implements java.io.Serializable {

	// Fields

	private Integer inId;
	private Date date;
	private String type;
	private String vehicle;
	private Double amount;
	private String account;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Otherin() {
	}

	/** full constructor */
	public Otherin(Date date, String type, String vehicle, Double amount,
			String account, String operator, String remark) {
		this.date = date;
		this.type = type;
		this.vehicle = vehicle;
		this.amount = amount;
		this.account = account;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
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