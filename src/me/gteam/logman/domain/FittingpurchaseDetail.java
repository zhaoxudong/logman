package me.gteam.logman.domain;

/**
 * FittingpurchaseDetail entity. @author MyEclipse Persistence Tools
 */

public class FittingpurchaseDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private FittingPurchase fittingPurchase;
	private String fittingNo;
	private String fittingName;
	private String standard;
	private Double quantity;
	private Double unitPrice;
	private Double amount;

	// Constructors

	/** default constructor */
	public FittingpurchaseDetail() {
	}

	/** full constructor */
	public FittingpurchaseDetail(FittingPurchase fittingPurchase,
			String fittingNo, String fittingName, String standard,
			Double quantity, Double unitPrice, Double amount) {
		this.fittingPurchase = fittingPurchase;
		this.fittingNo = fittingNo;
		this.fittingName = fittingName;
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

	public FittingPurchase getFittingPurchase() {
		return this.fittingPurchase;
	}

	public void setFittingPurchase(FittingPurchase fittingPurchase) {
		this.fittingPurchase = fittingPurchase;
	}

	public String getFittingNo() {
		return this.fittingNo;
	}

	public void setFittingNo(String fittingNo) {
		this.fittingNo = fittingNo;
	}

	public String getFittingName() {
		return this.fittingName;
	}

	public void setFittingName(String fittingName) {
		this.fittingName = fittingName;
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