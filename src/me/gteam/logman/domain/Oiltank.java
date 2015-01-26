package me.gteam.logman.domain;

/**
 * Oiltank entity. @author MyEclipse Persistence Tools
 */

public class Oiltank implements java.io.Serializable {

	// Fields

	private Integer tankId;
	private String tankname;
	private String oilType;
	private Double initAount;
	private Double leastAmount;
	private String remark;

	// Constructors

	/** default constructor */
	public Oiltank() {
	}

	/** full constructor */
	public Oiltank(String tankname, String oilType, Double initAount,
			Double leastAmount, String remark) {
		this.tankname = tankname;
		this.oilType = oilType;
		this.initAount = initAount;
		this.leastAmount = leastAmount;
		this.remark = remark;
	}

	// Property accessors

	public Integer getTankId() {
		return this.tankId;
	}

	public void setTankId(Integer tankId) {
		this.tankId = tankId;
	}

	public String getTankname() {
		return this.tankname;
	}

	public void setTankname(String tankname) {
		this.tankname = tankname;
	}

	public String getOilType() {
		return this.oilType;
	}

	public void setOilType(String oilType) {
		this.oilType = oilType;
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

}