package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.FleetDao;
import me.gteam.logman.domain.Fleet;

@Repository("fleetDao")
public class FleetDaoImpl extends BaseDaoImpl<Fleet> implements FleetDao<Fleet>{

}