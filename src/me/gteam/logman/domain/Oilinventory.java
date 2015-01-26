package me.gteam.logman.domain;

/**
 * Oilinventory entity. @author MyEclipse Persistence Tools
 */

public class Oilinventory implements java.io.Serializable {

	// Fields

	private Integer stockId;
	private String tank;
	private Double weight;
	private String remark;

	// Constructors

	/** default constructor */
	public Oilinventory() {
	}

	/** minimal constructor */
	public Oilinventory(String tank) {
		this.tank = tank;
	}

	/** full constructor */
	public Oilinventory(String tank, Double weight, String remark) {
		this.tank = tank;
		this.weight = weight;
		this.remark = remark;
	}

	// Property accessors

	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getTank() {
		return this.tank;
	}

	public void setTank(String tank) {
		this.tank = tank;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}