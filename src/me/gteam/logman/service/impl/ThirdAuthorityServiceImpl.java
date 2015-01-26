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

	public void saveThirdAuthority(ThirdAuthority thirdAuthority) {
		this.thirdAuthorityDao.saveEntry(thirdAuthority);
	}

	public void updateThirdAuthority(ThirdAuthority thirdAuthority){
		this.thirdAuthorityDao.updateEntry(thirdAuthority);
	}

	public void deleteThirdAuthorityByID(Serializable id, String deleteMode) {
		this.thirdAuthorityDao.deleteEntry(id);
	}

	public Collection<ThirdAuthority> getAllThirdAuthority() {
		return this.thirdAuthorityDao.getAllEntry();
	}

	public ThirdAuthority getThirdAuthorityById(Serializable id) {
		return (ThirdAuthority)this.thirdAuthorityDao.getEntryById(id);
	}
	
	public List getThirdAuthoritiesBySecId(String secId) {
		// TODO Auto-generated method stub
		return this.thirdAuthorityDao.getThirdAuthoritiesBySecId(secId);
	}

}