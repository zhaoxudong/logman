package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.DispatchDao;
import me.gteam.logman.domain.Dispatch;

@Repository("dispatchDao")
public class DispatchDaoImpl extends BaseDaoImpl<Dispatch> implements DispatchDao<Dispatch>{

}