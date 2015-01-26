package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.PrimaryAuthorityDao;
import me.gteam.logman.domain.PrimaryAuthority;
import me.gteam.logman.service.PrimaryAuthorityService;

@Service("primaryAuthorityService")
public class PrimaryAuthorityServiceImpl implements PrimaryAuthorityService{

	@Resource(name="primaryAuthorityDao")
	private PrimaryAuthorityDao primaryAuthorityDao;

	public void savePrimaryAuthority(PrimaryAuthority primaryAuthority) {
		this.primaryAuthorityDao.saveEntry(primaryAuthority);
	}

	public void updatePrimaryAuthority(PrimaryAuthority primaryAuthority){
		this.primaryAuthorityDao.updateEntry(primaryAuthority);
	}

	public void deletePrimaryAuthorityByID(Serializable id, String deleteMode) {
		this.primaryAuthorityDao.deleteEntry(id);
	}

	public Collection<PrimaryAuthority> getAllPrimaryAuthority() {
		return this.primaryAuthorityDao.getAllEntry();
	}

	public PrimaryAuthority getPrimaryAuthorityById(Serializable id) {
		return (PrimaryAuthority)this.primaryAuthorityDao.getEntryById(id);
	}

}