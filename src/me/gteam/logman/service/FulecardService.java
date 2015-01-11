package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Fulecard;

public interface FulecardService {

	public void saveFulecard(Fulecard fulecard);

	public void updateFulecard(Fulecard fulecard);

	public void deleteFulecardByID(Serializable id,String deleteMode);

	public Collection<Fulecard> getAllFulecard();

	public Fulecard getFulecardById(Serializable id);
}