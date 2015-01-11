package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.BorrowPurpose;

public interface BorrowPurposeService {

	public void saveBorrowPurpose(BorrowPurpose borrowPurpose);

	public void updateBorrowPurpose(BorrowPurpose borrowPurpose);

	public void deleteBorrowPurposeByID(Serializable id,String deleteMode);

	public Collection<BorrowPurpose> getAllBorrowPurpose();

	public BorrowPurpose getBorrowPurposeById(Serializable id);
}