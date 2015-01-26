package me.gteam.logman.domain;

import java.util.Date;

/**
 * Prepay entity. @author MyEclipse Persistence Tools
 */

public class Prepay implements java.io.Serializable {

	// Fields

	private Integer prepayId;
	private Date date;
	private String unit;
	private Double prepay;
	private String account;
	private String attn;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Prepay() {
	}

	/** full constructor */
	public Prepay(Date date, String unit, Double prepay, String account,
			String attn, String operator, String remark) {
		this.date = date;
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

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
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

}