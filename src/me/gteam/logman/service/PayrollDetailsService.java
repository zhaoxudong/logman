package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.PayrollDetails;

public interface PayrollDetailsService {

	public void savePayrollDetails(PayrollDetails payrollDetails);

	public void updatePayrollDetails(PayrollDetails payrollDetails);

	public void deletePayrollDetailsByID(Serializable id,String deleteMode);

	public Collection<PayrollDetails> getAllPayrollDetails();

	public PayrollDetails getPayrollDetailsById(Serializable id);
}