package me.gteam.logman.domain;

/**
 * FittingpurchaseDetail entity. @author MyEclipse Persistence Tools
 */

public class FittingpurchaseDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private Fittingdetail fittingdetail;
	private FittingPurchase fittingPurchase;
	private String standard;
	private Double quantity;
	private Double unitPrice;
	private Double amount;

	// Constructors

	/** default constructor */
	public FittingpurchaseDetail() {
	}

	/** minimal constructor */
	public FittingpurchaseDetail(Integer detailId) {
		this.detailId = detailId;
	}

	/** full constructor */
	public FittingpurchaseDetail(Integer detailId, Fittingdetail fittingdetail,
			FittingPurchase fittingPurchase, String standard, Double quantity,
			Double unitPrice, Double amount) {
		this.detailId = detailId;
		this.fittingdetail = fittingdetail;
		this.fittingPurchase = fittingPurchase;
		this.standard = standard;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}

	// Property accessors

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Fittingdetail getFittingdetail() {
		return this.fittingdetail;
	}

	public void setFittingdetail(Fittingdetail fittingdetail) {
		this.fittingdetail = fittingdetail;
	}

	public FittingPurchase getFittingPurchase() {
		return this.fittingPurchase;
	}

	public void setFittingPurchase(FittingPurchase fittingPurchase) {
		this.fittingPurchase = fittingPurchase;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
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

}