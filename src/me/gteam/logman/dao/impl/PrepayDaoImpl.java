package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.PrepayDao;
import me.gteam.logman.domain.Prepay;

@Repository("prepayDao")
public class PrepayDaoImpl extends BaseDaoImpl<Prepay> implements PrepayDao<Prepay>{

}