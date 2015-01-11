package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.OilcardRecharge;

public interface OilcardRechargeService {

	public void saveOilcardRecharge(OilcardRecharge oilcardRecharge);

	public void updateOilcardRecharge(OilcardRecharge oilcardRecharge);

	public void deleteOilcardRechargeByID(Serializable id,String deleteMode);

	public Collection<OilcardRecharge> getAllOilcardRecharge();

	public OilcardRecharge getOilcardRechargeById(Serializable id);
}