package me.gteam.logman.domain;

/**
 * Fuel entity. @author MyEclipse Persistence Tools
 */

public class Fuel implements java.io.Serializable {

	// Fields

	private Integer fuelId;
	private String type;
	private Double unitPrice;

	// Constructors

	/** default constructor */
	public Fuel() {
	}

	/** full constructor */
	public Fuel(String type, Double unitPrice) {
		this.type = type;
		this.unitPrice = unitPrice;
	}

	// Property accessors

	public Integer getFuelId() {
		return this.fuelId;
	}

	public void setFuelId(Integer fuelId) {
		this.fuelId = fuelId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

}