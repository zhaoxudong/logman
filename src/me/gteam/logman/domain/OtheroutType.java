package me.gteam.logman.domain;

/**
 * OtheroutType entity. @author MyEclipse Persistence Tools
 */

public class OtheroutType implements java.io.Serializable {

	// Fields

	private Integer typeid;
	private String name;
	private String isvehicle;
	private String issplitthecost;

	// Constructors

	/** default constructor */
	public OtheroutType() {
	}

	/** full constructor */
	public OtheroutType(String name, String isvehicle, String issplitthecost) {
		this.name = name;
		this.isvehicle = isvehicle;
		this.issplitthecost = issplitthecost;
	}

	// Property accessors

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

}