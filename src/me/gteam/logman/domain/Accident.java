package me.gteam.logman.domain;

import java.util.Date;

/**
 * Accident entity. @author MyEclipse Persistence Tools
 */

public class Accident implements java.io.Serializable {

	// Fields

	private Integer accidentId;
	private String vehicle;
	private String driver;
	private Date accidentDate;
	private String location;
	private String responsibleParty;
	private String operator;
	private String remark;

	// Constructors

	/** default constructor */
	public Accident() {
	}

	/** full constructor */
	public Accident(String vehicle, String driver, Date accidentDate,
			String location, String responsibleParty, String operator,
			String remark) {
		this.vehicle = vehicle;
		this.driver = driver;
		this.accidentDate = accidentDate;
		this.location = location;
		this.responsibleParty = responsibleParty;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public Integer getAccidentId() {
		return this.accidentId;
	}

	public void setAccidentId(Integer accidentId) {
		this.accidentId = accidentId;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public Date getAccidentDate() {
		return this.accidentDate;
	}

	public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getResponsibleParty() {
		return this.responsibleParty;
	}

	public void setResponsibleParty(String responsibleParty) {
		this.responsibleParty = responsibleParty;
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

}