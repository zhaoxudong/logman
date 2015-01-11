package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.VehiclemodelDao;
import me.gteam.logman.domain.Vehiclemodel;
import me.gteam.logman.service.VehiclemodelService;

@Service("vehiclemodelService")
public class VehiclemodelServiceImpl implements VehiclemodelService{

	@Resource(name="vehiclemodelDao")
	private VehiclemodelDao vehiclemodelDao;

	public void saveVehiclemodel(Vehiclemodel vehiclemodel) {
		this.vehiclemodelDao.saveEntry(vehiclemodel);
	}

	public void updateVehiclemodel(Vehiclemodel vehiclemodel){
		this.vehiclemodelDao.updateEntry(vehiclemodel);
	}

	public void deleteVehiclemodelByID(Serializable id, String deleteMode) {
		this.vehiclemodelDao.deleteEntry(id);
	}

	public Collection<Vehiclemodel> getAllVehiclemodel() {
		return this.vehiclemodelDao.getAllEntry();
	}

	public Vehiclemodel getVehiclemodelById(Serializable id) {
		return (Vehiclemodel)this.vehiclemodelDao.getEntryById(id);
	}

}