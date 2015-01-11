package me.gteam.logman.domain;

/**
 * OfficesuppliesUse entity. @author MyEclipse Persistence Tools
 */

public class OfficesuppliesUse implements java.io.Serializable {

	// Fields

	private OfficesuppliesUseId id;

	// Constructors

	/** default constructor */
	public OfficesuppliesUse() {
	}

	/** full constructor */
	public OfficesuppliesUse(OfficesuppliesUseId id) {
		this.id = id;
	}

	// Property accessors

	public OfficesuppliesUseId getId() {
		return this.id;
	}

	public void setId(OfficesuppliesUseId id) {
		this.id = id;
	}

}