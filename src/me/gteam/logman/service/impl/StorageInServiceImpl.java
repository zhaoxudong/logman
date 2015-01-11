package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.StorageInDao;
import me.gteam.logman.domain.StorageIn;
import me.gteam.logman.service.StorageInService;

@Service("storageInService")
public class StorageInServiceImpl implements StorageInService{

	@Resource(name="storageInDao")
	private StorageInDao storageInDao;

	public void saveStorageIn(StorageIn storageIn) {
		this.storageInDao.saveEntry(storageIn);
	}

	public void updateStorageIn(StorageIn storageIn){
		this.storageInDao.updateEntry(storageIn);
	}

	public void deleteStorageInByID(Serializable id, String deleteMode) {
		this.storageInDao.deleteEntry(id);
	}

	public Collection<StorageIn> getAllStorageIn() {
		return this.storageInDao.getAllEntry();
	}

	public StorageIn getStorageInById(Serializable id) {
		return (StorageIn)this.storageInDao.getEntryById(id);
	}

}