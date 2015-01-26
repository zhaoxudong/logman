package me.gteam.logman.domain;

/**
 * Vehiclemodel entity. @author MyEclipse Persistence Tools
 */

public class Vehiclemodel implements java.io.Serializable {

	// Fields

	private Integer modleId;
	private String vehiclemodle;

	// Constructors

	/** default constructor */
	public Vehiclemodel() {
	}

	/** full constructor */
	public Vehiclemodel(String vehiclemodle) {
		this.vehiclemodle = vehiclemodle;
	}

	// Property accessors

	public Integer getModleId() {
		return this.modleId;
	}

	public void setModleId(Integer modleId) {
		this.modleId = modleId;
	}

	public String getVehiclemodle() {
		return this.vehiclemodle;
	}

	public void setVehiclemodle(String vehiclemodle) {
		this.vehiclemodle = vehiclemodle;
	}

}