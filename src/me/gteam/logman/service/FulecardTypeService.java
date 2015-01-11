package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FulecardType;

public interface FulecardTypeService {

	public void saveFulecardType(FulecardType fulecardType);

	public void updateFulecardType(FulecardType fulecardType);

	public void deleteFulecardTypeByID(Serializable id,String deleteMode);

	public Collection<FulecardType> getAllFulecardType();

	public FulecardType getFulecardTypeById(Serializable id);
}