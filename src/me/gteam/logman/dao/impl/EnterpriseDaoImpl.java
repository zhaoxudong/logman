package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.EnterpriseDao;
import me.gteam.logman.domain.Enterprise;

@Repository("enterpriseDao")
public class EnterpriseDaoImpl extends BaseDaoImpl<Enterprise> implements EnterpriseDao<Enterprise>{

}