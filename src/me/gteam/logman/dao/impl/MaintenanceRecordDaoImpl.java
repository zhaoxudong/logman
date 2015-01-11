package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.MaintenanceRecordDao;
import me.gteam.logman.domain.MaintenanceRecord;

@Repository("maintenanceRecordDao")
public class MaintenanceRecordDaoImpl extends BaseDaoImpl<MaintenanceRecord> implements MaintenanceRecordDao<MaintenanceRecord>{

}