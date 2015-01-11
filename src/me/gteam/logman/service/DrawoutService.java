package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Drawout;

public interface DrawoutService {

	public void saveDrawout(Drawout drawout);

	public void updateDrawout(Drawout drawout);

	public void deleteDrawoutByID(Serializable id,String deleteMode);

	public Collection<Drawout> getAllDrawout();

	public Drawout getDrawoutById(Serializable id);
}