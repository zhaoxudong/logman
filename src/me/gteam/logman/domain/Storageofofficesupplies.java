package me.gteam.logman.domain;

/**
 * Storageofofficesupplies entity. @author MyEclipse Persistence Tools
 */

public class Storageofofficesupplies implements java.io.Serializable {

	// Fields

	private StorageofofficesuppliesId id;

	// Constructors

	/** default constructor */
	public Storageofofficesupplies() {
	}

	/** full constructor */
	public Storageofofficesupplies(StorageofofficesuppliesId id) {
		this.id = id;
	}

	// Property accessors

	public StorageofofficesuppliesId getId() {
		return this.id;
	}

	public void setId(StorageofofficesuppliesId id) {
		this.id = id;
	}

}