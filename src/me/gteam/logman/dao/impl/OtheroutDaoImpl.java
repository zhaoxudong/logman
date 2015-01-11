package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.OtheroutDao;
import me.gteam.logman.domain.Otherout;

@Repository("otheroutDao")
public class OtheroutDaoImpl extends BaseDaoImpl<Otherout> implements OtheroutDao<Otherout>{

}