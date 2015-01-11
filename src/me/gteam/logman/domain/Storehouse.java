package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Storehouse entity. @author MyEclipse Persistence Tools
 */

public class Storehouse implements java.io.Serializable {

	// Fields

	private Integer warehouseId;
	private String addr;
	private Integer chargeman;
	private Double capacity;
	private Set storageIns = new HashSet(0);
	private Set storeageOuts = new HashSet(0);
	private Set storeDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Storehouse() {
	}

	/** minimal constructor */
	public Storehouse(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	/** full constructor */
	public Storehouse(Integer warehouseId, String addr, Integer chargeman,
			Double capacity, Set storageIns, Set storeageOuts, Set storeDetails) {
		this.warehouseId = warehouseId;
		this.addr = addr;
		this.chargeman = chargeman;
		this.capacity = capacity;
		this.storageIns = storageIns;
		this.storeageOuts = storeageOuts;
		this.storeDetails = storeDetails;
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

	public Integer getChargeman() {
		return this.chargeman;
	}

	public void setChargeman(Integer chargeman) {
		this.chargeman = chargeman;
	}

	public Double getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public Set getStorageIns() {
		return this.storageIns;
	}

	public void setStorageIns(Set storageIns) {
		this.storageIns = storageIns;
	}

	public Set getStoreageOuts() {
		return this.storeageOuts;
	}

	public void setStoreageOuts(Set storeageOuts) {
		this.storeageOuts = storeageOuts;
	}

	public Set getStoreDetails() {
		return this.storeDetails;
	}

	public void setStoreDetails(Set storeDetails) {
		this.storeDetails = storeDetails;
	}

}