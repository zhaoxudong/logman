package me.gteam.logman.domain;

import java.util.Date;

/**
 * OfficesuppliesPurchaseId entity. @author MyEclipse Persistence Tools
 */

public class OfficesuppliesPurchaseId implements java.io.Serializable {

	// Fields

	private Integer purchaseId;
	private Date date;
	private String goods;
	private Double quantity;
	private Double unitPrice;
	private Double amount;
	private Integer account;
	private String buyplace;
	private String voucherNo;
	private String buyer;
	private String remark;

	// Constructors

	/** default constructor */
	public OfficesuppliesPurchaseId() {
	}

	/** full constructor */
	public OfficesuppliesPurchaseId(Integer purchaseId, Date date,
			String goods, Double quantity, Double unitPrice, Double amount,
			Integer account, String buyplace, String voucherNo, String buyer,
			String remark) {
		this.purchaseId = purchaseId;
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

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OfficesuppliesPurchaseId))
			return false;
		OfficesuppliesPurchaseId castOther = (OfficesuppliesPurchaseId) other;

		return ((this.getPurchaseId() == castOther.getPurchaseId()) || (this
				.getPurchaseId() != null && castOther.getPurchaseId() != null && this
				.getPurchaseId().equals(castOther.getPurchaseId())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getGoods() == castOther.getGoods()) || (this
						.getGoods() != null && castOther.getGoods() != null && this
						.getGoods().equals(castOther.getGoods())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this
						.getQuantity() != null
						&& castOther.getQuantity() != null && this
						.getQuantity().equals(castOther.getQuantity())))
				&& ((this.getUnitPrice() == castOther.getUnitPrice()) || (this
						.getUnitPrice() != null
						&& castOther.getUnitPrice() != null && this
						.getUnitPrice().equals(castOther.getUnitPrice())))
				&& ((this.getAmount() == castOther.getAmount()) || (this
						.getAmount() != null && castOther.getAmount() != null && this
						.getAmount().equals(castOther.getAmount())))
				&& ((this.getAccount() == castOther.getAccount()) || (this
						.getAccount() != null && castOther.getAccount() != null && this
						.getAccount().equals(castOther.getAccount())))
				&& ((this.getBuyplace() == castOther.getBuyplace()) || (this
						.getBuyplace() != null
						&& castOther.getBuyplace() != null && this
						.getBuyplace().equals(castOther.getBuyplace())))
				&& ((this.getVoucherNo() == castOther.getVoucherNo()) || (this
						.getVoucherNo() != null
						&& castOther.getVoucherNo() != null && this
						.getVoucherNo().equals(castOther.getVoucherNo())))
				&& ((this.getBuyer() == castOther.getBuyer()) || (this
						.getBuyer() != null && castOther.getBuyer() != null && this
						.getBuyer().equals(castOther.getBuyer())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPurchaseId() == null ? 0 : this.getPurchaseId()
						.hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result
				+ (getGoods() == null ? 0 : this.getGoods().hashCode());
		result = 37 * result
				+ (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37 * result
				+ (getUnitPrice() == null ? 0 : this.getUnitPrice().hashCode());
		result = 37 * result
				+ (getAmount() == null ? 0 : this.getAmount().hashCode());
		result = 37 * result
				+ (getAccount() == null ? 0 : this.getAccount().hashCode());
		result = 37 * result
				+ (getBuyplace() == null ? 0 : this.getBuyplace().hashCode());
		result = 37 * result
				+ (getVoucherNo() == null ? 0 : this.getVoucherNo().hashCode());
		result = 37 * result
				+ (getBuyer() == null ? 0 : this.getBuyer().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}