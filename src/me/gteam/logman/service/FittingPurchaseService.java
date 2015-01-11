package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FittingPurchase;

public interface FittingPurchaseService {

	public void saveFittingPurchase(FittingPurchase fittingPurchase);

	public void updateFittingPurchase(FittingPurchase fittingPurchase);

	public void deleteFittingPurchaseByID(Serializable id,String deleteMode);

	public Collection<FittingPurchase> getAllFittingPurchase();

	public FittingPurchase getFittingPurchaseById(Serializable id);
}