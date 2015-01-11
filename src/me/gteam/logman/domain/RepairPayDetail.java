package me.gteam.logman.domain;

/**
 * RepairPayDetail entity. @author MyEclipse Persistence Tools
 */

public class RepairPayDetail implements java.io.Serializable {

	// Fields

	private RepairPayDetailId id;
	private RepairNeedtopay repairNeedtopay;

	// Constructors

	/** default constructor */
	public RepairPayDetail() {
	}

	/** minimal constructor */
	public RepairPayDetail(RepairPayDetailId id) {
		this.id = id;
	}

	/** full constructor */
	public RepairPayDetail(RepairPayDetailId id, RepairNeedtopay repairNeedtopay) {
		this.id = id;
		this.repairNeedtopay = repairNeedtopay;
	}

	// Property accessors

	public RepairPayDetailId getId() {
		return this.id;
	}

	public void setId(RepairPayDetailId id) {
		this.id = id;
	}

	public RepairNeedtopay getRepairNeedtopay() {
		return this.repairNeedtopay;
	}

	public void setRepairNeedtopay(RepairNeedtopay repairNeedtopay) {
		this.repairNeedtopay = repairNeedtopay;
	}

}