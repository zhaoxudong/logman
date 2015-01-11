package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.LucaDao;
import me.gteam.logman.domain.Luca;
import me.gteam.logman.service.LucaService;

@Service("lucaService")
public class LucaServiceImpl implements LucaService{

	@Resource(name="lucaDao")
	private LucaDao lucaDao;

	public void saveLuca(Luca luca) {
		this.lucaDao.saveEntry(luca);
	}

	public void updateLuca(Luca luca){
		this.lucaDao.updateEntry(luca);
	}

	public void deleteLucaByID(Serializable id, String deleteMode) {
		this.lucaDao.deleteEntry(id);
	}

	public Collection<Luca> getAllLuca() {
		return this.lucaDao.getAllEntry();
	}

	public Luca getLucaById(Serializable id) {
		return (Luca)this.lucaDao.getEntryById(id);
	}

}