package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FittingStockDao;
import me.gteam.logman.domain.FittingStock;
import me.gteam.logman.service.FittingStockService;

@Service("fittingStockService")
public class FittingStockServiceImpl implements FittingStockService{

	@Resource(name="fittingStockDao")
	private FittingStockDao fittingStockDao;

	public void saveFittingStock(FittingStock fittingStock) {
		this.fittingStockDao.saveEntry(fittingStock);
	}

	public void updateFittingStock(FittingStock fittingStock){
		this.fittingStockDao.updateEntry(fittingStock);
	}

	public void deleteFittingStockByID(Serializable id, String deleteMode) {
		this.fittingStockDao.deleteEntry(id);
	}

	public Collection<FittingStock> getAllFittingStock() {
		return this.fittingStockDao.getAllEntry();
	}

	public FittingStock getFittingStockById(Serializable id) {
		return (FittingStock)this.fittingStockDao.getEntryById(id);
	}

}