package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Fleet;

public interface FleetService {

	public void saveFleet(Fleet fleet);

	public void updateFleet(Fleet fleet);

	public void deleteFleetByID(Serializable id,String deleteMode);

	public Collection<Fleet> getAllFleet();

	public Fleet getFleetById(Serializable id);
}