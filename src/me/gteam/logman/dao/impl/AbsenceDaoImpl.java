package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.AbsenceDao;
import me.gteam.logman.domain.Absence;

@Repository("absenceDao")
public class AbsenceDaoImpl extends BaseDaoImpl<Absence> implements AbsenceDao<Absence>{

}