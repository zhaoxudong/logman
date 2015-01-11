package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Vehiclemodel;

public interface VehiclemodelService {

	public void saveVehiclemodel(Vehiclemodel vehiclemodel);

	public void updateVehiclemodel(Vehiclemodel vehiclemodel);

	public void deleteVehiclemodelByID(Serializable id,String deleteMode);

	public Collection<Vehiclemodel> getAllVehiclemodel();

	public Vehiclemodel getVehiclemodelById(Serializable id);
}