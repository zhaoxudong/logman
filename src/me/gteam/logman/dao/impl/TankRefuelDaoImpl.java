package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.TankRefuelDao;
import me.gteam.logman.domain.TankRefuel;

@Repository("tankRefuelDao")
public class TankRefuelDaoImpl extends BaseDaoImpl<TankRefuel> implements TankRefuelDao<TankRefuel>{

}