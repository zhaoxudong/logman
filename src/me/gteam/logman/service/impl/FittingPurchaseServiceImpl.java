package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FittingPurchaseDao;
import me.gteam.logman.domain.FittingPurchase;
import me.gteam.logman.service.FittingPurchaseService;

@Service("fittingPurchaseService")
public class FittingPurchaseServiceImpl implements FittingPurchaseService{

	@Resource(name="fittingPurchaseDao")
	private FittingPurchaseDao fittingPurchaseDao;

	public void saveFittingPurchase(FittingPurchase fittingPurchase) {
		this.fittingPurchaseDao.saveEntry(fittingPurchase);
	}

	public void updateFittingPurchase(FittingPurchase fittingPurchase){
		this.fittingPurchaseDao.updateEntry(fittingPurchase);
	}

	public void deleteFittingPurchaseByID(Serializable id, String deleteMode) {
		this.fittingPurchaseDao.deleteEntry(id);
	}

	public Collection<FittingPurchase> getAllFittingPurchase() {
		return this.fittingPurchaseDao.getAllEntry();
	}

	public FittingPurchase getFittingPurchaseById(Serializable id) {
		return (FittingPurchase)this.fittingPurchaseDao.getEntryById(id);
	}

}