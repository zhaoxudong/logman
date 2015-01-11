package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.HandlerDao;
import me.gteam.logman.domain.Handler;

@Repository("handlerDao")
public class HandlerDaoImpl extends BaseDaoImpl<Handler> implements HandlerDao<Handler>{

}