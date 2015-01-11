package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OilcardRechargeDao;
import me.gteam.logman.domain.OilcardRecharge;
import me.gteam.logman.service.OilcardRechargeService;

@Service("oilcardRechargeService")
public class OilcardRechargeServiceImpl implements OilcardRechargeService{

	@Resource(name="oilcardRechargeDao")
	private OilcardRechargeDao oilcardRechargeDao;

	public void saveOilcardRecharge(OilcardRecharge oilcardRecharge) {
		this.oilcardRechargeDao.saveEntry(oilcardRecharge);
	}

	public void updateOilcardRecharge(OilcardRecharge oilcardRecharge){
		this.oilcardRechargeDao.updateEntry(oilcardRecharge);
	}

	public void deleteOilcardRechargeByID(Serializable id, String deleteMode) {
		this.oilcardRechargeDao.deleteEntry(id);
	}

	public Collection<OilcardRecharge> getAllOilcardRecharge() {
		return this.oilcardRechargeDao.getAllEntry();
	}

	public OilcardRecharge getOilcardRechargeById(Serializable id) {
		return (OilcardRecharge)this.oilcardRechargeDao.getEntryById(id);
	}

}