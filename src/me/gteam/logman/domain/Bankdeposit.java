package me.gteam.logman.domain;

/**
 * Bankdeposit entity. @author MyEclipse Persistence Tools
 */

public class Bankdeposit implements java.io.Serializable {

	// Fields

	private BankdepositId id;

	// Constructors

	/** default constructor */
	public Bankdeposit() {
	}

	/** full constructor */
	public Bankdeposit(BankdepositId id) {
		this.id = id;
	}

	// Property accessors

	public BankdepositId getId() {
		return this.id;
	}

	public void setId(BankdepositId id) {
		this.id = id;
	}

}