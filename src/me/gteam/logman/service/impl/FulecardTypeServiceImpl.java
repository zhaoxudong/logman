package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FulecardTypeDao;
import me.gteam.logman.domain.FulecardType;
import me.gteam.logman.service.FulecardTypeService;

@Service("fulecardTypeService")
public class FulecardTypeServiceImpl implements FulecardTypeService{

	@Resource(name="fulecardTypeDao")
	private FulecardTypeDao fulecardTypeDao;

	public void saveFulecardType(FulecardType fulecardType) {
		this.fulecardTypeDao.saveEntry(fulecardType);
	}

	public void updateFulecardType(FulecardType fulecardType){
		this.fulecardTypeDao.updateEntry(fulecardType);
	}

	public void deleteFulecardTypeByID(Serializable id, String deleteMode) {
		this.fulecardTypeDao.deleteEntry(id);
	}

	public Collection<FulecardType> getAllFulecardType() {
		return this.fulecardTypeDao.getAllEntry();
	}

	public FulecardType getFulecardTypeById(Serializable id) {
		return (FulecardType)this.fulecardTypeDao.getEntryById(id);
	}

}