package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.DispatchDetailDao;
import me.gteam.logman.domain.DispatchDetail;

@Repository("dispatchDetailDao")
public class DispatchDetailDaoImpl extends BaseDaoImpl<DispatchDetail> implements DispatchDetailDao<DispatchDetail>{

}