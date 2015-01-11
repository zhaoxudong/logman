package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Route;

public interface RouteService {

	public void saveRoute(Route route);

	public void updateRoute(Route route);

	public void deleteRouteByID(Serializable id,String deleteMode);

	public Collection<Route> getAllRoute();

	public Route getRouteById(Serializable id);
}