package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.CashRefuelDao;
import me.gteam.logman.domain.CashRefuel;
import me.gteam.logman.service.CashRefuelService;

@Service("cashRefuelService")
public class CashRefuelServiceImpl implements CashRefuelService{

	@Resource(name="cashRefuelDao")
	private CashRefuelDao cashRefuelDao;

	public void saveCashRefuel(CashRefuel cashRefuel) {
		this.cashRefuelDao.saveEntry(cashRefuel);
	}

	public void updateCashRefuel(CashRefuel cashRefuel){
		this.cashRefuelDao.updateEntry(cashRefuel);
	}

	public void deleteCashRefuelByID(Serializable id, String deleteMode) {
		this.cashRefuelDao.deleteEntry(id);
	}

	public Collection<CashRefuel> getAllCashRefuel() {
		return this.cashRefuelDao.getAllEntry();
	}

	public CashRefuel getCashRefuelById(Serializable id) {
		return (CashRefuel)this.cashRefuelDao.getEntryById(id);
	}

}