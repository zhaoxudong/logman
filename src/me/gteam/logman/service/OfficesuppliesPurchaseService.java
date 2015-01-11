package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.OfficesuppliesPurchase;

public interface OfficesuppliesPurchaseService {

	public void saveOfficesuppliesPurchase(OfficesuppliesPurchase officesuppliesPurchase);

	public void updateOfficesuppliesPurchase(OfficesuppliesPurchase officesuppliesPurchase);

	public void deleteOfficesuppliesPurchaseByID(Serializable id,String deleteMode);

	public Collection<OfficesuppliesPurchase> getAllOfficesuppliesPurchase();

	public OfficesuppliesPurchase getOfficesuppliesPurchaseById(Serializable id);
}