package me.gteam.logman.domain;

/**
 * FreightNeedtopayDetail entity. @author MyEclipse Persistence Tools
 */

public class FreightNeedtopayDetail implements java.io.Serializable {

	// Fields

	private FreightNeedtopayDetailId id;
	private Dispatch dispatch;
	private FreightNeedtopay freightNeedtopay;

	// Constructors

	/** default constructor */
	public FreightNeedtopayDetail() {
	}

	/** minimal constructor */
	public FreightNeedtopayDetail(FreightNeedtopayDetailId id) {
		this.id = id;
	}

	/** full constructor */
	public FreightNeedtopayDetail(FreightNeedtopayDetailId id,
			Dispatch dispatch, FreightNeedtopay freightNeedtopay) {
		this.id = id;
		this.dispatch = dispatch;
		this.freightNeedtopay = freightNeedtopay;
	}

	// Property accessors

	public FreightNeedtopayDetailId getId() {
		return this.id;
	}

	public void setId(FreightNeedtopayDetailId id) {
		this.id = id;
	}

	public Dispatch getDispatch() {
		return this.dispatch;
	}

	public void setDispatch(Dispatch dispatch) {
		this.dispatch = dispatch;
	}

	public FreightNeedtopay getFreightNeedtopay() {
		return this.freightNeedtopay;
	}

	public void setFreightNeedtopay(FreightNeedtopay freightNeedtopay) {
		this.freightNeedtopay = freightNeedtopay;
	}

}