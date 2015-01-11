package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.AddoilNeedtopaysettle;

public interface AddoilNeedtopaysettleService {

	public void saveAddoilNeedtopaysettle(AddoilNeedtopaysettle addoilNeedtopaysettle);

	public void updateAddoilNeedtopaysettle(AddoilNeedtopaysettle addoilNeedtopaysettle);

	public void deleteAddoilNeedtopaysettleByID(Serializable id,String deleteMode);

	public Collection<AddoilNeedtopaysettle> getAllAddoilNeedtopaysettle();

	public AddoilNeedtopaysettle getAddoilNeedtopaysettleById(Serializable id);
}