package me.gteam.logman.domain;

import java.util.Date;

/**
 * Staff entity. @author MyEclipse Persistence Tools
 */

public class Staff implements java.io.Serializable {

	// Fields

	private Integer staffId;
	private String staffname;
	private String department;
	private Date birth;
	private String idcard;
	private String tel;
	private String addr;
	private String isleave;
	private String staffRemark;

	// Constructors

	/** default constructor */
	public Staff() {
	}

	/** full constructor */
	public Staff(String staffname, String department, Date birth,
			String idcard, String tel, String addr, String isleave,
			String staffRemark) {
		this.staffname = staffname;
		this.department = department;
		this.birth = birth;
		this.idcard = idcard;
		this.tel = tel;
		this.addr = addr;
		this.isleave = isleave;
		this.staffRemark = staffRemark;
	}

	// Property accessors

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffname() {
		return this.staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
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

	public String getStaffRemark() {
		return this.staffRemark;
	}

	public void setStaffRemark(String staffRemark) {
		this.staffRemark = staffRemark;
	}

}