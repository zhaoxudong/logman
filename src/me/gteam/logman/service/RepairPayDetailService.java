package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.RepairPayDetail;

public interface RepairPayDetailService {

	public void saveRepairPayDetail(RepairPayDetail repairPayDetail);

	public void updateRepairPayDetail(RepairPayDetail repairPayDetail);

	public void deleteRepairPayDetailByID(Serializable id,String deleteMode);

	public Collection<RepairPayDetail> getAllRepairPayDetail();

	public RepairPayDetail getRepairPayDetailById(Serializable id);
}