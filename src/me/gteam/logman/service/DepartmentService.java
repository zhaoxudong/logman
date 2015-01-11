package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Department;

public interface DepartmentService {

	public void saveDepartment(Department department);

	public void updateDepartment(Department department);

	public void deleteDepartmentByID(Serializable id,String deleteMode);

	public Collection<Department> getAllDepartment();

	public Department getDepartmentById(Serializable id);
}