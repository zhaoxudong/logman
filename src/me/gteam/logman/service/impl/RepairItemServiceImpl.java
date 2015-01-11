package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.RepairItemDao;
import me.gteam.logman.domain.RepairItem;
import me.gteam.logman.service.RepairItemService;

@Service("repairItemService")
public class RepairItemServiceImpl implements RepairItemService{

	@Resource(name="repairItemDao")
	private RepairItemDao repairItemDao;

	public void saveRepairItem(RepairItem repairItem) {
		this.repairItemDao.saveEntry(repairItem);
	}

	public void updateRepairItem(RepairItem repairItem){
		this.repairItemDao.updateEntry(repairItem);
	}

	public void deleteRepairItemByID(Serializable id, String deleteMode) {
		this.repairItemDao.deleteEntry(id);
	}

	public Collection<RepairItem> getAllRepairItem() {
		return this.repairItemDao.getAllEntry();
	}

	public RepairItem getRepairItemById(Serializable id) {
		return (RepairItem)this.repairItemDao.getEntryById(id);
	}

}