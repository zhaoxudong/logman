package me.gteam.logman.domain;

/**
 * Fittingdetail entity. @author MyEclipse Persistence Tools
 */

public class Fittingdetail implements java.io.Serializable {

	// Fields

	private Integer fittingId;
	private String fittingname;
	private String unit;
	private String standard;
	private String classification;
	private Double inPrice;
	private Double storePrice;
	private Double initAmount;
	private Double currentAmount;
	private String mnemonic;

	// Constructors

	/** default constructor */
	public Fittingdetail() {
	}

	/** full constructor */
	public Fittingdetail(String fittingname, String unit, String standard,
			String classification, Double inPrice, Double storePrice,
			Double initAmount, Double currentAmount, String mnemonic) {
		this.fittingname = fittingname;
		this.unit = unit;
		this.standard = standard;
		this.classification = classification;
		this.inPrice = inPrice;
		this.storePrice = storePrice;
		this.initAmount = initAmount;
		this.currentAmount = currentAmount;
		this.mnemonic = mnemonic;
	}

	// Property accessors

	public Integer getFittingId() {
		return this.fittingId;
	}

	public void setFittingId(Integer fittingId) {
		this.fittingId = fittingId;
	}

	public String getFittingname() {
		return this.fittingname;
	}

	public void setFittingname(String fittingname) {
		this.fittingname = fittingname;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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

	public Double getInPrice() {
		return this.inPrice;
	}

	public void setInPrice(Double inPrice) {
		this.inPrice = inPrice;
	}

	public Double getStorePrice() {
		return this.storePrice;
	}

	public void setStorePrice(Double storePrice) {
		this.storePrice = storePrice;
	}

	public Double getInitAmount() {
		return this.initAmount;
	}

	public void setInitAmount(Double initAmount) {
		this.initAmount = initAmount;
	}

	public Double getCurrentAmount() {
		return this.currentAmount;
	}

	public void setCurrentAmount(Double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getMnemonic() {
		return this.mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

}