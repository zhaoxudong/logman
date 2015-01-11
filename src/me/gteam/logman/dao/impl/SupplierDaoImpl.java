package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.SupplierDao;
import me.gteam.logman.domain.Supplier;

@Repository("supplierDao")
public class SupplierDaoImpl extends BaseDaoImpl<Supplier> implements SupplierDao<Supplier>{

}