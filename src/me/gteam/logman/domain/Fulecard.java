package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fulecard entity. @author MyEclipse Persistence Tools
 */

public class Fulecard implements java.io.Serializable {

	// Fields

	private Integer fulecardId;
	private Vehicle vehicle;
	private FulecardType fulecardType;
	private String fulecardNo;
	private Date buyDate;
	private Double warningAmount;
	private Double initAmount;
	private Double currentAmount;
	private Set cardRefuels = new HashSet(0);
	private Set oilcardRecharges = new HashSet(0);

	// Constructors

	/** default constructor */
	public Fulecard() {
	}

	/** minimal constructor */
	public Fulecard(Integer fulecardId) {
		this.fulecardId = fulecardId;
	}

	/** full constructor */
	public Fulecard(Integer fulecardId, Vehicle vehicle,
			FulecardType fulecardType, String fulecardNo, Date buyDate,
			Double warningAmount, Double initAmount, Double currentAmount,
			Set cardRefuels, Set oilcardRecharges) {
		this.fulecardId = fulecardId;
		this.vehicle = vehicle;
		this.fulecardType = fulecardType;
		this.fulecardNo = fulecardNo;
		this.buyDate = buyDate;
		this.warningAmount = warningAmount;
		this.initAmount = initAmount;
		this.currentAmount = currentAmount;
		this.cardRefuels = cardRefuels;
		this.oilcardRecharges = oilcardRecharges;
	}

	// Property accessors

	public Integer getFulecardId() {
		return this.fulecardId;
	}

	public void setFulecardId(Integer fulecardId) {
		this.fulecardId = fulecardId;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public FulecardType getFulecardType() {
		return this.fulecardType;
	}

	public void setFulecardType(FulecardType fulecardType) {
		this.fulecardType = fulecardType;
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

	public Set getCardRefuels() {
		return this.cardRefuels;
	}

	public void setCardRefuels(Set cardRefuels) {
		this.cardRefuels = cardRefuels;
	}

	public Set getOilcardRecharges() {
		return this.oilcardRecharges;
	}

	public void setOilcardRecharges(Set oilcardRecharges) {
		this.oilcardRecharges = oilcardRecharges;
	}

}