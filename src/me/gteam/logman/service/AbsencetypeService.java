package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Absencetype;

public interface AbsencetypeService {

	public void saveAbsencetype(Absencetype absencetype);

	public void updateAbsencetype(Absencetype absencetype);

	public void deleteAbsencetypeByID(Serializable id,String deleteMode);

	public Collection<Absencetype> getAllAbsencetype();

	public Absencetype getAbsencetypeById(Serializable id);
}