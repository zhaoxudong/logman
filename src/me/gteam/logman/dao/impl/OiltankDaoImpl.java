package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.OiltankDao;
import me.gteam.logman.domain.Oiltank;

@Repository("oiltankDao")
public class OiltankDaoImpl extends BaseDaoImpl<Oiltank> implements OiltankDao<Oiltank>{

}