package me.gteam.logman.domain;

import java.util.Date;

/**
 * AddoilPayDetailId entity. @author MyEclipse Persistence Tools
 */

public class AddoilPayDetailId implements java.io.Serializable {

	// Fields

	private AddoilNeedtopaysettle addoilNeedtopaysettle;
	private FixpointRefueling fixpointRefueling;
	private Date date;
	private Integer oiltype;
	private Double unitPlace;
	private Double weight;
	private Double needtopay;
	private Double alreadyPay;
	private Double nothasPay;
	private Double thisPay;
	private String ispay;

	// Constructors

	/** default constructor */
	public AddoilPayDetailId() {
	}

	/** full constructor */
	public AddoilPayDetailId(AddoilNeedtopaysettle addoilNeedtopaysettle,
			FixpointRefueling fixpointRefueling, Date date, Integer oiltype,
			Double unitPlace, Double weight, Double needtopay,
			Double alreadyPay, Double nothasPay, Double thisPay, String ispay) {
		this.addoilNeedtopaysettle = addoilNeedtopaysettle;
		this.fixpointRefueling = fixpointRefueling;
		this.date = date;
		this.oiltype = oiltype;
		this.unitPlace = unitPlace;
		this.weight = weight;
		this.needtopay = needtopay;
		this.alreadyPay = alreadyPay;
		this.nothasPay = nothasPay;
		this.thisPay = thisPay;
		this.ispay = ispay;
	}

	// Property accessors

	public AddoilNeedtopaysettle getAddoilNeedtopaysettle() {
		return this.addoilNeedtopaysettle;
	}

	public void setAddoilNeedtopaysettle(
			AddoilNeedtopaysettle addoilNeedtopaysettle) {
		this.addoilNeedtopaysettle = addoilNeedtopaysettle;
	}

	public FixpointRefueling getFixpointRefueling() {
		return this.fixpointRefueling;
	}

	public void setFixpointRefueling(FixpointRefueling fixpointRefueling) {
		this.fixpointRefueling = fixpointRefueling;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getOiltype() {
		return this.oiltype;
	}

	public void setOiltype(Integer oiltype) {
		this.oiltype = oiltype;
	}

	public Double getUnitPlace() {
		return this.unitPlace;
	}

	public void setUnitPlace(Double unitPlace) {
		this.unitPlace = unitPlace;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
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
		if (!(other instanceof AddoilPayDetailId))
			return false;
		AddoilPayDetailId castOther = (AddoilPayDetailId) other;

		return ((this.getAddoilNeedtopaysettle() == castOther
				.getAddoilNeedtopaysettle()) || (this
				.getAddoilNeedtopaysettle() != null
				&& castOther.getAddoilNeedtopaysettle() != null && this
				.getAddoilNeedtopaysettle().equals(
						castOther.getAddoilNeedtopaysettle())))
				&& ((this.getFixpointRefueling() == castOther
						.getFixpointRefueling()) || (this
						.getFixpointRefueling() != null
						&& castOther.getFixpointRefueling() != null && this
						.getFixpointRefueling().equals(
								castOther.getFixpointRefueling())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getOiltype() == castOther.getOiltype()) || (this
						.getOiltype() != null && castOther.getOiltype() != null && this
						.getOiltype().equals(castOther.getOiltype())))
				&& ((this.getUnitPlace() == castOther.getUnitPlace()) || (this
						.getUnitPlace() != null
						&& castOther.getUnitPlace() != null && this
						.getUnitPlace().equals(castOther.getUnitPlace())))
				&& ((this.getWeight() == castOther.getWeight()) || (this
						.getWeight() != null && castOther.getWeight() != null && this
						.getWeight().equals(castOther.getWeight())))
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
				+ (getAddoilNeedtopaysettle() == null ? 0 : this
						.getAddoilNeedtopaysettle().hashCode());
		result = 37
				* result
				+ (getFixpointRefueling() == null ? 0 : this
						.getFixpointRefueling().hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result
				+ (getOiltype() == null ? 0 : this.getOiltype().hashCode());
		result = 37 * result
				+ (getUnitPlace() == null ? 0 : this.getUnitPlace().hashCode());
		result = 37 * result
				+ (getWeight() == null ? 0 : this.getWeight().hashCode());
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