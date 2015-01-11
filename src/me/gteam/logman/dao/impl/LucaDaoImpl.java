package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.LucaDao;
import me.gteam.logman.domain.Luca;

@Repository("lucaDao")
public class LucaDaoImpl extends BaseDaoImpl<Luca> implements LucaDao<Luca>{

}