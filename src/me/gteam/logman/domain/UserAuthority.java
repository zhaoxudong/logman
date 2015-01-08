package me.gteam.logman.domain;

/**
 * UserAuthority entity. @author MyEclipse Persistence Tools
 */

public class UserAuthority implements java.io.Serializable {

	// Fields

	private Integer authorityRecordId;
	private ThirdAuthority thirdAuthority;
	private User user;

	// Constructors

	/** default constructor */
	public UserAuthority() {
	}

	/** full constructor */
	public UserAuthority(Integer authorityRecordId,
			ThirdAuthority thirdAuthority, User user) {
		this.authorityRecordId = authorityRecordId;
		this.thirdAuthority = thirdAuthority;
		this.user = user;
	}

	// Property accessors

	public Integer getAuthorityRecordId() {
		return this.authorityRecordId;
	}

	public void setAuthorityRecordId(Integer authorityRecordId) {
		this.authorityRecordId = authorityRecordId;
	}

	public ThirdAuthority getThirdAuthority() {
		return this.thirdAuthority;
	}

	public void setThirdAuthority(ThirdAuthority thirdAuthority) {
		this.thirdAuthority = thirdAuthority;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}