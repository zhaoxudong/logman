package me.gteam.logman.domain;

import java.util.Date;

/**
 * OilcardRecharge entity. @author MyEclipse Persistence Tools
 */

public class OilcardRecharge implements java.io.Serializable {

	// Fields

	private Integer oilcardrechargeId;
	private Account account;
	private Fulecard fulecard;
	private Date date;
	private Double amount;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public OilcardRecharge() {
	}

	/** minimal constructor */
	public OilcardRecharge(Integer oilcardrechargeId) {
		this.oilcardrechargeId = oilcardrechargeId;
	}

	/** full constructor */
	public OilcardRecharge(Integer oilcardrechargeId, Account account,
			Fulecard fulecard, Date date, Double amount, String operator,
			String remark) {
		this.oilcardrechargeId = oilcardrechargeId;
		this.account = account;
		this.fulecard = fulecard;
		this.date = date;
		this.amount = amount;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getOilcardrechargeId() {
		return this.oilcardrechargeId;
	}

	public void setOilcardrechargeId(Integer oilcardrechargeId) {
		this.oilcardrechargeId = oilcardrechargeId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Fulecard getFulecard() {
		return this.fulecard;
	}

	public void setFulecard(Fulecard fulecard) {
		this.fulecard = fulecard;
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