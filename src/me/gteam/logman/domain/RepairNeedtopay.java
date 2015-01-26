package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RepairNeedtopay entity. @author MyEclipse Persistence Tools
 */

public class RepairNeedtopay implements java.io.Serializable {

	// Fields

	private Integer repairsettleId;
	private Date settleDate;
	private String repairFactory;
	private Double prepayRemainder;
	private Double needtopay;
	private Double prepay;
	private Double actualPay;
	private String account;
	private String operator;
	private String remark;
	private Set repairPayDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public RepairNeedtopay() {
	}

	/** full constructor */
	public RepairNeedtopay(Date settleDate, String repairFactory,
			Double prepayRemainder, Double needtopay, Double prepay,
			Double actualPay, String account, String operator, String remark,
			Set repairPayDetails) {
		this.settleDate = settleDate;
		this.repairFactory = repairFactory;
		this.prepayRemainder = prepayRemainder;
		this.needtopay = needtopay;
		this.prepay = prepay;
		this.actualPay = actualPay;
		this.account = account;
		this.operator = operator;
		this.remark = remark;
		this.repairPayDetails = repairPayDetails;
	}

	// Property accessors

	public Integer getRepairsettleId() {
		return this.repairsettleId;
	}

	public void setRepairsettleId(Integer repairsettleId) {
		this.repairsettleId = repairsettleId;
	}

	public Date getSettleDate() {
		return this.settleDate;
	}

	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}

	public String getRepairFactory() {
		return this.repairFactory;
	}

	public void setRepairFactory(String repairFactory) {
		this.repairFactory = repairFactory;
	}

	public Double getPrepayRemainder() {
		return this.prepayRemainder;
	}

	public void setPrepayRemainder(Double prepayRemainder) {
		this.prepayRemainder = prepayRemainder;
	}

	public Double getNeedtopay() {
		return this.needtopay;
	}

	public void setNeedtopay(Double needtopay) {
		this.needtopay = needtopay;
	}

	public Double getPrepay() {
		return this.prepay;
	}

	public void setPrepay(Double prepay) {
		this.prepay = prepay;
	}

	public Double getActualPay() {
		return this.actualPay;
	}

	public void setActualPay(Double actualPay) {
		this.actualPay = actualPay;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	public Set getRepairPayDetails() {
		return this.repairPayDetails;
	}

	public void setRepairPayDetails(Set repairPayDetails) {
		this.repairPayDetails = repairPayDetails;
	}

}