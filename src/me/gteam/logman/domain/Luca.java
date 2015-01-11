package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Luca entity. @author MyEclipse Persistence Tools
 */

public class Luca implements java.io.Serializable {

	// Fields

	private Integer lucaId;
	private Vehicle vehicle;
	private LucaType lucaType;
	private String lucaNo;
	private Date buyDate;
	private Double initAmount;
	private Double currentAmount;
	private String remark;
	private Set lucaRecharges = new HashSet(0);

	// Constructors

	/** default constructor */
	public Luca() {
	}

	/** minimal constructor */
	public Luca(Integer lucaId) {
		this.lucaId = lucaId;
	}

	/** full constructor */
	public Luca(Integer lucaId, Vehicle vehicle, LucaType lucaType,
			String lucaNo, Date buyDate, Double initAmount,
			Double currentAmount, String remark, Set lucaRecharges) {
		this.lucaId = lucaId;
		this.vehicle = vehicle;
		this.lucaType = lucaType;
		this.lucaNo = lucaNo;
		this.buyDate = buyDate;
		this.initAmount = initAmount;
		this.currentAmount = currentAmount;
		this.remark = remark;
		this.lucaRecharges = lucaRecharges;
	}

	// Property accessors

	public Integer getLucaId() {
		return this.lucaId;
	}

	public void setLucaId(Integer lucaId) {
		this.lucaId = lucaId;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public LucaType getLucaType() {
		return this.lucaType;
	}

	public void setLucaType(LucaType lucaType) {
		this.lucaType = lucaType;
	}

	public String getLucaNo() {
		return this.lucaNo;
	}

	public void setLucaNo(String lucaNo) {
		this.lucaNo = lucaNo;
	}

	public Date getBuyDate() {
		return this.buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public Double getInitAmount() {
		return this.initAmount;
	}

	public void setInitAmount(Double initAmount) {
		this.initAmount = initAmount;
	}

	public Double getCurrentAmount() {
		return this.currentAmount;
	}

	public void setCurrentAmount(Double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getLucaRecharges() {
		return this.lucaRecharges;
	}

	public void setLucaRecharges(Set lucaRecharges) {
		this.lucaRecharges = lucaRecharges;
	}

}