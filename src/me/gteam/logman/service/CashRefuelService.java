package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.CashRefuel;

public interface CashRefuelService {

	public void saveCashRefuel(CashRefuel cashRefuel);

	public void updateCashRefuel(CashRefuel cashRefuel);

	public void deleteCashRefuelByID(Serializable id,String deleteMode);

	public Collection<CashRefuel> getAllCashRefuel();

	public CashRefuel getCashRefuelById(Serializable id);
}