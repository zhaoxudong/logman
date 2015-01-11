package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OilpurchaseNeedtopaySettleDao;
import me.gteam.logman.domain.OilpurchaseNeedtopaySettle;
import me.gteam.logman.service.OilpurchaseNeedtopaySettleService;

@Service("oilpurchaseNeedtopaySettleService")
public class OilpurchaseNeedtopaySettleServiceImpl implements OilpurchaseNeedtopaySettleService{

	@Resource(name="oilpurchaseNeedtopaySettleDao")
	private OilpurchaseNeedtopaySettleDao oilpurchaseNeedtopaySettleDao;

	public void saveOilpurchaseNeedtopaySettle(OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle) {
		this.oilpurchaseNeedtopaySettleDao.saveEntry(oilpurchaseNeedtopaySettle);
	}

	public void updateOilpurchaseNeedtopaySettle(OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle){
		this.oilpurchaseNeedtopaySettleDao.updateEntry(oilpurchaseNeedtopaySettle);
	}

	public void deleteOilpurchaseNeedtopaySettleByID(Serializable id, String deleteMode) {
		this.oilpurchaseNeedtopaySettleDao.deleteEntry(id);
	}

	public Collection<OilpurchaseNeedtopaySettle> getAllOilpurchaseNeedtopaySettle() {
		return this.oilpurchaseNeedtopaySettleDao.getAllEntry();
	}

	public OilpurchaseNeedtopaySettle getOilpurchaseNeedtopaySettleById(Serializable id) {
		return (OilpurchaseNeedtopaySettle)this.oilpurchaseNeedtopaySettleDao.getEntryById(id);
	}

}