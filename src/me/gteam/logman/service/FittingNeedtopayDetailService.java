package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FittingNeedtopayDetail;

public interface FittingNeedtopayDetailService {

	public void saveFittingNeedtopayDetail(FittingNeedtopayDetail fittingNeedtopayDetail);

	public void updateFittingNeedtopayDetail(FittingNeedtopayDetail fittingNeedtopayDetail);

	public void deleteFittingNeedtopayDetailByID(Serializable id,String deleteMode);

	public Collection<FittingNeedtopayDetail> getAllFittingNeedtopayDetail();

	public FittingNeedtopayDetail getFittingNeedtopayDetailById(Serializable id);
}