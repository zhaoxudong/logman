package me.gteam.logman.domain;

/**
 * IolpurchaseSettledetail entity. @author MyEclipse Persistence Tools
 */

public class IolpurchaseSettledetail implements java.io.Serializable {

	// Fields

	private IolpurchaseSettledetailId id;
	private OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle;
	private OilProcurement oilProcurement;

	// Constructors

	/** default constructor */
	public IolpurchaseSettledetail() {
	}

	/** minimal constructor */
	public IolpurchaseSettledetail(IolpurchaseSettledetailId id) {
		this.id = id;
	}

	/** full constructor */
	public IolpurchaseSettledetail(IolpurchaseSettledetailId id,
			OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle,
			OilProcurement oilProcurement) {
		this.id = id;
		this.oilpurchaseNeedtopaySettle = oilpurchaseNeedtopaySettle;
		this.oilProcurement = oilProcurement;
	}

	// Property accessors

	public IolpurchaseSettledetailId getId() {
		return this.id;
	}

	public void setId(IolpurchaseSettledetailId id) {
		this.id = id;
	}

	public OilpurchaseNeedtopaySettle getOilpurchaseNeedtopaySettle() {
		return this.oilpurchaseNeedtopaySettle;
	}

	public void setOilpurchaseNeedtopaySettle(
			OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle) {
		this.oilpurchaseNeedtopaySettle = oilpurchaseNeedtopaySettle;
	}

	public OilProcurement getOilProcurement() {
		return this.oilProcurement;
	}

	public void setOilProcurement(OilProcurement oilProcurement) {
		this.oilProcurement = oilProcurement;
	}

}