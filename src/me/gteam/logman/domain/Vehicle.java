package me.gteam.logman.domain;

/**
 * Vehicle entity. @author MyEclipse Persistence Tools
 */

public class Vehicle implements java.io.Serializable {

	// Fields

	private Integer vehicleId;
	private String licensePlate;
	private String fleet;
	private String type;
	private String defaultDrag;
	private String vehicleType;
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

	// Constructors

	/** default constructor */
	public Vehicle() {
	}

	/** full constructor */
	public Vehicle(String licensePlate, String fleet, String type,
			String defaultDrag, String vehicleType, Double mileage,
			Double ratifiedLoad, Double oilConsumption,
			Double emptyConsumption, Double monthlyDepreciation,
			String engineNumber, String insuranceNumber, String frameNumber,
			String chassisNumber, String remarks) {
		this.licensePlate = licensePlate;
		this.fleet = fleet;
		this.type = type;
		this.defaultDrag = defaultDrag;
		this.vehicleType = vehicleType;
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
	}

	// Property accessors

	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getFleet() {
		return this.fleet;
	}

	public void setFleet(String fleet) {
		this.fleet = fleet;
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

	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
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

}