package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.RepairNeedtopay;

public interface RepairNeedtopayService {

	public void saveRepairNeedtopay(RepairNeedtopay repairNeedtopay);

	public void updateRepairNeedtopay(RepairNeedtopay repairNeedtopay);

	public void deleteRepairNeedtopayByID(Serializable id,String deleteMode);

	public Collection<RepairNeedtopay> getAllRepairNeedtopay();

	public RepairNeedtopay getRepairNeedtopayById(Serializable id);
}