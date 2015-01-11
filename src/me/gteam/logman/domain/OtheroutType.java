package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * OtheroutType entity. @author MyEclipse Persistence Tools
 */

public class OtheroutType implements java.io.Serializable {

	// Fields

	private Integer typeid;
	private String isvehicle;
	private String issplitthecost;
	private Set otherouts = new HashSet(0);

	// Constructors

	/** default constructor */
	public OtheroutType() {
	}

	/** minimal constructor */
	public OtheroutType(Integer typeid) {
		this.typeid = typeid;
	}

	/** full constructor */
	public OtheroutType(Integer typeid, String isvehicle,
			String issplitthecost, Set otherouts) {
		this.typeid = typeid;
		this.isvehicle = isvehicle;
		this.issplitthecost = issplitthecost;
		this.otherouts = otherouts;
	}

	// Property accessors

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getIsvehicle() {
		return this.isvehicle;
	}

	public void setIsvehicle(String isvehicle) {
		this.isvehicle = isvehicle;
	}

	public String getIssplitthecost() {
		return this.issplitthecost;
	}

	public void setIssplitthecost(String issplitthecost) {
		this.issplitthecost = issplitthecost;
	}

	public Set getOtherouts() {
		return this.otherouts;
	}

	public void setOtherouts(Set otherouts) {
		this.otherouts = otherouts;
	}

}