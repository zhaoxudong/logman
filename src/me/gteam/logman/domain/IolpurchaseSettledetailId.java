package me.gteam.logman.domain;

import java.util.Date;

/**
 * IolpurchaseSettledetailId entity. @author MyEclipse Persistence Tools
 */

public class IolpurchaseSettledetailId implements java.io.Serializable {

	// Fields

	private OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle;
	private OilProcurement oilProcurement;
	private Date buydate;
	private Integer oiltype;
	private Double quantity;
	private Double needtopay;
	private Double alreadyPay;
	private Double nothasPay;
	private Double thisPay;
	private String ispay;

	// Constructors

	/** default constructor */
	public IolpurchaseSettledetailId() {
	}

	/** full constructor */
	public IolpurchaseSettledetailId(
			OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle,
			OilProcurement oilProcurement, Date buydate, Integer oiltype,
			Double quantity, Double needtopay, Double alreadyPay,
			Double nothasPay, Double thisPay, String ispay) {
		this.oilpurchaseNeedtopaySettle = oilpurchaseNeedtopaySettle;
		this.oilProcurement = oilProcurement;
		this.buydate = buydate;
		this.oiltype = oiltype;
		this.quantity = quantity;
		this.needtopay = needtopay;
		this.alreadyPay = alreadyPay;
		this.nothasPay = nothasPay;
		this.thisPay = thisPay;
		this.ispay = ispay;
	}

	// Property accessors

	public OilpurchaseNeedtopaySettle getOilpurchaseNeedtopaySettle() {
		return this.oilpurchaseNeedtopaySettle;
	}

	public void setOilpurchaseNeedtopaySettle(
			OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle) {
		this.oilpurchaseNeedtopaySettle = oilpurchaseNeedtopaySettle;
	}

	public OilProcurement getOilProcurement() {
		return this.oilProcurement;
	}

	public void setOilProcurement(OilProcurement oilProcurement) {
		this.oilProcurement = oilProcurement;
	}

	public Date getBuydate() {
		return this.buydate;
	}

	public void setBuydate(Date buydate) {
		this.buydate = buydate;
	}

	public Integer getOiltype() {
		return this.oiltype;
	}

	public void setOiltype(Integer oiltype) {
		this.oiltype = oiltype;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getAlreadyPay() {
		return this.alreadyPay;
	}

	public void setAlreadyPay(Double alreadyPay) {
		this.alreadyPay = alreadyPay;
	}

	public Double getNothasPay() {
		return this.nothasPay;
	}

	public void setNothasPay(Double nothasPay) {
		this.nothasPay = nothasPay;
	}

	public Double getThisPay() {
		return this.thisPay;
	}

	public void setThisPay(Double thisPay) {
		this.thisPay = thisPay;
	}

	public String getIspay() {
		return this.ispay;
	}

	public void setIspay(String ispay) {
		this.ispay = ispay;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IolpurchaseSettledetailId))
			return false;
		IolpurchaseSettledetailId castOther = (IolpurchaseSettledetailId) other;

		return ((this.getOilpurchaseNeedtopaySettle() == castOther
				.getOilpurchaseNeedtopaySettle()) || (this
				.getOilpurchaseNeedtopaySettle() != null
				&& castOther.getOilpurchaseNeedtopaySettle() != null && this
				.getOilpurchaseNeedtopaySettle().equals(
						castOther.getOilpurchaseNeedtopaySettle())))
				&& ((this.getOilProcurement() == castOther.getOilProcurement()) || (this
						.getOilProcurement() != null
						&& castOther.getOilProcurement() != null && this
						.getOilProcurement().equals(
								castOther.getOilProcurement())))
				&& ((this.getBuydate() == castOther.getBuydate()) || (this
						.getBuydate() != null && castOther.getBuydate() != null && this
						.getBuydate().equals(castOther.getBuydate())))
				&& ((this.getOiltype() == castOther.getOiltype()) || (this
						.getOiltype() != null && castOther.getOiltype() != null && this
						.getOiltype().equals(castOther.getOiltype())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this
						.getQuantity() != null
						&& castOther.getQuantity() != null && this
						.getQuantity().equals(castOther.getQuantity())))
				&& ((this.getNeedtopay() == castOther.getNeedtopay()) || (this
						.getNeedtopay() != null
						&& castOther.getNeedtopay() != null && this
						.getNeedtopay().equals(castOther.getNeedtopay())))
				&& ((this.getAlreadyPay() == castOther.getAlreadyPay()) || (this
						.getAlreadyPay() != null
						&& castOther.getAlreadyPay() != null && this
						.getAlreadyPay().equals(castOther.getAlreadyPay())))
				&& ((this.getNothasPay() == castOther.getNothasPay()) || (this
						.getNothasPay() != null
						&& castOther.getNothasPay() != null && this
						.getNothasPay().equals(castOther.getNothasPay())))
				&& ((this.getThisPay() == castOther.getThisPay()) || (this
						.getThisPay() != null && castOther.getThisPay() != null && this
						.getThisPay().equals(castOther.getThisPay())))
				&& ((this.getIspay() == castOther.getIspay()) || (this
						.getIspay() != null && castOther.getIspay() != null && this
						.getIspay().equals(castOther.getIspay())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOilpurchaseNeedtopaySettle() == null ? 0 : this
						.getOilpurchaseNeedtopaySettle().hashCode());
		result = 37
				* result
				+ (getOilProcurement() == null ? 0 : this.getOilProcurement()
						.hashCode());
		result = 37 * result
				+ (getBuydate() == null ? 0 : this.getBuydate().hashCode());
		result = 37 * result
				+ (getOiltype() == null ? 0 : this.getOiltype().hashCode());
		result = 37 * result
				+ (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37 * result
				+ (getNeedtopay() == null ? 0 : this.getNeedtopay().hashCode());
		result = 37
				* result
				+ (getAlreadyPay() == null ? 0 : this.getAlreadyPay()
						.hashCode());
		result = 37 * result
				+ (getNothasPay() == null ? 0 : this.getNothasPay().hashCode());
		result = 37 * result
				+ (getThisPay() == null ? 0 : this.getThisPay().hashCode());
		result = 37 * result
				+ (getIspay() == null ? 0 : this.getIspay().hashCode());
		return result;
	}

}