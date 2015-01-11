package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.StorageofofficesuppliesDao;
import me.gteam.logman.domain.Storageofofficesupplies;
import me.gteam.logman.service.StorageofofficesuppliesService;

@Service("storageofofficesuppliesService")
public class StorageofofficesuppliesServiceImpl implements StorageofofficesuppliesService{

	@Resource(name="storageofofficesuppliesDao")
	private StorageofofficesuppliesDao storageofofficesuppliesDao;

	public void saveStorageofofficesupplies(Storageofofficesupplies storageofofficesupplies) {
		this.storageofofficesuppliesDao.saveEntry(storageofofficesupplies);
	}

	public void updateStorageofofficesupplies(Storageofofficesupplies storageofofficesupplies){
		this.storageofofficesuppliesDao.updateEntry(storageofofficesupplies);
	}

	public void deleteStorageofofficesuppliesByID(Serializable id, String deleteMode) {
		this.storageofofficesuppliesDao.deleteEntry(id);
	}

	public Collection<Storageofofficesupplies> getAllStorageofofficesupplies() {
		return this.storageofofficesuppliesDao.getAllEntry();
	}

	public Storageofofficesupplies getStorageofofficesuppliesById(Serializable id) {
		return (Storageofofficesupplies)this.storageofofficesuppliesDao.getEntryById(id);
	}

}