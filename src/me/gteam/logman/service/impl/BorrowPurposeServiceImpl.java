package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.BorrowPurposeDao;
import me.gteam.logman.domain.BorrowPurpose;
import me.gteam.logman.service.BorrowPurposeService;

@Service("borrowPurposeService")
public class BorrowPurposeServiceImpl implements BorrowPurposeService{

	@Resource(name="borrowPurposeDao")
	private BorrowPurposeDao borrowPurposeDao;

	public void saveBorrowPurpose(BorrowPurpose borrowPurpose) {
		this.borrowPurposeDao.saveEntry(borrowPurpose);
	}

	public void updateBorrowPurpose(BorrowPurpose borrowPurpose){
		this.borrowPurposeDao.updateEntry(borrowPurpose);
	}

	public void deleteBorrowPurposeByID(Serializable id, String deleteMode) {
		this.borrowPurposeDao.deleteEntry(id);
	}

	public Collection<BorrowPurpose> getAllBorrowPurpose() {
		return this.borrowPurposeDao.getAllEntry();
	}

	public BorrowPurpose getBorrowPurposeById(Serializable id) {
		return (BorrowPurpose)this.borrowPurposeDao.getEntryById(id);
	}

}