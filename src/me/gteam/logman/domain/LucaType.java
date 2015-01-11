package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * LucaType entity. @author MyEclipse Persistence Tools
 */

public class LucaType implements java.io.Serializable {

	// Fields

	private Integer lucatypeId;
	private String lucaType;
	private Set lucas = new HashSet(0);

	// Constructors

	/** default constructor */
	public LucaType() {
	}

	/** minimal constructor */
	public LucaType(Integer lucatypeId) {
		this.lucatypeId = lucatypeId;
	}

	/** full constructor */
	public LucaType(Integer lucatypeId, String lucaType, Set lucas) {
		this.lucatypeId = lucatypeId;
		this.lucaType = lucaType;
		this.lucas = lucas;
	}

	// Property accessors

	public Integer getLucatypeId() {
		return this.lucatypeId;
	}

	public void setLucatypeId(Integer lucatypeId) {
		this.lucatypeId = lucatypeId;
	}

	public String getLucaType() {
		return this.lucaType;
	}

	public void setLucaType(String lucaType) {
		this.lucaType = lucaType;
	}

	public Set getLucas() {
		return this.lucas;
	}

	public void setLucas(Set lucas) {
		this.lucas = lucas;
	}

}