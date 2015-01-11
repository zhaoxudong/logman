package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Oiltank;

public interface OiltankService {

	public void saveOiltank(Oiltank oiltank);

	public void updateOiltank(Oiltank oiltank);

	public void deleteOiltankByID(Serializable id,String deleteMode);

	public Collection<Oiltank> getAllOiltank();

	public Oiltank getOiltankById(Serializable id);
}