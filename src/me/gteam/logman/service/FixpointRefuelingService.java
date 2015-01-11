package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.FixpointRefueling;

public interface FixpointRefuelingService {

	public void saveFixpointRefueling(FixpointRefueling fixpointRefueling);

	public void updateFixpointRefueling(FixpointRefueling fixpointRefueling);

	public void deleteFixpointRefuelingByID(Serializable id,String deleteMode);

	public Collection<FixpointRefueling> getAllFixpointRefueling();

	public FixpointRefueling getFixpointRefuelingById(Serializable id);
}