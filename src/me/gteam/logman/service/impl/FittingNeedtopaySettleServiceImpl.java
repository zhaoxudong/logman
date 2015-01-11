package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FittingNeedtopaySettleDao;
import me.gteam.logman.domain.FittingNeedtopaySettle;
import me.gteam.logman.service.FittingNeedtopaySettleService;

@Service("fittingNeedtopaySettleService")
public class FittingNeedtopaySettleServiceImpl implements FittingNeedtopaySettleService{

	@Resource(name="fittingNeedtopaySettleDao")
	private FittingNeedtopaySettleDao fittingNeedtopaySettleDao;

	public void saveFittingNeedtopaySettle(FittingNeedtopaySettle fittingNeedtopaySettle) {
		this.fittingNeedtopaySettleDao.saveEntry(fittingNeedtopaySettle);
	}

	public void updateFittingNeedtopaySettle(FittingNeedtopaySettle fittingNeedtopaySettle){
		this.fittingNeedtopaySettleDao.updateEntry(fittingNeedtopaySettle);
	}

	public void deleteFittingNeedtopaySettleByID(Serializable id, String deleteMode) {
		this.fittingNeedtopaySettleDao.deleteEntry(id);
	}

	public Collection<FittingNeedtopaySettle> getAllFittingNeedtopaySettle() {
		return this.fittingNeedtopaySettleDao.getAllEntry();
	}

	public FittingNeedtopaySettle getFittingNeedtopaySettleById(Serializable id) {
		return (FittingNeedtopaySettle)this.fittingNeedtopaySettleDao.getEntryById(id);
	}

}