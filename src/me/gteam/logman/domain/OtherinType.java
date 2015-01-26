package me.gteam.logman.domain;

/**
 * OtherinType entity. @author MyEclipse Persistence Tools
 */

public class OtherinType implements java.io.Serializable {

	// Fields

	private Integer typeid;
	private String name;
	private String ishevicle;

	// Constructors

	/** default constructor */
	public OtherinType() {
	}

	/** full constructor */
	public OtherinType(String name, String ishevicle) {
		this.name = name;
		this.ishevicle = ishevicle;
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

	public String getIshevicle() {
		return this.ishevicle;
	}

	public void setIshevicle(String ishevicle) {
		this.ishevicle = ishevicle;
	}

}