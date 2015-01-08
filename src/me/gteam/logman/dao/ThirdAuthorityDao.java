package me.gteam.logman.dao;

import java.util.Collection;
import java.util.List;

import me.gteam.logman.domain.ThirdAuthority;

public interface ThirdAuthorityDao<T> extends BaseDao<T> {
	public List<T> getThirdAuthoritiesBySecId(String secId); 
}
