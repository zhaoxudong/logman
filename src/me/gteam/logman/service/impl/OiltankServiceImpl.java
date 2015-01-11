package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OiltankDao;
import me.gteam.logman.domain.Oiltank;
import me.gteam.logman.service.OiltankService;

@Service("oiltankService")
public class OiltankServiceImpl implements OiltankService{

	@Resource(name="oiltankDao")
	private OiltankDao oiltankDao;

	public void saveOiltank(Oiltank oiltank) {
		this.oiltankDao.saveEntry(oiltank);
	}

	public void updateOiltank(Oiltank oiltank){
		this.oiltankDao.updateEntry(oiltank);
	}

	public void deleteOiltankByID(Serializable id, String deleteMode) {
		this.oiltankDao.deleteEntry(id);
	}

	public Collection<Oiltank> getAllOiltank() {
		return this.oiltankDao.getAllEntry();
	}

	public Oiltank getOiltankById(Serializable id) {
		return (Oiltank)this.oiltankDao.getEntryById(id);
	}

}