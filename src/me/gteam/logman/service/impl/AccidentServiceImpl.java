package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.AccidentDao;
import me.gteam.logman.domain.Accident;
import me.gteam.logman.service.AccidentService;

@Service("accidentService")
public class AccidentServiceImpl implements AccidentService{

	@Resource(name="accidentDao")
	private AccidentDao accidentDao;

	public void saveAccident(Accident accident) {
		this.accidentDao.saveEntry(accident);
	}

	public void updateAccident(Accident accident){
		this.accidentDao.updateEntry(accident);
	}

	public void deleteAccidentByID(Serializable id, String deleteMode) {
		this.accidentDao.deleteEntry(id);
	}

	public Collection<Accident> getAllAccident() {
		return this.accidentDao.getAllEntry();
	}

	public Accident getAccidentById(Serializable id) {
		return (Accident)this.accidentDao.getEntryById(id);
	}

}