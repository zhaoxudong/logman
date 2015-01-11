package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FittingpurchaseDetailDao;
import me.gteam.logman.domain.FittingpurchaseDetail;
import me.gteam.logman.service.FittingpurchaseDetailService;

@Service("fittingpurchaseDetailService")
public class FittingpurchaseDetailServiceImpl implements FittingpurchaseDetailService{

	@Resource(name="fittingpurchaseDetailDao")
	private FittingpurchaseDetailDao fittingpurchaseDetailDao;

	public void saveFittingpurchaseDetail(FittingpurchaseDetail fittingpurchaseDetail) {
		this.fittingpurchaseDetailDao.saveEntry(fittingpurchaseDetail);
	}

	public void updateFittingpurchaseDetail(FittingpurchaseDetail fittingpurchaseDetail){
		this.fittingpurchaseDetailDao.updateEntry(fittingpurchaseDetail);
	}

	public void deleteFittingpurchaseDetailByID(Serializable id, String deleteMode) {
		this.fittingpurchaseDetailDao.deleteEntry(id);
	}

	public Collection<FittingpurchaseDetail> getAllFittingpurchaseDetail() {
		return this.fittingpurchaseDetailDao.getAllEntry();
	}

	public FittingpurchaseDetail getFittingpurchaseDetailById(Serializable id) {
		return (FittingpurchaseDetail)this.fittingpurchaseDetailDao.getEntryById(id);
	}

}