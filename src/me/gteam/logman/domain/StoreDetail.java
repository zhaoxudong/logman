package me.gteam.logman.domain;

/**
 * StoreDetail entity. @author MyEclipse Persistence Tools
 */

public class StoreDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private Double weight;

	// Constructors

	/** default constructor */
	public StoreDetail() {
	}

	/** minimal constructor */
	public StoreDetail(Integer detailId) {
		this.detailId = detailId;
	}

	/** full constructor */
	public StoreDetail(Integer detailId, Double weight) {
		this.detailId = detailId;
		this.weight = weight;
	}

	// Property accessors

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}