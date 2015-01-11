package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FuelDao;
import me.gteam.logman.domain.Fuel;
import me.gteam.logman.service.FuelService;

@Service("fuelService")
public class FuelServiceImpl implements FuelService{

	@Resource(name="fuelDao")
	private FuelDao fuelDao;

	public void saveFuel(Fuel fuel) {
		this.fuelDao.saveEntry(fuel);
	}

	public void updateFuel(Fuel fuel){
		this.fuelDao.updateEntry(fuel);
	}

	public void deleteFuelByID(Serializable id, String deleteMode) {
		this.fuelDao.deleteEntry(id);
	}

	public Collection<Fuel> getAllFuel() {
		return this.fuelDao.getAllEntry();
	}

	public Fuel getFuelById(Serializable id) {
		return (Fuel)this.fuelDao.getEntryById(id);
	}

}