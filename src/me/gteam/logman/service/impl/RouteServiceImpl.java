package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.RouteDao;
import me.gteam.logman.domain.Route;
import me.gteam.logman.service.RouteService;

@Service("routeService")
public class RouteServiceImpl implements RouteService{

	@Resource(name="routeDao")
	private RouteDao routeDao;

	public void saveRoute(Route route) {
		this.routeDao.saveEntry(route);
	}

	public void updateRoute(Route route){
		this.routeDao.updateEntry(route);
	}

	public void deleteRouteByID(Serializable id, String deleteMode) {
		this.routeDao.deleteEntry(id);
	}

	public Collection<Route> getAllRoute() {
		return this.routeDao.getAllEntry();
	}

	public Route getRouteById(Serializable id) {
		return (Route)this.routeDao.getEntryById(id);
	}

}