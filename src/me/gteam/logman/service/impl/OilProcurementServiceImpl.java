package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OilProcurementDao;
import me.gteam.logman.domain.OilProcurement;
import me.gteam.logman.service.OilProcurementService;

@Service("oilProcurementService")
public class OilProcurementServiceImpl implements OilProcurementService{

	@Resource(name="oilProcurementDao")
	private OilProcurementDao oilProcurementDao;

	public void saveOilProcurement(OilProcurement oilProcurement) {
		this.oilProcurementDao.saveEntry(oilProcurement);
	}

	public void updateOilProcurement(OilProcurement oilProcurement){
		this.oilProcurementDao.updateEntry(oilProcurement);
	}

	public void deleteOilProcurementByID(Serializable id, String deleteMode) {
		this.oilProcurementDao.deleteEntry(id);
	}

	public Collection<OilProcurement> getAllOilProcurement() {
		return this.oilProcurementDao.getAllEntry();
	}

	public OilProcurement getOilProcurementById(Serializable id) {
		return (OilProcurement)this.oilProcurementDao.getEntryById(id);
	}

}