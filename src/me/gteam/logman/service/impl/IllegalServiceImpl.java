package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.IllegalDao;
import me.gteam.logman.domain.Illegal;
import me.gteam.logman.service.IllegalService;

@Service("illegalService")
public class IllegalServiceImpl implements IllegalService{

	@Resource(name="illegalDao")
	private IllegalDao illegalDao;

	public void saveIllegal(Illegal illegal) {
		this.illegalDao.saveEntry(illegal);
	}

	public void updateIllegal(Illegal illegal){
		this.illegalDao.updateEntry(illegal);
	}

	public void deleteIllegalByID(Serializable id, String deleteMode) {
		this.illegalDao.deleteEntry(id);
	}

	public Collection<Illegal> getAllIllegal() {
		return this.illegalDao.getAllEntry();
	}

	public Illegal getIllegalById(Serializable id) {
		return (Illegal)this.illegalDao.getEntryById(id);
	}

}