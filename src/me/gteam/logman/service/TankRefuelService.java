package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.TankRefuel;

public interface TankRefuelService {

	public void saveTankRefuel(TankRefuel tankRefuel);

	public void updateTankRefuel(TankRefuel tankRefuel);

	public void deleteTankRefuelByID(Serializable id,String deleteMode);

	public Collection<TankRefuel> getAllTankRefuel();

	public TankRefuel getTankRefuelById(Serializable id);
}