package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.FreightReceiveDetailDao;
import me.gteam.logman.domain.FreightReceiveDetail;

@Repository("freightReceiveDetailDao")
public class FreightReceiveDetailDaoImpl extends BaseDaoImpl<FreightReceiveDetail> implements FreightReceiveDetailDao<FreightReceiveDetail>{

}