package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.ShouldReceivepayDao;
import me.gteam.logman.domain.ShouldReceivepay;
import me.gteam.logman.service.ShouldReceivepayService;

@Service("shouldReceivepayService")
public class ShouldReceivepayServiceImpl implements ShouldReceivepayService{

	@Resource(name="shouldReceivepayDao")
	private ShouldReceivepayDao shouldReceivepayDao;

	public void saveShouldReceivepay(ShouldReceivepay shouldReceivepay) {
		this.shouldReceivepayDao.saveEntry(shouldReceivepay);
	}

	public void updateShouldReceivepay(ShouldReceivepay shouldReceivepay){
		this.shouldReceivepayDao.updateEntry(shouldReceivepay);
	}

	public void deleteShouldReceivepayByID(Serializable id, String deleteMode) {
		this.shouldReceivepayDao.deleteEntry(id);
	}

	public Collection<ShouldReceivepay> getAllShouldReceivepay() {
		return this.shouldReceivepayDao.getAllEntry();
	}

	public ShouldReceivepay getShouldReceivepayById(Serializable id) {
		return (ShouldReceivepay)this.shouldReceivepayDao.getEntryById(id);
	}

}