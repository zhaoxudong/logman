package me.gteam.logman.domain;

/**
 * RouteTemplate entity. @author MyEclipse Persistence Tools
 */

public class RouteTemplate implements java.io.Serializable {

	// Fields

	private Integer templateNo;
	private String shipper;
	private String consignee;
	private String good;
	private String route;
	private String pricingFormula;
	private Double unitPrice;
	private String remark;

	// Constructors

	/** default constructor */
	public RouteTemplate() {
	}

	/** full constructor */
	public RouteTemplate(String shipper, String consignee, String good,
			String route, String pricingFormula, Double unitPrice, String remark) {
		this.shipper = shipper;
		this.consignee = consignee;
		this.good = good;
		this.route = route;
		this.pricingFormula = pricingFormula;
		this.unitPrice = unitPrice;
		this.remark = remark;
	}

	// Property accessors

	public Integer getTemplateNo() {
		return this.templateNo;
	}

	public void setTemplateNo(Integer templateNo) {
		this.templateNo = templateNo;
	}

	public String getShipper() {
		return this.shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getGood() {
		return this.good;
	}

	public void setGood(String good) {
		this.good = good;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
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

}