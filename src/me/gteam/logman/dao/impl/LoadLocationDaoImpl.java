package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.LoadLocationDao;
import me.gteam.logman.domain.LoadLocation;

@Repository("loadLocationDao")
public class LoadLocationDaoImpl extends BaseDaoImpl<LoadLocation> implements LoadLocationDao<LoadLocation>{

}