package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.FittingStockDao;
import me.gteam.logman.domain.FittingStock;

@Repository("fittingStockDao")
public class FittingStockDaoImpl extends BaseDaoImpl<FittingStock> implements FittingStockDao<FittingStock>{

}