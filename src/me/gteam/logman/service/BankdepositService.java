package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Bankdeposit;

public interface BankdepositService {

	public void saveBankdeposit(Bankdeposit bankdeposit);

	public void updateBankdeposit(Bankdeposit bankdeposit);

	public void deleteBankdepositByID(Serializable id,String deleteMode);

	public Collection<Bankdeposit> getAllBankdeposit();

	public Bankdeposit getBankdepositById(Serializable id);
}