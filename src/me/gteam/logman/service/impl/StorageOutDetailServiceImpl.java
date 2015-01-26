package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.StorageOutDetailDao;
import me.gteam.logman.domain.StorageOutDetail;
import me.gteam.logman.service.StorageOutDetailService;

@Service("storageOutDetailService")
public class StorageOutDetailServiceImpl implements StorageOutDetailService{

	@Resource(name="storageOutDetailDao")
	private StorageOutDetailDao storageOutDetailDao;

	public void saveStorageOutDetail(StorageOutDetail storageOutDetail) {
		this.storageOutDetailDao.saveEntry(storageOutDetail);
	}

	public void updateStorageOutDetail(StorageOutDetail storageOutDetail){
		this.storageOutDetailDao.updateEntry(storageOutDetail);
	}

	public void deleteStorageOutDetailByID(Serializable id, String deleteMode) {
		this.storageOutDetailDao.deleteEntry(id);
	}

	public Collection<StorageOutDetail> getAllStorageOutDetail() {
		return this.storageOutDetailDao.getAllEntry();
	}

	public StorageOutDetail getStorageOutDetailById(Serializable id) {
		return (StorageOutDetail)this.storageOutDetailDao.getEntryById(id);
	}

}