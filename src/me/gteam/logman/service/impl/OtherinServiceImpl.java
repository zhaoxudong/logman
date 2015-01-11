package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OtherinDao;
import me.gteam.logman.domain.Otherin;
import me.gteam.logman.service.OtherinService;

@Service("otherinService")
public class OtherinServiceImpl implements OtherinService{

	@Resource(name="otherinDao")
	private OtherinDao otherinDao;

	public void saveOtherin(Otherin otherin) {
		this.otherinDao.saveEntry(otherin);
	}

	public void updateOtherin(Otherin otherin){
		this.otherinDao.updateEntry(otherin);
	}

	public void deleteOtherinByID(Serializable id, String deleteMode) {
		this.otherinDao.deleteEntry(id);
	}

	public Collection<Otherin> getAllOtherin() {
		return this.otherinDao.getAllEntry();
	}

	public Otherin getOtherinById(Serializable id) {
		return (Otherin)this.otherinDao.getEntryById(id);
	}

}