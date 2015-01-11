package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.MaintenanceItemDao;
import me.gteam.logman.domain.MaintenanceItem;

@Repository("maintenanceItemDao")
public class MaintenanceItemDaoImpl extends BaseDaoImpl<MaintenanceItem> implements MaintenanceItemDao<MaintenanceItem>{

}