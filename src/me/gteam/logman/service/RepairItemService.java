package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.RepairItem;

public interface RepairItemService {

	public void saveRepairItem(RepairItem repairItem);

	public void updateRepairItem(RepairItem repairItem);

	public void deleteRepairItemByID(Serializable id,String deleteMode);

	public Collection<RepairItem> getAllRepairItem();

	public RepairItem getRepairItemById(Serializable id);
}