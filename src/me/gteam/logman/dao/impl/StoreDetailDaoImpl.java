package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.StoreDetailDao;
import me.gteam.logman.domain.StoreDetail;

@Repository("storeDetailDao")
public class StoreDetailDaoImpl extends BaseDaoImpl<StoreDetail> implements StoreDetailDao<StoreDetail>{

}