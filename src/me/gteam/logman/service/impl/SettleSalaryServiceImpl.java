package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.SettleSalaryDao;
import me.gteam.logman.domain.SettleSalary;
import me.gteam.logman.service.SettleSalaryService;

@Service("settleSalaryService")
public class SettleSalaryServiceImpl implements SettleSalaryService{

	@Resource(name="settleSalaryDao")
	private SettleSalaryDao settleSalaryDao;

	public void saveSettleSalary(SettleSalary settleSalary) {
		this.settleSalaryDao.saveEntry(settleSalary);
	}

	public void updateSettleSalary(SettleSalary settleSalary){
		this.settleSalaryDao.updateEntry(settleSalary);
	}

	public void deleteSettleSalaryByID(Serializable id, String deleteMode) {
		this.settleSalaryDao.deleteEntry(id);
	}

	public Collection<SettleSalary> getAllSettleSalary() {
		return this.settleSalaryDao.getAllEntry();
	}

	public SettleSalary getSettleSalaryById(Serializable id) {
		return (SettleSalary)this.settleSalaryDao.getEntryById(id);
	}

}