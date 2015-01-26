package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SettleSalary entity. @author MyEclipse Persistence Tools
 */

public class SettleSalary implements java.io.Serializable {

	// Fields

	private Integer settleId;
	private Date startDate;
	private Date endDate;
	private Date settledate;
	private Double amount;
	private String account;
	private String remark;
	private Set payrollDetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public SettleSalary() {
	}

	/** full constructor */
	public SettleSalary(Date startDate, Date endDate, Date settledate,
			Double amount, String account, String remark, Set payrollDetailses) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.settledate = settledate;
		this.amount = amount;
		this.account = account;
		this.remark = remark;
		this.payrollDetailses = payrollDetailses;
	}

	// Property accessors

	public Integer getSettleId() {
		return this.settleId;
	}

	public void setSettleId(Integer settleId) {
		this.settleId = settleId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getPayrollDetailses() {
		return this.payrollDetailses;
	}

	public void setPayrollDetailses(Set payrollDetailses) {
		this.payrollDetailses = payrollDetailses;
	}

}