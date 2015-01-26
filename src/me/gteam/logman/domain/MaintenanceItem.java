package me.gteam.logman.domain;

/**
 * MaintenanceItem entity. @author MyEclipse Persistence Tools
 */

public class MaintenanceItem implements java.io.Serializable {

	// Fields

	private Integer maintitemId;
	private String name;
	private Double intervalkm;
	private Double beforekm;
	private String remark;

	// Constructors

	/** default constructor */
	public MaintenanceItem() {
	}

	/** full constructor */
	public MaintenanceItem(String name, Double intervalkm, Double beforekm,
			String remark) {
		this.name = name;
		this.intervalkm = intervalkm;
		this.beforekm = beforekm;
		this.remark = remark;
	}

	// Property accessors

	public Integer getMaintitemId() {
		return this.maintitemId;
	}

	public void setMaintitemId(Integer maintitemId) {
		this.maintitemId = maintitemId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIntervalkm() {
		return this.intervalkm;
	}

	public void setIntervalkm(Double intervalkm) {
		this.intervalkm = intervalkm;
	}

	public Double getBeforekm() {
		return this.beforekm;
	}

	public void setBeforekm(Double beforekm) {
		this.beforekm = beforekm;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}