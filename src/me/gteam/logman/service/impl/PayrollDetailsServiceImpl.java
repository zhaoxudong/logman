package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.PayrollDetailsDao;
import me.gteam.logman.domain.PayrollDetails;
import me.gteam.logman.service.PayrollDetailsService;

@Service("payrollDetailsService")
public class PayrollDetailsServiceImpl implements PayrollDetailsService{

	@Resource(name="payrollDetailsDao")
	private PayrollDetailsDao payrollDetailsDao;

	public void savePayrollDetails(PayrollDetails payrollDetails) {
		this.payrollDetailsDao.saveEntry(payrollDetails);
	}

	public void updatePayrollDetails(PayrollDetails payrollDetails){
		this.payrollDetailsDao.updateEntry(payrollDetails);
	}

	public void deletePayrollDetailsByID(Serializable id, String deleteMode) {
		this.payrollDetailsDao.deleteEntry(id);
	}

	public Collection<PayrollDetails> getAllPayrollDetails() {
		return this.payrollDetailsDao.getAllEntry();
	}

	public PayrollDetails getPayrollDetailsById(Serializable id) {
		return (PayrollDetails)this.payrollDetailsDao.getEntryById(id);
	}

}