package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * StoreageOut entity. @author MyEclipse Persistence Tools
 */

public class StoreageOut implements java.io.Serializable {

	// Fields

	private Integer outId;
	private Date date;
	private String costumer;
	private String vehicle;
	private String driver;
	private Double loadFee;
	private Double storageFee;
	private Double transportationFee;
	private Double otherFee;
	private String remark;
	private Set storageOutDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public StoreageOut() {
	}

	/** full constructor */
	public StoreageOut(Date date, String costumer, String vehicle,
			String driver, Double loadFee, Double storageFee,
			Double transportationFee, Double otherFee, String remark,
			Set storageOutDetails) {
		this.date = date;
		this.costumer = costumer;
		this.vehicle = vehicle;
		this.driver = driver;
		this.loadFee = loadFee;
		this.storageFee = storageFee;
		this.transportationFee = transportationFee;
		this.otherFee = otherFee;
		this.remark = remark;
		this.storageOutDetails = storageOutDetails;
	}

	// Property accessors

	public Integer getOutId() {
		return this.outId;
	}

	public void setOutId(Integer outId) {
		this.outId = outId;
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

	public Double getStorageFee() {
		return this.storageFee;
	}

	public void setStorageFee(Double storageFee) {
		this.storageFee = storageFee;
	}

	public Double getTransportationFee() {
		return this.transportationFee;
	}

	public void setTransportationFee(Double transportationFee) {
		this.transportationFee = transportationFee;
	}

	public Double getOtherFee() {
		return this.otherFee;
	}

	public void setOtherFee(Double otherFee) {
		this.otherFee = otherFee;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getStorageOutDetails() {
		return this.storageOutDetails;
	}

	public void setStorageOutDetails(Set storageOutDetails) {
		this.storageOutDetails = storageOutDetails;
	}

}