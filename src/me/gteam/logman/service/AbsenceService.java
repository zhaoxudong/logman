package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Absence;

public interface AbsenceService {

	public void saveAbsence(Absence absence);

	public void updateAbsence(Absence absence);

	public void deleteAbsenceByID(Serializable id,String deleteMode);

	public Collection<Absence> getAllAbsence();

	public Absence getAbsenceById(Serializable id);
}