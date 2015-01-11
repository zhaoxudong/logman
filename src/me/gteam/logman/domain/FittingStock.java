package me.gteam.logman.domain;

/**
 * FittingStock entity. @author MyEclipse Persistence Tools
 */

public class FittingStock implements java.io.Serializable {

	// Fields

	private Integer fittingNo;
	private Fittingdetail fittingdetail;
	private String standard;
	private String classification;
	private Double quantity;
	private Double unitPrice;
	private Double amount;

	// Constructors

	/** default constructor */
	public FittingStock() {
	}

	/** minimal constructor */
	public FittingStock(Integer fittingNo, Fittingdetail fittingdetail) {
		this.fittingNo = fittingNo;
		this.fittingdetail = fittingdetail;
	}

	/** full constructor */
	public FittingStock(Integer fittingNo, Fittingdetail fittingdetail,
			String standard, String classification, Double quantity,
			Double unitPrice, Double amount) {
		this.fittingNo = fittingNo;
		this.fittingdetail = fittingdetail;
		this.standard = standard;
		this.classification = classification;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}

	// Property accessors

	public Integer getFittingNo() {
		return this.fittingNo;
	}

	public void setFittingNo(Integer fittingNo) {
		this.fittingNo = fittingNo;
	}

	public Fittingdetail getFittingdetail() {
		return this.fittingdetail;
	}

	public void setFittingdetail(Fittingdetail fittingdetail) {
		this.fittingdetail = fittingdetail;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
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