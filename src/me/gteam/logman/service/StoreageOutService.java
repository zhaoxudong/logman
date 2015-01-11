package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.StoreageOut;

public interface StoreageOutService {

	public void saveStoreageOut(StoreageOut storeageOut);

	public void updateStoreageOut(StoreageOut storeageOut);

	public void deleteStoreageOutByID(Serializable id,String deleteMode);

	public Collection<StoreageOut> getAllStoreageOut();

	public StoreageOut getStoreageOutById(Serializable id);
}