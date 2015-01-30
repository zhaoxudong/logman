package me.gteam.logman.domain;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * SecondAuthority entity. @author MyEclipse Persistence Tools
 */

public class SecondAuthority implements java.io.Serializable, Comparable<SecondAuthority>{

	// Fields

	private Integer secId;
	private PrimaryAuthority primaryAuthority;
	private String secAuthority;
	private Set thirdAuthorities = new HashSet(0);

	// Constructors

	/** default constructor */
	public SecondAuthority() {
	}

	public SecondAuthority(Integer secId,String secAuthority) {
		this.secId = secId;
		this.secAuthority = secAuthority;
	}
	
	/** full constructor */
	public SecondAuthority(PrimaryAuthority primaryAuthority,
			String secAuthority, Set thirdAuthorities) {
		this.primaryAuthority = primaryAuthority;
		this.secAuthority = secAuthority;
		this.thirdAuthorities = thirdAuthorities;
	}

	// Property accessors

	public Integer getSecId() {
		return this.secId;
	}

	public void setSecId(Integer secId) {
		this.secId = secId;
	}

	public PrimaryAuthority getPrimaryAuthority() {
		return this.primaryAuthority;
	}

	public void setPrimaryAuthority(PrimaryAuthority primaryAuthority) {
		this.primaryAuthority = primaryAuthority;
	}

	public String getSecAuthority() {
		return this.secAuthority;
	}

	public void setSecAuthority(String secAuthority) {
		this.secAuthority = secAuthority;
	}

	public Set getThirdAuthorities() {
		return this.thirdAuthorities;
	}

	public void setThirdAuthorities(Set thirdAuthorities) {
		this.thirdAuthorities = thirdAuthorities;
	}

	@Override
	public int compareTo(SecondAuthority o) {
		// TODO Auto-generated method stub
		if(this.secId<o.secId) return -1;
		if(this.secId==o.secId) return 0;
		if(this.secId>o.secId) return 1;
		return 0;
	}

	

}