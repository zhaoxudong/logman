package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FulecardDao;
import me.gteam.logman.domain.Fulecard;
import me.gteam.logman.service.FulecardService;

@Service("fulecardService")
public class FulecardServiceImpl implements FulecardService{

	@Resource(name="fulecardDao")
	private FulecardDao fulecardDao;

	public void saveFulecard(Fulecard fulecard) {
		this.fulecardDao.saveEntry(fulecard);
	}

	public void updateFulecard(Fulecard fulecard){
		this.fulecardDao.updateEntry(fulecard);
	}

	public void deleteFulecardByID(Serializable id, String deleteMode) {
		this.fulecardDao.deleteEntry(id);
	}

	public Collection<Fulecard> getAllFulecard() {
		return this.fulecardDao.getAllEntry();
	}

	public Fulecard getFulecardById(Serializable id) {
		return (Fulecard)this.fulecardDao.getEntryById(id);
	}

}