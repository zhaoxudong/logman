package me.gteam.logman.domain;

import java.util.Date;

/**
 * LucaRecharge entity. @author MyEclipse Persistence Tools
 */

public class LucaRecharge implements java.io.Serializable {

	// Fields

	private Integer lucarechargeId;
	private Luca luca;
	private Account account;
	private Date rechargeDate;
	private Double amount;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public LucaRecharge() {
	}

	/** minimal constructor */
	public LucaRecharge(Integer lucarechargeId) {
		this.lucarechargeId = lucarechargeId;
	}

	/** full constructor */
	public LucaRecharge(Integer lucarechargeId, Luca luca, Account account,
			Date rechargeDate, Double amount, String operator, String remark) {
		this.lucarechargeId = lucarechargeId;
		this.luca = luca;
		this.account = account;
		this.rechargeDate = rechargeDate;
		this.amount = amount;
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

	public Luca getLuca() {
		return this.luca;
	}

	public void setLuca(Luca luca) {
		this.luca = luca;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getRechargeDate() {
		return this.rechargeDate;
	}

	public void setRechargeDate(Date rechargeDate) {
		this.rechargeDate = rechargeDate;
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