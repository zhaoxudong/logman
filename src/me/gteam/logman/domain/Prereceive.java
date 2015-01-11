package me.gteam.logman.domain;

/**
 * Prereceive entity. @author MyEclipse Persistence Tools
 */

public class Prereceive implements java.io.Serializable {

	// Fields

	private PrereceiveId id;

	// Constructors

	/** default constructor */
	public Prereceive() {
	}

	/** full constructor */
	public Prereceive(PrereceiveId id) {
		this.id = id;
	}

	// Property accessors

	public PrereceiveId getId() {
		return this.id;
	}

	public void setId(PrereceiveId id) {
		this.id = id;
	}

}