package me.gteam.logman.domain;

/**
 * StorageInDetail entity. @author MyEclipse Persistence Tools
 */

public class StorageInDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private StorageIn storageIn;
	private String good;
	private String batch;
	private String storage;
	private String measurementUnit;
	private Double amount;
	private Double weight;
	private String remark;

	// Constructors

	/** default constructor */
	public StorageInDetail() {
	}

	/** full constructor */
	public StorageInDetail(StorageIn storageIn, String good, String batch,
			String storage, String measurementUnit, Double amount,
			Double weight, String remark) {
		this.storageIn = storageIn;
		this.good = good;
		this.batch = batch;
		this.storage = storage;
		this.measurementUnit = measurementUnit;
		this.amount = amount;
		this.weight = weight;
		this.remark = remark;
	}

	// Property accessors

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public StorageIn getStorageIn() {
		return this.storageIn;
	}

	public void setStorageIn(StorageIn storageIn) {
		this.storageIn = storageIn;
	}

	public String getGood() {
		return this.good;
	}

	public void setGood(String good) {
		this.good = good;
	}

	public String getBatch() {
		return this.batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getStorage() {
		return this.storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getMeasurementUnit() {
		return this.measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}