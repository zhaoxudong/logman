package me.gteam.logman.domain;

import java.util.Date;

/**
 * CardRefuel entity. @author MyEclipse Persistence Tools
 */

public class CardRefuel implements java.io.Serializable {

	// Fields

	private Integer cardRefuelId;
	private Date refuelDate;
	private String vehicle;
	private String driver;
	private String oilcard;
	private String oiltype;
	private Double unitPrice;
	private Double amount;
	private Double weignt;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public CardRefuel() {
	}

	/** full constructor */
	public CardRefuel(Date refuelDate, String vehicle, String driver,
			String oilcard, String oiltype, Double unitPrice, Double amount,
			Double weignt, String operator, String remark) {
		this.refuelDate = refuelDate;
		this.vehicle = vehicle;
		this.driver = driver;
		this.oilcard = oilcard;
		this.oiltype = oiltype;
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

	public Date getRefuelDate() {
		return this.refuelDate;
	}

	public void setRefuelDate(Date refuelDate) {
		this.refuelDate = refuelDate;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getOilcard() {
		return this.oilcard;
	}

	public void setOilcard(String oilcard) {
		this.oilcard = oilcard;
	}

	public String getOiltype() {
		return this.oiltype;
	}

	public void setOiltype(String oiltype) {
		this.oiltype = oiltype;
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