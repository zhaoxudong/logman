package me.gteam.logman.domain;

import java.util.Date;

/**
 * Bankdeposit entity. @author MyEclipse Persistence Tools
 */

public class Bankdeposit implements java.io.Serializable {

	// Fields

	private Integer depsitId;
	private String depositNo;
	private Date date;
	private String payaccount;
	private String receive;
	private Double amount;
	private String checkNumber;
	private String operator;
	private String rermark;

	// Constructors

	/** default constructor */
	public Bankdeposit() {
	}

	/** full constructor */
	public Bankdeposit(String depositNo, Date date, String payaccount,
			String receive, Double amount, String checkNumber, String operator,
			String rermark) {
		this.depositNo = depositNo;
		this.date = date;
		this.payaccount = payaccount;
		this.receive = receive;
		this.amount = amount;
		this.checkNumber = checkNumber;
		this.operator = operator;
		this.rermark = rermark;
	}

	// Property accessors

	public Integer getDepsitId() {
		return this.depsitId;
	}

	public void setDepsitId(Integer depsitId) {
		this.depsitId = depsitId;
	}

	public String getDepositNo() {
		return this.depositNo;
	}

	public void setDepositNo(String depositNo) {
		this.depositNo = depositNo;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPayaccount() {
		return this.payaccount;
	}

	public void setPayaccount(String payaccount) {
		this.payaccount = payaccount;
	}

	public String getReceive() {
		return this.receive;
	}

	public void setReceive(String receive) {
		this.receive = receive;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRermark() {
		return this.rermark;
	}

	public void setRermark(String rermark) {
		this.rermark = rermark;
	}

}