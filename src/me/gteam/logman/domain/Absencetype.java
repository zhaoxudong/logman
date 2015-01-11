package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Absencetype entity. @author MyEclipse Persistence Tools
 */

public class Absencetype implements java.io.Serializable {

	// Fields

	private Integer absencetypeId;
	private String absencetypeName;
	private Integer deduction;
	private Set absences = new HashSet(0);

	// Constructors

	/** default constructor */
	public Absencetype() {
	}

	/** minimal constructor */
	public Absencetype(Integer absencetypeId) {
		this.absencetypeId = absencetypeId;
	}

	/** full constructor */
	public Absencetype(Integer absencetypeId, String absencetypeName,
			Integer deduction, Set absences) {
		this.absencetypeId = absencetypeId;
		this.absencetypeName = absencetypeName;
		this.deduction = deduction;
		this.absences = absences;
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

	public Set getAbsences() {
		return this.absences;
	}

	public void setAbsences(Set absences) {
		this.absences = absences;
	}

}