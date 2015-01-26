package me.gteam.logman.domain;

import java.util.Date;

/**
 * OilcardRecharge entity. @author MyEclipse Persistence Tools
 */

public class OilcardRecharge implements java.io.Serializable {

	// Fields

	private Integer oilcardrechargeId;
	private Date date;
	private String oilcardNo;
	private Double amount;
	private String account;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public OilcardRecharge() {
	}

	/** full constructor */
	public OilcardRecharge(Date date, String oilcardNo, Double amount,
			String account, String operator, String remark) {
		this.date = date;
		this.oilcardNo = oilcardNo;
		this.amount = amount;
		this.account = account;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOilcardNo() {
		return this.oilcardNo;
	}

	public void setOilcardNo(String oilcardNo) {
		this.oilcardNo = oilcardNo;
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