package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.VehicleDao;
import me.gteam.logman.domain.Vehicle;

@Repository("vehicleDao")
public class VehicleDaoImpl extends BaseDaoImpl<Vehicle> implements VehicleDao<Vehicle>{

}