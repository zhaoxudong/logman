package me.gteam.logman.domain;

/**
 * FulecardType entity. @author MyEclipse Persistence Tools
 */

public class FulecardType implements java.io.Serializable {

	// Fields

	private Integer fulecardId;
	private String type;

	// Constructors

	/** default constructor */
	public FulecardType() {
	}

	/** full constructor */
	public FulecardType(String type) {
		this.type = type;
	}

	// Property accessors

	public Integer getFulecardId() {
		return this.fulecardId;
	}

	public void setFulecardId(Integer fulecardId) {
		this.fulecardId = fulecardId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}