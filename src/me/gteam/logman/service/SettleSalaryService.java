package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.SettleSalary;

public interface SettleSalaryService {

	public void saveSettleSalary(SettleSalary settleSalary);

	public void updateSettleSalary(SettleSalary settleSalary);

	public void deleteSettleSalaryByID(Serializable id,String deleteMode);

	public Collection<SettleSalary> getAllSettleSalary();

	public SettleSalary getSettleSalaryById(Serializable id);
}