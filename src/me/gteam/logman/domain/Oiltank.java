package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Oiltank entity. @author MyEclipse Persistence Tools
 */

public class Oiltank implements java.io.Serializable {

	// Fields

	private Integer tankId;
	private Fuel fuel;
	private String tankname;
	private Double initAount;
	private Double leastAmount;
	private String remark;
	private Set oilProcurements = new HashSet(0);
	private Set tankRefuels = new HashSet(0);
	private Set oilinventories = new HashSet(0);

	// Constructors

	/** default constructor */
	public Oiltank() {
	}

	/** minimal constructor */
	public Oiltank(Integer tankId) {
		this.tankId = tankId;
	}

	/** full constructor */
	public Oiltank(Integer tankId, Fuel fuel, String tankname,
			Double initAount, Double leastAmount, String remark,
			Set oilProcurements, Set tankRefuels, Set oilinventories) {
		this.tankId = tankId;
		this.fuel = fuel;
		this.tankname = tankname;
		this.initAount = initAount;
		this.leastAmount = leastAmount;
		this.remark = remark;
		this.oilProcurements = oilProcurements;
		this.tankRefuels = tankRefuels;
		this.oilinventories = oilinventories;
	}

	// Property accessors

	public Integer getTankId() {
		return this.tankId;
	}

	public void setTankId(Integer tankId) {
		this.tankId = tankId;
	}

	public Fuel getFuel() {
		return this.fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public String getTankname() {
		return this.tankname;
	}

	public void setTankname(String tankname) {
		this.tankname = tankname;
	}

	public Double getInitAount() {
		return this.initAount;
	}

	public void setInitAount(Double initAount) {
		this.initAount = initAount;
	}

	public Double getLeastAmount() {
		return this.leastAmount;
	}

	public void setLeastAmount(Double leastAmount) {
		this.leastAmount = leastAmount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getOilProcurements() {
		return this.oilProcurements;
	}

	public void setOilProcurements(Set oilProcurements) {
		this.oilProcurements = oilProcurements;
	}

	public Set getTankRefuels() {
		return this.tankRefuels;
	}

	public void setTankRefuels(Set tankRefuels) {
		this.tankRefuels = tankRefuels;
	}

	public Set getOilinventories() {
		return this.oilinventories;
	}

	public void setOilinventories(Set oilinventories) {
		this.oilinventories = oilinventories;
	}

}