package me.gteam.logman.domain;

/**
 * RepairPayDetail entity. @author MyEclipse Persistence Tools
 */

public class RepairPayDetail implements java.io.Serializable {

	// Fields

	private Integer mxid;
	private RepairNeedtopay repairNeedtopay;
	private String number;
	private Double needtopay;
	private Double aldeayPay;
	private Double nothasPay;
	private Double thisPay;
	private String ispay;

	// Constructors

	/** default constructor */
	public RepairPayDetail() {
	}

	/** minimal constructor */
	public RepairPayDetail(RepairNeedtopay repairNeedtopay) {
		this.repairNeedtopay = repairNeedtopay;
	}

	/** full constructor */
	public RepairPayDetail(RepairNeedtopay repairNeedtopay, String number,
			Double needtopay, Double aldeayPay, Double nothasPay,
			Double thisPay, String ispay) {
		this.repairNeedtopay = repairNeedtopay;
		this.number = number;
		this.needtopay = needtopay;
		this.aldeayPay = aldeayPay;
		this.nothasPay = nothasPay;
		this.thisPay = thisPay;
		this.ispay = ispay;
	}

	// Property accessors

	public Integer getMxid() {
		return this.mxid;
	}

	public void setMxid(Integer mxid) {
		this.mxid = mxid;
	}

	public RepairNeedtopay getRepairNeedtopay() {
		return this.repairNeedtopay;
	}

	public void setRepairNeedtopay(RepairNeedtopay repairNeedtopay) {
		this.repairNeedtopay = repairNeedtopay;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getAldeayPay() {
		return this.aldeayPay;
	}

	public void setAldeayPay(Double aldeayPay) {
		this.aldeayPay = aldeayPay;
	}

	public Double getNothasPay() {
		return this.nothasPay;
	}

	public void setNothasPay(Double nothasPay) {
		this.nothasPay = nothasPay;
	}

	public Double getThisPay() {
		return this.thisPay;
	}

	public void setThisPay(Double thisPay) {
		this.thisPay = thisPay;
	}

	public String getIspay() {
		return this.ispay;
	}

	public void setIspay(String ispay) {
		this.ispay = ispay;
	}

}