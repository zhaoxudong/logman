package me.gteam.logman.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String passwd;
	private Set<UserAuthority> userAuthorities = new HashSet<UserAuthority>(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	/** full constructor */
	public User(Integer userId, String userName, String passwd,
			Set userAuthorities) {
		this.userId = userId;
		this.userName = userName;
		this.passwd = passwd;
		this.userAuthorities = userAuthorities;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Set getUserAuthorities() {
		return this.userAuthorities;
	}

	public void setUserAuthorities(Set userAuthorities) {
		this.userAuthorities = userAuthorities;
	}

}