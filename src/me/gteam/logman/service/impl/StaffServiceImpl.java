package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.StaffDao;
import me.gteam.logman.domain.Staff;
import me.gteam.logman.service.StaffService;

@Service("staffService")
public class StaffServiceImpl implements StaffService{

	@Resource(name="staffDao")
	private StaffDao staffDao;

	public void saveStaff(Staff staff) {
		this.staffDao.saveEntry(staff);
	}

	public void updateStaff(Staff staff){
		this.staffDao.updateEntry(staff);
	}

	public void deleteStaffByID(Serializable id, String deleteMode) {
		this.staffDao.deleteEntry(id);
	}

	public Collection<Staff> getAllStaff() {
		return this.staffDao.getAllEntry();
	}

	public Staff getStaffById(Serializable id) {
		return (Staff)this.staffDao.getEntryById(id);
	}

}