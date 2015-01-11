package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.AbsenceDao;
import me.gteam.logman.domain.Absence;
import me.gteam.logman.service.AbsenceService;

@Service("absenceService")
public class AbsenceServiceImpl implements AbsenceService{

	@Resource(name="absenceDao")
	private AbsenceDao absenceDao;

	public void saveAbsence(Absence absence) {
		this.absenceDao.saveEntry(absence);
	}

	public void updateAbsence(Absence absence){
		this.absenceDao.updateEntry(absence);
	}

	public void deleteAbsenceByID(Serializable id, String deleteMode) {
		this.absenceDao.deleteEntry(id);
	}

	public Collection<Absence> getAllAbsence() {
		return this.absenceDao.getAllEntry();
	}

	public Absence getAbsenceById(Serializable id) {
		return (Absence)this.absenceDao.getEntryById(id);
	}

}