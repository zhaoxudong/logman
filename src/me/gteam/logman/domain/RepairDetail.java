package me.gteam.logman.domain;

/**
 * RepairDetail entity. @author MyEclipse Persistence Tools
 */

public class RepairDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private Repair repair;
	private RepairItem repairItem;
	private Fittingdetail fittingdetail;
	private String fittingFormat;
	private Double stockAmount;
	private Double number;
	private Double unitPrice;
	private Double fittingPrice;
	private Double labourCost;

	// Constructors

	/** default constructor */
	public RepairDetail() {
	}

	/** minimal constructor */
	public RepairDetail(Integer detailId) {
		this.detailId = detailId;
	}

	/** full constructor */
	public RepairDetail(Integer detailId, Repair repair, RepairItem repairItem,
			Fittingdetail fittingdetail, String fittingFormat,
			Double stockAmount, Double number, Double unitPrice,
			Double fittingPrice, Double labourCost) {
		this.detailId = detailId;
		this.repair = repair;
		this.repairItem = repairItem;
		this.fittingdetail = fittingdetail;
		this.fittingFormat = fittingFormat;
		this.stockAmount = stockAmount;
		this.number = number;
		this.unitPrice = unitPrice;
		this.fittingPrice = fittingPrice;
		this.labourCost = labourCost;
	}

	// Property accessors

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Repair getRepair() {
		return this.repair;
	}

	public void setRepair(Repair repair) {
		this.repair = repair;
	}

	public RepairItem getRepairItem() {
		return this.repairItem;
	}

	public void setRepairItem(RepairItem repairItem) {
		this.repairItem = repairItem;
	}

	public Fittingdetail getFittingdetail() {
		return this.fittingdetail;
	}

	public void setFittingdetail(Fittingdetail fittingdetail) {
		this.fittingdetail = fittingdetail;
	}

	public String getFittingFormat() {
		return this.fittingFormat;
	}

	public void setFittingFormat(String fittingFormat) {
		this.fittingFormat = fittingFormat;
	}

	public Double getStockAmount() {
		return this.stockAmount;
	}

	public void setStockAmount(Double stockAmount) {
		this.stockAmount = stockAmount;
	}

	public Double getNumber() {
		return this.number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getFittingPrice() {
		return this.fittingPrice;
	}

	public void setFittingPrice(Double fittingPrice) {
		this.fittingPrice = fittingPrice;
	}

	public Double getLabourCost() {
		return this.labourCost;
	}

	public void setLabourCost(Double labourCost) {
		this.labourCost = labourCost;
	}

}