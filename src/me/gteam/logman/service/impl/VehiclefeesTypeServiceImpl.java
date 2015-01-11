package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.VehiclefeesTypeDao;
import me.gteam.logman.domain.VehiclefeesType;
import me.gteam.logman.service.VehiclefeesTypeService;

@Service("vehiclefeesTypeService")
public class VehiclefeesTypeServiceImpl implements VehiclefeesTypeService{

	@Resource(name="vehiclefeesTypeDao")
	private VehiclefeesTypeDao vehiclefeesTypeDao;

	public void saveVehiclefeesType(VehiclefeesType vehiclefeesType) {
		this.vehiclefeesTypeDao.saveEntry(vehiclefeesType);
	}

	public void updateVehiclefeesType(VehiclefeesType vehiclefeesType){
		this.vehiclefeesTypeDao.updateEntry(vehiclefeesType);
	}

	public void deleteVehiclefeesTypeByID(Serializable id, String deleteMode) {
		this.vehiclefeesTypeDao.deleteEntry(id);
	}

	public Collection<VehiclefeesType> getAllVehiclefeesType() {
		return this.vehiclefeesTypeDao.getAllEntry();
	}

	public VehiclefeesType getVehiclefeesTypeById(Serializable id) {
		return (VehiclefeesType)this.vehiclefeesTypeDao.getEntryById(id);
	}

}