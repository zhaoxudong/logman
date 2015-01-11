package me.gteam.logman.domain;

import java.util.Date;

/**
 * SettleSalary entity. @author MyEclipse Persistence Tools
 */

public class SettleSalary implements java.io.Serializable {

	// Fields

	private Integer settleId;
	private String settleNo;
	private Date settledate;
	private Double amount;
	private Integer account;
	private String remark;

	// Constructors

	/** default constructor */
	public SettleSalary() {
	}

	/** minimal constructor */
	public SettleSalary(Integer settleId) {
		this.settleId = settleId;
	}

	/** full constructor */
	public SettleSalary(Integer settleId, String settleNo, Date settledate,
			Double amount, Integer account, String remark) {
		this.settleId = settleId;
		this.settleNo = settleNo;
		this.settledate = settledate;
		this.amount = amount;
		this.account = account;
		this.remark = remark;
	}

	// Property accessors

	public Integer getSettleId() {
		return this.settleId;
	}

	public void setSettleId(Integer settleId) {
		this.settleId = settleId;
	}

	public String getSettleNo() {
		return this.settleNo;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	public Date getSettledate() {
		return this.settledate;
	}

	public void setSettledate(Date settledate) {
		this.settledate = settledate;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}