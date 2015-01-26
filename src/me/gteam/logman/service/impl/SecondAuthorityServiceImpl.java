package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.SecondAuthorityDao;
import me.gteam.logman.domain.SecondAuthority;
import me.gteam.logman.service.SecondAuthorityService;

@Service("secondAuthorityService")
public class SecondAuthorityServiceImpl implements SecondAuthorityService{

	@Resource(name="secondAuthorityDao")
	private SecondAuthorityDao secondAuthorityDao;

	public void saveSecondAuthority(SecondAuthority secondAuthority) {
		this.secondAuthorityDao.saveEntry(secondAuthority);
	}

	public void updateSecondAuthority(SecondAuthority secondAuthority){
		this.secondAuthorityDao.updateEntry(secondAuthority);
	}

	public void deleteSecondAuthorityByID(Serializable id, String deleteMode) {
		this.secondAuthorityDao.deleteEntry(id);
	}

	public Collection<SecondAuthority> getAllSecondAuthority() {
		return this.secondAuthorityDao.getAllEntry();
	}

	public SecondAuthority getSecondAuthorityById(Serializable id) {
		return (SecondAuthority)this.secondAuthorityDao.getEntryById(id);
	}

}