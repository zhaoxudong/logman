package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import me.gteam.logman.domain.ThirdAuthority;

public interface ThirdAuthorityService {
	public void saveThirdAuthority(ThirdAuthority thirdAuthority);

	public void updateThirdAuthority(ThirdAuthority thirdAuthority);

	public void deleteThirdAuthorityByID(Serializable id,String deleteMode);

	public Collection<ThirdAuthority> getAllThirdAuthorities();

	public ThirdAuthority getThirdAuthorityById(Serializable id);
	
	public List getThirdAuthoritiesBySecId(String secId);
}
