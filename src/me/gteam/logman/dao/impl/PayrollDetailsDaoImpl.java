package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.PayrollDetailsDao;
import me.gteam.logman.domain.PayrollDetails;

@Repository("payrollDetailsDao")
public class PayrollDetailsDaoImpl extends BaseDaoImpl<PayrollDetails> implements PayrollDetailsDao<PayrollDetails>{

}