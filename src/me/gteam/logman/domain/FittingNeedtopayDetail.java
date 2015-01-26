package me.gteam.logman.domain;

/**
 * FittingNeedtopayDetail entity. @author MyEclipse Persistence Tools
 */

public class FittingNeedtopayDetail implements java.io.Serializable {

	// Fields

	private Integer mxid;
	private FittingNeedtopaySettle fittingNeedtopaySettle;
	private String purchaseId;
	private Double needtopay;
	private Double aldeaypay;
	private Double nothasPay;
	private Double thisPay;
	private String ispay;

	// Constructors

	/** default constructor */
	public FittingNeedtopayDetail() {
	}

	/** full constructor */
	public FittingNeedtopayDetail(
			FittingNeedtopaySettle fittingNeedtopaySettle, String purchaseId,
			Double needtopay, Double aldeaypay, Double nothasPay,
			Double thisPay, String ispay) {
		this.fittingNeedtopaySettle = fittingNeedtopaySettle;
		this.purchaseId = purchaseId;
		this.needtopay = needtopay;
		this.aldeaypay = aldeaypay;
		this.nothasPay = nothasPay;
		this.thisPay = thisPay;
		this.ispay = ispay;
	}

	// Property accessors

	public Integer getMxid() {
		return this.mxid;
	}

	public void setMxid(Integer mxid) {
		this.mxid = mxid;
	}

	public FittingNeedtopaySettle getFittingNeedtopaySettle() {
		return this.fittingNeedtopaySettle;
	}

	public void setFittingNeedtopaySettle(
			FittingNeedtopaySettle fittingNeedtopaySettle) {
		this.fittingNeedtopaySettle = fittingNeedtopaySettle;
	}

	public String getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
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

}