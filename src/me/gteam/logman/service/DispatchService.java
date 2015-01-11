package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Dispatch;

public interface DispatchService {

	public void saveDispatch(Dispatch dispatch);

	public void updateDispatch(Dispatch dispatch);

	public void deleteDispatchByID(Serializable id,String deleteMode);

	public Collection<Dispatch> getAllDispatch();

	public Dispatch getDispatchById(Serializable id);
}