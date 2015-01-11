package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Vehiclemodel entity. @author MyEclipse Persistence Tools
 */

public class Vehiclemodel implements java.io.Serializable {

	// Fields

	private Integer modleId;
	private String vehiclemodle;
	private Set vehicles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vehiclemodel() {
	}

	/** minimal constructor */
	public Vehiclemodel(Integer modleId) {
		this.modleId = modleId;
	}

	/** full constructor */
	public Vehiclemodel(Integer modleId, String vehiclemodle, Set vehicles) {
		this.modleId = modleId;
		this.vehiclemodle = vehiclemodle;
		this.vehicles = vehicles;
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

	public Set getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(Set vehicles) {
		this.vehicles = vehicles;
	}

}