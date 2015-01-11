package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Repair;

public interface RepairService {

	public void saveRepair(Repair repair);

	public void updateRepair(Repair repair);

	public void deleteRepairByID(Serializable id,String deleteMode);

	public Collection<Repair> getAllRepair();

	public Repair getRepairById(Serializable id);
}