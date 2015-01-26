package me.gteam.logman.domain;

/**
 * RepairItem entity. @author MyEclipse Persistence Tools
 */

public class RepairItem implements java.io.Serializable {

	// Fields

	private Integer itemId;
	private String itemName;

	// Constructors

	/** default constructor */
	public RepairItem() {
	}

	/** full constructor */
	public RepairItem(String itemName) {
		this.itemName = itemName;
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

}