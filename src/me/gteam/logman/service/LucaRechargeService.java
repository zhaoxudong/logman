package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.LucaRecharge;

public interface LucaRechargeService {

	public void saveLucaRecharge(LucaRecharge lucaRecharge);

	public void updateLucaRecharge(LucaRecharge lucaRecharge);

	public void deleteLucaRechargeByID(Serializable id,String deleteMode);

	public Collection<LucaRecharge> getAllLucaRecharge();

	public LucaRecharge getLucaRechargeById(Serializable id);
}