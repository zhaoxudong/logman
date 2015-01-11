package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.LoadLocation;

public interface LoadLocationService {

	public void saveLoadLocation(LoadLocation loadLocation);

	public void updateLoadLocation(LoadLocation loadLocation);

	public void deleteLoadLocationByID(Serializable id,String deleteMode);

	public Collection<LoadLocation> getAllLoadLocation();

	public LoadLocation getLoadLocationById(Serializable id);
}