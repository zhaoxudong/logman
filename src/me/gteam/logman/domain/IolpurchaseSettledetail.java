package me.gteam.logman.domain;

/**
 * IolpurchaseSettledetail entity. @author MyEclipse Persistence Tools
 */

public class IolpurchaseSettledetail implements java.io.Serializable {

	// Fields

	private Integer mxid;
	private OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle;
	private String danjuNo;
	private Double needtopay;
	private Double alreadyPay;
	private Double nothasPay;
	private Double thisPay;
	private String ispay;

	// Constructors

	/** default constructor */
	public IolpurchaseSettledetail() {
	}

	/** full constructor */
	public IolpurchaseSettledetail(
			OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle,
			String danjuNo, Double needtopay, Double alreadyPay,
			Double nothasPay, Double thisPay, String ispay) {
		this.oilpurchaseNeedtopaySettle = oilpurchaseNeedtopaySettle;
		this.danjuNo = danjuNo;
		this.needtopay = needtopay;
		this.alreadyPay = alreadyPay;
		this.nothasPay = nothasPay;
		this.thisPay = thisPay;
		this.ispay = ispay;
	}

	// Property accessors

	public Integer getMxid() {
		return this.mxid;
	}

	public void setMxid(Integer mxid) {
		this.mxid = mxid;
	}

	public OilpurchaseNeedtopaySettle getOilpurchaseNeedtopaySettle() {
		return this.oilpurchaseNeedtopaySettle;
	}

	public void setOilpurchaseNeedtopaySettle(
			OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle) {
		this.oilpurchaseNeedtopaySettle = oilpurchaseNeedtopaySettle;
	}

	public String getDanjuNo() {
		return this.danjuNo;
	}

	public void setDanjuNo(String danjuNo) {
		this.danjuNo = danjuNo;
	}

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getAlreadyPay() {
		return this.alreadyPay;
	}

	public void setAlreadyPay(Double alreadyPay) {
		this.alreadyPay = alreadyPay;
	}

	public Double getNothasPay() {
		return this.nothasPay;
	}

	public void setNothasPay(Double nothasPay) {
		this.nothasPay = nothasPay;
	}

	public Double getThisPay() {
		return this.thisPay;
	}

	public void setThisPay(Double thisPay) {
		this.thisPay = thisPay;
	}

	public String getIspay() {
		return this.ispay;
	}

	public void setIspay(String ispay) {
		this.ispay = ispay;
	}

}