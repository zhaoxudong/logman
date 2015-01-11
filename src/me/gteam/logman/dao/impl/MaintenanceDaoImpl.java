package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.MaintenanceDao;
import me.gteam.logman.domain.Maintenance;

@Repository("maintenanceDao")
public class MaintenanceDaoImpl extends BaseDaoImpl<Maintenance> implements MaintenanceDao<Maintenance>{

}