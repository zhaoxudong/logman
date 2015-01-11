package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.OfficesuppliesUse;

public interface OfficesuppliesUseService {

	public void saveOfficesuppliesUse(OfficesuppliesUse officesuppliesUse);

	public void updateOfficesuppliesUse(OfficesuppliesUse officesuppliesUse);

	public void deleteOfficesuppliesUseByID(Serializable id,String deleteMode);

	public Collection<OfficesuppliesUse> getAllOfficesuppliesUse();

	public OfficesuppliesUse getOfficesuppliesUseById(Serializable id);
}