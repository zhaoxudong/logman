package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OfficesuppliesPurchaseDao;
import me.gteam.logman.domain.OfficesuppliesPurchase;
import me.gteam.logman.service.OfficesuppliesPurchaseService;

@Service("officesuppliesPurchaseService")
public class OfficesuppliesPurchaseServiceImpl implements OfficesuppliesPurchaseService{

	@Resource(name="officesuppliesPurchaseDao")
	private OfficesuppliesPurchaseDao officesuppliesPurchaseDao;

	public void saveOfficesuppliesPurchase(OfficesuppliesPurchase officesuppliesPurchase) {
		this.officesuppliesPurchaseDao.saveEntry(officesuppliesPurchase);
	}

	public void updateOfficesuppliesPurchase(OfficesuppliesPurchase officesuppliesPurchase){
		this.officesuppliesPurchaseDao.updateEntry(officesuppliesPurchase);
	}

	public void deleteOfficesuppliesPurchaseByID(Serializable id, String deleteMode) {
		this.officesuppliesPurchaseDao.deleteEntry(id);
	}

	public Collection<OfficesuppliesPurchase> getAllOfficesuppliesPurchase() {
		return this.officesuppliesPurchaseDao.getAllEntry();
	}

	public OfficesuppliesPurchase getOfficesuppliesPurchaseById(Serializable id) {
		return (OfficesuppliesPurchase)this.officesuppliesPurchaseDao.getEntryById(id);
	}

}