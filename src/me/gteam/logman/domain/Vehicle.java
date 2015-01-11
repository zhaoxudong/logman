package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Vehicle entity. @author MyEclipse Persistence Tools
 */

public class Vehicle implements java.io.Serializable {

	// Fields

	private Integer vehicleId;
	private Vehiclemodel vehiclemodel;
	private Fleet fleet;
	private String licensePlate;
	private String type;
	private String defaultDrag;
	private Double mileage;
	private Double ratifiedLoad;
	private Double oilConsumption;
	private Double emptyConsumption;
	private Double monthlyDepreciation;
	private String engineNumber;
	private String insuranceNumber;
	private String frameNumber;
	private String chassisNumber;
	private String remarks;
	private Set otherouts = new HashSet(0);
	private Set vehicleFeeses = new HashSet(0);
	private Set storageIns = new HashSet(0);
	private Set cashRefuels = new HashSet(0);
	private Set repairs = new HashSet(0);
	private Set storeageOuts = new HashSet(0);
	private Set maintenanceRecords = new HashSet(0);
	private Set otherins = new HashSet(0);
	private Set illegals = new HashSet(0);
	private Set fixpointRefuelings = new HashSet(0);
	private Set fulecards = new HashSet(0);
	private Set tankRefuels = new HashSet(0);
	private Set drivers = new HashSet(0);
	private Set accidents = new HashSet(0);
	private Set lucas = new HashSet(0);
	private Set tireDates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vehicle() {
	}

	/** minimal constructor */
	public Vehicle(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	/** full constructor */
	public Vehicle(Integer vehicleId, Vehiclemodel vehiclemodel, Fleet fleet,
			String licensePlate, String type, String defaultDrag,
			Double mileage, Double ratifiedLoad, Double oilConsumption,
			Double emptyConsumption, Double monthlyDepreciation,
			String engineNumber, String insuranceNumber, String frameNumber,
			String chassisNumber, String remarks, Set otherouts,
			Set vehicleFeeses, Set storageIns, Set cashRefuels, Set repairs,
			Set storeageOuts, Set maintenanceRecords, Set otherins,
			Set illegals, Set fixpointRefuelings, Set fulecards,
			Set tankRefuels, Set drivers, Set accidents, Set lucas,
			Set tireDates) {
		this.vehicleId = vehicleId;
		this.vehiclemodel = vehiclemodel;
		this.fleet = fleet;
		this.licensePlate = licensePlate;
		this.type = type;
		this.defaultDrag = defaultDrag;
		this.mileage = mileage;
		this.ratifiedLoad = ratifiedLoad;
		this.oilConsumption = oilConsumption;
		this.emptyConsumption = emptyConsumption;
		this.monthlyDepreciation = monthlyDepreciation;
		this.engineNumber = engineNumber;
		this.insuranceNumber = insuranceNumber;
		this.frameNumber = frameNumber;
		this.chassisNumber = chassisNumber;
		this.remarks = remarks;
		this.otherouts = otherouts;
		this.vehicleFeeses = vehicleFeeses;
		this.storageIns = storageIns;
		this.cashRefuels = cashRefuels;
		this.repairs = repairs;
		this.storeageOuts = storeageOuts;
		this.maintenanceRecords = maintenanceRecords;
		this.otherins = otherins;
		this.illegals = illegals;
		this.fixpointRefuelings = fixpointRefuelings;
		this.fulecards = fulecards;
		this.tankRefuels = tankRefuels;
		this.drivers = drivers;
		this.accidents = accidents;
		this.lucas = lucas;
		this.tireDates = tireDates;
	}

	// Property accessors

	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Vehiclemodel getVehiclemodel() {
		return this.vehiclemodel;
	}

	public void setVehiclemodel(Vehiclemodel vehiclemodel) {
		this.vehiclemodel = vehiclemodel;
	}

	public Fleet getFleet() {
		return this.fleet;
	}

	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDefaultDrag() {
		return this.defaultDrag;
	}

	public void setDefaultDrag(String defaultDrag) {
		this.defaultDrag = defaultDrag;
	}

	public Double getMileage() {
		return this.mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public Double getRatifiedLoad() {
		return this.ratifiedLoad;
	}

	public void setRatifiedLoad(Double ratifiedLoad) {
		this.ratifiedLoad = ratifiedLoad;
	}

	public Double getOilConsumption() {
		return this.oilConsumption;
	}

	public void setOilConsumption(Double oilConsumption) {
		this.oilConsumption = oilConsumption;
	}

	public Double getEmptyConsumption() {
		return this.emptyConsumption;
	}

	public void setEmptyConsumption(Double emptyConsumption) {
		this.emptyConsumption = emptyConsumption;
	}

	public Double getMonthlyDepreciation() {
		return this.monthlyDepreciation;
	}

	public void setMonthlyDepreciation(Double monthlyDepreciation) {
		this.monthlyDepreciation = monthlyDepreciation;
	}

	public String getEngineNumber() {
		return this.engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getInsuranceNumber() {
		return this.insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public String getFrameNumber() {
		return this.frameNumber;
	}

	public void setFrameNumber(String frameNumber) {
		this.frameNumber = frameNumber;
	}

	public String getChassisNumber() {
		return this.chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Set getOtherouts() {
		return this.otherouts;
	}

	public void setOtherouts(Set otherouts) {
		this.otherouts = otherouts;
	}

	public Set getVehicleFeeses() {
		return this.vehicleFeeses;
	}

	public void setVehicleFeeses(Set vehicleFeeses) {
		this.vehicleFeeses = vehicleFeeses;
	}

	public Set getStorageIns() {
		return this.storageIns;
	}

	public void setStorageIns(Set storageIns) {
		this.storageIns = storageIns;
	}

	public Set getCashRefuels() {
		return this.cashRefuels;
	}

	public void setCashRefuels(Set cashRefuels) {
		this.cashRefuels = cashRefuels;
	}

	public Set getRepairs() {
		return this.repairs;
	}

	public void setRepairs(Set repairs) {
		this.repairs = repairs;
	}

	public Set getStoreageOuts() {
		return this.storeageOuts;
	}

	public void setStoreageOuts(Set storeageOuts) {
		this.storeageOuts = storeageOuts;
	}

	public Set getMaintenanceRecords() {
		return this.maintenanceRecords;
	}

	public void setMaintenanceRecords(Set maintenanceRecords) {
		this.maintenanceRecords = maintenanceRecords;
	}

	public Set getOtherins() {
		return this.otherins;
	}

	public void setOtherins(Set otherins) {
		this.otherins = otherins;
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

	public Set getFulecards() {
		return this.fulecards;
	}

	public void setFulecards(Set fulecards) {
		this.fulecards = fulecards;
	}

	public Set getTankRefuels() {
		return this.tankRefuels;
	}

	public void setTankRefuels(Set tankRefuels) {
		this.tankRefuels = tankRefuels;
	}

	public Set getDrivers() {
		return this.drivers;
	}

	public void setDrivers(Set drivers) {
		this.drivers = drivers;
	}

	public Set getAccidents() {
		return this.accidents;
	}

	public void setAccidents(Set accidents) {
		this.accidents = accidents;
	}

	public Set getLucas() {
		return this.lucas;
	}

	public void setLucas(Set lucas) {
		this.lucas = lucas;
	}

	public Set getTireDates() {
		return this.tireDates;
	}

	public void setTireDates(Set tireDates) {
		this.tireDates = tireDates;
	}

}