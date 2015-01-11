package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.TireDateDao;
import me.gteam.logman.domain.TireDate;
import me.gteam.logman.service.TireDateService;

@Service("tireDateService")
public class TireDateServiceImpl implements TireDateService{

	@Resource(name="tireDateDao")
	private TireDateDao tireDateDao;

	public void saveTireDate(TireDate tireDate) {
		this.tireDateDao.saveEntry(tireDate);
	}

	public void updateTireDate(TireDate tireDate){
		this.tireDateDao.updateEntry(tireDate);
	}

	public void deleteTireDateByID(Serializable id, String deleteMode) {
		this.tireDateDao.deleteEntry(id);
	}

	public Collection<TireDate> getAllTireDate() {
		return this.tireDateDao.getAllEntry();
	}

	public TireDate getTireDateById(Serializable id) {
		return (TireDate)this.tireDateDao.getEntryById(id);
	}

}