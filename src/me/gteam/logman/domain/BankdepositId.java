package me.gteam.logman.domain;

import java.util.Date;

/**
 * BankdepositId entity. @author MyEclipse Persistence Tools
 */

public class BankdepositId implements java.io.Serializable {

	// Fields

	private Integer depsitId;
	private String depositNo;
	private Date date;
	private Integer payaccount;
	private Integer receive;
	private Double amount;
	private String checkNumber;
	private String operator;
	private String rermark;

	// Constructors

	/** default constructor */
	public BankdepositId() {
	}

	/** full constructor */
	public BankdepositId(Integer depsitId, String depositNo, Date date,
			Integer payaccount, Integer receive, Double amount,
			String checkNumber, String operator, String rermark) {
		this.depsitId = depsitId;
		this.depositNo = depositNo;
		this.date = date;
		this.payaccount = payaccount;
		this.receive = receive;
		this.amount = amount;
		this.checkNumber = checkNumber;
		this.operator = operator;
		this.rermark = rermark;
	}

	// Property accessors

	public Integer getDepsitId() {
		return this.depsitId;
	}

	public void setDepsitId(Integer depsitId) {
		this.depsitId = depsitId;
	}

	public String getDepositNo() {
		return this.depositNo;
	}

	public void setDepositNo(String depositNo) {
		this.depositNo = depositNo;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getPayaccount() {
		return this.payaccount;
	}

	public void setPayaccount(Integer payaccount) {
		this.payaccount = payaccount;
	}

	public Integer getReceive() {
		return this.receive;
	}

	public void setReceive(Integer receive) {
		this.receive = receive;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRermark() {
		return this.rermark;
	}

	public void setRermark(String rermark) {
		this.rermark = rermark;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BankdepositId))
			return false;
		BankdepositId castOther = (BankdepositId) other;

		return ((this.getDepsitId() == castOther.getDepsitId()) || (this
				.getDepsitId() != null && castOther.getDepsitId() != null && this
				.getDepsitId().equals(castOther.getDepsitId())))
				&& ((this.getDepositNo() == castOther.getDepositNo()) || (this
						.getDepositNo() != null
						&& castOther.getDepositNo() != null && this
						.getDepositNo().equals(castOther.getDepositNo())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getPayaccount() == castOther.getPayaccount()) || (this
						.getPayaccount() != null
						&& castOther.getPayaccount() != null && this
						.getPayaccount().equals(castOther.getPayaccount())))
				&& ((this.getReceive() == castOther.getReceive()) || (this
						.getReceive() != null && castOther.getReceive() != null && this
						.getReceive().equals(castOther.getReceive())))
				&& ((this.getAmount() == castOther.getAmount()) || (this
						.getAmount() != null && castOther.getAmount() != null && this
						.getAmount().equals(castOther.getAmount())))
				&& ((this.getCheckNumber() == castOther.getCheckNumber()) || (this
						.getCheckNumber() != null
						&& castOther.getCheckNumber() != null && this
						.getCheckNumber().equals(castOther.getCheckNumber())))
				&& ((this.getOperator() == castOther.getOperator()) || (this
						.getOperator() != null
						&& castOther.getOperator() != null && this
						.getOperator().equals(castOther.getOperator())))
				&& ((this.getRermark() == castOther.getRermark()) || (this
						.getRermark() != null && castOther.getRermark() != null && this
						.getRermark().equals(castOther.getRermark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDepsitId() == null ? 0 : this.getDepsitId().hashCode());
		result = 37 * result
				+ (getDepositNo() == null ? 0 : this.getDepositNo().hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37
				* result
				+ (getPayaccount() == null ? 0 : this.getPayaccount()
						.hashCode());
		result = 37 * result
				+ (getReceive() == null ? 0 : this.getReceive().hashCode());
		result = 37 * result
				+ (getAmount() == null ? 0 : this.getAmount().hashCode());
		result = 37
				* result
				+ (getCheckNumber() == null ? 0 : this.getCheckNumber()
						.hashCode());
		result = 37 * result
				+ (getOperator() == null ? 0 : this.getOperator().hashCode());
		result = 37 * result
				+ (getRermark() == null ? 0 : this.getRermark().hashCode());
		return result;
	}

}