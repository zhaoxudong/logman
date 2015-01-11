package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.SalaryType;

public interface SalaryTypeService {

	public void saveSalaryType(SalaryType salaryType);

	public void updateSalaryType(SalaryType salaryType);

	public void deleteSalaryTypeByID(Serializable id,String deleteMode);

	public Collection<SalaryType> getAllSalaryType();

	public SalaryType getSalaryTypeById(Serializable id);
}