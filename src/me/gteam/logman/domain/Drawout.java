package me.gteam.logman.domain;

/**
 * Drawout entity. @author MyEclipse Persistence Tools
 */

public class Drawout implements java.io.Serializable {

	// Fields

	private DrawoutId id;

	// Constructors

	/** default constructor */
	public Drawout() {
	}

	/** full constructor */
	public Drawout(DrawoutId id) {
		this.id = id;
	}

	// Property accessors

	public DrawoutId getId() {
		return this.id;
	}

	public void setId(DrawoutId id) {
		this.id = id;
	}

}