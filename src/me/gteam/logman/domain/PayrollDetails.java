package me.gteam.logman.domain;

/**
 * PayrollDetails entity. @author MyEclipse Persistence Tools
 */

public class PayrollDetails implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private SettleSalary settleSalary;
	private String name;
	private String type;
	private Double salaryValue;
	private Double commission;
	private Double accruedWages;
	private Double basicWage;
	private Double rentSubsidies;
	private Double foodSubsidies;
	private Double chargesSubsidies;
	private Double otherSubsidies;
	private Double reward;
	private Double payTotal;
	private Double arrearsDeduction;
	private Double absenteeismSalary;
	private Double deductedProvidentFund;
	private Double otherDeducted;
	private Double deductibleLoss;
	private Double salary;
	private String remark;

	// Constructors

	/** default constructor */
	public PayrollDetails() {
	}

	/** full constructor */
	public PayrollDetails(SettleSalary settleSalary, String name, String type,
			Double salaryValue, Double commission, Double accruedWages,
			Double basicWage, Double rentSubsidies, Double foodSubsidies,
			Double chargesSubsidies, Double otherSubsidies, Double reward,
			Double payTotal, Double arrearsDeduction, Double absenteeismSalary,
			Double deductedProvidentFund, Double otherDeducted,
			Double deductibleLoss, Double salary, String remark) {
		this.settleSalary = settleSalary;
		this.name = name;
		this.type = type;
		this.salaryValue = salaryValue;
		this.commission = commission;
		this.accruedWages = accruedWages;
		this.basicWage = basicWage;
		this.rentSubsidies = rentSubsidies;
		this.foodSubsidies = foodSubsidies;
		this.chargesSubsidies = chargesSubsidies;
		this.otherSubsidies = otherSubsidies;
		this.reward = reward;
		this.payTotal = payTotal;
		this.arrearsDeduction = arrearsDeduction;
		this.absenteeismSalary = absenteeismSalary;
		this.deductedProvidentFund = deductedProvidentFund;
		this.otherDeducted = otherDeducted;
		this.deductibleLoss = deductibleLoss;
		this.salary = salary;
		this.remark = remark;
	}

	// Property accessors

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public SettleSalary getSettleSalary() {
		return this.settleSalary;
	}

	public void setSettleSalary(SettleSalary settleSalary) {
		this.settleSalary = settleSalary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getSalaryValue() {
		return this.salaryValue;
	}

	public void setSalaryValue(Double salaryValue) {
		this.salaryValue = salaryValue;
	}

	public Double getCommission() {
		return this.commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public Double getAccruedWages() {
		return this.accruedWages;
	}

	public void setAccruedWages(Double accruedWages) {
		this.accruedWages = accruedWages;
	}

	public Double getBasicWage() {
		return this.basicWage;
	}

	public void setBasicWage(Double basicWage) {
		this.basicWage = basicWage;
	}

	public Double getRentSubsidies() {
		return this.rentSubsidies;
	}

	public void setRentSubsidies(Double rentSubsidies) {
		this.rentSubsidies = rentSubsidies;
	}

	public Double getFoodSubsidies() {
		return this.foodSubsidies;
	}

	public void setFoodSubsidies(Double foodSubsidies) {
		this.foodSubsidies = foodSubsidies;
	}

	public Double getChargesSubsidies() {
		return this.chargesSubsidies;
	}

	public void setChargesSubsidies(Double chargesSubsidies) {
		this.chargesSubsidies = chargesSubsidies;
	}

	public Double getOtherSubsidies() {
		return this.otherSubsidies;
	}

	public void setOtherSubsidies(Double otherSubsidies) {
		this.otherSubsidies = otherSubsidies;
	}

	public Double getReward() {
		return this.reward;
	}

	public void setReward(Double reward) {
		this.reward = reward;
	}

	public Double getPayTotal() {
		return this.payTotal;
	}

	public void setPayTotal(Double payTotal) {
		this.payTotal = payTotal;
	}

	public Double getArrearsDeduction() {
		return this.arrearsDeduction;
	}

	public void setArrearsDeduction(Double arrearsDeduction) {
		this.arrearsDeduction = arrearsDeduction;
	}

	public Double getAbsenteeismSalary() {
		return this.absenteeismSalary;
	}

	public void setAbsenteeismSalary(Double absenteeismSalary) {
		this.absenteeismSalary = absenteeismSalary;
	}

	public Double getDeductedProvidentFund() {
		return this.deductedProvidentFund;
	}

	public void setDeductedProvidentFund(Double deductedProvidentFund) {
		this.deductedProvidentFund = deductedProvidentFund;
	}

	public Double getOtherDeducted() {
		return this.otherDeducted;
	}

	public void setOtherDeducted(Double otherDeducted) {
		this.otherDeducted = otherDeducted;
	}

	public Double getDeductibleLoss() {
		return this.deductibleLoss;
	}

	public void setDeductibleLoss(Double deductibleLoss) {
		this.deductibleLoss = deductibleLoss;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}