package me.gteam.logman.domain;

import java.util.Date;

/**
 * DrawoutId entity. @author MyEclipse Persistence Tools
 */

public class DrawoutId implements java.io.Serializable {

	// Fields

	private Integer drawoutId;
	private String have;
	private Date date;
	private Date timeLimit;
	private Double prepay;
	private Date planDrawout;
	private Integer fleet;
	private Integer vehicle;
	private Integer trailer;
	private Integer driver;
	private String handler;
	private String client;
	private String destination;
	private Integer goods;
	private String remark;

	// Constructors

	/** default constructor */
	public DrawoutId() {
	}

	/** full constructor */
	public DrawoutId(Integer drawoutId, String have, Date date, Date timeLimit,
			Double prepay, Date planDrawout, Integer fleet, Integer vehicle,
			Integer trailer, Integer driver, String handler, String client,
			String destination, Integer goods, String remark) {
		this.drawoutId = drawoutId;
		this.have = have;
		this.date = date;
		this.timeLimit = timeLimit;
		this.prepay = prepay;
		this.planDrawout = planDrawout;
		this.fleet = fleet;
		this.vehicle = vehicle;
		this.trailer = trailer;
		this.driver = driver;
		this.handler = handler;
		this.client = client;
		this.destination = destination;
		this.goods = goods;
		this.remark = remark;
	}

	// Property accessors

	public Integer getDrawoutId() {
		return this.drawoutId;
	}

	public void setDrawoutId(Integer drawoutId) {
		this.drawoutId = drawoutId;
	}

	public String getHave() {
		return this.have;
	}

	public void setHave(String have) {
		this.have = have;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTimeLimit() {
		return this.timeLimit;
	}

	public void setTimeLimit(Date timeLimit) {
		this.timeLimit = timeLimit;
	}

	public Double getPrepay() {
		return this.prepay;
	}

	public void setPrepay(Double prepay) {
		this.prepay = prepay;
	}

	public Date getPlanDrawout() {
		return this.planDrawout;
	}

	public void setPlanDrawout(Date planDrawout) {
		this.planDrawout = planDrawout;
	}

	public Integer getFleet() {
		return this.fleet;
	}

	public void setFleet(Integer fleet) {
		this.fleet = fleet;
	}

	public Integer getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Integer vehicle) {
		this.vehicle = vehicle;
	}

	public Integer getTrailer() {
		return this.trailer;
	}

	public void setTrailer(Integer trailer) {
		this.trailer = trailer;
	}

	public Integer getDriver() {
		return this.driver;
	}

	public void setDriver(Integer driver) {
		this.driver = driver;
	}

	public String getHandler() {
		return this.handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getGoods() {
		return this.goods;
	}

	public void setGoods(Integer goods) {
		this.goods = goods;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DrawoutId))
			return false;
		DrawoutId castOther = (DrawoutId) other;

		return ((this.getDrawoutId() == castOther.getDrawoutId()) || (this
				.getDrawoutId() != null && castOther.getDrawoutId() != null && this
				.getDrawoutId().equals(castOther.getDrawoutId())))
				&& ((this.getHave() == castOther.getHave()) || (this.getHave() != null
						&& castOther.getHave() != null && this.getHave()
						.equals(castOther.getHave())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getTimeLimit() == castOther.getTimeLimit()) || (this
						.getTimeLimit() != null
						&& castOther.getTimeLimit() != null && this
						.getTimeLimit().equals(castOther.getTimeLimit())))
				&& ((this.getPrepay() == castOther.getPrepay()) || (this
						.getPrepay() != null && castOther.getPrepay() != null && this
						.getPrepay().equals(castOther.getPrepay())))
				&& ((this.getPlanDrawout() == castOther.getPlanDrawout()) || (this
						.getPlanDrawout() != null
						&& castOther.getPlanDrawout() != null && this
						.getPlanDrawout().equals(castOther.getPlanDrawout())))
				&& ((this.getFleet() == castOther.getFleet()) || (this
						.getFleet() != null && castOther.getFleet() != null && this
						.getFleet().equals(castOther.getFleet())))
				&& ((this.getVehicle() == castOther.getVehicle()) || (this
						.getVehicle() != null && castOther.getVehicle() != null && this
						.getVehicle().equals(castOther.getVehicle())))
				&& ((this.getTrailer() == castOther.getTrailer()) || (this
						.getTrailer() != null && castOther.getTrailer() != null && this
						.getTrailer().equals(castOther.getTrailer())))
				&& ((this.getDriver() == castOther.getDriver()) || (this
						.getDriver() != null && castOther.getDriver() != null && this
						.getDriver().equals(castOther.getDriver())))
				&& ((this.getHandler() == castOther.getHandler()) || (this
						.getHandler() != null && castOther.getHandler() != null && this
						.getHandler().equals(castOther.getHandler())))
				&& ((this.getClient() == castOther.getClient()) || (this
						.getClient() != null && castOther.getClient() != null && this
						.getClient().equals(castOther.getClient())))
				&& ((this.getDestination() == castOther.getDestination()) || (this
						.getDestination() != null
						&& castOther.getDestination() != null && this
						.getDestination().equals(castOther.getDestination())))
				&& ((this.getGoods() == castOther.getGoods()) || (this
						.getGoods() != null && castOther.getGoods() != null && this
						.getGoods().equals(castOther.getGoods())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDrawoutId() == null ? 0 : this.getDrawoutId().hashCode());
		result = 37 * result
				+ (getHave() == null ? 0 : this.getHave().hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result
				+ (getTimeLimit() == null ? 0 : this.getTimeLimit().hashCode());
		result = 37 * result
				+ (getPrepay() == null ? 0 : this.getPrepay().hashCode());
		result = 37
				* result
				+ (getPlanDrawout() == null ? 0 : this.getPlanDrawout()
						.hashCode());
		result = 37 * result
				+ (getFleet() == null ? 0 : this.getFleet().hashCode());
		result = 37 * result
				+ (getVehicle() == null ? 0 : this.getVehicle().hashCode());
		result = 37 * result
				+ (getTrailer() == null ? 0 : this.getTrailer().hashCode());
		result = 37 * result
				+ (getDriver() == null ? 0 : this.getDriver().hashCode());
		result = 37 * result
				+ (getHandler() == null ? 0 : this.getHandler().hashCode());
		result = 37 * result
				+ (getClient() == null ? 0 : this.getClient().hashCode());
		result = 37
				* result
				+ (getDestination() == null ? 0 : this.getDestination()
						.hashCode());
		result = 37 * result
				+ (getGoods() == null ? 0 : this.getGoods().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}