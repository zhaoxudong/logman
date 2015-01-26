package me.gteam.logman.domain;

/**
 * FittingStock entity. @author MyEclipse Persistence Tools
 */

public class FittingStock implements java.io.Serializable {

	// Fields

	private Integer stockId;
	private String fittingNo;
	private String name;
	private String standard;
	private String classification;
	private Double quantity;

	// Constructors

	/** default constructor */
	public FittingStock() {
	}

	/** minimal constructor */
	public FittingStock(String fittingNo) {
		this.fittingNo = fittingNo;
	}

	/** full constructor */
	public FittingStock(String fittingNo, String name, String standard,
			String classification, Double quantity) {
		this.fittingNo = fittingNo;
		this.name = name;
		this.standard = standard;
		this.classification = classification;
		this.quantity = quantity;
	}

	// Property accessors

	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getFittingNo() {
		return this.fittingNo;
	}

	public void setFittingNo(String fittingNo) {
		this.fittingNo = fittingNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

}