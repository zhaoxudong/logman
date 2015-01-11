package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.OilProcurementDao;
import me.gteam.logman.domain.OilProcurement;

@Repository("oilProcurementDao")
public class OilProcurementDaoImpl extends BaseDaoImpl<OilProcurement> implements OilProcurementDao<OilProcurement>{

}