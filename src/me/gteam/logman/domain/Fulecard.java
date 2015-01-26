package me.gteam.logman.domain;

import java.util.Date;

/**
 * Fulecard entity. @author MyEclipse Persistence Tools
 */

public class Fulecard implements java.io.Serializable {

	// Fields

	private Integer fulecardId;
	private String fulecardNo;
	private Date buyDate;
	private String vehicle;
	private Double warningAmount;
	private Double initAmount;
	private Double currentAmount;

	// Constructors

	/** default constructor */
	public Fulecard() {
	}

	/** full constructor */
	public Fulecard(String fulecardNo, Date buyDate, String vehicle,
			Double warningAmount, Double initAmount, Double currentAmount) {
		this.fulecardNo = fulecardNo;
		this.buyDate = buyDate;
		this.vehicle = vehicle;
		this.warningAmount = warningAmount;
		this.initAmount = initAmount;
		this.currentAmount = currentAmount;
	}

	// Property accessors

	public Integer getFulecardId() {
		return this.fulecardId;
	}

	public void setFulecardId(Integer fulecardId) {
		this.fulecardId = fulecardId;
	}

	public String getFulecardNo() {
		return this.fulecardNo;
	}

	public void setFulecardNo(String fulecardNo) {
		this.fulecardNo = fulecardNo;
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

	public Double getWarningAmount() {
		return this.warningAmount;
	}

	public void setWarningAmount(Double warningAmount) {
		this.warningAmount = warningAmount;
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

}