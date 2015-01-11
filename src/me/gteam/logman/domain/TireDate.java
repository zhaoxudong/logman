package me.gteam.logman.domain;

import java.util.Date;

/**
 * TireDate entity. @author MyEclipse Persistence Tools
 */

public class TireDate implements java.io.Serializable {

	// Fields

	private Integer tireNo;
	private Vehicle vehicle;
	private Supplier supplier;
	private Double km;
	private String location;
	private String type;
	private String brand;
	private String standard;
	private String figure;
	private String producingArea;
	private Date buyDate;
	private Double buyCost;
	private Date useDatre;
	private String whetherReimbursement;
	private String remark;

	// Constructors

	/** default constructor */
	public TireDate() {
	}

	/** minimal constructor */
	public TireDate(Integer tireNo) {
		this.tireNo = tireNo;
	}

	/** full constructor */
	public TireDate(Integer tireNo, Vehicle vehicle, Supplier supplier,
			Double km, String location, String type, String brand,
			String standard, String figure, String producingArea, Date buyDate,
			Double buyCost, Date useDatre, String whetherReimbursement,
			String remark) {
		this.tireNo = tireNo;
		this.vehicle = vehicle;
		this.supplier = supplier;
		this.km = km;
		this.location = location;
		this.type = type;
		this.brand = brand;
		this.standard = standard;
		this.figure = figure;
		this.producingArea = producingArea;
		this.buyDate = buyDate;
		this.buyCost = buyCost;
		this.useDatre = useDatre;
		this.whetherReimbursement = whetherReimbursement;
		this.remark = remark;
	}

	// Property accessors

	public Integer getTireNo() {
		return this.tireNo;
	}

	public void setTireNo(Integer tireNo) {
		this.tireNo = tireNo;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Double getKm() {
		return this.km;
	}

	public void setKm(Double km) {
		this.km = km;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getFigure() {
		return this.figure;
	}

	public void setFigure(String figure) {
		this.figure = figure;
	}

	public String getProducingArea() {
		return this.producingArea;
	}

	public void setProducingArea(String producingArea) {
		this.producingArea = producingArea;
	}

	public Date getBuyDate() {
		return this.buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public Double getBuyCost() {
		return this.buyCost;
	}

	public void setBuyCost(Double buyCost) {
		this.buyCost = buyCost;
	}

	public Date getUseDatre() {
		return this.useDatre;
	}

	public void setUseDatre(Date useDatre) {
		this.useDatre = useDatre;
	}

	public String getWhetherReimbursement() {
		return this.whetherReimbursement;
	}

	public void setWhetherReimbursement(String whetherReimbursement) {
		this.whetherReimbursement = whetherReimbursement;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}