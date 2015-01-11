package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.VehicleDao;
import me.gteam.logman.domain.Vehicle;
import me.gteam.logman.service.VehicleService;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService{

	@Resource(name="vehicleDao")
	private VehicleDao vehicleDao;

	public void saveVehicle(Vehicle vehicle) {
		this.vehicleDao.saveEntry(vehicle);
	}

	public void updateVehicle(Vehicle vehicle){
		this.vehicleDao.updateEntry(vehicle);
	}

	public void deleteVehicleByID(Serializable id, String deleteMode) {
		this.vehicleDao.deleteEntry(id);
	}

	public Collection<Vehicle> getAllVehicle() {
		return this.vehicleDao.getAllEntry();
	}

	public Vehicle getVehicleById(Serializable id) {
		return (Vehicle)this.vehicleDao.getEntryById(id);
	}

}