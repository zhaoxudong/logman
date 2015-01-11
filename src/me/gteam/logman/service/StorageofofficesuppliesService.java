package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Storageofofficesupplies;

public interface StorageofofficesuppliesService {

	public void saveStorageofofficesupplies(Storageofofficesupplies storageofofficesupplies);

	public void updateStorageofofficesupplies(Storageofofficesupplies storageofofficesupplies);

	public void deleteStorageofofficesuppliesByID(Serializable id,String deleteMode);

	public Collection<Storageofofficesupplies> getAllStorageofofficesupplies();

	public Storageofofficesupplies getStorageofofficesuppliesById(Serializable id);
}