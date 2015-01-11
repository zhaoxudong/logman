package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Staff;

public interface StaffService {

	public void saveStaff(Staff staff);

	public void updateStaff(Staff staff);

	public void deleteStaffByID(Serializable id,String deleteMode);

	public Collection<Staff> getAllStaff();

	public Staff getStaffById(Serializable id);
}