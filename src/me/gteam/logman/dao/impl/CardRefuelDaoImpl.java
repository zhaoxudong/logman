package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.CardRefuelDao;
import me.gteam.logman.domain.CardRefuel;

@Repository("cardRefuelDao")
public class CardRefuelDaoImpl extends BaseDaoImpl<CardRefuel> implements CardRefuelDao<CardRefuel>{

}