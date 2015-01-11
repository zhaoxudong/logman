package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FreightNeedtoreceiveDao;
import me.gteam.logman.domain.FreightNeedtoreceive;
import me.gteam.logman.service.FreightNeedtoreceiveService;

@Service("freightNeedtoreceiveService")
public class FreightNeedtoreceiveServiceImpl implements FreightNeedtoreceiveService{

	@Resource(name="freightNeedtoreceiveDao")
	private FreightNeedtoreceiveDao freightNeedtoreceiveDao;

	public void saveFreightNeedtoreceive(FreightNeedtoreceive freightNeedtoreceive) {
		this.freightNeedtoreceiveDao.saveEntry(freightNeedtoreceive);
	}

	public void updateFreightNeedtoreceive(FreightNeedtoreceive freightNeedtoreceive){
		this.freightNeedtoreceiveDao.updateEntry(freightNeedtoreceive);
	}

	public void deleteFreightNeedtoreceiveByID(Serializable id, String deleteMode) {
		this.freightNeedtoreceiveDao.deleteEntry(id);
	}

	public Collection<FreightNeedtoreceive> getAllFreightNeedtoreceive() {
		return this.freightNeedtoreceiveDao.getAllEntry();
	}

	public FreightNeedtoreceive getFreightNeedtoreceiveById(Serializable id) {
		return (FreightNeedtoreceive)this.freightNeedtoreceiveDao.getEntryById(id);
	}

}