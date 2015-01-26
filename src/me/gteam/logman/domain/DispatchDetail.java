package me.gteam.logman.domain;

import java.util.Date;

/**
 * DispatchDetail entity. @author MyEclipse Persistence Tools
 */

public class DispatchDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private Dispatch dispatch;
	private Integer orderId;
	private Date deliveryDate;
	private String iswhole;
	private Double dispatchAmount;
	private Double actualAmount;
	private String remark;

	// Constructors

	/** default constructor */
	public DispatchDetail() {
	}

	/** full constructor */
	public DispatchDetail(Dispatch dispatch, Integer orderId,
			Date deliveryDate, String iswhole, Double dispatchAmount,
			Double actualAmount, String remark) {
		this.dispatch = dispatch;
		this.orderId = orderId;
		this.deliveryDate = deliveryDate;
		this.iswhole = iswhole;
		this.dispatchAmount = dispatchAmount;
		this.actualAmount = actualAmount;
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

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getIswhole() {
		return this.iswhole;
	}

	public void setIswhole(String iswhole) {
		this.iswhole = iswhole;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}