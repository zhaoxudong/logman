package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Handler;

public interface HandlerService {

	public void saveHandler(Handler handler);

	public void updateHandler(Handler handler);

	public void deleteHandlerByID(Serializable id,String deleteMode);

	public Collection<Handler> getAllHandler();

	public Handler getHandlerById(Serializable id);
}