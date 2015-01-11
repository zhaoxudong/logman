package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.RepairItemDao;
import me.gteam.logman.domain.RepairItem;

@Repository("repairItemDao")
public class RepairItemDaoImpl extends BaseDaoImpl<RepairItem> implements RepairItemDao<RepairItem>{

}