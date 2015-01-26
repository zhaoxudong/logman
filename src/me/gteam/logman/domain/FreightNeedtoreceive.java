package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FreightNeedtoreceive entity. @author MyEclipse Persistence Tools
 */

public class FreightNeedtoreceive implements java.io.Serializable {

	// Fields

	private Integer settleId;
	private Date settleDate;
	private String unit;
	private Double receiveAmount;
	private Double benifitAmount;
	private Double prereceive;
	private Double prereceivePay;
	private Double actualReceive;
	private String account;
	private String invoiceNo;
	private Double invoiceAmount;
	private String operator;
	private String remark;
	private Set freightReceiveDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public FreightNeedtoreceive() {
	}

	/** full constructor */
	public FreightNeedtoreceive(Date settleDate, String unit,
			Double receiveAmount, Double benifitAmount, Double prereceive,
			Double prereceivePay, Double actualReceive, String account,
			String invoiceNo, Double invoiceAmount, String operator,
			String remark, Set freightReceiveDetails) {
		this.settleDate = settleDate;
		this.unit = unit;
		this.receiveAmount = receiveAmount;
		this.benifitAmount = benifitAmount;
		this.prereceive = prereceive;
		this.prereceivePay = prereceivePay;
		this.actualReceive = actualReceive;
		this.account = account;
		this.invoiceNo = invoiceNo;
		this.invoiceAmount = invoiceAmount;
		this.operator = operator;
		this.remark = remark;
		this.freightReceiveDetails = freightReceiveDetails;
	}

	// Property accessors

	public Integer getSettleId() {
		return this.settleId;
	}

	public void setSettleId(Integer settleId) {
		this.settleId = settleId;
	}

	public Date getSettleDate() {
		return this.settleDate;
	}

	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getReceiveAmount() {
		return this.receiveAmount;
	}

	public void setReceiveAmount(Double receiveAmount) {
		this.receiveAmount = receiveAmount;
	}

	public Double getBenifitAmount() {
		return this.benifitAmount;
	}

	public void setBenifitAmount(Double benifitAmount) {
		this.benifitAmount = benifitAmount;
	}

	public Double getPrereceive() {
		return this.prereceive;
	}

	public void setPrereceive(Double prereceive) {
		this.prereceive = prereceive;
	}

	public Double getPrereceivePay() {
		return this.prereceivePay;
	}

	public void setPrereceivePay(Double prereceivePay) {
		this.prereceivePay = prereceivePay;
	}

	public Double getActualReceive() {
		return this.actualReceive;
	}

	public void setActualReceive(Double actualReceive) {
		this.actualReceive = actualReceive;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Double getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getFreightReceiveDetails() {
		return this.freightReceiveDetails;
	}

	public void setFreightReceiveDetails(Set freightReceiveDetails) {
		this.freightReceiveDetails = freightReceiveDetails;
	}

}