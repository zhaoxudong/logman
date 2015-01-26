package me.gteam.logman.domain;

import java.util.Date;

/**
 * Absence entity. @author MyEclipse Persistence Tools
 */

public class Absence implements java.io.Serializable {

	// Fields

	private Integer absenceId;
	private Date date;
	private String name;
	private String type;
	private Float duration;
	private Double deductedAmount;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Absence() {
	}

	/** full constructor */
	public Absence(Date date, String name, String type, Float duration,
			Double deductedAmount, String operator, String remark) {
		this.date = date;
		this.name = name;
		this.type = type;
		this.duration = duration;
		this.deductedAmount = deductedAmount;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getAbsenceId() {
		return this.absenceId;
	}

	public void setAbsenceId(Integer absenceId) {
		this.absenceId = absenceId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getDuration() {
		return this.duration;
	}

	public void setDuration(Float duration) {
		this.duration = duration;
	}

	public Double getDeductedAmount() {
		return this.deductedAmount;
	}

	public void setDeductedAmount(Double deductedAmount) {
		this.deductedAmount = deductedAmount;
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