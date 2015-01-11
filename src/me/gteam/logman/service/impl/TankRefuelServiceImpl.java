package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.TankRefuelDao;
import me.gteam.logman.domain.TankRefuel;
import me.gteam.logman.service.TankRefuelService;

@Service("tankRefuelService")
public class TankRefuelServiceImpl implements TankRefuelService{

	@Resource(name="tankRefuelDao")
	private TankRefuelDao tankRefuelDao;

	public void saveTankRefuel(TankRefuel tankRefuel) {
		this.tankRefuelDao.saveEntry(tankRefuel);
	}

	public void updateTankRefuel(TankRefuel tankRefuel){
		this.tankRefuelDao.updateEntry(tankRefuel);
	}

	public void deleteTankRefuelByID(Serializable id, String deleteMode) {
		this.tankRefuelDao.deleteEntry(id);
	}

	public Collection<TankRefuel> getAllTankRefuel() {
		return this.tankRefuelDao.getAllEntry();
	}

	public TankRefuel getTankRefuelById(Serializable id) {
		return (TankRefuel)this.tankRefuelDao.getEntryById(id);
	}

}