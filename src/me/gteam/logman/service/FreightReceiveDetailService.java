package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FreightReceiveDetail;

public interface FreightReceiveDetailService {

	public void saveFreightReceiveDetail(FreightReceiveDetail freightReceiveDetail);

	public void updateFreightReceiveDetail(FreightReceiveDetail freightReceiveDetail);

	public void deleteFreightReceiveDetailByID(Serializable id,String deleteMode);

	public Collection<FreightReceiveDetail> getAllFreightReceiveDetail();

	public FreightReceiveDetail getFreightReceiveDetailById(Serializable id);
}