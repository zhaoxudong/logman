package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.StorageInDetail;

public interface StorageInDetailService {

	public void saveStorageInDetail(StorageInDetail storageInDetail);

	public void updateStorageInDetail(StorageInDetail storageInDetail);

	public void deleteStorageInDetailByID(Serializable id,String deleteMode);

	public Collection<StorageInDetail> getAllStorageInDetail();

	public StorageInDetail getStorageInDetailById(Serializable id);
}