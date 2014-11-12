package me.gteam.logman.dao.impl;

import me.gteam.logman.dao.EnterpriseDao;
import me.gteam.logman.domain.Enterprise;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class EnterpriseDaoImpl extends HibernateDaoSupport implements EnterpriseDao{

	public void saveEnterprise(Enterprise enterprise) {
		this.getHibernateTemplate().save(enterprise);
	}
	
	
}
