package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.UnloadLocation;

public interface UnloadLocationService {

	public void saveUnloadLocation(UnloadLocation unloadLocation);

	public void updateUnloadLocation(UnloadLocation unloadLocation);

	public void deleteUnloadLocationByID(Serializable id,String deleteMode);

	public Collection<UnloadLocation> getAllUnloadLocation();

	public UnloadLocation getUnloadLocationById(Serializable id);
}