package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FreightNeedtopay entity. @author MyEclipse Persistence Tools
 */

public class FreightNeedtopay implements java.io.Serializable {

	// Fields

	private Integer settleId;
	private Fleet fleet;
	private Account account;
	private Date settleDate;
	private Double prepayRemainder;
	private Double needtopay;
	private Double borrow;
	private Double prepay;
	private Double actualPay;
	private String operator;
	private String remark;
	private Set freightNeedtopayDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public FreightNeedtopay() {
	}

	/** minimal constructor */
	public FreightNeedtopay(Integer settleId) {
		this.settleId = settleId;
	}

	/** full constructor */
	public FreightNeedtopay(Integer settleId, Fleet fleet, Account account,
			Date settleDate, Double prepayRemainder, Double needtopay,
			Double borrow, Double prepay, Double actualPay, String operator,
			String remark, Set freightNeedtopayDetails) {
		this.settleId = settleId;
		this.fleet = fleet;
		this.account = account;
		this.settleDate = settleDate;
		this.prepayRemainder = prepayRemainder;
		this.needtopay = needtopay;
		this.borrow = borrow;
		this.prepay = prepay;
		this.actualPay = actualPay;
		this.operator = operator;
		this.remark = remark;
		this.freightNeedtopayDetails = freightNeedtopayDetails;
	}

	// Property accessors

	public Integer getSettleId() {
		return this.settleId;
	}

	public void setSettleId(Integer settleId) {
		this.settleId = settleId;
	}

	public Fleet getFleet() {
		return this.fleet;
	}

	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getSettleDate() {
		return this.settleDate;
	}

	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}

	public Double getPrepayRemainder() {
		return this.prepayRemainder;
	}

	public void setPrepayRemainder(Double prepayRemainder) {
		this.prepayRemainder = prepayRemainder;
	}

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getBorrow() {
		return this.borrow;
	}

	public void setBorrow(Double borrow) {
		this.borrow = borrow;
	}

	public Double getPrepay() {
		return this.prepay;
	}

	public void setPrepay(Double prepay) {
		this.prepay = prepay;
	}

	public Double getActualPay() {
		return this.actualPay;
	}

	public void setActualPay(Double actualPay) {
		this.actualPay = actualPay;
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

	public Set getFreightNeedtopayDetails() {
		return this.freightNeedtopayDetails;
	}

	public void setFreightNeedtopayDetails(Set freightNeedtopayDetails) {
		this.freightNeedtopayDetails = freightNeedtopayDetails;
	}

}