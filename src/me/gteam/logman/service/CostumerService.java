package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Costumer;

public interface CostumerService {

	public void saveCostumer(Costumer costumer);

	public void updateCostumer(Costumer costumer);

	public void deleteCostumerByID(Serializable id,String deleteMode);

	public Collection<Costumer> getAllCostumer();

	public Costumer getCostumerById(Serializable id);
}