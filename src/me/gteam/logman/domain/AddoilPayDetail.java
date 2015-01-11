package me.gteam.logman.domain;

/**
 * AddoilPayDetail entity. @author MyEclipse Persistence Tools
 */

public class AddoilPayDetail implements java.io.Serializable {

	// Fields

	private AddoilPayDetailId id;
	private FixpointRefueling fixpointRefueling;
	private AddoilNeedtopaysettle addoilNeedtopaysettle;

	// Constructors

	/** default constructor */
	public AddoilPayDetail() {
	}

	/** minimal constructor */
	public AddoilPayDetail(AddoilPayDetailId id) {
		this.id = id;
	}

	/** full constructor */
	public AddoilPayDetail(AddoilPayDetailId id,
			FixpointRefueling fixpointRefueling,
			AddoilNeedtopaysettle addoilNeedtopaysettle) {
		this.id = id;
		this.fixpointRefueling = fixpointRefueling;
		this.addoilNeedtopaysettle = addoilNeedtopaysettle;
	}

	// Property accessors

	public AddoilPayDetailId getId() {
		return this.id;
	}

	public void setId(AddoilPayDetailId id) {
		this.id = id;
	}

	public FixpointRefueling getFixpointRefueling() {
		return this.fixpointRefueling;
	}

	public void setFixpointRefueling(FixpointRefueling fixpointRefueling) {
		this.fixpointRefueling = fixpointRefueling;
	}

	public AddoilNeedtopaysettle getAddoilNeedtopaysettle() {
		return this.addoilNeedtopaysettle;
	}

	public void setAddoilNeedtopaysettle(
			AddoilNeedtopaysettle addoilNeedtopaysettle) {
		this.addoilNeedtopaysettle = addoilNeedtopaysettle;
	}

}