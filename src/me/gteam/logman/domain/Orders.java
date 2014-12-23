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
	private Integer templateNo;
	private String shipperContact;
	private String shipperTel;
	private String consigneeContact;
	private String consigneeTel;
	private String contractNumber;
	private Integer loadAddr;
	private Integer unloadAddr;
	private Integer goods;
	private String measurementUnit;
	private Double advanceAmount;
	private String iswhole;
	private Integer routeId;
	private Double heavykm;
	private Double emptykm;
	private String ladingNo;
	private String priceFormula;
	private Double unitPrice;
	private Double amount;
	private String settlementWay;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(Date orderTime, Date requireTime, Integer templateNo,
			String shipperContact, String shipperTel, String consigneeContact,
			String consigneeTel, String contractNumber, Integer loadAddr,
			Integer unloadAddr, Integer goods, String measurementUnit,
			Double advanceAmount, String iswhole, Integer routeId,
			Double heavykm, Double emptykm, String ladingNo,
			String priceFormula, Double unitPrice, Double amount,
			String settlementWay, String operator, String remark) {
		this.orderTime = orderTime;
		this.requireTime = requireTime;
		this.templateNo = templateNo;
		this.shipperContact = shipperContact;
		this.shipperTel = shipperTel;
		this.consigneeContact = consigneeContact;
		this.consigneeTel = consigneeTel;
		this.contractNumber = contractNumber;
		this.loadAddr = loadAddr;
		this.unloadAddr = unloadAddr;
		this.goods = goods;
		this.measurementUnit = measurementUnit;
		this.advanceAmount = advanceAmount;
		this.iswhole = iswhole;
		this.routeId = routeId;
		this.heavykm = heavykm;
		this.emptykm = emptykm;
		this.ladingNo = ladingNo;
		this.priceFormula = priceFormula;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.settlementWay = settlementWay;
		this.operator = operator;
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

	public Integer getTemplateNo() {
		return this.templateNo;
	}

	public void setTemplateNo(Integer templateNo) {
		this.templateNo = templateNo;
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

	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Integer getLoadAddr() {
		return this.loadAddr;
	}

	public void setLoadAddr(Integer loadAddr) {
		this.loadAddr = loadAddr;
	}

	public Integer getUnloadAddr() {
		return this.unloadAddr;
	}

	public void setUnloadAddr(Integer unloadAddr) {
		this.unloadAddr = unloadAddr;
	}

	public Integer getGoods() {
		return this.goods;
	}

	public void setGoods(Integer goods) {
		this.goods = goods;
	}

	public String getMeasurementUnit() {
		return this.measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
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

	public Integer getRouteId() {
		return this.routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}