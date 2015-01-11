package me.gteam.logman.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Driver entity. @author MyEclipse Persistence Tools
 */

public class Driver implements java.io.Serializable {

	// Fields

	private Integer driverId;
	private Department department;
	private Vehicle vehicle;
	private String name;
	private String mnemonic;
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
	private Set tankRefuels = new HashSet(0);
	private Set cashRefuels = new HashSet(0);
	private Set accidents = new HashSet(0);
	private Set repairs = new HashSet(0);
	private Set illegals = new HashSet(0);
	private Set fixpointRefuelings = new HashSet(0);
	private Set storeageOuts = new HashSet(0);
	private Set storageIns = new HashSet(0);
	private Set maintenanceRecords = new HashSet(0);

	// Constructors

	/** default constructor */
	public Driver() {
	}

	/** minimal constructor */
	public Driver(Integer driverId) {
		this.driverId = driverId;
	}

	/** full constructor */
	public Driver(Integer driverId, Department department, Vehicle vehicle,
			String name, String mnemonic, String idcard, Date birth,
			String tel, String addr, Date jointime, Date driLicDat,
			Date extendDate, String drivingLicense, String drivingPermitNo,
			String licenseNumber, String skillLevel, String drivingType,
			String isleave, String ramark, Set tankRefuels, Set cashRefuels,
			Set accidents, Set repairs, Set illegals, Set fixpointRefuelings,
			Set storeageOuts, Set storageIns, Set maintenanceRecords) {
		this.driverId = driverId;
		this.department = department;
		this.vehicle = vehicle;
		this.name = name;
		this.mnemonic = mnemonic;
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
		this.tankRefuels = tankRefuels;
		this.cashRefuels = cashRefuels;
		this.accidents = accidents;
		this.repairs = repairs;
		this.illegals = illegals;
		this.fixpointRefuelings = fixpointRefuelings;
		this.storeageOuts = storeageOuts;
		this.storageIns = storageIns;
		this.maintenanceRecords = maintenanceRecords;
	}

	// Property accessors

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
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

	public Set getTankRefuels() {
		return this.tankRefuels;
	}

	public void setTankRefuels(Set tankRefuels) {
		this.tankRefuels = tankRefuels;
	}

	public Set getCashRefuels() {
		return this.cashRefuels;
	}

	public void setCashRefuels(Set cashRefuels) {
		this.cashRefuels = cashRefuels;
	}

	public Set getAccidents() {
		return this.accidents;
	}

	public void setAccidents(Set accidents) {
		this.accidents = accidents;
	}

	public Set getRepairs() {
		return this.repairs;
	}

	public void setRepairs(Set repairs) {
		this.repairs = repairs;
	}

	public Set getIllegals() {
		return this.illegals;
	}

	public void setIllegals(Set illegals) {
		this.illegals = illegals;
	}

	public Set getFixpointRefuelings() {
		return this.fixpointRefuelings;
	}

	public void setFixpointRefuelings(Set fixpointRefuelings) {
		this.fixpointRefuelings = fixpointRefuelings;
	}

	public Set getStoreageOuts() {
		return this.storeageOuts;
	}

	public void setStoreageOuts(Set storeageOuts) {
		this.storeageOuts = storeageOuts;
	}

	public Set getStorageIns() {
		return this.storageIns;
	}

	public void setStorageIns(Set storageIns) {
		this.storageIns = storageIns;
	}

	public Set getMaintenanceRecords() {
		return this.maintenanceRecords;
	}

	public void setMaintenanceRecords(Set maintenanceRecords) {
		this.maintenanceRecords = maintenanceRecords;
	}

}