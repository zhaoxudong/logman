package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.UnloadLocationDao;
import me.gteam.logman.domain.UnloadLocation;

@Repository("unloadLocationDao")
public class UnloadLocationDaoImpl extends BaseDaoImpl<UnloadLocation> implements UnloadLocationDao<UnloadLocation>{

}