package me.gteam.logman.domain;

import java.util.HashSet;
import java.util.Set;

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
	private Set orderses = new HashSet(0);
	private Set routeTemplates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Route() {
	}

	/** minimal constructor */
	public Route(Integer routeId) {
		this.routeId = routeId;
	}

	/** full constructor */
	public Route(Integer routeId, String routeName, Double loadKm,
			Double noloadKm, String mnemoric, Set orderses, Set routeTemplates) {
		this.routeId = routeId;
		this.routeName = routeName;
		this.loadKm = loadKm;
		this.noloadKm = noloadKm;
		this.mnemoric = mnemoric;
		this.orderses = orderses;
		this.routeTemplates = routeTemplates;
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

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getRouteTemplates() {
		return this.routeTemplates;
	}

	public void setRouteTemplates(Set routeTemplates) {
		this.routeTemplates = routeTemplates;
	}

}