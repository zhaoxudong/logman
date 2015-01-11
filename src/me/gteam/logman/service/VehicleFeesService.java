package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.VehicleFees;

public interface VehicleFeesService {

	public void saveVehicleFees(VehicleFees vehicleFees);

	public void updateVehicleFees(VehicleFees vehicleFees);

	public void deleteVehicleFeesByID(Serializable id,String deleteMode);

	public Collection<VehicleFees> getAllVehicleFees();

	public VehicleFees getVehicleFeesById(Serializable id);
}