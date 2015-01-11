package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Otherout;

public interface OtheroutService {

	public void saveOtherout(Otherout otherout);

	public void updateOtherout(Otherout otherout);

	public void deleteOtheroutByID(Serializable id,String deleteMode);

	public Collection<Otherout> getAllOtherout();

	public Otherout getOtheroutById(Serializable id);
}