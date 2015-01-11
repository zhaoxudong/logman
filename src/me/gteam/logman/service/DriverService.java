package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Driver;

public interface DriverService {

	public void saveDriver(Driver driver);

	public void updateDriver(Driver driver);

	public void deleteDriverByID(Serializable id,String deleteMode);

	public Collection<Driver> getAllDriver();

	public Driver getDriverById(Serializable id);
}