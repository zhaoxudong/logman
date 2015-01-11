package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Accident;

public interface AccidentService {

	public void saveAccident(Accident accident);

	public void updateAccident(Accident accident);

	public void deleteAccidentByID(Serializable id,String deleteMode);

	public Collection<Accident> getAllAccident();

	public Accident getAccidentById(Serializable id);
}