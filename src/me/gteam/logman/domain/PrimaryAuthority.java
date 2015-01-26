package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * PrimaryAuthority entity. @author MyEclipse Persistence Tools
 */

public class PrimaryAuthority implements java.io.Serializable {

	// Fields

	private Integer priId;
	private String priAuthority;
	private Set secondAuthorities = new HashSet(0);

	// Constructors

	/** default constructor */
	public PrimaryAuthority() {
	}

	public PrimaryAuthority(Integer priId, String priAuthority) {
		this.priId = priId;
		this.priAuthority = priAuthority;
	}
	
	/** full constructor */
	public PrimaryAuthority(String priAuthority, Set secondAuthorities) {
		this.priAuthority = priAuthority;
		this.secondAuthorities = secondAuthorities;
	}

	// Property accessors

	public Integer getPriId() {
		return this.priId;
	}

	public void setPriId(Integer priId) {
		this.priId = priId;
	}

	public String getPriAuthority() {
		return this.priAuthority;
	}

	public void setPriAuthority(String priAuthority) {
		this.priAuthority = priAuthority;
	}

	public Set getSecondAuthorities() {
		return this.secondAuthorities;
	}

	public void setSecondAuthorities(Set secondAuthorities) {
		this.secondAuthorities = secondAuthorities;
	}

}