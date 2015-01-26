package me.gteam.logman.domain;

import java.util.Date;

/**
 * BorrowReturn entity. @author MyEclipse Persistence Tools
 */

public class BorrowReturn implements java.io.Serializable {

	// Fields

	private Integer recordId;
	private Date date;
	private String type;
	private String name;
	private String usePurpose;
	private Double amount;
	private String account;
	private String reback;
	private String isfinished;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public BorrowReturn() {
	}

	/** full constructor */
	public BorrowReturn(Date date, String type, String name, String usePurpose,
			Double amount, String account, String reback, String isfinished,
			String operator, String remark) {
		this.date = date;
		this.type = type;
		this.name = name;
		this.usePurpose = usePurpose;
		this.amount = amount;
		this.account = account;
		this.reback = reback;
		this.isfinished = isfinished;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsePurpose() {
		return this.usePurpose;
	}

	public void setUsePurpose(String usePurpose) {
		this.usePurpose = usePurpose;
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

	public String getReback() {
		return this.reback;
	}

	public void setReback(String reback) {
		this.reback = reback;
	}

	public String getIsfinished() {
		return this.isfinished;
	}

	public void setIsfinished(String isfinished) {
		this.isfinished = isfinished;
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