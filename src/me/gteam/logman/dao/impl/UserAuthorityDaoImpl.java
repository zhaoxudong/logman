package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.UserAuthorityDao;
import me.gteam.logman.domain.ThirdAuthority;
import me.gteam.logman.domain.UserAuthority;

@Repository("userAuthorityDao")
public class UserAuthorityDaoImpl extends BaseDaoImpl<UserAuthority> implements UserAuthorityDao<UserAuthority>{

	@Override
	public ThirdAuthority getThirdAuthorityByUserIdAndThiId(int userId, int ThiId) {
		// TODO Auto-generated method stub
		try {
			return (ThirdAuthority)this.hibernateTemplate.find("select userAuthority.thirdAuthority from UserAuthority userAuthority where userAuthority.user.userId="+userId+" and userAuthority.thirdAuthority.thiId="+ThiId).get(0);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
