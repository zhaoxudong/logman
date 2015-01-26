package me.gteam.logman.domain;

import java.util.Date;

/**
 * OilProcurement entity. @author MyEclipse Persistence Tools
 */

public class OilProcurement implements java.io.Serializable {

	// Fields

	private Integer oilProcurement;
	private Date procDate;
	private String supplier;
	private String oilType;
	private String oilTank;
	private Double weight;
	private Double unitPrice;
	private Double amount;
	private Double cashpay;
	private String account;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public OilProcurement() {
	}

	/** full constructor */
	public OilProcurement(Date procDate, String supplier, String oilType,
			String oilTank, Double weight, Double unitPrice, Double amount,
			Double cashpay, String account, String operator, String remark) {
		this.procDate = procDate;
		this.supplier = supplier;
		this.oilType = oilType;
		this.oilTank = oilTank;
		this.weight = weight;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.cashpay = cashpay;
		this.account = account;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getOilProcurement() {
		return this.oilProcurement;
	}

	public void setOilProcurement(Integer oilProcurement) {
		this.oilProcurement = oilProcurement;
	}

	public Date getProcDate() {
		return this.procDate;
	}

	public void setProcDate(Date procDate) {
		this.procDate = procDate;
	}

	public String getSupplier() {
		return this.supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getOilType() {
		return this.oilType;
	}

	public void setOilType(String oilType) {
		this.oilType = oilType;
	}

	public String getOilTank() {
		return this.oilTank;
	}

	public void setOilTank(String oilTank) {
		this.oilTank = oilTank;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getCashpay() {
		return this.cashpay;
	}

	public void setCashpay(Double cashpay) {
		this.cashpay = cashpay;
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