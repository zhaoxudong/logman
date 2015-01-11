package me.gteam.logman.domain;

/**
 * StoreDetail entity. @author MyEclipse Persistence Tools
 */

public class StoreDetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private Costumer costumer;
	private Storehouse storehouse;
	private Goods goods;
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
	public StoreDetail(Integer detailId, Costumer costumer,
			Storehouse storehouse, Goods goods, Double weight) {
		this.detailId = detailId;
		this.costumer = costumer;
		this.storehouse = storehouse;
		this.goods = goods;
		this.weight = weight;
	}

	// Property accessors

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Costumer getCostumer() {
		return this.costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	public Storehouse getStorehouse() {
		return this.storehouse;
	}

	public void setStorehouse(Storehouse storehouse) {
		this.storehouse = storehouse;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}