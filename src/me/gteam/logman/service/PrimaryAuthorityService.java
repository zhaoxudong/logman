package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.PrimaryAuthority;

public interface PrimaryAuthorityService {

	public void savePrimaryAuthority(PrimaryAuthority primaryAuthority);

	public void updatePrimaryAuthority(PrimaryAuthority primaryAuthority);

	public void deletePrimaryAuthorityByID(Serializable id,String deleteMode);

	public Collection<PrimaryAuthority> getAllPrimaryAuthority();

	public PrimaryAuthority getPrimaryAuthorityById(Serializable id);
}