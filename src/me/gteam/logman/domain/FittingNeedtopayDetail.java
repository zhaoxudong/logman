package me.gteam.logman.domain;

/**
 * FittingNeedtopayDetail entity. @author MyEclipse Persistence Tools
 */

public class FittingNeedtopayDetail implements java.io.Serializable {

	// Fields

	private FittingNeedtopayDetailId id;

	// Constructors

	/** default constructor */
	public FittingNeedtopayDetail() {
	}

	/** full constructor */
	public FittingNeedtopayDetail(FittingNeedtopayDetailId id) {
		this.id = id;
	}

	// Property accessors

	public FittingNeedtopayDetailId getId() {
		return this.id;
	}

	public void setId(FittingNeedtopayDetailId id) {
		this.id = id;
	}

}