package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.DrawoutDao;
import me.gteam.logman.domain.Drawout;

@Repository("drawoutDao")
public class DrawoutDaoImpl extends BaseDaoImpl<Drawout> implements DrawoutDao<Drawout>{

}