package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

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
	private Set fittingStocks = new HashSet(0);
	private Set fittingpurchaseDetails = new HashSet(0);
	private Set repairDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Fittingdetail() {
	}

	/** minimal constructor */
	public Fittingdetail(Integer fittingId) {
		this.fittingId = fittingId;
	}

	/** full constructor */
	public Fittingdetail(Integer fittingId, String fittingname, String unit,
			String standard, String classification, Double inPrice,
			Double storePrice, Double initAmount, Double currentAmount,
			String mnemonic, Set fittingStocks, Set fittingpurchaseDetails,
			Set repairDetails) {
		this.fittingId = fittingId;
		this.fittingname = fittingname;
		this.unit = unit;
		this.standard = standard;
		this.classification = classification;
		this.inPrice = inPrice;
		this.storePrice = storePrice;
		this.initAmount = initAmount;
		this.currentAmount = currentAmount;
		this.mnemonic = mnemonic;
		this.fittingStocks = fittingStocks;
		this.fittingpurchaseDetails = fittingpurchaseDetails;
		this.repairDetails = repairDetails;
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

	public Set getFittingStocks() {
		return this.fittingStocks;
	}

	public void setFittingStocks(Set fittingStocks) {
		this.fittingStocks = fittingStocks;
	}

	public Set getFittingpurchaseDetails() {
		return this.fittingpurchaseDetails;
	}

	public void setFittingpurchaseDetails(Set fittingpurchaseDetails) {
		this.fittingpurchaseDetails = fittingpurchaseDetails;
	}

	public Set getRepairDetails() {
		return this.repairDetails;
	}

	public void setRepairDetails(Set repairDetails) {
		this.repairDetails = repairDetails;
	}

}