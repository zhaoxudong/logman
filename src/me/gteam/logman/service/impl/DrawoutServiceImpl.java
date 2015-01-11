package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.DrawoutDao;
import me.gteam.logman.domain.Drawout;
import me.gteam.logman.service.DrawoutService;

@Service("drawoutService")
public class DrawoutServiceImpl implements DrawoutService{

	@Resource(name="drawoutDao")
	private DrawoutDao drawoutDao;

	public void saveDrawout(Drawout drawout) {
		this.drawoutDao.saveEntry(drawout);
	}

	public void updateDrawout(Drawout drawout){
		this.drawoutDao.updateEntry(drawout);
	}

	public void deleteDrawoutByID(Serializable id, String deleteMode) {
		this.drawoutDao.deleteEntry(id);
	}

	public Collection<Drawout> getAllDrawout() {
		return this.drawoutDao.getAllEntry();
	}

	public Drawout getDrawoutById(Serializable id) {
		return (Drawout)this.drawoutDao.getEntryById(id);
	}

}