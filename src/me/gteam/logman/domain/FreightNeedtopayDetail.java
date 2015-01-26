package me.gteam.logman.domain;

/**
 * FreightNeedtopayDetail entity. @author MyEclipse Persistence Tools
 */

public class FreightNeedtopayDetail implements java.io.Serializable {

	// Fields

	private Integer mxid;
	private FreightNeedtopay freightNeedtopay;
	private String dispatchNo;
	private Double needtopay;
	private Double alreadySettle;
	private Double nothasSettle;
	private Double thisSettle;
	private String ispay;

	// Constructors

	/** default constructor */
	public FreightNeedtopayDetail() {
	}

	/** full constructor */
	public FreightNeedtopayDetail(FreightNeedtopay freightNeedtopay,
			String dispatchNo, Double needtopay, Double alreadySettle,
			Double nothasSettle, Double thisSettle, String ispay) {
		this.freightNeedtopay = freightNeedtopay;
		this.dispatchNo = dispatchNo;
		this.needtopay = needtopay;
		this.alreadySettle = alreadySettle;
		this.nothasSettle = nothasSettle;
		this.thisSettle = thisSettle;
		this.ispay = ispay;
	}

	// Property accessors

	public Integer getMxid() {
		return this.mxid;
	}

	public void setMxid(Integer mxid) {
		this.mxid = mxid;
	}

	public FreightNeedtopay getFreightNeedtopay() {
		return this.freightNeedtopay;
	}

	public void setFreightNeedtopay(FreightNeedtopay freightNeedtopay) {
		this.freightNeedtopay = freightNeedtopay;
	}

	public String getDispatchNo() {
		return this.dispatchNo;
	}

	public void setDispatchNo(String dispatchNo) {
		this.dispatchNo = dispatchNo;
	}

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getAlreadySettle() {
		return this.alreadySettle;
	}

	public void setAlreadySettle(Double alreadySettle) {
		this.alreadySettle = alreadySettle;
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

	public String getIspay() {
		return this.ispay;
	}

	public void setIspay(String ispay) {
		this.ispay = ispay;
	}

}