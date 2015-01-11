package me.gteam.logman.domain;

import java.util.Date;

/**
 * PrereceiveId entity. @author MyEclipse Persistence Tools
 */

public class PrereceiveId implements java.io.Serializable {

	// Fields

	private Integer prereceiveId;
	private Date date;
	private String unit;
	private Double prereceive;
	private Integer account;
	private String attn;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public PrereceiveId() {
	}

	/** full constructor */
	public PrereceiveId(Integer prereceiveId, Date date, String unit,
			Double prereceive, Integer account, String attn, String operator,
			String remark) {
		this.prereceiveId = prereceiveId;
		this.date = date;
		this.unit = unit;
		this.prereceive = prereceive;
		this.account = account;
		this.attn = attn;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getPrereceiveId() {
		return this.prereceiveId;
	}

	public void setPrereceiveId(Integer prereceiveId) {
		this.prereceiveId = prereceiveId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getPrereceive() {
		return this.prereceive;
	}

	public void setPrereceive(Double prereceive) {
		this.prereceive = prereceive;
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
		if (!(other instanceof PrereceiveId))
			return false;
		PrereceiveId castOther = (PrereceiveId) other;

		return ((this.getPrereceiveId() == castOther.getPrereceiveId()) || (this
				.getPrereceiveId() != null
				&& castOther.getPrereceiveId() != null && this
				.getPrereceiveId().equals(castOther.getPrereceiveId())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getUnit() == castOther.getUnit()) || (this.getUnit() != null
						&& castOther.getUnit() != null && this.getUnit()
						.equals(castOther.getUnit())))
				&& ((this.getPrereceive() == castOther.getPrereceive()) || (this
						.getPrereceive() != null
						&& castOther.getPrereceive() != null && this
						.getPrereceive().equals(castOther.getPrereceive())))
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

		result = 37
				* result
				+ (getPrereceiveId() == null ? 0 : this.getPrereceiveId()
						.hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result
				+ (getUnit() == null ? 0 : this.getUnit().hashCode());
		result = 37
				* result
				+ (getPrereceive() == null ? 0 : this.getPrereceive()
						.hashCode());
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