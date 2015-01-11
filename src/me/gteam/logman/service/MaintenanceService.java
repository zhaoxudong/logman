package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Maintenance;

public interface MaintenanceService {

	public void saveMaintenance(Maintenance maintenance);

	public void updateMaintenance(Maintenance maintenance);

	public void deleteMaintenanceByID(Serializable id,String deleteMode);

	public Collection<Maintenance> getAllMaintenance();

	public Maintenance getMaintenanceById(Serializable id);
}