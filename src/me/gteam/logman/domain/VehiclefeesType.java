package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * VehiclefeesType entity. @author MyEclipse Persistence Tools
 */

public class VehiclefeesType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String name;
	private String mnemonic;
	private Set vehicleFeeses = new HashSet(0);

	// Constructors

	/** default constructor */
	public VehiclefeesType() {
	}

	/** minimal constructor */
	public VehiclefeesType(Integer typeId) {
		this.typeId = typeId;
	}

	/** full constructor */
	public VehiclefeesType(Integer typeId, String name, String mnemonic,
			Set vehicleFeeses) {
		this.typeId = typeId;
		this.name = name;
		this.mnemonic = mnemonic;
		this.vehicleFeeses = vehicleFeeses;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMnemonic() {
		return this.mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public Set getVehicleFeeses() {
		return this.vehicleFeeses;
	}

	public void setVehicleFeeses(Set vehicleFeeses) {
		this.vehicleFeeses = vehicleFeeses;
	}

}