package me.gteam.logman.domain;

import java.util.Date;

/**
 * Handler entity. @author MyEclipse Persistence Tools
 */

public class Handler implements java.io.Serializable {

	// Fields

	private Integer handlerId;
	private Department department;
	private String name;
	private Date birth;
	private String idcard;
	private String tel;
	private String addr;
	private String isleave;
	private String remark;

	// Constructors

	/** default constructor */
	public Handler() {
	}

	/** minimal constructor */
	public Handler(Integer handlerId) {
		this.handlerId = handlerId;
	}

	/** full constructor */
	public Handler(Integer handlerId, Department department, String name,
			Date birth, String idcard, String tel, String addr, String isleave,
			String remark) {
		this.handlerId = handlerId;
		this.department = department;
		this.name = name;
		this.birth = birth;
		this.idcard = idcard;
		this.tel = tel;
		this.addr = addr;
		this.isleave = isleave;
		this.remark = remark;
	}

	// Property accessors

	public Integer getHandlerId() {
		return this.handlerId;
	}

	public void setHandlerId(Integer handlerId) {
		this.handlerId = handlerId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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