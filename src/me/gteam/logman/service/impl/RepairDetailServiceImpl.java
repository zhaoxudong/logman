package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.RepairDetailDao;
import me.gteam.logman.domain.RepairDetail;
import me.gteam.logman.service.RepairDetailService;

@Service("repairDetailService")
public class RepairDetailServiceImpl implements RepairDetailService{

	@Resource(name="repairDetailDao")
	private RepairDetailDao repairDetailDao;

	public void saveRepairDetail(RepairDetail repairDetail) {
		this.repairDetailDao.saveEntry(repairDetail);
	}

	public void updateRepairDetail(RepairDetail repairDetail){
		this.repairDetailDao.updateEntry(repairDetail);
	}

	public void deleteRepairDetailByID(Serializable id, String deleteMode) {
		this.repairDetailDao.deleteEntry(id);
	}

	public Collection<RepairDetail> getAllRepairDetail() {
		return this.repairDetailDao.getAllEntry();
	}

	public RepairDetail getRepairDetailById(Serializable id) {
		return (RepairDetail)this.repairDetailDao.getEntryById(id);
	}

}