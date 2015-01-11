package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.DrawoutfeeType;

public interface DrawoutfeeTypeService {

	public void saveDrawoutfeeType(DrawoutfeeType drawoutfeeType);

	public void updateDrawoutfeeType(DrawoutfeeType drawoutfeeType);

	public void deleteDrawoutfeeTypeByID(Serializable id,String deleteMode);

	public Collection<DrawoutfeeType> getAllDrawoutfeeType();

	public DrawoutfeeType getDrawoutfeeTypeById(Serializable id);
}