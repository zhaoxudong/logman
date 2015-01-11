package me.gteam.logman.domain;

import java.util.Date;

/**
 * ShouldReceivepayId entity. @author MyEclipse Persistence Tools
 */

public class ShouldReceivepayId implements java.io.Serializable {

	// Fields

	private Date date;
	private String object;
	private Double receiveIncrease;
	private Double receiveDecrease;
	private Double remainder;
	private String number;
	private String remark;

	// Constructors

	/** default constructor */
	public ShouldReceivepayId() {
	}

	/** full constructor */
	public ShouldReceivepayId(Date date, String object, Double receiveIncrease,
			Double receiveDecrease, Double remainder, String number,
			String remark) {
		this.date = date;
		this.object = object;
		this.receiveIncrease = receiveIncrease;
		this.receiveDecrease = receiveDecrease;
		this.remainder = remainder;
		this.number = number;
		this.remark = remark;
	}

	// Property accessors

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public Double getReceiveIncrease() {
		return this.receiveIncrease;
	}

	public void setReceiveIncrease(Double receiveIncrease) {
		this.receiveIncrease = receiveIncrease;
	}

	public Double getReceiveDecrease() {
		return this.receiveDecrease;
	}

	public void setReceiveDecrease(Double receiveDecrease) {
		this.receiveDecrease = receiveDecrease;
	}

	public Double getRemainder() {
		return this.remainder;
	}

	public void setRemainder(Double remainder) {
		this.remainder = remainder;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShouldReceivepayId))
			return false;
		ShouldReceivepayId castOther = (ShouldReceivepayId) other;

		return ((this.getDate() == castOther.getDate()) || (this.getDate() != null
				&& castOther.getDate() != null && this.getDate().equals(
				castOther.getDate())))
				&& ((this.getObject() == castOther.getObject()) || (this
						.getObject() != null && castOther.getObject() != null && this
						.getObject().equals(castOther.getObject())))
				&& ((this.getReceiveIncrease() == castOther
						.getReceiveIncrease()) || (this.getReceiveIncrease() != null
						&& castOther.getReceiveIncrease() != null && this
						.getReceiveIncrease().equals(
								castOther.getReceiveIncrease())))
				&& ((this.getReceiveDecrease() == castOther
						.getReceiveDecrease()) || (this.getReceiveDecrease() != null
						&& castOther.getReceiveDecrease() != null && this
						.getReceiveDecrease().equals(
								castOther.getReceiveDecrease())))
				&& ((this.getRemainder() == castOther.getRemainder()) || (this
						.getRemainder() != null
						&& castOther.getRemainder() != null && this
						.getRemainder().equals(castOther.getRemainder())))
				&& ((this.getNumber() == castOther.getNumber()) || (this
						.getNumber() != null && castOther.getNumber() != null && this
						.getNumber().equals(castOther.getNumber())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result
				+ (getObject() == null ? 0 : this.getObject().hashCode());
		result = 37
				* result
				+ (getReceiveIncrease() == null ? 0 : this.getReceiveIncrease()
						.hashCode());
		result = 37
				* result
				+ (getReceiveDecrease() == null ? 0 : this.getReceiveDecrease()
						.hashCode());
		result = 37 * result
				+ (getRemainder() == null ? 0 : this.getRemainder().hashCode());
		result = 37 * result
				+ (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}