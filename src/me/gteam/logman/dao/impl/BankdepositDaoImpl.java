package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.BankdepositDao;
import me.gteam.logman.domain.Bankdeposit;

@Repository("bankdepositDao")
public class BankdepositDaoImpl extends BaseDaoImpl<Bankdeposit> implements BankdepositDao<Bankdeposit>{

}