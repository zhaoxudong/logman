package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.StorageIn;

public interface StorageInService {

	public void saveStorageIn(StorageIn storageIn);

	public void updateStorageIn(StorageIn storageIn);

	public void deleteStorageInByID(Serializable id,String deleteMode);

	public Collection<StorageIn> getAllStorageIn();

	public StorageIn getStorageInById(Serializable id);
}