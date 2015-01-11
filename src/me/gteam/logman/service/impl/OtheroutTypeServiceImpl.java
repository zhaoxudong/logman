package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OtheroutTypeDao;
import me.gteam.logman.domain.OtheroutType;
import me.gteam.logman.service.OtheroutTypeService;

@Service("otheroutTypeService")
public class OtheroutTypeServiceImpl implements OtheroutTypeService{

	@Resource(name="otheroutTypeDao")
	private OtheroutTypeDao otheroutTypeDao;

	public void saveOtheroutType(OtheroutType otheroutType) {
		this.otheroutTypeDao.saveEntry(otheroutType);
	}

	public void updateOtheroutType(OtheroutType otheroutType){
		this.otheroutTypeDao.updateEntry(otheroutType);
	}

	public void deleteOtheroutTypeByID(Serializable id, String deleteMode) {
		this.otheroutTypeDao.deleteEntry(id);
	}

	public Collection<OtheroutType> getAllOtheroutType() {
		return this.otheroutTypeDao.getAllEntry();
	}

	public OtheroutType getOtheroutTypeById(Serializable id) {
		return (OtheroutType)this.otheroutTypeDao.getEntryById(id);
	}

}