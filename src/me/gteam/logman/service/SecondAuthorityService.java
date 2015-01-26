package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.SecondAuthority;

public interface SecondAuthorityService {

	public void saveSecondAuthority(SecondAuthority secondAuthority);

	public void updateSecondAuthority(SecondAuthority secondAuthority);

	public void deleteSecondAuthorityByID(Serializable id,String deleteMode);

	public Collection<SecondAuthority> getAllSecondAuthority();

	public SecondAuthority getSecondAuthorityById(Serializable id);
}