package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Illegal;

public interface IllegalService {

	public void saveIllegal(Illegal illegal);

	public void updateIllegal(Illegal illegal);

	public void deleteIllegalByID(Serializable id,String deleteMode);

	public Collection<Illegal> getAllIllegal();

	public Illegal getIllegalById(Serializable id);
}