package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.StoreageOutDao;
import me.gteam.logman.domain.StoreageOut;
import me.gteam.logman.service.StoreageOutService;

@Service("storeageOutService")
public class StoreageOutServiceImpl implements StoreageOutService{

	@Resource(name="storeageOutDao")
	private StoreageOutDao storeageOutDao;

	public void saveStoreageOut(StoreageOut storeageOut) {
		this.storeageOutDao.saveEntry(storeageOut);
	}

	public void updateStoreageOut(StoreageOut storeageOut){
		this.storeageOutDao.updateEntry(storeageOut);
	}

	public void deleteStoreageOutByID(Serializable id, String deleteMode) {
		this.storeageOutDao.deleteEntry(id);
	}

	public Collection<StoreageOut> getAllStoreageOut() {
		return this.storeageOutDao.getAllEntry();
	}

	public StoreageOut getStoreageOutById(Serializable id) {
		return (StoreageOut)this.storeageOutDao.getEntryById(id);
	}

}