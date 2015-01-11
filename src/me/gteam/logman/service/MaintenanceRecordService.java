package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.MaintenanceRecord;

public interface MaintenanceRecordService {

	public void saveMaintenanceRecord(MaintenanceRecord maintenanceRecord);

	public void updateMaintenanceRecord(MaintenanceRecord maintenanceRecord);

	public void deleteMaintenanceRecordByID(Serializable id,String deleteMode);

	public Collection<MaintenanceRecord> getAllMaintenanceRecord();

	public MaintenanceRecord getMaintenanceRecordById(Serializable id);
}