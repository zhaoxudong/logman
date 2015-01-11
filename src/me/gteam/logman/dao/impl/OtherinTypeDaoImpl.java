package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.OtherinTypeDao;
import me.gteam.logman.domain.OtherinType;

@Repository("otherinTypeDao")
public class OtherinTypeDaoImpl extends BaseDaoImpl<OtherinType> implements OtherinTypeDao<OtherinType>{

}