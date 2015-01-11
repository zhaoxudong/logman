package me.gteam.logman.domain;

import java.util.Date;

/**
 * FreightNeedtopayDetailId entity. @author MyEclipse Persistence Tools
 */

public class FreightNeedtopayDetailId implements java.io.Serializable {

	// Fields

	private FreightNeedtopay freightNeedtopay;
	private Dispatch dispatch;
	private Date transportDate;
	private Integer vehicle;
	private Double needtopay;
	private Double alreadySettle;
	private Double nothasSettle;
	private Double thisSettle;
	private String ispay;
	private Integer consignee;
	private Integer goods;
	private Integer startplace;
	private Integer endplace;

	// Constructors

	/** default constructor */
	public FreightNeedtopayDetailId() {
	}

	/** full constructor */
	public FreightNeedtopayDetailId(FreightNeedtopay freightNeedtopay,
			Dispatch dispatch, Date transportDate, Integer vehicle,
			Double needtopay, Double alreadySettle, Double nothasSettle,
			Double thisSettle, String ispay, Integer consignee, Integer goods,
			Integer startplace, Integer endplace) {
		this.freightNeedtopay = freightNeedtopay;
		this.dispatch = dispatch;
		this.transportDate = transportDate;
		this.vehicle = vehicle;
		this.needtopay = needtopay;
		this.alreadySettle = alreadySettle;
		this.nothasSettle = nothasSettle;
		this.thisSettle = thisSettle;
		this.ispay = ispay;
		this.consignee = consignee;
		this.goods = goods;
		this.startplace = startplace;
		this.endplace = endplace;
	}

	// Property accessors

	public FreightNeedtopay getFreightNeedtopay() {
		return this.freightNeedtopay;
	}

	public void setFreightNeedtopay(FreightNeedtopay freightNeedtopay) {
		this.freightNeedtopay = freightNeedtopay;
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

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getAlreadySettle() {
		return this.alreadySettle;
	}

	public void setAlreadySettle(Double alreadySettle) {
		this.alreadySettle = alreadySettle;
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

	public String getIspay() {
		return this.ispay;
	}

	public void setIspay(String ispay) {
		this.ispay = ispay;
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
		if (!(other instanceof FreightNeedtopayDetailId))
			return false;
		FreightNeedtopayDetailId castOther = (FreightNeedtopayDetailId) other;

		return ((this.getFreightNeedtopay() == castOther.getFreightNeedtopay()) || (this
				.getFreightNeedtopay() != null
				&& castOther.getFreightNeedtopay() != null && this
				.getFreightNeedtopay().equals(castOther.getFreightNeedtopay())))
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
				&& ((this.getNeedtopay() == castOther.getNeedtopay()) || (this
						.getNeedtopay() != null
						&& castOther.getNeedtopay() != null && this
						.getNeedtopay().equals(castOther.getNeedtopay())))
				&& ((this.getAlreadySettle() == castOther.getAlreadySettle()) || (this
						.getAlreadySettle() != null
						&& castOther.getAlreadySettle() != null && this
						.getAlreadySettle()
						.equals(castOther.getAlreadySettle())))
				&& ((this.getNothasSettle() == castOther.getNothasSettle()) || (this
						.getNothasSettle() != null
						&& castOther.getNothasSettle() != null && this
						.getNothasSettle().equals(castOther.getNothasSettle())))
				&& ((this.getThisSettle() == castOther.getThisSettle()) || (this
						.getThisSettle() != null
						&& castOther.getThisSettle() != null && this
						.getThisSettle().equals(castOther.getThisSettle())))
				&& ((this.getIspay() == castOther.getIspay()) || (this
						.getIspay() != null && castOther.getIspay() != null && this
						.getIspay().equals(castOther.getIspay())))
				&& ((this.getConsignee() == castOther.getConsignee()) || (this
						.getConsignee() != null
						&& castOther.getConsignee() != null && this
						.getConsignee().equals(castOther.getConsignee())))
				&& ((this.getGoods() == castOther.getGoods()) || (this
						.getGoods() != null && castOther.getGoods() != null && this
						.getGoods().equals(castOther.getGoods())))
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
				+ (getFreightNeedtopay() == null ? 0 : this
						.getFreightNeedtopay().hashCode());
		result = 37 * result
				+ (getDispatch() == null ? 0 : this.getDispatch().hashCode());
		result = 37
				* result
				+ (getTransportDate() == null ? 0 : this.getTransportDate()
						.hashCode());
		result = 37 * result
				+ (getVehicle() == null ? 0 : this.getVehicle().hashCode());
		result = 37 * result
				+ (getNeedtopay() == null ? 0 : this.getNeedtopay().hashCode());
		result = 37
				* result
				+ (getAlreadySettle() == null ? 0 : this.getAlreadySettle()
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
				+ (getIspay() == null ? 0 : this.getIspay().hashCode());
		result = 37 * result
				+ (getConsignee() == null ? 0 : this.getConsignee().hashCode());
		result = 37 * result
				+ (getGoods() == null ? 0 : this.getGoods().hashCode());
		result = 37
				* result
				+ (getStartplace() == null ? 0 : this.getStartplace()
						.hashCode());
		result = 37 * result
				+ (getEndplace() == null ? 0 : this.getEndplace().hashCode());
		return result;
	}

}