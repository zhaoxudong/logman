package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.LucaRechargeDao;
import me.gteam.logman.domain.LucaRecharge;
import me.gteam.logman.service.LucaRechargeService;

@Service("lucaRechargeService")
public class LucaRechargeServiceImpl implements LucaRechargeService{

	@Resource(name="lucaRechargeDao")
	private LucaRechargeDao lucaRechargeDao;

	public void saveLucaRecharge(LucaRecharge lucaRecharge) {
		this.lucaRechargeDao.saveEntry(lucaRecharge);
	}

	public void updateLucaRecharge(LucaRecharge lucaRecharge){
		this.lucaRechargeDao.updateEntry(lucaRecharge);
	}

	public void deleteLucaRechargeByID(Serializable id, String deleteMode) {
		this.lucaRechargeDao.deleteEntry(id);
	}

	public Collection<LucaRecharge> getAllLucaRecharge() {
		return this.lucaRechargeDao.getAllEntry();
	}

	public LucaRecharge getLucaRechargeById(Serializable id) {
		return (LucaRecharge)this.lucaRechargeDao.getEntryById(id);
	}

}