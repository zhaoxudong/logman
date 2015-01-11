package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.FuelDao;
import me.gteam.logman.domain.Fuel;

@Repository("fuelDao")
public class FuelDaoImpl extends BaseDaoImpl<Fuel> implements FuelDao<Fuel>{

}