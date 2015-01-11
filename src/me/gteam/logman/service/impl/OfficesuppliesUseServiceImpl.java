package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OfficesuppliesUseDao;
import me.gteam.logman.domain.OfficesuppliesUse;
import me.gteam.logman.service.OfficesuppliesUseService;

@Service("officesuppliesUseService")
public class OfficesuppliesUseServiceImpl implements OfficesuppliesUseService{

	@Resource(name="officesuppliesUseDao")
	private OfficesuppliesUseDao officesuppliesUseDao;

	public void saveOfficesuppliesUse(OfficesuppliesUse officesuppliesUse) {
		this.officesuppliesUseDao.saveEntry(officesuppliesUse);
	}

	public void updateOfficesuppliesUse(OfficesuppliesUse officesuppliesUse){
		this.officesuppliesUseDao.updateEntry(officesuppliesUse);
	}

	public void deleteOfficesuppliesUseByID(Serializable id, String deleteMode) {
		this.officesuppliesUseDao.deleteEntry(id);
	}

	public Collection<OfficesuppliesUse> getAllOfficesuppliesUse() {
		return this.officesuppliesUseDao.getAllEntry();
	}

	public OfficesuppliesUse getOfficesuppliesUseById(Serializable id) {
		return (OfficesuppliesUse)this.officesuppliesUseDao.getEntryById(id);
	}

}