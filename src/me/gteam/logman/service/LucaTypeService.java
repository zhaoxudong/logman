package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.LucaType;

public interface LucaTypeService {

	public void saveLucaType(LucaType lucaType);

	public void updateLucaType(LucaType lucaType);

	public void deleteLucaTypeByID(Serializable id,String deleteMode);

	public Collection<LucaType> getAllLucaType();

	public LucaType getLucaTypeById(Serializable id);
}