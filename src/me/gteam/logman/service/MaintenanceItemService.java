package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.MaintenanceItem;

public interface MaintenanceItemService {

	public void saveMaintenanceItem(MaintenanceItem maintenanceItem);

	public void updateMaintenanceItem(MaintenanceItem maintenanceItem);

	public void deleteMaintenanceItemByID(Serializable id,String deleteMode);

	public Collection<MaintenanceItem> getAllMaintenanceItem();

	public MaintenanceItem getMaintenanceItemById(Serializable id);
}