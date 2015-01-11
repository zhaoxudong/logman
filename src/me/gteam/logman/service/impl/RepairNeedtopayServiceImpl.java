package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.RepairNeedtopayDao;
import me.gteam.logman.domain.RepairNeedtopay;
import me.gteam.logman.service.RepairNeedtopayService;

@Service("repairNeedtopayService")
public class RepairNeedtopayServiceImpl implements RepairNeedtopayService{

	@Resource(name="repairNeedtopayDao")
	private RepairNeedtopayDao repairNeedtopayDao;

	public void saveRepairNeedtopay(RepairNeedtopay repairNeedtopay) {
		this.repairNeedtopayDao.saveEntry(repairNeedtopay);
	}

	public void updateRepairNeedtopay(RepairNeedtopay repairNeedtopay){
		this.repairNeedtopayDao.updateEntry(repairNeedtopay);
	}

	public void deleteRepairNeedtopayByID(Serializable id, String deleteMode) {
		this.repairNeedtopayDao.deleteEntry(id);
	}

	public Collection<RepairNeedtopay> getAllRepairNeedtopay() {
		return this.repairNeedtopayDao.getAllEntry();
	}

	public RepairNeedtopay getRepairNeedtopayById(Serializable id) {
		return (RepairNeedtopay)this.repairNeedtopayDao.getEntryById(id);
	}

}