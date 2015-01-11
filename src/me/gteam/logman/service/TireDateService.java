package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.TireDate;

public interface TireDateService {

	public void saveTireDate(TireDate tireDate);

	public void updateTireDate(TireDate tireDate);

	public void deleteTireDateByID(Serializable id,String deleteMode);

	public Collection<TireDate> getAllTireDate();

	public TireDate getTireDateById(Serializable id);
}