package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.VehicleFeesDao;
import me.gteam.logman.domain.VehicleFees;
import me.gteam.logman.service.VehicleFeesService;

@Service("vehicleFeesService")
public class VehicleFeesServiceImpl implements VehicleFeesService{

	@Resource(name="vehicleFeesDao")
	private VehicleFeesDao vehicleFeesDao;

	public void saveVehicleFees(VehicleFees vehicleFees) {
		this.vehicleFeesDao.saveEntry(vehicleFees);
	}

	public void updateVehicleFees(VehicleFees vehicleFees){
		this.vehicleFeesDao.updateEntry(vehicleFees);
	}

	public void deleteVehicleFeesByID(Serializable id, String deleteMode) {
		this.vehicleFeesDao.deleteEntry(id);
	}

	public Collection<VehicleFees> getAllVehicleFees() {
		return this.vehicleFeesDao.getAllEntry();
	}

	public VehicleFees getVehicleFeesById(Serializable id) {
		return (VehicleFees)this.vehicleFeesDao.getEntryById(id);
	}

}