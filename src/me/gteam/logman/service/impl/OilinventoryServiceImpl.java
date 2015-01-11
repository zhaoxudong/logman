package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OilinventoryDao;
import me.gteam.logman.domain.Oilinventory;
import me.gteam.logman.service.OilinventoryService;

@Service("oilinventoryService")
public class OilinventoryServiceImpl implements OilinventoryService{

	@Resource(name="oilinventoryDao")
	private OilinventoryDao oilinventoryDao;

	public void saveOilinventory(Oilinventory oilinventory) {
		this.oilinventoryDao.saveEntry(oilinventory);
	}

	public void updateOilinventory(Oilinventory oilinventory){
		this.oilinventoryDao.updateEntry(oilinventory);
	}

	public void deleteOilinventoryByID(Serializable id, String deleteMode) {
		this.oilinventoryDao.deleteEntry(id);
	}

	public Collection<Oilinventory> getAllOilinventory() {
		return this.oilinventoryDao.getAllEntry();
	}

	public Oilinventory getOilinventoryById(Serializable id) {
		return (Oilinventory)this.oilinventoryDao.getEntryById(id);
	}

}