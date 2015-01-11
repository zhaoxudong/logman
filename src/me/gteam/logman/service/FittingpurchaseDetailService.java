package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FittingpurchaseDetail;

public interface FittingpurchaseDetailService {

	public void saveFittingpurchaseDetail(FittingpurchaseDetail fittingpurchaseDetail);

	public void updateFittingpurchaseDetail(FittingpurchaseDetail fittingpurchaseDetail);

	public void deleteFittingpurchaseDetailByID(Serializable id,String deleteMode);

	public Collection<FittingpurchaseDetail> getAllFittingpurchaseDetail();

	public FittingpurchaseDetail getFittingpurchaseDetailById(Serializable id);
}