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

	public void saveUserAuthority(UserAuthority userAuthority) {
		this.userAuthorityDao.saveEntry(userAuthority);
	}

	public void updateUserAuthority(UserAuthority userAuthority){
		this.userAuthorityDao.updateEntry(userAuthority);
	}

	public void deleteUserAuthorityByID(Serializable id, String deleteMode) {
		this.userAuthorityDao.deleteEntry(id);
	}

	public Collection<UserAuthority> getAllUserAuthority() {
		return this.userAuthorityDao.getAllEntry();
	}

	public UserAuthority getUserAuthorityById(Serializable id) {
		return (UserAuthority)this.userAuthorityDao.getEntryById(id);
	}

	@Override
	public ThirdAuthority getThirdAuthorityByUserIdAndThiId(int userId, int ThiId) {
		// TODO Auto-generated method stub
		return this.userAuthorityDao.getThirdAuthorityByUserIdAndThiId(userId, ThiId);
	}
}