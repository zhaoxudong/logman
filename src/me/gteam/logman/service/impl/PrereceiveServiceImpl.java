package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.PrereceiveDao;
import me.gteam.logman.domain.Prereceive;
import me.gteam.logman.service.PrereceiveService;

@Service("prereceiveService")
public class PrereceiveServiceImpl implements PrereceiveService{

	@Resource(name="prereceiveDao")
	private PrereceiveDao prereceiveDao;

	public void savePrereceive(Prereceive prereceive) {
		this.prereceiveDao.saveEntry(prereceive);
	}

	public void updatePrereceive(Prereceive prereceive){
		this.prereceiveDao.updateEntry(prereceive);
	}

	public void deletePrereceiveByID(Serializable id, String deleteMode) {
		this.prereceiveDao.deleteEntry(id);
	}

	public Collection<Prereceive> getAllPrereceive() {
		return this.prereceiveDao.getAllEntry();
	}

	public Prereceive getPrereceiveById(Serializable id) {
		return (Prereceive)this.prereceiveDao.getEntryById(id);
	}

}