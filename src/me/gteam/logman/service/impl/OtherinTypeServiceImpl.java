package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OtherinTypeDao;
import me.gteam.logman.domain.OtherinType;
import me.gteam.logman.service.OtherinTypeService;

@Service("otherinTypeService")
public class OtherinTypeServiceImpl implements OtherinTypeService{

	@Resource(name="otherinTypeDao")
	private OtherinTypeDao otherinTypeDao;

	public void saveOtherinType(OtherinType otherinType) {
		this.otherinTypeDao.saveEntry(otherinType);
	}

	public void updateOtherinType(OtherinType otherinType){
		this.otherinTypeDao.updateEntry(otherinType);
	}

	public void deleteOtherinTypeByID(Serializable id, String deleteMode) {
		this.otherinTypeDao.deleteEntry(id);
	}

	public Collection<OtherinType> getAllOtherinType() {
		return this.otherinTypeDao.getAllEntry();
	}

	public OtherinType getOtherinTypeById(Serializable id) {
		return (OtherinType)this.otherinTypeDao.getEntryById(id);
	}

}