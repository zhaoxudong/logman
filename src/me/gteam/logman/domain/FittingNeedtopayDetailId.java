package me.gteam.logman.domain;

import java.util.Date;

/**
 * FittingNeedtopayDetailId entity. @author MyEclipse Persistence Tools
 */

public class FittingNeedtopayDetailId implements java.io.Serializable {

	// Fields

	private Integer purchaseId;
	private Date date;
	private Double needtopay;
	private Double aldeaypay;
	private Double nothasPay;
	private Double thisPay;
	private String ispay;

	// Constructors

	/** default constructor */
	public FittingNeedtopayDetailId() {
	}

	/** full constructor */
	public FittingNeedtopayDetailId(Integer purchaseId, Date date,
			Double needtopay, Double aldeaypay, Double nothasPay,
			Double thisPay, String ispay) {
		this.purchaseId = purchaseId;
		this.date = date;
		this.needtopay = needtopay;
		this.aldeaypay = aldeaypay;
		this.nothasPay = nothasPay;
		this.thisPay = thisPay;
		this.ispay = ispay;
	}

	// Property accessors

	public Integer getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getAldeaypay() {
		return this.aldeaypay;
	}

	public void setAldeaypay(Double aldeaypay) {
		this.aldeaypay = aldeaypay;
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
		if (!(other instanceof FittingNeedtopayDetailId))
			return false;
		FittingNeedtopayDetailId castOther = (FittingNeedtopayDetailId) other;

		return ((this.getPurchaseId() == castOther.getPurchaseId()) || (this
				.getPurchaseId() != null && castOther.getPurchaseId() != null && this
				.getPurchaseId().equals(castOther.getPurchaseId())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getNeedtopay() == castOther.getNeedtopay()) || (this
						.getNeedtopay() != null
						&& castOther.getNeedtopay() != null && this
						.getNeedtopay().equals(castOther.getNeedtopay())))
				&& ((this.getAldeaypay() == castOther.getAldeaypay()) || (this
						.getAldeaypay() != null
						&& castOther.getAldeaypay() != null && this
						.getAldeaypay().equals(castOther.getAldeaypay())))
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
				+ (getPurchaseId() == null ? 0 : this.getPurchaseId()
						.hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result
				+ (getNeedtopay() == null ? 0 : this.getNeedtopay().hashCode());
		result = 37 * result
				+ (getAldeaypay() == null ? 0 : this.getAldeaypay().hashCode());
		result = 37 * result
				+ (getNothasPay() == null ? 0 : this.getNothasPay().hashCode());
		result = 37 * result
				+ (getThisPay() == null ? 0 : this.getThisPay().hashCode());
		result = 37 * result
				+ (getIspay() == null ? 0 : this.getIspay().hashCode());
		return result;
	}

}