package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FreightNeedtopayDetailDao;
import me.gteam.logman.domain.FreightNeedtopayDetail;
import me.gteam.logman.service.FreightNeedtopayDetailService;

@Service("freightNeedtopayDetailService")
public class FreightNeedtopayDetailServiceImpl implements FreightNeedtopayDetailService{

	@Resource(name="freightNeedtopayDetailDao")
	private FreightNeedtopayDetailDao freightNeedtopayDetailDao;

	public void saveFreightNeedtopayDetail(FreightNeedtopayDetail freightNeedtopayDetail) {
		this.freightNeedtopayDetailDao.saveEntry(freightNeedtopayDetail);
	}

	public void updateFreightNeedtopayDetail(FreightNeedtopayDetail freightNeedtopayDetail){
		this.freightNeedtopayDetailDao.updateEntry(freightNeedtopayDetail);
	}

	public void deleteFreightNeedtopayDetailByID(Serializable id, String deleteMode) {
		this.freightNeedtopayDetailDao.deleteEntry(id);
	}

	public Collection<FreightNeedtopayDetail> getAllFreightNeedtopayDetail() {
		return this.freightNeedtopayDetailDao.getAllEntry();
	}

	public FreightNeedtopayDetail getFreightNeedtopayDetailById(Serializable id) {
		return (FreightNeedtopayDetail)this.freightNeedtopayDetailDao.getEntryById(id);
	}

}