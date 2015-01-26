package me.gteam.logman.dao;

import me.gteam.logman.domain.ThirdAuthority;

public interface UserAuthorityDao<T> extends BaseDao<T> {
	public ThirdAuthority getThirdAuthorityByUserIdAndThiId(int userId ,int ThiId);
}