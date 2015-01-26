package me.gteam.logman.domain;

import java.util.Date;

/**
 * Prereceive entity. @author MyEclipse Persistence Tools
 */

public class Prereceive implements java.io.Serializable {

	// Fields

	private Integer prereceiveId;
	private Date date;
	private String unit;
	private Double prereceive;
	private String account;
	private String attn;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Prereceive() {
	}

	/** full constructor */
	public Prereceive(Date date, String unit, Double prereceive,
			String account, String attn, String operator, String remark) {
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