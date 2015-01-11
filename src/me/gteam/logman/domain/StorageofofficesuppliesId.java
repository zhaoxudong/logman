package me.gteam.logman.domain;

/**
 * StorageofofficesuppliesId entity. @author MyEclipse Persistence Tools
 */

public class StorageofofficesuppliesId implements java.io.Serializable {

	// Fields

	private String officesuppliesname;
	private Double price;
	private Double currentAmount;

	// Constructors

	/** default constructor */
	public StorageofofficesuppliesId() {
	}

	/** full constructor */
	public StorageofofficesuppliesId(String officesuppliesname, Double price,
			Double currentAmount) {
		this.officesuppliesname = officesuppliesname;
		this.price = price;
		this.currentAmount = currentAmount;
	}

	// Property accessors

	public String getOfficesuppliesname() {
		return this.officesuppliesname;
	}

	public void setOfficesuppliesname(String officesuppliesname) {
		this.officesuppliesname = officesuppliesname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getCurrentAmount() {
		return this.currentAmount;
	}

	public void setCurrentAmount(Double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StorageofofficesuppliesId))
			return false;
		StorageofofficesuppliesId castOther = (StorageofofficesuppliesId) other;

		return ((this.getOfficesuppliesname() == castOther
				.getOfficesuppliesname()) || (this.getOfficesuppliesname() != null
				&& castOther.getOfficesuppliesname() != null && this
				.getOfficesuppliesname().equals(
						castOther.getOfficesuppliesname())))
				&& ((this.getPrice() == castOther.getPrice()) || (this
						.getPrice() != null && castOther.getPrice() != null && this
						.getPrice().equals(castOther.getPrice())))
				&& ((this.getCurrentAmount() == castOther.getCurrentAmount()) || (this
						.getCurrentAmount() != null
						&& castOther.getCurrentAmount() != null && this
						.getCurrentAmount()
						.equals(castOther.getCurrentAmount())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOfficesuppliesname() == null ? 0 : this
						.getOfficesuppliesname().hashCode());
		result = 37 * result
				+ (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37
				* result
				+ (getCurrentAmount() == null ? 0 : this.getCurrentAmount()
						.hashCode());
		return result;
	}

}