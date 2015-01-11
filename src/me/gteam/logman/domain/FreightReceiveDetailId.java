package me.gteam.logman.domain;

import java.util.Date;

/**
 * FreightReceiveDetailId entity. @author MyEclipse Persistence Tools
 */

public class FreightReceiveDetailId implements java.io.Serializable {

	// Fields

	private FreightNeedtoreceive freightNeedtoreceive;
	private Dispatch dispatch;
	private Date transportDate;
	private Integer vehicle;
	private Double receiveAmount;
	private Double aldeadySettle;
	private Double nothasSettle;
	private Double thisSettle;
	private String isreceive;
	private Integer consignee;
	private Integer goods;
	private Double weight;
	private Integer startplace;
	private Integer endplace;

	// Constructors

	/** default constructor */
	public FreightReceiveDetailId() {
	}

	/** minimal constructor */
	public FreightReceiveDetailId(FreightNeedtoreceive freightNeedtoreceive) {
		this.freightNeedtoreceive = freightNeedtoreceive;
	}

	/** full constructor */
	public FreightReceiveDetailId(FreightNeedtoreceive freightNeedtoreceive,
			Dispatch dispatch, Date transportDate, Integer vehicle,
			Double receiveAmount, Double aldeadySettle, Double nothasSettle,
			Double thisSettle, String isreceive, Integer consignee,
			Integer goods, Double weight, Integer startplace, Integer endplace) {
		this.freightNeedtoreceive = freightNeedtoreceive;
		this.dispatch = dispatch;
		this.transportDate = transportDate;
		this.vehicle = vehicle;
		this.receiveAmount = receiveAmount;
		this.aldeadySettle = aldeadySettle;
		this.nothasSettle = nothasSettle;
		this.thisSettle = thisSettle;
		this.isreceive = isreceive;
		this.consignee = consignee;
		this.goods = goods;
		this.weight = weight;
		this.startplace = startplace;
		this.endplace = endplace;
	}

	// Property accessors

	public FreightNeedtoreceive getFreightNeedtoreceive() {
		return this.freightNeedtoreceive;
	}

	public void setFreightNeedtoreceive(
			FreightNeedtoreceive freightNeedtoreceive) {
		this.freightNeedtoreceive = freightNeedtoreceive;
	}

	public Dispatch getDispatch() {
		return this.dispatch;
	}

	public void setDispatch(Dispatch dispatch) {
		this.dispatch = dispatch;
	}

	public Date getTransportDate() {
		return this.transportDate;
	}

	public void setTransportDate(Date transportDate) {
		this.transportDate = transportDate;
	}

