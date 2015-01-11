package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Fuel;

public interface FuelService {

	public void saveFuel(Fuel fuel);

	public void updateFuel(Fuel fuel);

	public void deleteFuelByID(Serializable id,String deleteMode);

	public Collection<Fuel> getAllFuel();

	public Fuel getFuelById(Serializable id);
}