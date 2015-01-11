package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.AbsencetypeDao;
import me.gteam.logman.domain.Absencetype;
import me.gteam.logman.service.AbsencetypeService;

@Service("absencetypeService")
public class AbsencetypeServiceImpl implements AbsencetypeService{

	@Resource(name="absencetypeDao")
	private AbsencetypeDao absencetypeDao;

	public void saveAbsencetype(Absencetype absencetype) {
		this.absencetypeDao.saveEntry(absencetype);
	}

	public void updateAbsencetype(Absencetype absencetype){
		this.absencetypeDao.updateEntry(absencetype);
	}

	public void deleteAbsencetypeByID(Serializable id, String deleteMode) {
		this.absencetypeDao.deleteEntry(id);
	}

	public Collection<Absencetype> getAllAbsencetype() {
		return this.absencetypeDao.getAllEntry();
	}

	public Absencetype getAbsencetypeById(Serializable id) {
		return (Absencetype)this.absencetypeDao.getEntryById(id);
	}

}