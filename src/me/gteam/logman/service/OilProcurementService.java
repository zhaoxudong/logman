package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.OilProcurement;

public interface OilProcurementService {

	public void saveOilProcurement(OilProcurement oilProcurement);

	public void updateOilProcurement(OilProcurement oilProcurement);

	public void deleteOilProcurementByID(Serializable id,String deleteMode);

	public Collection<OilProcurement> getAllOilProcurement();

	public OilProcurement getOilProcurementById(Serializable id);
}