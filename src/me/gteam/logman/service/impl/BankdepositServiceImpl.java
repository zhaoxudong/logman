package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.BankdepositDao;
import me.gteam.logman.domain.Bankdeposit;
import me.gteam.logman.service.BankdepositService;

@Service("bankdepositService")
public class BankdepositServiceImpl implements BankdepositService{

	@Resource(name="bankdepositDao")
	private BankdepositDao bankdepositDao;

	public void saveBankdeposit(Bankdeposit bankdeposit) {
		this.bankdepositDao.saveEntry(bankdeposit);
	}

	public void updateBankdeposit(Bankdeposit bankdeposit){
		this.bankdepositDao.updateEntry(bankdeposit);
	}

	public void deleteBankdepositByID(Serializable id, String deleteMode) {
		this.bankdepositDao.deleteEntry(id);
	}

	public Collection<Bankdeposit> getAllBankdeposit() {
		return this.bankdepositDao.getAllEntry();
	}

	public Bankdeposit getBankdepositById(Serializable id) {
		return (Bankdeposit)this.bankdepositDao.getEntryById(id);
	}

}