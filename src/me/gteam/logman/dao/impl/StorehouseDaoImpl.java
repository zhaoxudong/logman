package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.StorehouseDao;
import me.gteam.logman.domain.Storehouse;

@Repository("storehouseDao")
public class StorehouseDaoImpl extends BaseDaoImpl<Storehouse> implements StorehouseDao<Storehouse>{

}