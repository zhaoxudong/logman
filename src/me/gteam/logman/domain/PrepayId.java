package me.gteam.logman.domain;

import java.util.Date;

/**
 * PrepayId entity. @author MyEclipse Persistence Tools
 */

public class PrepayId implements java.io.Serializable {

	// Fields

	private Integer prepayId;
	private Date date;
	private String currentunitType;
	private String unit;
	private Double prepay;
	private Integer account;
	private String attn;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public PrepayId() {
	}

	/** full constructor */
	public PrepayId(Integer prepayId, Date date, String currentunitType,
			String unit, Double prepay, Integer account, String attn,
			String operator, String remark) {
		this.prepayId = prepayId;
		this.date = date;
		this.currentunitType = currentunitType;
		this.unit = unit;
		this.prepay = prepay;
		this.account = account;
		this.attn = attn;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getPrepayId() {
		return this.prepayId;
	}

	public void setPrepayId(Integer prepayId) {
		this.prepayId = prepayId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCurrentunitType() {
		return this.currentunitType;
	}

	public void setCurrentunitType(String currentunitType) {
		this.currentunitType = currentunitType;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getPrepay() {
		return this.prepay;
	}

	public void setPrepay(Double prepay) {
		this.prepay = prepay;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getAttn() {
		return this.attn;
	}

	public void setAttn(String attn) {
		this.attn = attn;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrepayId))
			return false;
		PrepayId castOther = (PrepayId) other;

		return ((this.getPrepayId() == castOther.getPrepayId()) || (this
				.getPrepayId() != null && castOther.getPrepayId() != null && this
				.getPrepayId().equals(castOther.getPrepayId())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getCurrentunitType() == castOther
						.getCurrentunitType()) || (this.getCurrentunitType() != null
						&& castOther.getCurrentunitType() != null && this
						.getCurrentunitType().equals(
								castOther.getCurrentunitType())))
				&& ((this.getUnit() == castOther.getUnit()) || (this.getUnit() != null
						&& castOther.getUnit() != null && this.getUnit()
						.equals(castOther.getUnit())))
				&& ((this.getPrepay() == castOther.getPrepay()) || (this
						.getPrepay() != null && castOther.getPrepay() != null && this
						.getPrepay().equals(castOther.getPrepay())))
				&& ((this.getAccount() == castOther.getAccount()) || (this
						.getAccount() != null && castOther.getAccount() != null && this
						.getAccount().equals(castOther.getAccount())))
				&& ((this.getAttn() == castOther.getAttn()) || (this.getAttn() != null
						&& castOther.getAttn() != null && this.getAttn()
						.equals(castOther.getAttn())))
				&& ((this.getOperator() == castOther.getOperator()) || (this
						.getOperator() != null
						&& castOther.getOperator() != null && this
						.getOperator().equals(castOther.getOperator())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPrepayId() == null ? 0 : this.getPrepayId().hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37
				* result
				+ (getCurrentunitType() == null ? 0 : this.getCurrentunitType()
						.hashCode());
		result = 37 * result
				+ (getUnit() == null ? 0 : this.getUnit().hashCode());
		result = 37 * result
				+ (getPrepay() == null ? 0 : this.getPrepay().hashCode());
		result = 37 * result
				+ (getAccount() == null ? 0 : this.getAccount().hashCode());
		result = 37 * result
				+ (getAttn() == null ? 0 : this.getAttn().hashCode());
		result = 37 * result
				+ (getOperator() == null ? 0 : this.getOperator().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}