package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.StorageOutDetail;

public interface StorageOutDetailService {

	public void saveStorageOutDetail(StorageOutDetail storageOutDetail);

	public void updateStorageOutDetail(StorageOutDetail storageOutDetail);

	public void deleteStorageOutDetailByID(Serializable id,String deleteMode);

	public Collection<StorageOutDetail> getAllStorageOutDetail();

	public StorageOutDetail getStorageOutDetailById(Serializable id);
}