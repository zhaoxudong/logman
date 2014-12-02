package me.gteam.logman.domain;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer idorder;
	private String ordername;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer idorder) {
		this.idorder = idorder;
	}

	/** full constructor */
	public Order(Integer idorder, String ordername) {
		this.idorder = idorder;
		this.ordername = ordername;
	}

	// Property accessors

	public Integer getIdorder() {
		return this.idorder;
	}

	public void setIdorder(Integer idorder) {
		this.idorder = idorder;
	}

	public String getOrdername() {
		return this.ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

}