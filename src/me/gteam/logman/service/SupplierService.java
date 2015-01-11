package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Supplier;

public interface SupplierService {

	public void saveSupplier(Supplier supplier);

	public void updateSupplier(Supplier supplier);

	public void deleteSupplierByID(Serializable id,String deleteMode);

	public Collection<Supplier> getAllSupplier();

	public Supplier getSupplierById(Serializable id);
}