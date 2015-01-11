package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private String goodName;
	private String type;
	private String unit;
	private String code;
	private Set storeDetails = new HashSet(0);
	private Set storageIns = new HashSet(0);
	private Set routeTemplates = new HashSet(0);
	private Set storeageOuts = new HashSet(0);
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(Integer goodsId) {
		this.goodsId = goodsId;
	}

	/** full constructor */
	public Goods(Integer goodsId, String goodName, String type, String unit,
			String code, Set storeDetails, Set storageIns, Set routeTemplates,
			Set storeageOuts, Set orderses) {
		this.goodsId = goodsId;
		this.goodName = goodName;
		this.type = type;
		this.unit = unit;
		this.code = code;
		this.storeDetails = storeDetails;
		this.storageIns = storageIns;
		this.routeTemplates = routeTemplates;
		this.storeageOuts = storeageOuts;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodName() {
		return this.goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set getStoreDetails() {
		return this.storeDetails;
	}

	public void setStoreDetails(Set storeDetails) {
		this.storeDetails = storeDetails;
	}

	public Set getStorageIns() {
		return this.storageIns;
	}

	public void setStorageIns(Set storageIns) {
		this.storageIns = storageIns;
	}

	public Set getRouteTemplates() {
		return this.routeTemplates;
	}

	public void setRouteTemplates(Set routeTemplates) {
		this.routeTemplates = routeTemplates;
	}

	public Set getStoreageOuts() {
		return this.storeageOuts;
	}

	public void setStoreageOuts(Set storeageOuts) {
		this.storeageOuts = storeageOuts;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}