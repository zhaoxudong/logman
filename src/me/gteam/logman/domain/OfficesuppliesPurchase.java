package me.gteam.logman.domain;

import java.util.Date;

/**
 * OfficesuppliesPurchase entity. @author MyEclipse Persistence Tools
 */

public class OfficesuppliesPurchase implements java.io.Serializable {

	// Fields

	private Integer purchaseId;
	private Date date;
	private String goods;
	private Double quantity;
	private Double unitPrice;
	private Double amount;
	private String account;
	private String buyplace;
	private String voucherNo;
	private String buyer;
	private String remark;

	// Constructors

	/** default constructor */
	public OfficesuppliesPurchase() {
	}

	/** full constructor */
	public OfficesuppliesPurchase(Date date, String goods, Double quantity,
			Double unitPrice, Double amount, String account, String buyplace,
			String voucherNo, String buyer, String remark) {
		this.date = date;
		this.goods = goods;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.account = account;
		this.buyplace = buyplace;
		this.voucherNo = voucherNo;
		this.buyer = buyer;
		this.remark = remark;
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

	public String getGoods() {
		return this.goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
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

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getBuyplace() {
		return this.buyplace;
	}

	public void setBuyplace(String buyplace) {
		this.buyplace = buyplace;
	}

	public String getVoucherNo() {
		return this.voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getBuyer() {
		return this.buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}