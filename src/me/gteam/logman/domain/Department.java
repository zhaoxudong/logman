package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer departmentId;
	private String departmentName;
	private String remark;
	private Set drivers = new HashSet(0);
	private Set handlers = new HashSet(0);
	private Set maintenances = new HashSet(0);
	private Set staffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** minimal constructor */
	public Department(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/** full constructor */
	public Department(Integer departmentId, String departmentName,
			String remark, Set drivers, Set handlers, Set maintenances,
			Set staffs) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.remark = remark;
		this.drivers = drivers;
		this.handlers = handlers;
		this.maintenances = maintenances;
		this.staffs = staffs;
	}

	// Property accessors

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getDrivers() {
		return this.drivers;
	}

	public void setDrivers(Set drivers) {
		this.drivers = drivers;
	}

	public Set getHandlers() {
		return this.handlers;
	}

	public void setHandlers(Set handlers) {
		this.handlers = handlers;
	}

	public Set getMaintenances() {
		return this.maintenances;
	}

	public void setMaintenances(Set maintenances) {
		this.maintenances = maintenances;
	}

	public Set getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Set staffs) {
		this.staffs = staffs;
	}

}