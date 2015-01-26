package me.gteam.logman.domain;

/**
 * Absencetype entity. @author MyEclipse Persistence Tools
 */

public class Absencetype implements java.io.Serializable {

	// Fields

	private Integer absencetypeId;
	private String absencetypeName;
	private Integer deduction;

	// Constructors

	/** default constructor */
	public Absencetype() {
	}

	/** full constructor */
	public Absencetype(String absencetypeName, Integer deduction) {
		this.absencetypeName = absencetypeName;
		this.deduction = deduction;
	}

	// Property accessors

	public Integer getAbsencetypeId() {
		return this.absencetypeId;
	}

	public void setAbsencetypeId(Integer absencetypeId) {
		this.absencetypeId = absencetypeId;
	}

	public String getAbsencetypeName() {
		return this.absencetypeName;
	}

	public void setAbsencetypeName(String absencetypeName) {
		this.absencetypeName = absencetypeName;
	}

	public Integer getDeduction() {
		return this.deduction;
	}

	public void setDeduction(Integer deduction) {
		this.deduction = deduction;
	}

}