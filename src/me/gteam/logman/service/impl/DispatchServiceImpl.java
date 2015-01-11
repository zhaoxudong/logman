package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.DispatchDao;
import me.gteam.logman.domain.Dispatch;
import me.gteam.logman.service.DispatchService;

@Service("dispatchService")
public class DispatchServiceImpl implements DispatchService{

	@Resource(name="dispatchDao")
	private DispatchDao dispatchDao;

	public void saveDispatch(Dispatch dispatch) {
		this.dispatchDao.saveEntry(dispatch);
	}

	public void updateDispatch(Dispatch dispatch){
		this.dispatchDao.updateEntry(dispatch);
	}

	public void deleteDispatchByID(Serializable id, String deleteMode) {
		this.dispatchDao.deleteEntry(id);
	}

	public Collection<Dispatch> getAllDispatch() {
		return this.dispatchDao.getAllEntry();
	}

	public Dispatch getDispatchById(Serializable id) {
		return (Dispatch)this.dispatchDao.getEntryById(id);
	}

}