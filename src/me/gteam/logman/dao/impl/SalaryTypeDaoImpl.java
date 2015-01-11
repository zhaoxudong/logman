package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.SalaryTypeDao;
import me.gteam.logman.domain.SalaryType;

@Repository("salaryTypeDao")
public class SalaryTypeDaoImpl extends BaseDaoImpl<SalaryType> implements SalaryTypeDao<SalaryType>{

}