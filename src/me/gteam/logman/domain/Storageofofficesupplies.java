package me.gteam.logman.domain;

/**
 * Storageofofficesupplies entity. @author MyEclipse Persistence Tools
 */

public class Storageofofficesupplies implements java.io.Serializable {

	// Fields

	private Integer stockId;
	private String officesuppliesname;
	private Double currentAmount;

	// Constructors

	/** default constructor */
	public Storageofofficesupplies() {
	}

	/** full constructor */
	public Storageofofficesupplies(String officesuppliesname,
			Double currentAmount) {
		this.officesuppliesname = officesuppliesname;
		this.currentAmount = currentAmount;
	}

	// Property accessors

	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getOfficesuppliesname() {
		return this.officesuppliesname;
	}

	public void setOfficesuppliesname(String officesuppliesname) {
		this.officesuppliesname = officesuppliesname;
	}

	public Double getCurrentAmount() {
		return this.currentAmount;
	}

	public void setCurrentAmount(Double currentAmount) {
		this.currentAmount = currentAmount;
	}

}