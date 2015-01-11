package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Vehicle;

public interface VehicleService {

	public void saveVehicle(Vehicle vehicle);

	public void updateVehicle(Vehicle vehicle);

	public void deleteVehicleByID(Serializable id,String deleteMode);

	public Collection<Vehicle> getAllVehicle();

	public Vehicle getVehicleById(Serializable id);
}