	public Integer getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Integer vehicle) {
		this.vehicle = vehicle;
	}

	public Double getReceiveAmount() {
		return this.receiveAmount;
	}

	public void setReceiveAmount(Double receiveAmount) {
		this.receiveAmount = receiveAmount;
	}

	public Double getAldeadySettle() {
		return this.aldeadySettle;
	}

	public void setAldeadySettle(Double aldeadySettle) {
		this.aldeadySettle = aldeadySettle;
	}

	public Double getNothasSettle() {
		return this.nothasSettle;
	}

	public void setNothasSettle(Double nothasSettle) {
		this.nothasSettle = nothasSettle;
	}

	public Double getThisSettle() {
		return this.thisSettle;
	}

	public void setThisSettle(Double thisSettle) {
		this.thisSettle = thisSettle;
	}

	public String getIsreceive() {
		return this.isreceive;
	}

	public void setIsreceive(String isreceive) {
		this.isreceive = isreceive;
	}

	public Integer getConsignee() {
		return this.consignee;
	}

	public void setConsignee(Integer consignee) {
		this.consignee = consignee;
	}

	public Integer getGoods() {
		return this.goods;
	}

	public void setGoods(Integer goods) {
		this.goods = goods;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getStartplace() {
		return this.startplace;
	}

	public void setStartplace(Integer startplace) {
		this.startplace = startplace;
	}

	public Integer getEndplace() {
		return this.endplace;
	}

	public void setEndplace(Integer endplace) {
		this.endplace = endplace;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FreightReceiveDetailId))
			return false;
		FreightReceiveDetailId castOther = (FreightReceiveDetailId) other;

		return ((this.getFreightNeedtoreceive() == castOther
				.getFreightNeedtoreceive()) || (this.getFreightNeedtoreceive() != null
				&& castOther.getFreightNeedtoreceive() != null && this
				.getFreightNeedtoreceive().equals(
						castOther.getFreightNeedtoreceive())))
				&& ((this.getDispatch() == castOther.getDispatch()) || (this
						.getDispatch() != null
						&& castOther.getDispatch() != null && this
						.getDispatch().equals(castOther.getDispatch())))
				&& ((this.getTransportDate() == castOther.getTransportDate()) || (this
						.getTransportDate() != null
						&& castOther.getTransportDate() != null && this
						.getTransportDate()
						.equals(castOther.getTransportDate())))
				&& ((this.getVehicle() == castOther.getVehicle()) || (this
						.getVehicle() != null && castOther.getVehicle() != null && this
						.getVehicle().equals(castOther.getVehicle())))
				&& ((this.getReceiveAmount() == castOther.getReceiveAmount()) || (this
						.getReceiveAmount() != null
						&& castOther.getReceiveAmount() != null && this
						.getReceiveAmount()
						.equals(castOther.getReceiveAmount())))
				&& ((this.getAldeadySettle() == castOther.getAldeadySettle()) || (this
						.getAldeadySettle() != null
						&& castOther.getAldeadySettle() != null && this
						.getAldeadySettle()
						.equals(castOther.getAldeadySettle())))
				&& ((this.getNothasSettle() == castOther.getNothasSettle()) || (this
						.getNothasSettle() != null
						&& castOther.getNothasSettle() != null && this
						.getNothasSettle().equals(castOther.getNothasSettle())))
				&& ((this.getThisSettle() == castOther.getThisSettle()) || (this
						.getThisSettle() != null
						&& castOther.getThisSettle() != null && this
						.getThisSettle().equals(castOther.getThisSettle())))
				&& ((this.getIsreceive() == castOther.getIsreceive()) || (this
						.getIsreceive() != null
						&& castOther.getIsreceive() != null && this
						.getIsreceive().equals(castOther.getIsreceive())))
				&& ((this.getConsignee() == castOther.getConsignee()) || (this
						.getConsignee() != null
						&& castOther.getConsignee() != null && this
						.getConsignee().equals(castOther.getConsignee())))
				&& ((this.getGoods() == castOther.getGoods()) || (this
						.getGoods() != null && castOther.getGoods() != null && this
						.getGoods().equals(castOther.getGoods())))
				&& ((this.getWeight() == castOther.getWeight()) || (this
						.getWeight() != null && castOther.getWeight() != null && this
						.getWeight().equals(castOther.getWeight())))
				&& ((this.getStartplace() == castOther.getStartplace()) || (this
						.getStartplace() != null
						&& castOther.getStartplace() != null && this
						.getStartplace().equals(castOther.getStartplace())))
				&& ((this.getEndplace() == castOther.getEndplace()) || (this
						.getEndplace() != null
						&& castOther.getEndplace() != null && this
						.getEndplace().equals(castOther.getEndplace())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFreightNeedtoreceive() == null ? 0 : this
						.getFreightNeedtoreceive().hashCode());
		result = 37 * result
				+ (getDispatch() == null ? 0 : this.getDispatch().hashCode());
		result = 37
				* result
				+ (getTransportDate() == null ? 0 : this.getTransportDate()
						.hashCode());
		result = 37 * result
				+ (getVehicle() == null ? 0 : this.getVehicle().hashCode());
		result = 37
				* result
				+ (getReceiveAmount() == null ? 0 : this.getReceiveAmount()
						.hashCode());
		result = 37
				* result
				+ (getAldeadySettle() == null ? 0 : this.getAldeadySettle()
						.hashCode());
		result = 37
				* result
				+ (getNothasSettle() == null ? 0 : this.getNothasSettle()
						.hashCode());
		result = 37
				* result
				+ (getThisSettle() == null ? 0 : this.getThisSettle()
						.hashCode());
		result = 37 * result
				+ (getIsreceive() == null ? 0 : this.getIsreceive().hashCode());
		result = 37 * result
				+ (getConsignee() == null ? 0 : this.getConsignee().hashCode());
		result = 37 * result
				+ (getGoods() == null ? 0 : this.getGoods().hashCode());
		result = 37 * result
				+ (getWeight() == null ? 0 : this.getWeight().hashCode());
		result = 37
				* result
				+ (getStartplace() == null ? 0 : this.getStartplace()
						.hashCode());
		result = 37 * result
				+ (getEndplace() == null ? 0 : this.getEndplace().hashCode());
		return result;
	}

}