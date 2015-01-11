package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.StoreDetailDao;
import me.gteam.logman.domain.StoreDetail;
import me.gteam.logman.service.StoreDetailService;

@Service("storeDetailService")
public class StoreDetailServiceImpl implements StoreDetailService{

	@Resource(name="storeDetailDao")
	private StoreDetailDao storeDetailDao;

	public void saveStoreDetail(StoreDetail storeDetail) {
		this.storeDetailDao.saveEntry(storeDetail);
	}

	public void updateStoreDetail(StoreDetail storeDetail){
		this.storeDetailDao.updateEntry(storeDetail);
	}

	public void deleteStoreDetailByID(Serializable id, String deleteMode) {
		this.storeDetailDao.deleteEntry(id);
	}

	public Collection<StoreDetail> getAllStoreDetail() {
		return this.storeDetailDao.getAllEntry();
	}

	public StoreDetail getStoreDetailById(Serializable id) {
		return (StoreDetail)this.storeDetailDao.getEntryById(id);
	}

}