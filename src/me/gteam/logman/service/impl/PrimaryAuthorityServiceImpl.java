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

	@Override
	public void savePrimaryAuthority(PrimaryAuthority primaryAuthority) {
		// TODO Auto-generated method stub
		this.primaryAuthorityDao.saveEntry(primaryAuthority);
	}

	@Override
	public void updatePrimaryAuthority(PrimaryAuthority primaryAuthority) {
		// TODO Auto-generated method stub
		this.updatePrimaryAuthority(primaryAuthority);
	}

	@Override
	public void deletePrimaryAuthorityByID(Serializable id, String deleteMode) {
		// TODO Auto-generated method stub
		this.primaryAuthorityDao.deleteEntry(id);
	}

	@Override
	public Collection<PrimaryAuthority> getAllPrimaryAuthorities() {
		// TODO Auto-generated method stub
		return this.primaryAuthorityDao.getAllEntry();
	}

	@Override
	public PrimaryAuthority getPrimaryAuthorityById(Serializable id) {
		// TODO Auto-generated method stub
		return (PrimaryAuthority)this.primaryAuthorityDao.getEntryById(id);
	}
}
