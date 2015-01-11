package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Enterprise;

public interface EnterpriseService {

	public void saveEnterprise(Enterprise enterprise);

	public void updateEnterprise(Enterprise enterprise);

	public void deleteEnterpriseByID(Serializable id,String deleteMode);

	public Collection<Enterprise> getAllEnterprise();

	public Enterprise getEnterpriseById(Serializable id);
}