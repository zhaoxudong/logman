package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.RepairDao;
import me.gteam.logman.domain.Repair;
import me.gteam.logman.service.RepairService;

@Service("repairService")
public class RepairServiceImpl implements RepairService{

	@Resource(name="repairDao")
	private RepairDao repairDao;

	public void saveRepair(Repair repair) {
		this.repairDao.saveEntry(repair);
	}

	public void updateRepair(Repair repair){
		this.repairDao.updateEntry(repair);
	}

	public void deleteRepairByID(Serializable id, String deleteMode) {
		this.repairDao.deleteEntry(id);
	}

	public Collection<Repair> getAllRepair() {
		return this.repairDao.getAllEntry();
	}

	public Repair getRepairById(Serializable id) {
		return (Repair)this.repairDao.getEntryById(id);
	}

}