package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.LoadLocationDao;
import me.gteam.logman.domain.LoadLocation;
import me.gteam.logman.service.LoadLocationService;

@Service("loadLocationService")
public class LoadLocationServiceImpl implements LoadLocationService{

	@Resource(name="loadLocationDao")
	private LoadLocationDao loadLocationDao;

	public void saveLoadLocation(LoadLocation loadLocation) {
		this.loadLocationDao.saveEntry(loadLocation);
	}

	public void updateLoadLocation(LoadLocation loadLocation){
		this.loadLocationDao.updateEntry(loadLocation);
	}

	public void deleteLoadLocationByID(Serializable id, String deleteMode) {
		this.loadLocationDao.deleteEntry(id);
	}

	public Collection<LoadLocation> getAllLoadLocation() {
		return this.loadLocationDao.getAllEntry();
	}

	public LoadLocation getLoadLocationById(Serializable id) {
		return (LoadLocation)this.loadLocationDao.getEntryById(id);
	}

}