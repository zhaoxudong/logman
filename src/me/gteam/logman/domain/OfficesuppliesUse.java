package me.gteam.logman.domain;

import java.util.Date;

/**
 * OfficesuppliesUse entity. @author MyEclipse Persistence Tools
 */

public class OfficesuppliesUse implements java.io.Serializable {

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
	public OfficesuppliesUse() {
	}

	/** full constructor */
	public OfficesuppliesUse(Date date, String goods, Double quantity,
			String porpuse, String recipient, String remark) {
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

}