package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.ThirdAuthorityDao;
import me.gteam.logman.domain.ThirdAuthority;
import me.gteam.logman.service.ThirdAuthorityService;

@Service("thirdAuthorityService")
public class ThirdAuthorityServiceImpl implements ThirdAuthorityService{
	@Resource(name="thirdAuthorityDao")
	private ThirdAuthorityDao thirdAuthorityDao;

	@Override
	public void saveThirdAuthority(ThirdAuthority thirdAuthority) {
		// TODO Auto-generated method stub
		this.thirdAuthorityDao.saveEntry(thirdAuthority);
		
	}

	@Override
	public void updateThirdAuthority(ThirdAuthority thirdAuthority) {
		// TODO Auto-generated method stub
		this.thirdAuthorityDao.updateEntry(thirdAuthority);
	}

	@Override
	public void deleteThirdAuthorityByID(Serializable id, String deleteMode) {
		// TODO Auto-generated method stub
		this.thirdAuthorityDao.deleteEntry(id);
	}

	@Override
	public Collection<ThirdAuthority> getAllThirdAuthorities() {
		// TODO Auto-generated method stub
		return this.thirdAuthorityDao.getAllEntry();
	}

	@Override
	public ThirdAuthority getThirdAuthorityById(Serializable id) {
		// TODO Auto-generated method stub
		return (ThirdAuthority)this.getThirdAuthorityById(id);
	}

	@Override
	public List getThirdAuthoritiesBySecId(String secId) {
		// TODO Auto-generated method stub
		return this.thirdAuthorityDao.getThirdAuthoritiesBySecId(secId);
	}
}
