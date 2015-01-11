package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Fuel entity. @author MyEclipse Persistence Tools
 */

public class Fuel implements java.io.Serializable {

	// Fields

	private Integer fuelId;
	private String type;
	private Double unitPrice;
	private Set oilProcurements = new HashSet(0);
	private Set cardRefuels = new HashSet(0);
	private Set cashRefuels = new HashSet(0);
	private Set oilinventories = new HashSet(0);
	private Set fixpointRefuelings = new HashSet(0);
	private Set tankRefuels = new HashSet(0);
	private Set oiltanks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Fuel() {
	}

	/** minimal constructor */
	public Fuel(Integer fuelId) {
		this.fuelId = fuelId;
	}

	/** full constructor */
	public Fuel(Integer fuelId, String type, Double unitPrice,
			Set oilProcurements, Set cardRefuels, Set cashRefuels,
			Set oilinventories, Set fixpointRefuelings, Set tankRefuels,
			Set oiltanks) {
		this.fuelId = fuelId;
		this.type = type;
		this.unitPrice = unitPrice;
		this.oilProcurements = oilProcurements;
		this.cardRefuels = cardRefuels;
		this.cashRefuels = cashRefuels;
		this.oilinventories = oilinventories;
		this.fixpointRefuelings = fixpointRefuelings;
		this.tankRefuels = tankRefuels;
		this.oiltanks = oiltanks;
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

	public Set getOilProcurements() {
		return this.oilProcurements;
	}

	public void setOilProcurements(Set oilProcurements) {
		this.oilProcurements = oilProcurements;
	}

	public Set getCardRefuels() {
		return this.cardRefuels;
	}

	public void setCardRefuels(Set cardRefuels) {
		this.cardRefuels = cardRefuels;
	}

	public Set getCashRefuels() {
		return this.cashRefuels;
	}

	public void setCashRefuels(Set cashRefuels) {
		this.cashRefuels = cashRefuels;
	}

	public Set getOilinventories() {
		return this.oilinventories;
	}

	public void setOilinventories(Set oilinventories) {
		this.oilinventories = oilinventories;
	}

	public Set getFixpointRefuelings() {
		return this.fixpointRefuelings;
	}

	public void setFixpointRefuelings(Set fixpointRefuelings) {
		this.fixpointRefuelings = fixpointRefuelings;
	}

	public Set getTankRefuels() {
		return this.tankRefuels;
	}

	public void setTankRefuels(Set tankRefuels) {
		this.tankRefuels = tankRefuels;
	}

	public Set getOiltanks() {
		return this.oiltanks;
	}

	public void setOiltanks(Set oiltanks) {
		this.oiltanks = oiltanks;
	}

}