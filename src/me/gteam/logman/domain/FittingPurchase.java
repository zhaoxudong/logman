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
	private Account account;
	private Supplier supplier;
	private Date date;
	private String buyer;
	private Double amountNeed;
	private Double cashpay;
	private String remark;
	private Set fittingpurchaseDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public FittingPurchase() {
	}

	/** minimal constructor */
	public FittingPurchase(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	/** full constructor */
	public FittingPurchase(Integer purchaseId, Account account,
			Supplier supplier, Date date, String buyer, Double amountNeed,
			Double cashpay, String remark, Set fittingpurchaseDetails) {
		this.purchaseId = purchaseId;
		this.account = account;
		this.supplier = supplier;
		this.date = date;
		this.buyer = buyer;
		this.amountNeed = amountNeed;
		this.cashpay = cashpay;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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