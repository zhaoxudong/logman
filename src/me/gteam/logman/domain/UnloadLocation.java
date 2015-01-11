package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * UnloadLocation entity. @author MyEclipse Persistence Tools
 */

public class UnloadLocation implements java.io.Serializable {

	// Fields

	private Integer addrId;
	private Costumer costumer;
	private String addr;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public UnloadLocation() {
	}

	/** minimal constructor */
	public UnloadLocation(Integer addrId) {
		this.addrId = addrId;
	}

	/** full constructor */
	public UnloadLocation(Integer addrId, Costumer costumer, String addr,
			Set orderses) {
		this.addrId = addrId;
		this.costumer = costumer;
		this.addr = addr;
		this.orderses = orderses;
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

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}