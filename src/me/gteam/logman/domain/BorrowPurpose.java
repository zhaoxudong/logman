package me.gteam.logman.domain;

/**
 * BorrowPurpose entity. @author MyEclipse Persistence Tools
 */

public class BorrowPurpose implements java.io.Serializable {

	// Fields

	private Integer purposeId;
	private String purpose;

	// Constructors

	/** default constructor */
	public BorrowPurpose() {
	}

	/** full constructor */
	public BorrowPurpose(String purpose) {
		this.purpose = purpose;
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

}