package me.gteam.logman.domain;

/**
 * VehiclefeesType entity. @author MyEclipse Persistence Tools
 */

public class VehiclefeesType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String name;

	// Constructors

	/** default constructor */
	public VehiclefeesType() {
	}

	/** full constructor */
	public VehiclefeesType(String name) {
		this.name = name;
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

}