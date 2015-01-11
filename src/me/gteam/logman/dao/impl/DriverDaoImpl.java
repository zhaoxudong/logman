package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.DriverDao;
import me.gteam.logman.domain.Driver;

@Repository("driverDao")
public class DriverDaoImpl extends BaseDaoImpl<Driver> implements DriverDao<Driver>{

}