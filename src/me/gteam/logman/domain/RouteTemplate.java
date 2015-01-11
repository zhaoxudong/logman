package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * RouteTemplate entity. @author MyEclipse Persistence Tools
 */

public class RouteTemplate implements java.io.Serializable {

	// Fields

	private Integer templateNo;
	private Route route;
	private Goods goods;
	private String pricingFormula;
	private Double unitPrice;
	private String remark;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public RouteTemplate() {
	}

	/** minimal constructor */
	public RouteTemplate(Integer templateNo) {
		this.templateNo = templateNo;
	}

	/** full constructor */
	public RouteTemplate(Integer templateNo, Route route, Goods goods,
			String pricingFormula, Double unitPrice, String remark, Set orderses) {
		this.templateNo = templateNo;
		this.route = route;
		this.goods = goods;
		this.pricingFormula = pricingFormula;
		this.unitPrice = unitPrice;
		this.remark = remark;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getTemplateNo() {
		return this.templateNo;
	}

	public void setTemplateNo(Integer templateNo) {
		this.templateNo = templateNo;
	}

	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public String getPricingFormula() {
		return this.pricingFormula;
	}

	public void setPricingFormula(String pricingFormula) {
		this.pricingFormula = pricingFormula;
	}

	public Double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}