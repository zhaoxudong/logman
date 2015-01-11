package me.gteam.logman.domain;

/**
 * DrawoutfeeType entity. @author MyEclipse Persistence Tools
 */

public class DrawoutfeeType implements java.io.Serializable {

	// Fields

	private DrawoutfeeTypeId id;

	// Constructors

	/** default constructor */
	public DrawoutfeeType() {
	}

	/** full constructor */
	public DrawoutfeeType(DrawoutfeeTypeId id) {
		this.id = id;
	}

	// Property accessors

	public DrawoutfeeTypeId getId() {
		return this.id;
	}

	public void setId(DrawoutfeeTypeId id) {
		this.id = id;
	}

}