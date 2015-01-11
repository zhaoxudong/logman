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
	private Costumer costumer;
	private Account account;
	private Date settleDate;
	private Double receiveAmount;
	private Double benifitAmount;
	private Double prereceive;
	private Double prereceivePay;
	private Double actualReceive;
	private String invoiceNo;
	private Double invoiceAmount;
	private String operator;
	private String remark;
	private Set freightReceiveDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public FreightNeedtoreceive() {
	}

	/** minimal constructor */
	public FreightNeedtoreceive(Integer settleId) {
		this.settleId = settleId;
	}

	/** full constructor */
	public FreightNeedtoreceive(Integer settleId, Costumer costumer,
			Account account, Date settleDate, Double receiveAmount,
			Double benifitAmount, Double prereceive, Double prereceivePay,
			Double actualReceive, String invoiceNo, Double invoiceAmount,
			String operator, String remark, Set freightReceiveDetails) {
		this.settleId = settleId;
		this.costumer = costumer;
		this.account = account;
		this.settleDate = settleDate;
		this.receiveAmount = receiveAmount;
		this.benifitAmount = benifitAmount;
		this.prereceive = prereceive;
		this.prereceivePay = prereceivePay;
		this.actualReceive = actualReceive;
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

	public Costumer getCostumer() {
		return this.costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getSettleDate() {
		return this.settleDate;
	}

	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
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