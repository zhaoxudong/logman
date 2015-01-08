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
	private SecondAuthorityDao secondAuthorityDao ;

	@Override
	public void saveSecondAuthority(SecondAuthority secondAuthority) {
		// TODO Auto-generated method stub
		this.secondAuthorityDao.saveEntry(secondAuthority);
		
	}

	@Override
	public void updateSecondAuthority(SecondAuthority secondAuthority) {
		// TODO Auto-generated method stub
		this.secondAuthorityDao.updateEntry(secondAuthority);
		
	}

	@Override
	public void deleteSecondAuthorityByID(Serializable id, String deleteMode) {
		// TODO Auto-generated method stub
		this.secondAuthorityDao.deleteEntry(id);
		
	}

	@Override
	public Collection<SecondAuthority> getAllSecondAuthorities() {
		// TODO Auto-generated method stub
		return this.secondAuthorityDao.getAllEntry();
	}

	@Override
	public SecondAuthority getSecondAuthorityById(Serializable id) {
		// TODO Auto-generated method stub
		return (SecondAuthority)this.secondAuthorityDao.getEntryById(id);
	}
}
