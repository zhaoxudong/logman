package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.MaintenanceDao;
import me.gteam.logman.domain.Maintenance;
import me.gteam.logman.service.MaintenanceService;

@Service("maintenanceService")
public class MaintenanceServiceImpl implements MaintenanceService{

	@Resource(name="maintenanceDao")
	private MaintenanceDao maintenanceDao;

	public void saveMaintenance(Maintenance maintenance) {
		this.maintenanceDao.saveEntry(maintenance);
	}

	public void updateMaintenance(Maintenance maintenance){
		this.maintenanceDao.updateEntry(maintenance);
	}

	public void deleteMaintenanceByID(Serializable id, String deleteMode) {
		this.maintenanceDao.deleteEntry(id);
	}

	public Collection<Maintenance> getAllMaintenance() {
		return this.maintenanceDao.getAllEntry();
	}

	public Maintenance getMaintenanceById(Serializable id) {
		return (Maintenance)this.maintenanceDao.getEntryById(id);
	}

}