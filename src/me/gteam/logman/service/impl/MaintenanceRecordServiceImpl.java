package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.MaintenanceRecordDao;
import me.gteam.logman.domain.MaintenanceRecord;
import me.gteam.logman.service.MaintenanceRecordService;

@Service("maintenanceRecordService")
public class MaintenanceRecordServiceImpl implements MaintenanceRecordService{

	@Resource(name="maintenanceRecordDao")
	private MaintenanceRecordDao maintenanceRecordDao;

	public void saveMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
		this.maintenanceRecordDao.saveEntry(maintenanceRecord);
	}

	public void updateMaintenanceRecord(MaintenanceRecord maintenanceRecord){
		this.maintenanceRecordDao.updateEntry(maintenanceRecord);
	}

	public void deleteMaintenanceRecordByID(Serializable id, String deleteMode) {
		this.maintenanceRecordDao.deleteEntry(id);
	}

	public Collection<MaintenanceRecord> getAllMaintenanceRecord() {
		return this.maintenanceRecordDao.getAllEntry();
	}

	public MaintenanceRecord getMaintenanceRecordById(Serializable id) {
		return (MaintenanceRecord)this.maintenanceRecordDao.getEntryById(id);
	}

}