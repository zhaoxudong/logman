package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.IllegalDao;
import me.gteam.logman.domain.Illegal;

@Repository("illegalDao")
public class IllegalDaoImpl extends BaseDaoImpl<Illegal> implements IllegalDao<Illegal>{

}