package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FittingNeedtopaySettle entity. @author MyEclipse Persistence Tools
 */

public class FittingNeedtopaySettle implements java.io.Serializable {

	// Fields

	private Integer settleId;
	private Date settleDate;
	private String supplier;
	private Double prepayRemainder;
	private Double needtopay;
	private Double prepay;
	private Double actualPay;
	private String account;
	private String operator;
	private String remark;
	private Set fittingNeedtopayDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public FittingNeedtopaySettle() {
	}

	/** full constructor */
	public FittingNeedtopaySettle(Date settleDate, String supplier,
			Double prepayRemainder, Double needtopay, Double prepay,
			Double actualPay, String account, String operator, String remark,
			Set fittingNeedtopayDetails) {
		this.settleDate = settleDate;
		this.supplier = supplier;
		this.prepayRemainder = prepayRemainder;
		this.needtopay = needtopay;
		this.prepay = prepay;
		this.actualPay = actualPay;
		this.account = account;
		this.operator = operator;
		this.remark = remark;
		this.fittingNeedtopayDetails = fittingNeedtopayDetails;
	}

	// Property accessors

	public Integer getSettleId() {
		return this.settleId;
	}

	public void setSettleId(Integer settleId) {
		this.settleId = settleId;
	}

	public Date getSettleDate() {
		return this.settleDate;
	}

	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}

	public String getSupplier() {
		return this.supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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

	public Set getFittingNeedtopayDetails() {
		return this.fittingNeedtopayDetails;
	}

	public void setFittingNeedtopayDetails(Set fittingNeedtopayDetails) {
		this.fittingNeedtopayDetails = fittingNeedtopayDetails;
	}

}