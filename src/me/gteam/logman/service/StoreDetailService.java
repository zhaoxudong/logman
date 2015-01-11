package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.StoreDetail;

public interface StoreDetailService {

	public void saveStoreDetail(StoreDetail storeDetail);

	public void updateStoreDetail(StoreDetail storeDetail);

	public void deleteStoreDetailByID(Serializable id,String deleteMode);

	public Collection<StoreDetail> getAllStoreDetail();

	public StoreDetail getStoreDetailById(Serializable id);
}