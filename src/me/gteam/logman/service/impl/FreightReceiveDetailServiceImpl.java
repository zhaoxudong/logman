package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FreightReceiveDetailDao;
import me.gteam.logman.domain.FreightReceiveDetail;
import me.gteam.logman.service.FreightReceiveDetailService;

@Service("freightReceiveDetailService")
public class FreightReceiveDetailServiceImpl implements FreightReceiveDetailService{

	@Resource(name="freightReceiveDetailDao")
	private FreightReceiveDetailDao freightReceiveDetailDao;

	public void saveFreightReceiveDetail(FreightReceiveDetail freightReceiveDetail) {
		this.freightReceiveDetailDao.saveEntry(freightReceiveDetail);
	}

	public void updateFreightReceiveDetail(FreightReceiveDetail freightReceiveDetail){
		this.freightReceiveDetailDao.updateEntry(freightReceiveDetail);
	}

	public void deleteFreightReceiveDetailByID(Serializable id, String deleteMode) {
		this.freightReceiveDetailDao.deleteEntry(id);
	}

	public Collection<FreightReceiveDetail> getAllFreightReceiveDetail() {
		return this.freightReceiveDetailDao.getAllEntry();
	}

	public FreightReceiveDetail getFreightReceiveDetailById(Serializable id) {
		return (FreightReceiveDetail)this.freightReceiveDetailDao.getEntryById(id);
	}

}