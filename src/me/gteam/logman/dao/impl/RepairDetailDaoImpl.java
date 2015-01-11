package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.RepairDetailDao;
import me.gteam.logman.domain.RepairDetail;

@Repository("repairDetailDao")
public class RepairDetailDaoImpl extends BaseDaoImpl<RepairDetail> implements RepairDetailDao<RepairDetail>{

}