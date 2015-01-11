package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.FulecardTypeDao;
import me.gteam.logman.domain.FulecardType;

@Repository("fulecardTypeDao")
public class FulecardTypeDaoImpl extends BaseDaoImpl<FulecardType> implements FulecardTypeDao<FulecardType>{

}