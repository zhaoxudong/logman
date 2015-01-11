package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.FittingPurchaseDao;
import me.gteam.logman.domain.FittingPurchase;

@Repository("fittingPurchaseDao")
public class FittingPurchaseDaoImpl extends BaseDaoImpl<FittingPurchase> implements FittingPurchaseDao<FittingPurchase>{

}