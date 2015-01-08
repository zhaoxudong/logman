package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.UserAuthorityDao;
import me.gteam.logman.domain.ThirdAuthority;
import me.gteam.logman.domain.UserAuthority;
import me.gteam.logman.service.UserAuthorityService;

@Service("userAuthorityService")
public class UserAuthorityServiceImpl implements UserAuthorityService{
	@Resource(name="userAuthorityDao")
	private UserAuthorityDao userAuthorityDao;

	@Override
	public void saveUserAuthority(UserAuthority userAuthority) {
		// TODO Auto-generated method stub
		this.userAuthorityDao.saveEntry(userAuthority);
	}

	@Override
	public void updateUserAuthority(UserAuthority userAuthority) {
		// TODO Auto-generated method stub
		this.userAuthorityDao.updateEntry(userAuthority);
	}

	@Override
	public void deleteUserAuthorityByID(Serializable id, String deleteMode) {
		// TODO Auto-generated method stub
		this.userAuthorityDao.deleteEntry(id);
	}

	@Override
	public Collection<UserAuthority> getAllUserAuthorities() {
		// TODO Auto-generated method stub
		return this.userAuthorityDao.getAllEntry();
	}

	@Override
	public UserAuthority getUserAuthorityById(Serializable id) {
		// TODO Auto-generated method stub
		return (UserAuthority)this.userAuthorityDao.getEntryById(id);
	}

	@Override
	public ThirdAuthority getThirdAuthorityByUserIdAndThiId(int userId, int ThiId) {
		// TODO Auto-generated method stub
		return this.userAuthorityDao.getThirdAuthorityByUserIdAndThiId(userId, ThiId);
	}
	
}
