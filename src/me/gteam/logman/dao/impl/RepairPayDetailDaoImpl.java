package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.RepairPayDetailDao;
import me.gteam.logman.domain.RepairPayDetail;

@Repository("repairPayDetailDao")
public class RepairPayDetailDaoImpl extends BaseDaoImpl<RepairPayDetail> implements RepairPayDetailDao<RepairPayDetail>{

}