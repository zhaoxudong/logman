package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Staff entity. @author MyEclipse Persistence Tools
 */

public class Staff implements java.io.Serializable {

	// Fields

	private Integer staffId;
	private Department department;
	private String staffname;
	private Date birth;
	private String idcard;
	private String tel;
	private String addr;
	private String isleave;
	private String staffRemark;
	private Set absences = new HashSet(0);

	// Constructors

	/** default constructor */
	public Staff() {
	}

	/** minimal constructor */
	public Staff(Integer staffId) {
		this.staffId = staffId;
	}

	/** full constructor */
	public Staff(Integer staffId, Department department, String staffname,
			Date birth, String idcard, String tel, String addr, String isleave,
			String staffRemark, Set absences) {
		this.staffId = staffId;
		this.department = department;
		this.staffname = staffname;
		this.birth = birth;
		this.idcard = idcard;
		this.tel = tel;
		this.addr = addr;
		this.isleave = isleave;
		this.staffRemark = staffRemark;
		this.absences = absences;
	}

	// Property accessors

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getStaffname() {
		return this.staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
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

	public Set getAbsences() {
		return this.absences;
	}

	public void setAbsences(Set absences) {
		this.absences = absences;
	}

}