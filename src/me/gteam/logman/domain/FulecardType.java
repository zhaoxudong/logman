package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * FulecardType entity. @author MyEclipse Persistence Tools
 */

public class FulecardType implements java.io.Serializable {

	// Fields

	private Integer fulecardId;
	private String type;
	private Set fulecards = new HashSet(0);

	// Constructors

	/** default constructor */
	public FulecardType() {
	}

	/** minimal constructor */
	public FulecardType(Integer fulecardId) {
		this.fulecardId = fulecardId;
	}

	/** full constructor */
	public FulecardType(Integer fulecardId, String type, Set fulecards) {
		this.fulecardId = fulecardId;
		this.type = type;
		this.fulecards = fulecards;
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

	public Set getFulecards() {
		return this.fulecards;
	}

	public void setFulecards(Set fulecards) {
		this.fulecards = fulecards;
	}

}