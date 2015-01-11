package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.AddoilPayDetailDao;
import me.gteam.logman.domain.AddoilPayDetail;
import me.gteam.logman.service.AddoilPayDetailService;

@Service("addoilPayDetailService")
public class AddoilPayDetailServiceImpl implements AddoilPayDetailService{

	@Resource(name="addoilPayDetailDao")
	private AddoilPayDetailDao addoilPayDetailDao;

	public void saveAddoilPayDetail(AddoilPayDetail addoilPayDetail) {
		this.addoilPayDetailDao.saveEntry(addoilPayDetail);
	}

	public void updateAddoilPayDetail(AddoilPayDetail addoilPayDetail){
		this.addoilPayDetailDao.updateEntry(addoilPayDetail);
	}

	public void deleteAddoilPayDetailByID(Serializable id, String deleteMode) {
		this.addoilPayDetailDao.deleteEntry(id);
	}

	public Collection<AddoilPayDetail> getAllAddoilPayDetail() {
		return this.addoilPayDetailDao.getAllEntry();
	}

	public AddoilPayDetail getAddoilPayDetailById(Serializable id) {
		return (AddoilPayDetail)this.addoilPayDetailDao.getEntryById(id);
	}

}