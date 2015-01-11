package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * BorrowPurpose entity. @author MyEclipse Persistence Tools
 */

public class BorrowPurpose implements java.io.Serializable {

	// Fields

	private Integer purposeId;
	private String purpose;
	private Set borrowReturns = new HashSet(0);

	// Constructors

	/** default constructor */
	public BorrowPurpose() {
	}

	/** minimal constructor */
	public BorrowPurpose(Integer purposeId) {
		this.purposeId = purposeId;
	}

	/** full constructor */
	public BorrowPurpose(Integer purposeId, String purpose, Set borrowReturns) {
		this.purposeId = purposeId;
		this.purpose = purpose;
		this.borrowReturns = borrowReturns;
	}

	// Property accessors

	public Integer getPurposeId() {
		return this.purposeId;
	}

	public void setPurposeId(Integer purposeId) {
		this.purposeId = purposeId;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Set getBorrowReturns() {
		return this.borrowReturns;
	}

	public void setBorrowReturns(Set borrowReturns) {
		this.borrowReturns = borrowReturns;
	}

}