package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.AccountDao;
import me.gteam.logman.domain.Account;
import me.gteam.logman.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

	@Resource(name="accountDao")
	private AccountDao accountDao;

	public void saveAccount(Account account) {
		this.accountDao.saveEntry(account);
	}

	public void updateAccount(Account account){
		this.accountDao.updateEntry(account);
	}

	public void deleteAccountByID(Serializable id, String deleteMode) {
		this.accountDao.deleteEntry(id);
	}

	public Collection<Account> getAllAccount() {
		return this.accountDao.getAllEntry();
	}

	public Account getAccountById(Serializable id) {
		return (Account)this.accountDao.getEntryById(id);
	}

}