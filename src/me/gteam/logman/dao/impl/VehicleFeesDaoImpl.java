package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.VehicleFeesDao;
import me.gteam.logman.domain.VehicleFees;

@Repository("vehicleFeesDao")
public class VehicleFeesDaoImpl extends BaseDaoImpl<VehicleFees> implements VehicleFeesDao<VehicleFees>{

}