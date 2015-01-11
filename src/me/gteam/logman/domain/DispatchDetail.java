package me.gteam.logman.domain;

import java.util.Date;

/**
 * DispatchDetail entity. @author MyEclipse Persistence Tools
 */

public class DispatchDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private Dispatch dispatch;
	private Date deliveryDate;
	private Integer shipper;
	private Integer consignee;
	private Integer routerName;
	private Integer goods;
	private String iswhole;
	private Integer ladingNo;
	private String pickupAddress;
	private String deliveryAddress;
	private Integer orderId;
	private Double dispatchAmount;
	private Double actualAmount;
	private String unit;
	private String remark;

	// Constructors

	/** default constructor */
	public DispatchDetail() {
	}

	/** minimal constructor */
	public DispatchDetail(Integer detailId) {
		this.detailId = detailId;
	}

	/** full constructor */
	public DispatchDetail(Integer detailId, Dispatch dispatch,
			Date deliveryDate, Integer shipper, Integer consignee,
			Integer routerName, Integer goods, String iswhole,
			Integer ladingNo, String pickupAddress, String deliveryAddress,
			Integer orderId, Double dispatchAmount, Double actualAmount,
			String unit, String remark) {
		this.detailId = detailId;
		this.dispatch = dispatch;
		this.deliveryDate = deliveryDate;
		this.shipper = shipper;
		this.consignee = consignee;
		this.routerName = routerName;
		this.goods = goods;
		this.iswhole = iswhole;
		this.ladingNo = ladingNo;
		this.pickupAddress = pickupAddress;
		this.deliveryAddress = deliveryAddress;
		this.orderId = orderId;
		this.dispatchAmount = dispatchAmount;
		this.actualAmount = actualAmount;
		this.unit = unit;
		this.remark = remark;
	}

	// Property accessors

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Dispatch getDispatch() {
		return this.dispatch;
	}

	public void setDispatch(Dispatch dispatch) {
		this.dispatch = dispatch;
	}

	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Integer getShipper() {
		return this.shipper;
	}

	public void setShipper(Integer shipper) {
		this.shipper = shipper;
	}

	public Integer getConsignee() {
		return this.consignee;
	}

	public void setConsignee(Integer consignee) {
		this.consignee = consignee;
	}

	public Integer getRouterName() {
		return this.routerName;
	}

	public void setRouterName(Integer routerName) {
		this.routerName = routerName;
	}

	public Integer getGoods() {
		return this.goods;
	}

	public void setGoods(Integer goods) {
		this.goods = goods;
	}

	public String getIswhole() {
		return this.iswhole;
	}

	public void setIswhole(String iswhole) {
		this.iswhole = iswhole;
	}

	public Integer getLadingNo() {
		return this.ladingNo;
	}

	public void setLadingNo(Integer ladingNo) {
		this.ladingNo = ladingNo;
	}

	public String getPickupAddress() {
		return this.pickupAddress;
	}

	public void setPickupAddress(String pickupAddress) {
		this.pickupAddress = pickupAddress;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Double getDispatchAmount() {
		return this.dispatchAmount;
	}

	public void setDispatchAmount(Double dispatchAmount) {
		this.dispatchAmount = dispatchAmount;
	}

	public Double getActualAmount() {
		return this.actualAmount;
	}

	public void setActualAmount(Double actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}