package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.BorrowReturnDao;
import me.gteam.logman.domain.BorrowReturn;

@Repository("borrowReturnDao")
public class BorrowReturnDaoImpl extends BaseDaoImpl<BorrowReturn> implements BorrowReturnDao<BorrowReturn>{

}