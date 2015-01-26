package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.StorageInDetailDao;
import me.gteam.logman.domain.StorageInDetail;
import me.gteam.logman.service.StorageInDetailService;

@Service("storageInDetailService")
public class StorageInDetailServiceImpl implements StorageInDetailService{

	@Resource(name="storageInDetailDao")
	private StorageInDetailDao storageInDetailDao;

	public void saveStorageInDetail(StorageInDetail storageInDetail) {
		this.storageInDetailDao.saveEntry(storageInDetail);
	}

	public void updateStorageInDetail(StorageInDetail storageInDetail){
		this.storageInDetailDao.updateEntry(storageInDetail);
	}

	public void deleteStorageInDetailByID(Serializable id, String deleteMode) {
		this.storageInDetailDao.deleteEntry(id);
	}

	public Collection<StorageInDetail> getAllStorageInDetail() {
		return this.storageInDetailDao.getAllEntry();
	}

	public StorageInDetail getStorageInDetailById(Serializable id) {
		return (StorageInDetail)this.storageInDetailDao.getEntryById(id);
	}

}