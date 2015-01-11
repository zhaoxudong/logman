package me.gteam.logman.domain;

import java.util.Date;

/**
 * BorrowReturn entity. @author MyEclipse Persistence Tools
 */

public class BorrowReturn implements java.io.Serializable {

	// Fields

	private Integer recordId;
	private BorrowPurpose borrowPurpose;
	private Date date;
	private String staffFleet;
	private String borrowReturn;
	private Double amount;
	private Integer account;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public BorrowReturn() {
	}

	/** minimal constructor */
	public BorrowReturn(Integer recordId) {
		this.recordId = recordId;
	}

	/** full constructor */
	public BorrowReturn(Integer recordId, BorrowPurpose borrowPurpose,
			Date date, String staffFleet, String borrowReturn, Double amount,
			Integer account, String operator, String remark) {
		this.recordId = recordId;
		this.borrowPurpose = borrowPurpose;
		this.date = date;
		this.staffFleet = staffFleet;
		this.borrowReturn = borrowReturn;
		this.amount = amount;
		this.account = account;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public BorrowPurpose getBorrowPurpose() {
		return this.borrowPurpose;
	}

	public void setBorrowPurpose(BorrowPurpose borrowPurpose) {
		this.borrowPurpose = borrowPurpose;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStaffFleet() {
		return this.staffFleet;
	}

	public void setStaffFleet(String staffFleet) {
		this.staffFleet = staffFleet;
	}

	public String getBorrowReturn() {
		return this.borrowReturn;
	}

	public void setBorrowReturn(String borrowReturn) {
		this.borrowReturn = borrowReturn;
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