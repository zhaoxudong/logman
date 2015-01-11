package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.CardRefuelDao;
import me.gteam.logman.domain.CardRefuel;
import me.gteam.logman.service.CardRefuelService;

@Service("cardRefuelService")
public class CardRefuelServiceImpl implements CardRefuelService{

	@Resource(name="cardRefuelDao")
	private CardRefuelDao cardRefuelDao;

	public void saveCardRefuel(CardRefuel cardRefuel) {
		this.cardRefuelDao.saveEntry(cardRefuel);
	}

	public void updateCardRefuel(CardRefuel cardRefuel){
		this.cardRefuelDao.updateEntry(cardRefuel);
	}

	public void deleteCardRefuelByID(Serializable id, String deleteMode) {
		this.cardRefuelDao.deleteEntry(id);
	}

	public Collection<CardRefuel> getAllCardRefuel() {
		return this.cardRefuelDao.getAllEntry();
	}

	public CardRefuel getCardRefuelById(Serializable id) {
		return (CardRefuel)this.cardRefuelDao.getEntryById(id);
	}

}