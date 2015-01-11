package me.gteam.logman.domain;

/**
 * FreightReceiveDetail entity. @author MyEclipse Persistence Tools
 */

public class FreightReceiveDetail implements java.io.Serializable {

	// Fields

	private FreightReceiveDetailId id;
	private Dispatch dispatch;
	private FreightNeedtoreceive freightNeedtoreceive;

	// Constructors

	/** default constructor */
	public FreightReceiveDetail() {
	}

	/** minimal constructor */
	public FreightReceiveDetail(FreightReceiveDetailId id,
			FreightNeedtoreceive freightNeedtoreceive) {
		this.id = id;
		this.freightNeedtoreceive = freightNeedtoreceive;
	}

	/** full constructor */
	public FreightReceiveDetail(FreightReceiveDetailId id, Dispatch dispatch,
			FreightNeedtoreceive freightNeedtoreceive) {
		this.id = id;
		this.dispatch = dispatch;
		this.freightNeedtoreceive = freightNeedtoreceive;
	}

	// Property accessors

	public FreightReceiveDetailId getId() {
		return this.id;
	}

	public void setId(FreightReceiveDetailId id) {
		this.id = id;
	}

	public Dispatch getDispatch() {
		return this.dispatch;
	}

	public void setDispatch(Dispatch dispatch) {
		this.dispatch = dispatch;
	}

	public FreightNeedtoreceive getFreightNeedtoreceive() {
		return this.freightNeedtoreceive;
	}

	public void setFreightNeedtoreceive(
			FreightNeedtoreceive freightNeedtoreceive) {
		this.freightNeedtoreceive = freightNeedtoreceive;
	}

}