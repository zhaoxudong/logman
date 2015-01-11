package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.DepartmentDao;
import me.gteam.logman.domain.Department;
import me.gteam.logman.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{

	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;

	public void saveDepartment(Department department) {
		this.departmentDao.saveEntry(department);
	}

	public void updateDepartment(Department department){
		this.departmentDao.updateEntry(department);
	}

	public void deleteDepartmentByID(Serializable id, String deleteMode) {
		this.departmentDao.deleteEntry(id);
	}

	public Collection<Department> getAllDepartment() {
		return this.departmentDao.getAllEntry();
	}

	public Department getDepartmentById(Serializable id) {
		return (Department)this.departmentDao.getEntryById(id);
	}

}