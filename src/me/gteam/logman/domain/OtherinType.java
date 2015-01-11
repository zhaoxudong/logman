package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * OtherinType entity. @author MyEclipse Persistence Tools
 */

public class OtherinType implements java.io.Serializable {

	// Fields

	private Integer typeid;
	private String ishevicle;
	private Set otherins = new HashSet(0);

	// Constructors

	/** default constructor */
	public OtherinType() {
	}

	/** minimal constructor */
	public OtherinType(Integer typeid) {
		this.typeid = typeid;
	}

	/** full constructor */
	public OtherinType(Integer typeid, String ishevicle, Set otherins) {
		this.typeid = typeid;
		this.ishevicle = ishevicle;
		this.otherins = otherins;
	}

	// Property accessors

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getIshevicle() {
		return this.ishevicle;
	}

	public void setIshevicle(String ishevicle) {
		this.ishevicle = ishevicle;
	}

	public Set getOtherins() {
		return this.otherins;
	}

	public void setOtherins(Set otherins) {
		this.otherins = otherins;
	}

}