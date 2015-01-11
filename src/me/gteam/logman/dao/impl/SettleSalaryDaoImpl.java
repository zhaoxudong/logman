package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.SettleSalaryDao;
import me.gteam.logman.domain.SettleSalary;

@Repository("settleSalaryDao")
public class SettleSalaryDaoImpl extends BaseDaoImpl<SettleSalary> implements SettleSalaryDao<SettleSalary>{

}