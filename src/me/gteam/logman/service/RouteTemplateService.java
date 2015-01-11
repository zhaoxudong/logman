package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.RouteTemplate;

public interface RouteTemplateService {

	public void saveRouteTemplate(RouteTemplate routeTemplate);

	public void updateRouteTemplate(RouteTemplate routeTemplate);

	public void deleteRouteTemplateByID(Serializable id,String deleteMode);

	public Collection<RouteTemplate> getAllRouteTemplate();

	public RouteTemplate getRouteTemplateById(Serializable id);
}