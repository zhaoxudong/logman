package me.gteam.logman.domain;

/**
 * OfficesuppliesPurchase entity. @author MyEclipse Persistence Tools
 */

public class OfficesuppliesPurchase implements java.io.Serializable {

	// Fields

	private OfficesuppliesPurchaseId id;

	// Constructors

	/** default constructor */
	public OfficesuppliesPurchase() {
	}

	/** full constructor */
	public OfficesuppliesPurchase(OfficesuppliesPurchaseId id) {
		this.id = id;
	}

	// Property accessors

	public OfficesuppliesPurchaseId getId() {
		return this.id;
	}

	public void setId(OfficesuppliesPurchaseId id) {
		this.id = id;
	}

}