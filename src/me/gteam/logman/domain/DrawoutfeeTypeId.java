package me.gteam.logman.domain;

/**
 * DrawoutfeeTypeId entity. @author MyEclipse Persistence Tools
 */

public class DrawoutfeeTypeId implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String typeName;
	private String iscash;

	// Constructors

	/** default constructor */
	public DrawoutfeeTypeId() {
	}

	/** full constructor */
	public DrawoutfeeTypeId(Integer typeId, String typeName, String iscash) {
		this.typeId = typeId;
		this.typeName = typeName;
		this.iscash = iscash;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getIscash() {
		return this.iscash;
	}

	public void setIscash(String iscash) {
		this.iscash = iscash;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DrawoutfeeTypeId))
			return false;
		DrawoutfeeTypeId castOther = (DrawoutfeeTypeId) other;

		return ((this.getTypeId() == castOther.getTypeId()) || (this
				.getTypeId() != null && castOther.getTypeId() != null && this
				.getTypeId().equals(castOther.getTypeId())))
				&& ((this.getTypeName() == castOther.getTypeName()) || (this
						.getTypeName() != null
						&& castOther.getTypeName() != null && this
						.getTypeName().equals(castOther.getTypeName())))
				&& ((this.getIscash() == castOther.getIscash()) || (this
						.getIscash() != null && castOther.getIscash() != null && this
						.getIscash().equals(castOther.getIscash())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTypeId() == null ? 0 : this.getTypeId().hashCode());
		result = 37 * result
				+ (getTypeName() == null ? 0 : this.getTypeName().hashCode());
		result = 37 * result
				+ (getIscash() == null ? 0 : this.getIscash().hashCode());
		return result;
	}

}