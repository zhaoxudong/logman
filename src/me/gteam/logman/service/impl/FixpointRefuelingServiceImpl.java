package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FixpointRefuelingDao;
import me.gteam.logman.domain.FixpointRefueling;
import me.gteam.logman.service.FixpointRefuelingService;

@Service("fixpointRefuelingService")
public class FixpointRefuelingServiceImpl implements FixpointRefuelingService{

	@Resource(name="fixpointRefuelingDao")
	private FixpointRefuelingDao fixpointRefuelingDao;

	public void saveFixpointRefueling(FixpointRefueling fixpointRefueling) {
		this.fixpointRefuelingDao.saveEntry(fixpointRefueling);
	}

	public void updateFixpointRefueling(FixpointRefueling fixpointRefueling){
		this.fixpointRefuelingDao.updateEntry(fixpointRefueling);
	}

	public void deleteFixpointRefuelingByID(Serializable id, String deleteMode) {
		this.fixpointRefuelingDao.deleteEntry(id);
	}

	public Collection<FixpointRefueling> getAllFixpointRefueling() {
		return this.fixpointRefuelingDao.getAllEntry();
	}

	public FixpointRefueling getFixpointRefuelingById(Serializable id) {
		return (FixpointRefueling)this.fixpointRefuelingDao.getEntryById(id);
	}

}