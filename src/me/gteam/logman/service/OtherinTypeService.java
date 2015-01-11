package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.OtherinType;

public interface OtherinTypeService {

	public void saveOtherinType(OtherinType otherinType);

	public void updateOtherinType(OtherinType otherinType);

	public void deleteOtherinTypeByID(Serializable id,String deleteMode);

	public Collection<OtherinType> getAllOtherinType();

	public OtherinType getOtherinTypeById(Serializable id);
}