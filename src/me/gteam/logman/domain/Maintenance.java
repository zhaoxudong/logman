package me.gteam.logman.domain;

import java.util.Date;

/**
 * Maintenance entity. @author MyEclipse Persistence Tools
 */

public class Maintenance implements java.io.Serializable {

	// Fields

	private Integer maintenanceId;
	private String name;
	private String department;
	private Date birth;
	private String idcard;
	private String tel;
	private String addr;
	private String isleave;
	private String remark;

	// Constructors

	/** default constructor */
	public Maintenance() {
	}

	/** full constructor */
	public Maintenance(String name, String department, Date birth,
			String idcard, String tel, String addr, String isleave,
			String remark) {
		this.name = name;
		this.department = department;
		this.birth = birth;
		this.idcard = idcard;
		this.tel = tel;
		this.addr = addr;
		this.isleave = isleave;
		this.remark = remark;
	}

	// Property accessors

	public Integer getMaintenanceId() {
		return this.maintenanceId;
	}

	public void setMaintenanceId(Integer maintenanceId) {
		this.maintenanceId = maintenanceId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getIsleave() {
		return this.isleave;
	}

	public void setIsleave(String isleave) {
		this.isleave = isleave;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}