package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.RepairDao;
import me.gteam.logman.domain.Repair;

@Repository("repairDao")
public class RepairDaoImpl extends BaseDaoImpl<Repair> implements RepairDao<Repair>{

}