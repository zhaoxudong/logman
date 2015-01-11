package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.CardRefuel;

public interface CardRefuelService {

	public void saveCardRefuel(CardRefuel cardRefuel);

	public void updateCardRefuel(CardRefuel cardRefuel);

	public void deleteCardRefuelByID(Serializable id,String deleteMode);

	public Collection<CardRefuel> getAllCardRefuel();

	public CardRefuel getCardRefuelById(Serializable id);
}