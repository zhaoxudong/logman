package me.gteam.logman.domain;

/**
 * Storehouse entity. @author MyEclipse Persistence Tools
 */

public class Storehouse implements java.io.Serializable {

	// Fields

	private Integer warehouseId;
	private String addr;
	private String chargeman;
	private Double capacity;

	// Constructors

	/** default constructor */
	public Storehouse() {
	}

	/** full constructor */
	public Storehouse(String addr, String chargeman, Double capacity) {
		this.addr = addr;
		this.chargeman = chargeman;
		this.capacity = capacity;
	}

	// Property accessors

	public Integer getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getChargeman() {
		return this.chargeman;
	}

	public void setChargeman(String chargeman) {
		this.chargeman = chargeman;
	}

	public Double getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

}