package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.RouteDao;
import me.gteam.logman.domain.Route;

@Repository("routeDao")
public class RouteDaoImpl extends BaseDaoImpl<Route> implements RouteDao<Route>{

}