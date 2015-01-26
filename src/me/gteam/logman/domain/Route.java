package me.gteam.logman.domain;

/**
 * Route entity. @author MyEclipse Persistence Tools
 */

public class Route implements java.io.Serializable {

	// Fields

	private Integer routeId;
	private String routeName;
	private Double loadKm;
	private Double noloadKm;
	private String mnemoric;

	// Constructors

	/** default constructor */
	public Route() {
	}

	/** full constructor */
	public Route(String routeName, Double loadKm, Double noloadKm,
			String mnemoric) {
		this.routeName = routeName;
		this.loadKm = loadKm;
		this.noloadKm = noloadKm;
		this.mnemoric = mnemoric;
	}

	// Property accessors

	public Integer getRouteId() {
		return this.routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return this.routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public Double getLoadKm() {
		return this.loadKm;
	}

	public void setLoadKm(Double loadKm) {
		this.loadKm = loadKm;
	}

	public Double getNoloadKm() {
		return this.noloadKm;
	}

	public void setNoloadKm(Double noloadKm) {
		this.noloadKm = noloadKm;
	}

	public String getMnemoric() {
		return this.mnemoric;
	}

	public void setMnemoric(String mnemoric) {
		this.mnemoric = mnemoric;
	}

}