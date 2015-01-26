package me.gteam.logman.domain;

/**
 * LucaType entity. @author MyEclipse Persistence Tools
 */

public class LucaType implements java.io.Serializable {

	// Fields

	private Integer lucatypeId;
	private String lucaType;

	// Constructors

	/** default constructor */
	public LucaType() {
	}

	/** full constructor */
	public LucaType(String lucaType) {
		this.lucaType = lucaType;
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

}