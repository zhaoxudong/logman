package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FittingPurchase entity. @author MyEclipse Persistence Tools
 */

public class FittingPurchase implements java.io.Serializable {

	// Fields

	private Integer purchaseId;
	private Date date;
	private String supplier;
	private String buyer;
	private Double amountNeed;
	private Double cashpay;
	private String account;
	private String remark;
	private Set fittingpurchaseDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public FittingPurchase() {
	}

	/** full constructor */
	public FittingPurchase(Date date, String supplier, String buyer,
			Double amountNeed, Double cashpay, String account, String remark,
			Set fittingpurchaseDetails) {
		this.date = date;
		this.supplier = supplier;
		this.buyer = buyer;
		this.amountNeed = amountNeed;
		this.cashpay = cashpay;
		this.account = account;
		this.remark = remark;
		this.fittingpurchaseDetails = fittingpurchaseDetails;
	}

	// Property accessors

	public Integer getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSupplier() {
		return this.supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getBuyer() {
		return this.buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public Double getAmountNeed() {
		return this.amountNeed;
	}

	public void setAmountNeed(Double amountNeed) {
		this.amountNeed = amountNeed;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getFittingpurchaseDetails() {
		return this.fittingpurchaseDetails;
	}

	public void setFittingpurchaseDetails(Set fittingpurchaseDetails) {
		this.fittingpurchaseDetails = fittingpurchaseDetails;
	}

}