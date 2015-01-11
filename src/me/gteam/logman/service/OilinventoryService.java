package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Oilinventory;

public interface OilinventoryService {

	public void saveOilinventory(Oilinventory oilinventory);

	public void updateOilinventory(Oilinventory oilinventory);

	public void deleteOilinventoryByID(Serializable id,String deleteMode);

	public Collection<Oilinventory> getAllOilinventory();

	public Oilinventory getOilinventoryById(Serializable id);
}