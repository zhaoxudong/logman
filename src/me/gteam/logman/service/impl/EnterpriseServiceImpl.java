package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.EnterpriseDao;
import me.gteam.logman.domain.Enterprise;
import me.gteam.logman.service.EnterpriseService;

@Service("enterpriseService")
public class EnterpriseServiceImpl implements EnterpriseService{

	@Resource(name="enterpriseDao")
	private EnterpriseDao enterpriseDao;

	public void saveEnterprise(Enterprise enterprise) {
		this.enterpriseDao.saveEntry(enterprise);
	}

	public void updateEnterprise(Enterprise enterprise){
		this.enterpriseDao.updateEntry(enterprise);
	}

	public void deleteEnterpriseByID(Serializable id, String deleteMode) {
		this.enterpriseDao.deleteEntry(id);
	}

	public Collection<Enterprise> getAllEnterprise() {
		return this.enterpriseDao.getAllEntry();
	}

	public Enterprise getEnterpriseById(Serializable id) {
		return (Enterprise)this.enterpriseDao.getEntryById(id);
	}

}