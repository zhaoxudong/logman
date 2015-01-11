package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * RepairItem entity. @author MyEclipse Persistence Tools
 */

public class RepairItem implements java.io.Serializable {

	// Fields

	private Integer itemId;
	private String itemName;
	private Set repairDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public RepairItem() {
	}

	/** minimal constructor */
	public RepairItem(Integer itemId) {
		this.itemId = itemId;
	}

	/** full constructor */
	public RepairItem(Integer itemId, String itemName, Set repairDetails) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.repairDetails = repairDetails;
	}

	// Property accessors

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Set getRepairDetails() {
		return this.repairDetails;
	}

	public void setRepairDetails(Set repairDetails) {
		this.repairDetails = repairDetails;
	}

}