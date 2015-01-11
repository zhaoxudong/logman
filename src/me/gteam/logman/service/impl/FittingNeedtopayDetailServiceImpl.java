package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FittingNeedtopayDetailDao;
import me.gteam.logman.domain.FittingNeedtopayDetail;
import me.gteam.logman.service.FittingNeedtopayDetailService;

@Service("fittingNeedtopayDetailService")
public class FittingNeedtopayDetailServiceImpl implements FittingNeedtopayDetailService{

	@Resource(name="fittingNeedtopayDetailDao")
	private FittingNeedtopayDetailDao fittingNeedtopayDetailDao;

	public void saveFittingNeedtopayDetail(FittingNeedtopayDetail fittingNeedtopayDetail) {
		this.fittingNeedtopayDetailDao.saveEntry(fittingNeedtopayDetail);
	}

	public void updateFittingNeedtopayDetail(FittingNeedtopayDetail fittingNeedtopayDetail){
		this.fittingNeedtopayDetailDao.updateEntry(fittingNeedtopayDetail);
	}

	public void deleteFittingNeedtopayDetailByID(Serializable id, String deleteMode) {
		this.fittingNeedtopayDetailDao.deleteEntry(id);
	}

	public Collection<FittingNeedtopayDetail> getAllFittingNeedtopayDetail() {
		return this.fittingNeedtopayDetailDao.getAllEntry();
	}

	public FittingNeedtopayDetail getFittingNeedtopayDetailById(Serializable id) {
		return (FittingNeedtopayDetail)this.fittingNeedtopayDetailDao.getEntryById(id);
	}

}