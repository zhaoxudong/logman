package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.StorehouseDao;
import me.gteam.logman.domain.Storehouse;
import me.gteam.logman.service.StorehouseService;

@Service("storehouseService")
public class StorehouseServiceImpl implements StorehouseService{

	@Resource(name="storehouseDao")
	private StorehouseDao storehouseDao;

	public void saveStorehouse(Storehouse storehouse) {
		this.storehouseDao.saveEntry(storehouse);
	}

	public void updateStorehouse(Storehouse storehouse){
		this.storehouseDao.updateEntry(storehouse);
	}

	public void deleteStorehouseByID(Serializable id, String deleteMode) {
		this.storehouseDao.deleteEntry(id);
	}

	public Collection<Storehouse> getAllStorehouse() {
		return this.storehouseDao.getAllEntry();
	}

	public Storehouse getStorehouseById(Serializable id) {
		return (Storehouse)this.storehouseDao.getEntryById(id);
	}

}