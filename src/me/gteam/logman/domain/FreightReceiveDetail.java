package me.gteam.logman.domain;

/**
 * FreightReceiveDetail entity. @author MyEclipse Persistence Tools
 */

public class FreightReceiveDetail implements java.io.Serializable {

	// Fields

	private Integer mxid;
	private FreightNeedtoreceive freightNeedtoreceive;
	private String danjuNo;
	private Double receiveAmount;
	private Double aldeadySettle;
	private Double nothasSettle;
	private Double thisSettle;
	private String isreceive;

	// Constructors

	/** default constructor */
	public FreightReceiveDetail() {
	}

	/** full constructor */
	public FreightReceiveDetail(FreightNeedtoreceive freightNeedtoreceive,
			String danjuNo, Double receiveAmount, Double aldeadySettle,
			Double nothasSettle, Double thisSettle, String isreceive) {
		this.freightNeedtoreceive = freightNeedtoreceive;
		this.danjuNo = danjuNo;
		this.receiveAmount = receiveAmount;
		this.aldeadySettle = aldeadySettle;
		this.nothasSettle = nothasSettle;
		this.thisSettle = thisSettle;
		this.isreceive = isreceive;
	}

	// Property accessors

	public Integer getMxid() {
		return this.mxid;
	}

	public void setMxid(Integer mxid) {
		this.mxid = mxid;
	}

	public FreightNeedtoreceive getFreightNeedtoreceive() {
		return this.freightNeedtoreceive;
	}

	public void setFreightNeedtoreceive(
			FreightNeedtoreceive freightNeedtoreceive) {
		this.freightNeedtoreceive = freightNeedtoreceive;
	}

	public String getDanjuNo() {
		return this.danjuNo;
	}

	public void setDanjuNo(String danjuNo) {
		this.danjuNo = danjuNo;
	}

	public Double getReceiveAmount() {
		return this.receiveAmount;
	}

	public void setReceiveAmount(Double receiveAmount) {
		this.receiveAmount = receiveAmount;
	}

	public Double getAldeadySettle() {
		return this.aldeadySettle;
	}

	public void setAldeadySettle(Double aldeadySettle) {
		this.aldeadySettle = aldeadySettle;
	}

	public Double getNothasSettle() {
		return this.nothasSettle;
	}

	public void setNothasSettle(Double nothasSettle) {
		this.nothasSettle = nothasSettle;
	}

	public Double getThisSettle() {
		return this.thisSettle;
	}

	public void setThisSettle(Double thisSettle) {
		this.thisSettle = thisSettle;
	}

	public String getIsreceive() {
		return this.isreceive;
	}

	public void setIsreceive(String isreceive) {
		this.isreceive = isreceive;
	}

}