package me.gteam.logman.domain;

import java.util.Date;

/**
 * RepairPayDetailId entity. @author MyEclipse Persistence Tools
 */

public class RepairPayDetailId implements java.io.Serializable {

	// Fields

	private RepairNeedtopay repairNeedtopay;
	private Integer number;
	private Date dare;
	private Integer fitting;
	private Double needtopay;
	private Double aldeayPay;
	private Double nothasPay;
	private Double thisPay;
	private String ispay;

	// Constructors

	/** default constructor */
	public RepairPayDetailId() {
	}

	/** full constructor */
	public RepairPayDetailId(RepairNeedtopay repairNeedtopay, Integer number,
			Date dare, Integer fitting, Double needtopay, Double aldeayPay,
			Double nothasPay, Double thisPay, String ispay) {
		this.repairNeedtopay = repairNeedtopay;
		this.number = number;
		this.dare = dare;
		this.fitting = fitting;
		this.needtopay = needtopay;
		this.aldeayPay = aldeayPay;
		this.nothasPay = nothasPay;
		this.thisPay = thisPay;
		this.ispay = ispay;
	}

	// Property accessors

	public RepairNeedtopay getRepairNeedtopay() {
		return this.repairNeedtopay;
	}

	public void setRepairNeedtopay(RepairNeedtopay repairNeedtopay) {
		this.repairNeedtopay = repairNeedtopay;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDare() {
		return this.dare;
	}

	public void setDare(Date dare) {
		this.dare = dare;
	}

	public Integer getFitting() {
		return this.fitting;
	}

	public void setFitting(Integer fitting) {
		this.fitting = fitting;
	}

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getAldeayPay() {
		return this.aldeayPay;
	}

	public void setAldeayPay(Double aldeayPay) {
		this.aldeayPay = aldeayPay;
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
		if (!(other instanceof RepairPayDetailId))
			return false;
		RepairPayDetailId castOther = (RepairPayDetailId) other;

		return ((this.getRepairNeedtopay() == castOther.getRepairNeedtopay()) || (this
				.getRepairNeedtopay() != null
				&& castOther.getRepairNeedtopay() != null && this
				.getRepairNeedtopay().equals(castOther.getRepairNeedtopay())))
				&& ((this.getNumber() == castOther.getNumber()) || (this
						.getNumber() != null && castOther.getNumber() != null && this
						.getNumber().equals(castOther.getNumber())))
				&& ((this.getDare() == castOther.getDare()) || (this.getDare() != null
						&& castOther.getDare() != null && this.getDare()
						.equals(castOther.getDare())))
				&& ((this.getFitting() == castOther.getFitting()) || (this
						.getFitting() != null && castOther.getFitting() != null && this
						.getFitting().equals(castOther.getFitting())))
				&& ((this.getNeedtopay() == castOther.getNeedtopay()) || (this
						.getNeedtopay() != null
						&& castOther.getNeedtopay() != null && this
						.getNeedtopay().equals(castOther.getNeedtopay())))
				&& ((this.getAldeayPay() == castOther.getAldeayPay()) || (this
						.getAldeayPay() != null
						&& castOther.getAldeayPay() != null && this
						.getAldeayPay().equals(castOther.getAldeayPay())))
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
				+ (getRepairNeedtopay() == null ? 0 : this.getRepairNeedtopay()
						.hashCode());
		result = 37 * result
				+ (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result
				+ (getDare() == null ? 0 : this.getDare().hashCode());
		result = 37 * result
				+ (getFitting() == null ? 0 : this.getFitting().hashCode());
		result = 37 * result
				+ (getNeedtopay() == null ? 0 : this.getNeedtopay().hashCode());
		result = 37 * result
				+ (getAldeayPay() == null ? 0 : this.getAldeayPay().hashCode());
		result = 37 * result
				+ (getNothasPay() == null ? 0 : this.getNothasPay().hashCode());
		result = 37 * result
				+ (getThisPay() == null ? 0 : this.getThisPay().hashCode());
		result = 37 * result
				+ (getIspay() == null ? 0 : this.getIspay().hashCode());
		return result;
	}

}