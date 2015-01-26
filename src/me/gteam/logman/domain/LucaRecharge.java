package me.gteam.logman.domain;

import java.util.Date;

/**
 * LucaRecharge entity. @author MyEclipse Persistence Tools
 */

public class LucaRecharge implements java.io.Serializable {

	// Fields

	private Integer lucarechargeId;
	private Date rechargeDate;
	private String lucaNo;
	private Double amount;
	private String account;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public LucaRecharge() {
	}

	/** full constructor */
	public LucaRecharge(Date rechargeDate, String lucaNo, Double amount,
			String account, String operator, String remark) {
		this.rechargeDate = rechargeDate;
		this.lucaNo = lucaNo;
		this.amount = amount;
		this.account = account;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getLucarechargeId() {
		return this.lucarechargeId;
	}

	public void setLucarechargeId(Integer lucarechargeId) {
		this.lucarechargeId = lucarechargeId;
	}

	public Date getRechargeDate() {
		return this.rechargeDate;
	}

	public void setRechargeDate(Date rechargeDate) {
		this.rechargeDate = rechargeDate;
	}

	public String getLucaNo() {
		return this.lucaNo;
	}

	public void setLucaNo(String lucaNo) {
		this.lucaNo = lucaNo;
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