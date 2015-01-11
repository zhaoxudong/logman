package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Account;

public interface AccountService {

	public void saveAccount(Account account);

	public void updateAccount(Account account);

	public void deleteAccountByID(Serializable id,String deleteMode);

	public Collection<Account> getAllAccount();

	public Account getAccountById(Serializable id);
}