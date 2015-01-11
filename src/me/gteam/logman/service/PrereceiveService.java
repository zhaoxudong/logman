package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Prereceive;

public interface PrereceiveService {

	public void savePrereceive(Prereceive prereceive);

	public void updatePrereceive(Prereceive prereceive);

	public void deletePrereceiveByID(Serializable id,String deleteMode);

	public Collection<Prereceive> getAllPrereceive();

	public Prereceive getPrereceiveById(Serializable id);
}