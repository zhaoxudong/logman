package me.gteam.logman.domain;

/**
 * ShouldReceivepay entity. @author MyEclipse Persistence Tools
 */

public class ShouldReceivepay implements java.io.Serializable {

	// Fields

	private ShouldReceivepayId id;

	// Constructors

	/** default constructor */
	public ShouldReceivepay() {
	}

	/** full constructor */
	public ShouldReceivepay(ShouldReceivepayId id) {
		this.id = id;
	}

	// Property accessors

	public ShouldReceivepayId getId() {
		return this.id;
	}

	public void setId(ShouldReceivepayId id) {
		this.id = id;
	}

}