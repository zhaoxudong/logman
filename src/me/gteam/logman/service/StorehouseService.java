package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Storehouse;

public interface StorehouseService {

	public void saveStorehouse(Storehouse storehouse);

	public void updateStorehouse(Storehouse storehouse);

	public void deleteStorehouseByID(Serializable id,String deleteMode);

	public Collection<Storehouse> getAllStorehouse();

	public Storehouse getStorehouseById(Serializable id);
}