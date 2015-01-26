package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * StorageIn entity. @author MyEclipse Persistence Tools
 */

public class StorageIn implements java.io.Serializable {

	// Fields

	private Integer inId;
	private Date date;
	private String costumer;
	private String vehicle;
	private String driver;
	private Double loadFee;
	private Double warehousingFee;
	private Double transportation;
	private Double otherCost;
	private String remark;
	private Set storageInDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public StorageIn() {
	}

	/** full constructor */
	public StorageIn(Date date, String costumer, String vehicle, String driver,
			Double loadFee, Double warehousingFee, Double transportation,
			Double otherCost, String remark, Set storageInDetails) {
		this.date = date;
		this.costumer = costumer;
		this.vehicle = vehicle;
		this.driver = driver;
		this.loadFee = loadFee;
		this.warehousingFee = warehousingFee;
		this.transportation = transportation;
		this.otherCost = otherCost;
		this.remark = remark;
		this.storageInDetails = storageInDetails;
	}

	// Property accessors

	public Integer getInId() {
		return this.inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCostumer() {
		return this.costumer;
	}

	public void setCostumer(String costumer) {
		this.costumer = costumer;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public Double getLoadFee() {
		return this.loadFee;
	}

	public void setLoadFee(Double loadFee) {
		this.loadFee = loadFee;
	}

	public Double getWarehousingFee() {
		return this.warehousingFee;
	}

	public void setWarehousingFee(Double warehousingFee) {
		this.warehousingFee = warehousingFee;
	}

	public Double getTransportation() {
		return this.transportation;
	}

	public void setTransportation(Double transportation) {
		this.transportation = transportation;
	}

	public Double getOtherCost() {
		return this.otherCost;
	}

	public void setOtherCost(Double otherCost) {
		this.otherCost = otherCost;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getStorageInDetails() {
		return this.storageInDetails;
	}

	public void setStorageInDetails(Set storageInDetails) {
		this.storageInDetails = storageInDetails;
	}

}