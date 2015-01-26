package me.gteam.logman.domain;

import java.util.Date;

/**
 * Otherout entity. @author MyEclipse Persistence Tools
 */

public class Otherout implements java.io.Serializable {

	// Fields

	private Integer outId;
	private String type;
	private Date date;
	private String vehicle;
	private Double amount;
	private String account;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Otherout() {
	}

	/** full constructor */
	public Otherout(String type, Date date, String vehicle, Double amount,
			String account, String operator, String remark) {
		this.type = type;
		this.date = date;
		this.vehicle = vehicle;
		this.amount = amount;
		this.account = account;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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