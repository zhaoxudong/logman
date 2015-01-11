package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.DrawoutfeeTypeDao;
import me.gteam.logman.domain.DrawoutfeeType;
import me.gteam.logman.service.DrawoutfeeTypeService;

@Service("drawoutfeeTypeService")
public class DrawoutfeeTypeServiceImpl implements DrawoutfeeTypeService{

	@Resource(name="drawoutfeeTypeDao")
	private DrawoutfeeTypeDao drawoutfeeTypeDao;

	public void saveDrawoutfeeType(DrawoutfeeType drawoutfeeType) {
		this.drawoutfeeTypeDao.saveEntry(drawoutfeeType);
	}

	public void updateDrawoutfeeType(DrawoutfeeType drawoutfeeType){
		this.drawoutfeeTypeDao.updateEntry(drawoutfeeType);
	}

	public void deleteDrawoutfeeTypeByID(Serializable id, String deleteMode) {
		this.drawoutfeeTypeDao.deleteEntry(id);
	}

	public Collection<DrawoutfeeType> getAllDrawoutfeeType() {
		return this.drawoutfeeTypeDao.getAllEntry();
	}

	public DrawoutfeeType getDrawoutfeeTypeById(Serializable id) {
		return (DrawoutfeeType)this.drawoutfeeTypeDao.getEntryById(id);
	}

}