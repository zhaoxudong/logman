package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.BorrowReturnDao;
import me.gteam.logman.domain.BorrowReturn;
import me.gteam.logman.service.BorrowReturnService;

@Service("borrowReturnService")
public class BorrowReturnServiceImpl implements BorrowReturnService{

	@Resource(name="borrowReturnDao")
	private BorrowReturnDao borrowReturnDao;

	public void saveBorrowReturn(BorrowReturn borrowReturn) {
		this.borrowReturnDao.saveEntry(borrowReturn);
	}

	public void updateBorrowReturn(BorrowReturn borrowReturn){
		this.borrowReturnDao.updateEntry(borrowReturn);
	}

	public void deleteBorrowReturnByID(Serializable id, String deleteMode) {
		this.borrowReturnDao.deleteEntry(id);
	}

	public Collection<BorrowReturn> getAllBorrowReturn() {
		return this.borrowReturnDao.getAllEntry();
	}

	public BorrowReturn getBorrowReturnById(Serializable id) {
		return (BorrowReturn)this.borrowReturnDao.getEntryById(id);
	}

}