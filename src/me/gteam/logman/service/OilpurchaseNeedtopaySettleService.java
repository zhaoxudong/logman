package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.OilpurchaseNeedtopaySettle;

public interface OilpurchaseNeedtopaySettleService {

	public void saveOilpurchaseNeedtopaySettle(OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle);

	public void updateOilpurchaseNeedtopaySettle(OilpurchaseNeedtopaySettle oilpurchaseNeedtopaySettle);

	public void deleteOilpurchaseNeedtopaySettleByID(Serializable id,String deleteMode);

	public Collection<OilpurchaseNeedtopaySettle> getAllOilpurchaseNeedtopaySettle();

	public OilpurchaseNeedtopaySettle getOilpurchaseNeedtopaySettleById(Serializable id);
}