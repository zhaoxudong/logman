package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FreightNeedtoreceive;

public interface FreightNeedtoreceiveService {

	public void saveFreightNeedtoreceive(FreightNeedtoreceive freightNeedtoreceive);

	public void updateFreightNeedtoreceive(FreightNeedtoreceive freightNeedtoreceive);

	public void deleteFreightNeedtoreceiveByID(Serializable id,String deleteMode);

	public Collection<FreightNeedtoreceive> getAllFreightNeedtoreceive();

	public FreightNeedtoreceive getFreightNeedtoreceiveById(Serializable id);
}