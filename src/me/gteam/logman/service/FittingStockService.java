package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FittingStock;

public interface FittingStockService {

	public void saveFittingStock(FittingStock fittingStock);

	public void updateFittingStock(FittingStock fittingStock);

	public void deleteFittingStockByID(Serializable id,String deleteMode);

	public Collection<FittingStock> getAllFittingStock();

	public FittingStock getFittingStockById(Serializable id);
}