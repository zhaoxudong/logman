package me.gteam.logman.domain;

import java.util.Date;

/**
 * OfficesuppliesUseId entity. @author MyEclipse Persistence Tools
 */

public class OfficesuppliesUseId implements java.io.Serializable {

	// Fields

	private Integer useId;
	private Date date;
	private String goods;
	private Double quantity;
	private String porpuse;
	private String recipient;
	private String remark;

	// Constructors

	/** default constructor */
	public OfficesuppliesUseId() {
	}

	/** full constructor */
	public OfficesuppliesUseId(Integer useId, Date date, String goods,
			Double quantity, String porpuse, String recipient, String remark) {
		this.useId = useId;
		this.date = date;
		this.goods = goods;
		this.quantity = quantity;
		this.porpuse = porpuse;
		this.recipient = recipient;
		this.remark = remark;
	}

	// Property accessors

	public Integer getUseId() {
		return this.useId;
	}

	public void setUseId(Integer useId) {
		this.useId = useId;
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

	public String getPorpuse() {
		return this.porpuse;
	}

	public void setPorpuse(String porpuse) {
		this.porpuse = porpuse;
	}

	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
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
		if (!(other instanceof OfficesuppliesUseId))
			return false;
		OfficesuppliesUseId castOther = (OfficesuppliesUseId) other;

		return ((this.getUseId() == castOther.getUseId()) || (this.getUseId() != null
				&& castOther.getUseId() != null && this.getUseId().equals(
				castOther.getUseId())))
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
				&& ((this.getPorpuse() == castOther.getPorpuse()) || (this
						.getPorpuse() != null && castOther.getPorpuse() != null && this
						.getPorpuse().equals(castOther.getPorpuse())))
				&& ((this.getRecipient() == castOther.getRecipient()) || (this
						.getRecipient() != null
						&& castOther.getRecipient() != null && this
						.getRecipient().equals(castOther.getRecipient())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUseId() == null ? 0 : this.getUseId().hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result
				+ (getGoods() == null ? 0 : this.getGoods().hashCode());
		result = 37 * result
				+ (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37 * result
				+ (getPorpuse() == null ? 0 : this.getPorpuse().hashCode());
		result = 37 * result
				+ (getRecipient() == null ? 0 : this.getRecipient().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}