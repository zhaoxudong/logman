package me.gteam.logman.domain;

/**
 * Oilinventory entity. @author MyEclipse Persistence Tools
 */

public class Oilinventory implements java.io.Serializable {

	// Fields

	private Integer tank;
	private Oiltank oiltank;
	private Fuel fuel;
	private Double weight;
	private Double unitPrice;
	private Double inventoryAmount;
	private Double minInventory;
	private String remark;

	// Constructors

	/** default constructor */
	public Oilinventory() {
	}

	/** minimal constructor */
	public Oilinventory(Integer tank, Oiltank oiltank) {
		this.tank = tank;
		this.oiltank = oiltank;
	}

	/** full constructor */
	public Oilinventory(Integer tank, Oiltank oiltank, Fuel fuel,
			Double weight, Double unitPrice, Double inventoryAmount,
			Double minInventory, String remark) {
		this.tank = tank;
		this.oiltank = oiltank;
		this.fuel = fuel;
		this.weight = weight;
		this.unitPrice = unitPrice;
		this.inventoryAmount = inventoryAmount;
		this.minInventory = minInventory;
		this.remark = remark;
	}

	// Property accessors

	public Integer getTank() {
		return this.tank;
	}

	public void setTank(Integer tank) {
		this.tank = tank;
	}

	public Oiltank getOiltank() {
		return this.oiltank;
	}

	public void setOiltank(Oiltank oiltank) {
		this.oiltank = oiltank;
	}

	public Fuel getFuel() {
		return this.fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getInventoryAmount() {
		return this.inventoryAmount;
	}

	public void setInventoryAmount(Double inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	public Double getMinInventory() {
		return this.minInventory;
	}

	public void setMinInventory(Double minInventory) {
		this.minInventory = minInventory;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}