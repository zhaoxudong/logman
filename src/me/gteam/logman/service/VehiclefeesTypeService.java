package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.VehiclefeesType;

public interface VehiclefeesTypeService {

	public void saveVehiclefeesType(VehiclefeesType vehiclefeesType);

	public void updateVehiclefeesType(VehiclefeesType vehiclefeesType);

	public void deleteVehiclefeesTypeByID(Serializable id,String deleteMode);

	public Collection<VehiclefeesType> getAllVehiclefeesType();

	public VehiclefeesType getVehiclefeesTypeById(Serializable id);
}