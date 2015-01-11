package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.RepairDetail;

public interface RepairDetailService {

	public void saveRepairDetail(RepairDetail repairDetail);

	public void updateRepairDetail(RepairDetail repairDetail);

	public void deleteRepairDetailByID(Serializable id,String deleteMode);

	public Collection<RepairDetail> getAllRepairDetail();

	public RepairDetail getRepairDetailById(Serializable id);
}