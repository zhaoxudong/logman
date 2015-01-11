package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FreightNeedtopay;

public interface FreightNeedtopayService {

	public void saveFreightNeedtopay(FreightNeedtopay freightNeedtopay);

	public void updateFreightNeedtopay(FreightNeedtopay freightNeedtopay);

	public void deleteFreightNeedtopayByID(Serializable id,String deleteMode);

	public Collection<FreightNeedtopay> getAllFreightNeedtopay();

	public FreightNeedtopay getFreightNeedtopayById(Serializable id);
}