package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.BorrowPurposeDao;
import me.gteam.logman.domain.BorrowPurpose;

@Repository("borrowPurposeDao")
public class BorrowPurposeDaoImpl extends BaseDaoImpl<BorrowPurpose> implements BorrowPurposeDao<BorrowPurpose>{

}