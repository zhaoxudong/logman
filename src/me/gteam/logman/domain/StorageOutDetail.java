package me.gteam.logman.domain;

/**
 * StorageOutDetail entity. @author MyEclipse Persistence Tools
 */

public class StorageOutDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private StoreageOut storeageOut;
	private String good;
	private String batch;
	private String warehouse;
	private String measurementUnit;
	private Double amount;
	private Double weight;
	private String remark;

	// Constructors

	/** default constructor */
	public StorageOutDetail() {
	}

	/** full constructor */
	public StorageOutDetail(StoreageOut storeageOut, String good, String batch,
			String warehouse, String measurementUnit, Double amount,
			Double weight, String remark) {
		this.storeageOut = storeageOut;
		this.good = good;
		this.batch = batch;
		this.warehouse = warehouse;
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

	public StoreageOut getStoreageOut() {
		return this.storeageOut;
	}

	public void setStoreageOut(StoreageOut storeageOut) {
		this.storeageOut = storeageOut;
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

	public String getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
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