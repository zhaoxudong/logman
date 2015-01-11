package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.SupplierDao;
import me.gteam.logman.domain.Supplier;
import me.gteam.logman.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService{

	@Resource(name="supplierDao")
	private SupplierDao supplierDao;

	public void saveSupplier(Supplier supplier) {
		this.supplierDao.saveEntry(supplier);
	}

	public void updateSupplier(Supplier supplier){
		this.supplierDao.updateEntry(supplier);
	}

	public void deleteSupplierByID(Serializable id, String deleteMode) {
		this.supplierDao.deleteEntry(id);
	}

	public Collection<Supplier> getAllSupplier() {
		return this.supplierDao.getAllEntry();
	}

	public Supplier getSupplierById(Serializable id) {
		return (Supplier)this.supplierDao.getEntryById(id);
	}

}