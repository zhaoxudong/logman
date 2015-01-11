package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Prepay;

public interface PrepayService {

	public void savePrepay(Prepay prepay);

	public void updatePrepay(Prepay prepay);

	public void deletePrepayByID(Serializable id,String deleteMode);

	public Collection<Prepay> getAllPrepay();

	public Prepay getPrepayById(Serializable id);
}