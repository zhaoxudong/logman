package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.UnloadLocationDao;
import me.gteam.logman.domain.UnloadLocation;
import me.gteam.logman.service.UnloadLocationService;

@Service("unloadLocationService")
public class UnloadLocationServiceImpl implements UnloadLocationService{

	@Resource(name="unloadLocationDao")
	private UnloadLocationDao unloadLocationDao;

	public void saveUnloadLocation(UnloadLocation unloadLocation) {
		this.unloadLocationDao.saveEntry(unloadLocation);
	}

	public void updateUnloadLocation(UnloadLocation unloadLocation){
		this.unloadLocationDao.updateEntry(unloadLocation);
	}

	public void deleteUnloadLocationByID(Serializable id, String deleteMode) {
		this.unloadLocationDao.deleteEntry(id);
	}

	public Collection<UnloadLocation> getAllUnloadLocation() {
		return this.unloadLocationDao.getAllEntry();
	}

	public UnloadLocation getUnloadLocationById(Serializable id) {
		return (UnloadLocation)this.unloadLocationDao.getEntryById(id);
	}

}