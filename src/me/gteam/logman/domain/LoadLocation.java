package me.gteam.logman.domain;

/**
 * LoadLocation entity. @author MyEclipse Persistence Tools
 */

public class LoadLocation implements java.io.Serializable {

	// Fields

	private Integer addrId;
	private Costumer costumer;
	private String addr;

	// Constructors

	/** default constructor */
	public LoadLocation() {
	}

	/** full constructor */
	public LoadLocation(Costumer costumer, String addr) {
		this.costumer = costumer;
		this.addr = addr;
	}

	// Property accessors

	public Integer getAddrId() {
		return this.addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	public Costumer getCostumer() {
		return this.costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}