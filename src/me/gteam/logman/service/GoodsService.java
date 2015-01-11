package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Goods;

public interface GoodsService {

	public void saveGoods(Goods goods);

	public void updateGoods(Goods goods);

	public void deleteGoodsByID(Serializable id,String deleteMode);

	public Collection<Goods> getAllGoods();

	public Goods getGoodsById(Serializable id);
}