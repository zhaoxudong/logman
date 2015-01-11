package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OilProcurement entity. @author MyEclipse Persistence Tools
 */

public class OilProcurement implements java.io.Serializable {

	// Fields

	private Integer oilProcurement;
	private Oiltank oiltank;
	private Account account;
	private Supplier supplier;
	private Fuel fuel;
	private Date procDate;
	private Double weight;
	private Double unitPrice;
	private Double amount;
	private Double cashpay;
	private String operator;
	private String remark;
	private Set iolpurchaseSettledetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public OilProcurement() {
	}

	/** minimal constructor */
	public OilProcurement(Integer oilProcurement) {
		this.oilProcurement = oilProcurement;
	}

	/** full constructor */
	public OilProcurement(Integer oilProcurement, Oiltank oiltank,
			Account account, Supplier supplier, Fuel fuel, Date procDate,
			Double weight, Double unitPrice, Double amount, Double cashpay,
			String operator, String remark, Set iolpurchaseSettledetails) {
		this.oilProcurement = oilProcurement;
		this.oiltank = oiltank;
		this.account = account;
		this.supplier = supplier;
		this.fuel = fuel;
		this.procDate = procDate;
		this.weight = weight;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.cashpay = cashpay;
		this.operator = operator;
		this.remark = remark;
		this.iolpurchaseSettledetails = iolpurchaseSettledetails;
	}

	// Property accessors

	public Integer getOilProcurement() {
		return this.oilProcurement;
	}

	public void setOilProcurement(Integer oilProcurement) {
		this.oilProcurement = oilProcurement;
	}

	public Oiltank getOiltank() {
		return this.oiltank;
	}

	public void setOiltank(Oiltank oiltank) {
		this.oiltank = oiltank;
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

	public Fuel getFuel() {
		return this.fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Date getProcDate() {
		return this.procDate;
	}

	public void setProcDate(Date procDate) {
		this.procDate = procDate;
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