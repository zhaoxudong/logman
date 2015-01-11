package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FittingNeedtopaySettle;

public interface FittingNeedtopaySettleService {

	public void saveFittingNeedtopaySettle(FittingNeedtopaySettle fittingNeedtopaySettle);

	public void updateFittingNeedtopaySettle(FittingNeedtopaySettle fittingNeedtopaySettle);

	public void deleteFittingNeedtopaySettleByID(Serializable id,String deleteMode);

	public Collection<FittingNeedtopaySettle> getAllFittingNeedtopaySettle();

	public FittingNeedtopaySettle getFittingNeedtopaySettleById(Serializable id);
}