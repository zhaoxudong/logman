package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.LucaTypeDao;
import me.gteam.logman.domain.LucaType;
import me.gteam.logman.service.LucaTypeService;

@Service("lucaTypeService")
public class LucaTypeServiceImpl implements LucaTypeService{

	@Resource(name="lucaTypeDao")
	private LucaTypeDao lucaTypeDao;

	public void saveLucaType(LucaType lucaType) {
		this.lucaTypeDao.saveEntry(lucaType);
	}

	public void updateLucaType(LucaType lucaType){
		this.lucaTypeDao.updateEntry(lucaType);
	}

	public void deleteLucaTypeByID(Serializable id, String deleteMode) {
		this.lucaTypeDao.deleteEntry(id);
	}

	public Collection<LucaType> getAllLucaType() {
		return this.lucaTypeDao.getAllEntry();
	}

	public LucaType getLucaTypeById(Serializable id) {
		return (LucaType)this.lucaTypeDao.getEntryById(id);
	}

}