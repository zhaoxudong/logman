package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.SalaryTypeDao;
import me.gteam.logman.domain.SalaryType;
import me.gteam.logman.service.SalaryTypeService;

@Service("salaryTypeService")
public class SalaryTypeServiceImpl implements SalaryTypeService{

	@Resource(name="salaryTypeDao")
	private SalaryTypeDao salaryTypeDao;

	public void saveSalaryType(SalaryType salaryType) {
		this.salaryTypeDao.saveEntry(salaryType);
	}

	public void updateSalaryType(SalaryType salaryType){
		this.salaryTypeDao.updateEntry(salaryType);
	}

	public void deleteSalaryTypeByID(Serializable id, String deleteMode) {
		this.salaryTypeDao.deleteEntry(id);
	}

	public Collection<SalaryType> getAllSalaryType() {
		return this.salaryTypeDao.getAllEntry();
	}

	public SalaryType getSalaryTypeById(Serializable id) {
		return (SalaryType)this.salaryTypeDao.getEntryById(id);
	}

}