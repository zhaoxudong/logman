package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.AccidentDao;
import me.gteam.logman.domain.Accident;

@Repository("accidentDao")
public class AccidentDaoImpl extends BaseDaoImpl<Accident> implements AccidentDao<Accident>{

}