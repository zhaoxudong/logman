package me.gteam.logman.domain;

/**
 * DrawoutfeeType entity. @author MyEclipse Persistence Tools
 */

public class DrawoutfeeType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String typeName;
	private String iscash;

	// Constructors

	/** default constructor */
	public DrawoutfeeType() {
	}

	/** full constructor */
	public DrawoutfeeType(String typeName, String iscash) {
		this.typeName = typeName;
		this.iscash = iscash;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getIscash() {
		return this.iscash;
	}

	public void setIscash(String iscash) {
		this.iscash = iscash;
	}

}