package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.OtheroutType;

public interface OtheroutTypeService {

	public void saveOtheroutType(OtheroutType otheroutType);

	public void updateOtheroutType(OtheroutType otheroutType);

	public void deleteOtheroutTypeByID(Serializable id,String deleteMode);

	public Collection<OtheroutType> getAllOtheroutType();

	public OtheroutType getOtheroutTypeById(Serializable id);
}