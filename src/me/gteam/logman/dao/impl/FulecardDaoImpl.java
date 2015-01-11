package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.FulecardDao;
import me.gteam.logman.domain.Fulecard;

@Repository("fulecardDao")
public class FulecardDaoImpl extends BaseDaoImpl<Fulecard> implements FulecardDao<Fulecard>{

}