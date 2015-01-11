package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Fittingdetail;

public interface FittingdetailService {

	public void saveFittingdetail(Fittingdetail fittingdetail);

	public void updateFittingdetail(Fittingdetail fittingdetail);

	public void deleteFittingdetailByID(Serializable id,String deleteMode);

	public Collection<Fittingdetail> getAllFittingdetail();

	public Fittingdetail getFittingdetailById(Serializable id);
}