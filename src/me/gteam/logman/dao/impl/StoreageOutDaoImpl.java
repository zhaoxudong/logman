package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.StoreageOutDao;
import me.gteam.logman.domain.StoreageOut;

@Repository("storeageOutDao")
public class StoreageOutDaoImpl extends BaseDaoImpl<StoreageOut> implements StoreageOutDao<StoreageOut>{

}