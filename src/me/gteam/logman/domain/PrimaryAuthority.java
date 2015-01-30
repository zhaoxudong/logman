package me.gteam.logman.domain;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * PrimaryAuthority entity. @author MyEclipse Persistence Tools
 */

public class PrimaryAuthority implements java.io.Serializable, Comparable<PrimaryAuthority>{

	// Fields

	private Integer priId;
	private String priAuthority;
	private Set secondAuthorities = new TreeSet<SecondAuthority>();

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


	@Override
	public int compareTo(PrimaryAuthority o) {
		// TODO Auto-generated method stub
		if(this.priId<o.priId) return -1;
		if(this.priId==o.priId) return 0;
		if(this.priId>o.priId) return 1;
		return 0;
	}

}