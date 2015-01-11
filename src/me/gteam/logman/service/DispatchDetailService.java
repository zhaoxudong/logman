package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.DispatchDetail;

public interface DispatchDetailService {

	public void saveDispatchDetail(DispatchDetail dispatchDetail);

	public void updateDispatchDetail(DispatchDetail dispatchDetail);

	public void deleteDispatchDetailByID(Serializable id,String deleteMode);

	public Collection<DispatchDetail> getAllDispatchDetail();

	public DispatchDetail getDispatchDetailById(Serializable id);
}