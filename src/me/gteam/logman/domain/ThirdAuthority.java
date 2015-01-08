package me.gteam.logman.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * ThirdAuthority entity. @author MyEclipse Persistence Tools
 */

public class ThirdAuthority implements java.io.Serializable {

	// Fields

	private Integer thiId;
	private SecondAuthority secondAuthority;
	private String thiAuthority;
	private String url;
	private Set<UserAuthority> userAuthorities = new HashSet<UserAuthority>(0);

	// Constructors

	/** default constructor */
	public ThirdAuthority() {
	}

	/** minimal constructor */
	public ThirdAuthority(Integer thiId) {
		this.thiId = thiId;
	}

	/** full constructor */
	public ThirdAuthority(Integer thiId, SecondAuthority secondAuthority,
			String thiAuthority, String url, Set userAuthorities) {
		this.thiId = thiId;
		this.secondAuthority = secondAuthority;
		this.thiAuthority = thiAuthority;
		this.url = url;
		this.userAuthorities = userAuthorities;
	}

	// Property accessors

	public Integer getThiId() {
		return this.thiId;
	}

	public void setThiId(Integer thiId) {
		this.thiId = thiId;
	}

	public SecondAuthority getSecondAuthority() {
		return this.secondAuthority;
	}

	public void setSecondAuthority(SecondAuthority secondAuthority) {
		this.secondAuthority = secondAuthority;
	}

	public String getThiAuthority() {
		return this.thiAuthority;
	}

	public void setThiAuthority(String thiAuthority) {
		this.thiAuthority = thiAuthority;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set getUserAuthorities() {
		return this.userAuthorities;
	}

	public void setUserAuthorities(Set userAuthorities) {
		this.userAuthorities = userAuthorities;
	}

}