package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.OtherinDao;
import me.gteam.logman.domain.Otherin;

@Repository("otherinDao")
public class OtherinDaoImpl extends BaseDaoImpl<Otherin> implements OtherinDao<Otherin>{

}