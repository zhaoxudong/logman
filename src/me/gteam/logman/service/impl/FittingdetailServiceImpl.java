package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FittingdetailDao;
import me.gteam.logman.domain.Fittingdetail;
import me.gteam.logman.service.FittingdetailService;

@Service("fittingdetailService")
public class FittingdetailServiceImpl implements FittingdetailService{

	@Resource(name="fittingdetailDao")
	private FittingdetailDao fittingdetailDao;

	public void saveFittingdetail(Fittingdetail fittingdetail) {
		this.fittingdetailDao.saveEntry(fittingdetail);
	}

	public void updateFittingdetail(Fittingdetail fittingdetail){
		this.fittingdetailDao.updateEntry(fittingdetail);
	}

	public void deleteFittingdetailByID(Serializable id, String deleteMode) {
		this.fittingdetailDao.deleteEntry(id);
	}

	public Collection<Fittingdetail> getAllFittingdetail() {
		return this.fittingdetailDao.getAllEntry();
	}

	public Fittingdetail getFittingdetailById(Serializable id) {
		return (Fittingdetail)this.fittingdetailDao.getEntryById(id);
	}

}