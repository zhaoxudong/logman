package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.IolpurchaseSettledetailDao;
import me.gteam.logman.domain.IolpurchaseSettledetail;
import me.gteam.logman.service.IolpurchaseSettledetailService;

@Service("iolpurchaseSettledetailService")
public class IolpurchaseSettledetailServiceImpl implements IolpurchaseSettledetailService{

	@Resource(name="iolpurchaseSettledetailDao")
	private IolpurchaseSettledetailDao iolpurchaseSettledetailDao;

	public void saveIolpurchaseSettledetail(IolpurchaseSettledetail iolpurchaseSettledetail) {
		this.iolpurchaseSettledetailDao.saveEntry(iolpurchaseSettledetail);
	}

	public void updateIolpurchaseSettledetail(IolpurchaseSettledetail iolpurchaseSettledetail){
		this.iolpurchaseSettledetailDao.updateEntry(iolpurchaseSettledetail);
	}

	public void deleteIolpurchaseSettledetailByID(Serializable id, String deleteMode) {
		this.iolpurchaseSettledetailDao.deleteEntry(id);
	}

	public Collection<IolpurchaseSettledetail> getAllIolpurchaseSettledetail() {
		return this.iolpurchaseSettledetailDao.getAllEntry();
	}

	public IolpurchaseSettledetail getIolpurchaseSettledetailById(Serializable id) {
		return (IolpurchaseSettledetail)this.iolpurchaseSettledetailDao.getEntryById(id);
	}

}