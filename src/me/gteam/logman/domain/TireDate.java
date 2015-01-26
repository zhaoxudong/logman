package me.gteam.logman.domain;

import java.util.Date;

/**
 * TireDate entity. @author MyEclipse Persistence Tools
 */

public class TireDate implements java.io.Serializable {

	// Fields

	private Integer tireId;
	private String tireNo;
	private Double km;
	private String location;
	private String type;
	private String brand;
	private String standard;
	private String figure;
	private String producingArea;
	private String supplier;
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
	public TireDate(String tireNo) {
		this.tireNo = tireNo;
	}

	/** full constructor */
	public TireDate(String tireNo, Double km, String location, String type,
			String brand, String standard, String figure, String producingArea,
			String supplier, Date buyDate, Double buyCost, Date useDatre,
			String whetherReimbursement, String remark) {
		this.tireNo = tireNo;
		this.km = km;
		this.location = location;
		this.type = type;
		this.brand = brand;
		this.standard = standard;
		this.figure = figure;
		this.producingArea = producingArea;
		this.supplier = supplier;
		this.buyDate = buyDate;
		this.buyCost = buyCost;
		this.useDatre = useDatre;
		this.whetherReimbursement = whetherReimbursement;
		this.remark = remark;
	}

	// Property accessors

	public Integer getTireId() {
		return this.tireId;
	}

	public void setTireId(Integer tireId) {
		this.tireId = tireId;
	}

	public String getTireNo() {
		return this.tireNo;
	}

	public void setTireNo(String tireNo) {
		this.tireNo = tireNo;
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

	public String getSupplier() {
		return this.supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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