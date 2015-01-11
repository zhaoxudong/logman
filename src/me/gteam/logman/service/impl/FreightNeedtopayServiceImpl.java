package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FreightNeedtopayDao;
import me.gteam.logman.domain.FreightNeedtopay;
import me.gteam.logman.service.FreightNeedtopayService;

@Service("freightNeedtopayService")
public class FreightNeedtopayServiceImpl implements FreightNeedtopayService{

	@Resource(name="freightNeedtopayDao")
	private FreightNeedtopayDao freightNeedtopayDao;

	public void saveFreightNeedtopay(FreightNeedtopay freightNeedtopay) {
		this.freightNeedtopayDao.saveEntry(freightNeedtopay);
	}

	public void updateFreightNeedtopay(FreightNeedtopay freightNeedtopay){
		this.freightNeedtopayDao.updateEntry(freightNeedtopay);
	}

	public void deleteFreightNeedtopayByID(Serializable id, String deleteMode) {
		this.freightNeedtopayDao.deleteEntry(id);
	}

	public Collection<FreightNeedtopay> getAllFreightNeedtopay() {
		return this.freightNeedtopayDao.getAllEntry();
	}

	public FreightNeedtopay getFreightNeedtopayById(Serializable id) {
		return (FreightNeedtopay)this.freightNeedtopayDao.getEntryById(id);
	}

}