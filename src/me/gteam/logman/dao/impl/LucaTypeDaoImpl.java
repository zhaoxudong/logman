package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.LucaTypeDao;
import me.gteam.logman.domain.LucaType;

@Repository("lucaTypeDao")
public class LucaTypeDaoImpl extends BaseDaoImpl<LucaType> implements LucaTypeDao<LucaType>{

}