package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.RouteTemplateDao;
import me.gteam.logman.domain.RouteTemplate;
import me.gteam.logman.service.RouteTemplateService;

@Service("routeTemplateService")
public class RouteTemplateServiceImpl implements RouteTemplateService{

	@Resource(name="routeTemplateDao")
	private RouteTemplateDao routeTemplateDao;

	public void saveRouteTemplate(RouteTemplate routeTemplate) {
		this.routeTemplateDao.saveEntry(routeTemplate);
	}

	public void updateRouteTemplate(RouteTemplate routeTemplate){
		this.routeTemplateDao.updateEntry(routeTemplate);
	}

	public void deleteRouteTemplateByID(Serializable id, String deleteMode) {
		this.routeTemplateDao.deleteEntry(id);
	}

	public Collection<RouteTemplate> getAllRouteTemplate() {
		return this.routeTemplateDao.getAllEntry();
	}

	public RouteTemplate getRouteTemplateById(Serializable id) {
		return (RouteTemplate)this.routeTemplateDao.getEntryById(id);
	}

}