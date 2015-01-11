package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Otherin;

public interface OtherinService {

	public void saveOtherin(Otherin otherin);

	public void updateOtherin(Otherin otherin);

	public void deleteOtherinByID(Serializable id,String deleteMode);

	public Collection<Otherin> getAllOtherin();

	public Otherin getOtherinById(Serializable id);
}