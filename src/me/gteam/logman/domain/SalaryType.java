package me.gteam.logman.domain;

/**
 * SalaryType entity. @author MyEclipse Persistence Tools
 */

public class SalaryType implements java.io.Serializable {

	// Fields

	private Integer salarytypeId;
	private String typename;
	private String type;

	// Constructors

	/** default constructor */
	public SalaryType() {
	}

	/** full constructor */
	public SalaryType(String typename, String type) {
		this.typename = typename;
		this.type = type;
	}

	// Property accessors

	public Integer getSalarytypeId() {
		return this.salarytypeId;
	}

	public void setSalarytypeId(Integer salarytypeId) {
		this.salarytypeId = salarytypeId;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}