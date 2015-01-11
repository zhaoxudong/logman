package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.CashRefuelDao;
import me.gteam.logman.domain.CashRefuel;

@Repository("cashRefuelDao")
public class CashRefuelDaoImpl extends BaseDaoImpl<CashRefuel> implements CashRefuelDao<CashRefuel>{

}