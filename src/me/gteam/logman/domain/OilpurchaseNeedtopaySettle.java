package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OilpurchaseNeedtopaySettle entity. @author MyEclipse Persistence Tools
 */

public class OilpurchaseNeedtopaySettle implements java.io.Serializable {

	// Fields

	private Integer settleId;
	private Account account;
	private Supplier supplier;
	private Date settleDate;
	private Double prepayRemainder;
	private Double needtopay;
	private Double prepay;
	private Double actualPay;
	private String operator;
	private String remark;
	private Set iolpurchaseSettledetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public OilpurchaseNeedtopaySettle() {
	}

	/** minimal constructor */
	public OilpurchaseNeedtopaySettle(Integer settleId) {
		this.settleId = settleId;
	}

	/** full constructor */
	public OilpurchaseNeedtopaySettle(Integer settleId, Account account,
			Supplier supplier, Date settleDate, Double prepayRemainder,
			Double needtopay, Double prepay, Double actualPay, String operator,
			String remark, Set iolpurchaseSettledetails) {
		this.settleId = settleId;
		this.account = account;
		this.supplier = supplier;
		this.settleDate = settleDate;
		this.prepayRemainder = prepayRemainder;
		this.needtopay = needtopay;
		this.prepay = prepay;
		this.actualPay = actualPay;
		this.operator = operator;
		this.remark = remark;
		this.iolpurchaseSettledetails = iolpurchaseSettledetails;
	}

	// Property accessors

	public Integer getSettleId() {
		return this.settleId;
	}

	public void setSettleId(Integer settleId) {
		this.settleId = settleId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
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

	public Set getIolpurchaseSettledetails() {
		return this.iolpurchaseSettledetails;
	}

	public void setIolpurchaseSettledetails(Set iolpurchaseSettledetails) {
		this.iolpurchaseSettledetails = iolpurchaseSettledetails;
	}

}