package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.DispatchDetailDao;
import me.gteam.logman.domain.DispatchDetail;
import me.gteam.logman.service.DispatchDetailService;

@Service("dispatchDetailService")
public class DispatchDetailServiceImpl implements DispatchDetailService{

	@Resource(name="dispatchDetailDao")
	private DispatchDetailDao dispatchDetailDao;

	public void saveDispatchDetail(DispatchDetail dispatchDetail) {
		this.dispatchDetailDao.saveEntry(dispatchDetail);
	}

	public void updateDispatchDetail(DispatchDetail dispatchDetail){
		this.dispatchDetailDao.updateEntry(dispatchDetail);
	}

	public void deleteDispatchDetailByID(Serializable id, String deleteMode) {
		this.dispatchDetailDao.deleteEntry(id);
	}

	public Collection<DispatchDetail> getAllDispatchDetail() {
		return this.dispatchDetailDao.getAllEntry();
	}

	public DispatchDetail getDispatchDetailById(Serializable id) {
		return (DispatchDetail)this.dispatchDetailDao.getEntryById(id);
	}

}