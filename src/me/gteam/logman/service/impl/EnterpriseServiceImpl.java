package me.gteam.logman.service.impl;

import me.gteam.logman.dao.EnterpriseDao;
import me.gteam.logman.domain.Enterprise;
import me.gteam.logman.service.EnterpriseService;

public class EnterpriseServiceImpl implements EnterpriseService{

	private EnterpriseDao enterpriseDao;
	
	
	public EnterpriseDao getEnterpriseDao() {
		return enterpriseDao;
	}


	public void setEnterpriseDao(EnterpriseDao enterpriseDao) {
		this.enterpriseDao = enterpriseDao;
	}


	public void saveEnterprise(Enterprise enterprise) {
		this.enterpriseDao.saveEnterprise(enterprise);
	}

}
