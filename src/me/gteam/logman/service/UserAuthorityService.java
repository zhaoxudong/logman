package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.ThirdAuthority;
import me.gteam.logman.domain.UserAuthority;

public interface UserAuthorityService {
	public void saveUserAuthority(UserAuthority userAuthority);

	public void updateUserAuthority(UserAuthority userAuthority);

	public void deleteUserAuthorityByID(Serializable id,String deleteMode);

	public Collection<UserAuthority> getAllUserAuthorities();

	public UserAuthority getUserAuthorityById(Serializable id);
	
	public ThirdAuthority getThirdAuthorityByUserIdAndThiId(int userId ,int ThiId);
}
