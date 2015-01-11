package me.gteam.logman.domain;

/**
 * Prepay entity. @author MyEclipse Persistence Tools
 */

public class Prepay implements java.io.Serializable {

	// Fields

	private PrepayId id;

	// Constructors

	/** default constructor */
	public Prepay() {
	}

	/** full constructor */
	public Prepay(PrepayId id) {
		this.id = id;
	}

	// Property accessors

	public PrepayId getId() {
		return this.id;
	}

	public void setId(PrepayId id) {
		this.id = id;
	}

}