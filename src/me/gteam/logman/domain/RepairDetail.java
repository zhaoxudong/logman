package me.gteam.logman.domain;

/**
 * RepairDetail entity. @author MyEclipse Persistence Tools
 */

public class RepairDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private Repair repair;
	private String repairProject;
	private String fittingNo;
	private String fittingName;
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

	/** full constructor */
	public RepairDetail(Repair repair, String repairProject, String fittingNo,
			String fittingName, String fittingFormat, Double stockAmount,
			Double number, Double unitPrice, Double fittingPrice,
			Double labourCost) {
		this.repair = repair;
		this.repairProject = repairProject;
		this.fittingNo = fittingNo;
		this.fittingName = fittingName;
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

	public String getRepairProject() {
		return this.repairProject;
	}

	public void setRepairProject(String repairProject) {
		this.repairProject = repairProject;
	}

	public String getFittingNo() {
		return this.fittingNo;
	}

	public void setFittingNo(String fittingNo) {
		this.fittingNo = fittingNo;
	}

	public String getFittingName() {
		return this.fittingName;
	}

	public void setFittingName(String fittingName) {
		this.fittingName = fittingName;
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