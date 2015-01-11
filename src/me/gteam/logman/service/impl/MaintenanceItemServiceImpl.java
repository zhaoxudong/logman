package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.MaintenanceItemDao;
import me.gteam.logman.domain.MaintenanceItem;
import me.gteam.logman.service.MaintenanceItemService;

@Service("maintenanceItemService")
public class MaintenanceItemServiceImpl implements MaintenanceItemService{

	@Resource(name="maintenanceItemDao")
	private MaintenanceItemDao maintenanceItemDao;

	public void saveMaintenanceItem(MaintenanceItem maintenanceItem) {
		this.maintenanceItemDao.saveEntry(maintenanceItem);
	}

	public void updateMaintenanceItem(MaintenanceItem maintenanceItem){
		this.maintenanceItemDao.updateEntry(maintenanceItem);
	}

	public void deleteMaintenanceItemByID(Serializable id, String deleteMode) {
		this.maintenanceItemDao.deleteEntry(id);
	}

	public Collection<MaintenanceItem> getAllMaintenanceItem() {
		return this.maintenanceItemDao.getAllEntry();
	}

	public MaintenanceItem getMaintenanceItemById(Serializable id) {
		return (MaintenanceItem)this.maintenanceItemDao.getEntryById(id);
	}

}