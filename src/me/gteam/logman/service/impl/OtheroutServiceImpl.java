package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OtheroutDao;
import me.gteam.logman.domain.Otherout;
import me.gteam.logman.service.OtheroutService;

@Service("otheroutService")
public class OtheroutServiceImpl implements OtheroutService{

	@Resource(name="otheroutDao")
	private OtheroutDao otheroutDao;

	public void saveOtherout(Otherout otherout) {
		this.otheroutDao.saveEntry(otherout);
	}

	public void updateOtherout(Otherout otherout){
		this.otheroutDao.updateEntry(otherout);
	}

	public void deleteOtheroutByID(Serializable id, String deleteMode) {
		this.otheroutDao.deleteEntry(id);
	}

	public Collection<Otherout> getAllOtherout() {
		return this.otheroutDao.getAllEntry();
	}

	public Otherout getOtheroutById(Serializable id) {
		return (Otherout)this.otheroutDao.getEntryById(id);
	}

}