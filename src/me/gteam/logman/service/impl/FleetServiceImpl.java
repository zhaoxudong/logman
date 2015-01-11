package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.FleetDao;
import me.gteam.logman.domain.Fleet;
import me.gteam.logman.service.FleetService;

@Service("fleetService")
public class FleetServiceImpl implements FleetService{

	@Resource(name="fleetDao")
	private FleetDao fleetDao;

	public void saveFleet(Fleet fleet) {
		this.fleetDao.saveEntry(fleet);
	}

	public void updateFleet(Fleet fleet){
		this.fleetDao.updateEntry(fleet);
	}

	public void deleteFleetByID(Serializable id, String deleteMode) {
		this.fleetDao.deleteEntry(id);
	}

	public Collection<Fleet> getAllFleet() {
		return this.fleetDao.getAllEntry();
	}

	public Fleet getFleetById(Serializable id) {
		return (Fleet)this.fleetDao.getEntryById(id);
	}

}