package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.AbsencetypeDao;
import me.gteam.logman.domain.Absencetype;

@Repository("absencetypeDao")
public class AbsencetypeDaoImpl extends BaseDaoImpl<Absencetype> implements AbsencetypeDao<Absencetype>{

}