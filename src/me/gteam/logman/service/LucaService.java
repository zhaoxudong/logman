package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Luca;

public interface LucaService {

	public void saveLuca(Luca luca);

	public void updateLuca(Luca luca);

	public void deleteLucaByID(Serializable id,String deleteMode);

	public Collection<Luca> getAllLuca();

	public Luca getLucaById(Serializable id);
}