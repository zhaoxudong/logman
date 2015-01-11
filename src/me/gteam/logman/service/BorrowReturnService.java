package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.BorrowReturn;

public interface BorrowReturnService {

	public void saveBorrowReturn(BorrowReturn borrowReturn);

	public void updateBorrowReturn(BorrowReturn borrowReturn);

	public void deleteBorrowReturnByID(Serializable id,String deleteMode);

	public Collection<BorrowReturn> getAllBorrowReturn();

	public BorrowReturn getBorrowReturnById(Serializable id);
}