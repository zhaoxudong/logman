package me.gteam.logman.dao;

import java.util.List;

public interface ThirdAuthorityDao<T> extends BaseDao<T> {
	public List<T> getThirdAuthoritiesBySecId(String secId); 
}