package me.gteam.logman.domain;

import java.util.Date;

/**
 * Driver entity. @author MyEclipse Persistence Tools
 */

public class Driver implements java.io.Serializable {

	// Fields

	private Integer driverId;
	private String name;
	private String mnemonic;
	private String vehicle;
	private String department;
	private String idcard;
	private Date birth;
	private String tel;
	private String addr;
	private Date jointime;
	private Date driLicDat;
	private Date extendDate;
	private String drivingLicense;
	private String drivingPermitNo;
	private String licenseNumber;
	private String skillLevel;
	private String drivingType;
	private String isleave;
	private String ramark;

	// Constructors

	/** default constructor */
	public Driver() {
	}

	/** full constructor */
	public Driver(String name, String mnemonic, String vehicle,
			String department, String idcard, Date birth, String tel,
			String addr, Date jointime, Date driLicDat, Date extendDate,
			String drivingLicense, String drivingPermitNo,
			String licenseNumber, String skillLevel, String drivingType,
			String isleave, String ramark) {
		this.name = name;
		this.mnemonic = mnemonic;
		this.vehicle = vehicle;
		this.department = department;
		this.idcard = idcard;
		this.birth = birth;
		this.tel = tel;
		this.addr = addr;
		this.jointime = jointime;
		this.driLicDat = driLicDat;
		this.extendDate = extendDate;
		this.drivingLicense = drivingLicense;
		this.drivingPermitNo = drivingPermitNo;
		this.licenseNumber = licenseNumber;
		this.skillLevel = skillLevel;
		this.drivingType = drivingType;
		this.isleave = isleave;
		this.ramark = ramark;
	}

	// Property accessors

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMnemonic() {
		return this.mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
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

	public Date getJointime() {
		return this.jointime;
	}

	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}

	public Date getDriLicDat() {
		return this.driLicDat;
	}

	public void setDriLicDat(Date driLicDat) {
		this.driLicDat = driLicDat;
	}

	public Date getExtendDate() {
		return this.extendDate;
	}

	public void setExtendDate(Date extendDate) {
		this.extendDate = extendDate;
	}

	public String getDrivingLicense() {
		return this.drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public String getDrivingPermitNo() {
		return this.drivingPermitNo;
	}

	public void setDrivingPermitNo(String drivingPermitNo) {
		this.drivingPermitNo = drivingPermitNo;
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getSkillLevel() {
		return this.skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	public String getDrivingType() {
		return this.drivingType;
	}

	public void setDrivingType(String drivingType) {
		this.drivingType = drivingType;
	}

	public String getIsleave() {
		return this.isleave;
	}

	public void setIsleave(String isleave) {
		this.isleave = isleave;
	}

	public String getRamark() {
		return this.ramark;
	}

	public void setRamark(String ramark) {
		this.ramark = ramark;
	}

}