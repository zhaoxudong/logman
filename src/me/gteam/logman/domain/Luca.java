package me.gteam.logman.domain;

import java.util.Date;

/**
 * Luca entity. @author MyEclipse Persistence Tools
 */

public class Luca implements java.io.Serializable {

	// Fields

	private Integer lucaId;
	private String lucaNo;
	private String type;
	private Date buyDate;
	private String vehicle;
	private Double initAmount;
	private Double currentAmount;
	private String remark;

	// Constructors

	/** default constructor */
	public Luca() {
	}

	/** full constructor */
	public Luca(String lucaNo, String type, Date buyDate, String vehicle,
			Double initAmount, Double currentAmount, String remark) {
		this.lucaNo = lucaNo;
		this.type = type;
		this.buyDate = buyDate;
		this.vehicle = vehicle;
		this.initAmount = initAmount;
		this.currentAmount = currentAmount;
		this.remark = remark;
	}

	// Property accessors

	public Integer getLucaId() {
		return this.lucaId;
	}

	public void setLucaId(Integer lucaId) {
		this.lucaId = lucaId;
	}

	public String getLucaNo() {
		return this.lucaNo;
	}

	public void setLucaNo(String lucaNo) {
		this.lucaNo = lucaNo;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getBuyDate() {
		return this.buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public Double getInitAmount() {
		return this.initAmount;
	}

	public void setInitAmount(Double initAmount) {
		this.initAmount = initAmount;
	}

	public Double getCurrentAmount() {
		return this.currentAmount;
	}

	public void setCurrentAmount(Double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}