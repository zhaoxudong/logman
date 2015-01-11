package me.gteam.logman.domain;

import java.util.Date;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private RouteTemplate routeTemplate;
	private UnloadLocation unloadLocation;
	private Route route;
	private LoadLocation loadLocation;
	private Costumer costumerByConsignee;
	private Costumer costumerByShipper;
	private Goods goods;
	private Date orderTime;
	private Date requireTime;
	private String shipperContact;
	private String shipperTel;
	private String consigneeContact;
	private String consigneeTel;
	private String contractNumber;
	private String measurementUnit;
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
	private Integer isFinished;
	private String remark;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Integer orderId) {
		this.orderId = orderId;
	}

	/** full constructor */
	public Orders(Integer orderId, RouteTemplate routeTemplate,
			UnloadLocation unloadLocation, Route route,
			LoadLocation loadLocation, Costumer costumerByConsignee,
			Costumer costumerByShipper, Goods goods, Date orderTime,
			Date requireTime, String shipperContact, String shipperTel,
			String consigneeContact, String consigneeTel,
			String contractNumber, String measurementUnit,
			Double advanceAmount, String iswhole, Double heavykm,
			Double emptykm, String ladingNo, String priceFormula,
			Double unitPrice, Double amount, String settlementWay,
			String operator, Integer isFinished, String remark) {
		this.orderId = orderId;
		this.routeTemplate = routeTemplate;
		this.unloadLocation = unloadLocation;
		this.route = route;
		this.loadLocation = loadLocation;
		this.costumerByConsignee = costumerByConsignee;
		this.costumerByShipper = costumerByShipper;
		this.goods = goods;
		this.orderTime = orderTime;
		this.requireTime = requireTime;
		this.shipperContact = shipperContact;
		this.shipperTel = shipperTel;
		this.consigneeContact = consigneeContact;
		this.consigneeTel = consigneeTel;
		this.contractNumber = contractNumber;
		this.measurementUnit = measurementUnit;
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

	public RouteTemplate getRouteTemplate() {
		return this.routeTemplate;
	}

	public void setRouteTemplate(RouteTemplate routeTemplate) {
		this.routeTemplate = routeTemplate;
	}

	public UnloadLocation getUnloadLocation() {
		return this.unloadLocation;
	}

	public void setUnloadLocation(UnloadLocation unloadLocation) {
		this.unloadLocation = unloadLocation;
	}

	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public LoadLocation getLoadLocation() {
		return this.loadLocation;
	}

	public void setLoadLocation(LoadLocation loadLocation) {
		this.loadLocation = loadLocation;
	}

	public Costumer getCostumerByConsignee() {
		return this.costumerByConsignee;
	}

	public void setCostumerByConsignee(Costumer costumerByConsignee) {
		this.costumerByConsignee = costumerByConsignee;
	}

	public Costumer getCostumerByShipper() {
		return this.costumerByShipper;
	}

	public void setCostumerByShipper(Costumer costumerByShipper) {
		this.costumerByShipper = costumerByShipper;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
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

	public Integer getIsFinished() {
		return this.isFinished;
	}

	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}