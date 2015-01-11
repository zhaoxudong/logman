package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.PrepayDao;
import me.gteam.logman.domain.Prepay;
import me.gteam.logman.service.PrepayService;

@Service("prepayService")
public class PrepayServiceImpl implements PrepayService{

	@Resource(name="prepayDao")
	private PrepayDao prepayDao;

	public void savePrepay(Prepay prepay) {
		this.prepayDao.saveEntry(prepay);
	}

	public void updatePrepay(Prepay prepay){
		this.prepayDao.updateEntry(prepay);
	}

	public void deletePrepayByID(Serializable id, String deleteMode) {
		this.prepayDao.deleteEntry(id);
	}

	public Collection<Prepay> getAllPrepay() {
		return this.prepayDao.getAllEntry();
	}

	public Prepay getPrepayById(Serializable id) {
		return (Prepay)this.prepayDao.getEntryById(id);
	}

}