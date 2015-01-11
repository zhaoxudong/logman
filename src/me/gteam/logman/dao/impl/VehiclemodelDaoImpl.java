package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.VehiclemodelDao;
import me.gteam.logman.domain.Vehiclemodel;

@Repository("vehiclemodelDao")
public class VehiclemodelDaoImpl extends BaseDaoImpl<Vehiclemodel> implements VehiclemodelDao<Vehiclemodel>{

}