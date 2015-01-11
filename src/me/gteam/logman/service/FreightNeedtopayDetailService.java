package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FreightNeedtopayDetail;

public interface FreightNeedtopayDetailService {

	public void saveFreightNeedtopayDetail(FreightNeedtopayDetail freightNeedtopayDetail);

	public void updateFreightNeedtopayDetail(FreightNeedtopayDetail freightNeedtopayDetail);

	public void deleteFreightNeedtopayDetailByID(Serializable id,String deleteMode);

	public Collection<FreightNeedtopayDetail> getAllFreightNeedtopayDetail();

	public FreightNeedtopayDetail getFreightNeedtopayDetailById(Serializable id);
}