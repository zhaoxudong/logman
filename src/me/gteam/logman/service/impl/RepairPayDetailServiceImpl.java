package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.RepairPayDetailDao;
import me.gteam.logman.domain.RepairPayDetail;
import me.gteam.logman.service.RepairPayDetailService;

@Service("repairPayDetailService")
public class RepairPayDetailServiceImpl implements RepairPayDetailService{

	@Resource(name="repairPayDetailDao")
	private RepairPayDetailDao repairPayDetailDao;

	public void saveRepairPayDetail(RepairPayDetail repairPayDetail) {
		this.repairPayDetailDao.saveEntry(repairPayDetail);
	}

	public void updateRepairPayDetail(RepairPayDetail repairPayDetail){
		this.repairPayDetailDao.updateEntry(repairPayDetail);
	}

	public void deleteRepairPayDetailByID(Serializable id, String deleteMode) {
		this.repairPayDetailDao.deleteEntry(id);
	}

	public Collection<RepairPayDetail> getAllRepairPayDetail() {
		return this.repairPayDetailDao.getAllEntry();
	}

	public RepairPayDetail getRepairPayDetailById(Serializable id) {
		return (RepairPayDetail)this.repairPayDetailDao.getEntryById(id);
	}

}