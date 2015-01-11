package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.TireDateDao;
import me.gteam.logman.domain.TireDate;

@Repository("tireDateDao")
public class TireDateDaoImpl extends BaseDaoImpl<TireDate> implements TireDateDao<TireDate>{

}