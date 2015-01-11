package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.CostumerDao;
import me.gteam.logman.domain.Costumer;
import me.gteam.logman.service.CostumerService;

@Service("costumerService")
public class CostumerServiceImpl implements CostumerService{

	@Resource(name="costumerDao")
	private CostumerDao costumerDao;

	public void saveCostumer(Costumer costumer) {
		this.costumerDao.saveEntry(costumer);
	}

	public void updateCostumer(Costumer costumer){
		this.costumerDao.updateEntry(costumer);
	}

	public void deleteCostumerByID(Serializable id, String deleteMode) {
		this.costumerDao.deleteEntry(id);
	}

	public Collection<Costumer> getAllCostumer() {
		return this.costumerDao.getAllEntry();
	}

	public Costumer getCostumerById(Serializable id) {
		return (Costumer)this.costumerDao.getEntryById(id);
	}

}