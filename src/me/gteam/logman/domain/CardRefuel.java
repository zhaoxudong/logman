package me.gteam.logman.domain;

import java.util.Date;

/**
 * CardRefuel entity. @author MyEclipse Persistence Tools
 */

public class CardRefuel implements java.io.Serializable {

	// Fields

	private Integer cardRefuelId;
	private Fuel fuel;
	private Fulecard fulecard;
	private Date refuelDate;
	private Double unitPrice;
	private Double amount;
	private Double weignt;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public CardRefuel() {
	}

	/** minimal constructor */
	public CardRefuel(Integer cardRefuelId) {
		this.cardRefuelId = cardRefuelId;
	}

	/** full constructor */
	public CardRefuel(Integer cardRefuelId, Fuel fuel, Fulecard fulecard,
			Date refuelDate, Double unitPrice, Double amount, Double weignt,
			String operator, String remark) {
		this.cardRefuelId = cardRefuelId;
		this.fuel = fuel;
		this.fulecard = fulecard;
		this.refuelDate = refuelDate;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.weignt = weignt;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getCardRefuelId() {
		return this.cardRefuelId;
	}

	public void setCardRefuelId(Integer cardRefuelId) {
		this.cardRefuelId = cardRefuelId;
	}

	public Fuel getFuel() {
		return this.fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Fulecard getFulecard() {
		return this.fulecard;
	}

	public void setFulecard(Fulecard fulecard) {
		this.fulecard = fulecard;
	}

	public Date getRefuelDate() {
		return this.refuelDate;
	}

	public void setRefuelDate(Date refuelDate) {
		this.refuelDate = refuelDate;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getWeignt() {
		return this.weignt;
	}

	public void setWeignt(Double weignt) {
		this.weignt = weignt;
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