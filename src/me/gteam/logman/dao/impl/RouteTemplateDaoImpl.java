package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.RouteTemplateDao;
import me.gteam.logman.domain.RouteTemplate;

@Repository("routeTemplateDao")
public class RouteTemplateDaoImpl extends BaseDaoImpl<RouteTemplate> implements RouteTemplateDao<RouteTemplate>{

}