package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.AddoilNeedtopaysettleDao;
import me.gteam.logman.domain.AddoilNeedtopaysettle;
import me.gteam.logman.service.AddoilNeedtopaysettleService;

@Service("addoilNeedtopaysettleService")
public class AddoilNeedtopaysettleServiceImpl implements AddoilNeedtopaysettleService{

	@Resource(name="addoilNeedtopaysettleDao")
	private AddoilNeedtopaysettleDao addoilNeedtopaysettleDao;

	public void saveAddoilNeedtopaysettle(AddoilNeedtopaysettle addoilNeedtopaysettle) {
		this.addoilNeedtopaysettleDao.saveEntry(addoilNeedtopaysettle);
	}

	public void updateAddoilNeedtopaysettle(AddoilNeedtopaysettle addoilNeedtopaysettle){
		this.addoilNeedtopaysettleDao.updateEntry(addoilNeedtopaysettle);
	}

	public void deleteAddoilNeedtopaysettleByID(Serializable id, String deleteMode) {
		this.addoilNeedtopaysettleDao.deleteEntry(id);
	}

	public Collection<AddoilNeedtopaysettle> getAllAddoilNeedtopaysettle() {
		return this.addoilNeedtopaysettleDao.getAllEntry();
	}

	public AddoilNeedtopaysettle getAddoilNeedtopaysettleById(Serializable id) {
		return (AddoilNeedtopaysettle)this.addoilNeedtopaysettleDao.getEntryById(id);
	}

}