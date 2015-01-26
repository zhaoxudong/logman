package me.gteam.logman.domain;

import java.util.Date;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Date orderTime;
	private Date requireTime;
	private Integer shipper;
	private String shipperContact;
	private String shipperTel;
	private Integer consignee;
	private String consigneeContact;
	private String consigneeTel;
	private String loadPlace;
	private String unloadPlace;
	private String contractNumber;
	private String good;
	private String measurementUnit;
	private String route;
	private Double advanceAmount;
	private String iswhole;
	private Double heavykm;
	private Double emptykm;
	private String ladingNo;
	private String priceFormula;
	private Double unitPrice;
	private Double amount;
	private String settlementWay;
	private String operator;
	private String isFinished;
	private String remark;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(Date orderTime, Date requireTime, Integer shipper,
			String shipperContact, String shipperTel, Integer consignee,
			String consigneeContact, String consigneeTel, String loadPlace,
			String unloadPlace, String contractNumber, String good,
			String measurementUnit, String route, Double advanceAmount,
			String iswhole, Double heavykm, Double emptykm, String ladingNo,
			String priceFormula, Double unitPrice, Double amount,
			String settlementWay, String operator, String isFinished,
			String remark) {
		this.orderTime = orderTime;
		this.requireTime = requireTime;
		this.shipper = shipper;
		this.shipperContact = shipperContact;
		this.shipperTel = shipperTel;
		this.consignee = consignee;
		this.consigneeContact = consigneeContact;
		this.consigneeTel = consigneeTel;
		this.loadPlace = loadPlace;
		this.unloadPlace = unloadPlace;
		this.contractNumber = contractNumber;
		this.good = good;
		this.measurementUnit = measurementUnit;
		this.route = route;
		this.advanceAmount = advanceAmount;
		this.iswhole = iswhole;
		this.heavykm = heavykm;
		this.emptykm = emptykm;
		this.ladingNo = ladingNo;
		this.priceFormula = priceFormula;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.settlementWay = settlementWay;
		this.operator = operator;
		this.isFinished = isFinished;
		this.remark = remark;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getRequireTime() {
		return this.requireTime;
	}

	public void setRequireTime(Date requireTime) {
		this.requireTime = requireTime;
	}

	public Integer getShipper() {
		return this.shipper;
	}

	public void setShipper(Integer shipper) {
		this.shipper = shipper;
	}

	public String getShipperContact() {
		return this.shipperContact;
	}

	public void setShipperContact(String shipperContact) {
		this.shipperContact = shipperContact;
	}

	public String getShipperTel() {
		return this.shipperTel;
	}

	public void setShipperTel(String shipperTel) {
		this.shipperTel = shipperTel;
	}

	public Integer getConsignee() {
		return this.consignee;
	}

	public void setConsignee(Integer consignee) {
		this.consignee = consignee;
	}

	public String getConsigneeContact() {
		return this.consigneeContact;
	}

	public void setConsigneeContact(String consigneeContact) {
		this.consigneeContact = consigneeContact;
	}

	public String getConsigneeTel() {
		return this.consigneeTel;
	}

	public void setConsigneeTel(String consigneeTel) {
		this.consigneeTel = consigneeTel;
	}

	public String getLoadPlace() {
		return this.loadPlace;
	}

	public void setLoadPlace(String loadPlace) {
		this.loadPlace = loadPlace;
	}

	public String getUnloadPlace() {
		return this.unloadPlace;
	}

	public void setUnloadPlace(String unloadPlace) {
		this.unloadPlace = unloadPlace;
	}

	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getGood() {
		return this.good;
	}

	public void setGood(String good) {
		this.good = good;
	}

	public String getMeasurementUnit() {
		return this.measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Double getAdvanceAmount() {
		return this.advanceAmount;
	}

	public void setAdvanceAmount(Double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public String getIswhole() {
		return this.iswhole;
	}

	public void setIswhole(String iswhole) {
		this.iswhole = iswhole;
	}

	public Double getHeavykm() {
		return this.heavykm;
	}

	public void setHeavykm(Double heavykm) {
		this.heavykm = heavykm;
	}

	public Double getEmptykm() {
		return this.emptykm;
	}

	public void setEmptykm(Double emptykm) {
		this.emptykm = emptykm;
	}

	public String getLadingNo() {
		return this.ladingNo;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}

	public String getPriceFormula() {
		return this.priceFormula;
	}

	public void setPriceFormula(String priceFormula) {
		this.priceFormula = priceFormula;
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

	public String getSettlementWay() {
		return this.settlementWay;
	}

	public void setSettlementWay(String settlementWay) {
		this.settlementWay = settlementWay;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getIsFinished() {
		return this.isFinished;
	}

	public void setIsFinished(String isFinished) {
		this.isFinished = isFinished;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}