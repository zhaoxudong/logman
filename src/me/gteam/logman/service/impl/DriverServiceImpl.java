package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.DriverDao;
import me.gteam.logman.domain.Driver;
import me.gteam.logman.service.DriverService;

@Service("driverService")
public class DriverServiceImpl implements DriverService{

	@Resource(name="driverDao")
	private DriverDao driverDao;

	public void saveDriver(Driver driver) {
		this.driverDao.saveEntry(driver);
	}

	public void updateDriver(Driver driver){
		this.driverDao.updateEntry(driver);
	}

	public void deleteDriverByID(Serializable id, String deleteMode) {
		this.driverDao.deleteEntry(id);
	}

	public Collection<Driver> getAllDriver() {
		return this.driverDao.getAllEntry();
	}

	public Driver getDriverById(Serializable id) {
		return (Driver)this.driverDao.getEntryById(id);
	}

}