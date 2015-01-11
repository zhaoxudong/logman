package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.GoodsDao;
import me.gteam.logman.domain.Goods;
import me.gteam.logman.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{

	@Resource(name="goodsDao")
	private GoodsDao goodsDao;

	public void saveGoods(Goods goods) {
		this.goodsDao.saveEntry(goods);
	}

	public void updateGoods(Goods goods){
		this.goodsDao.updateEntry(goods);
	}

	public void deleteGoodsByID(Serializable id, String deleteMode) {
		this.goodsDao.deleteEntry(id);
	}

	public Collection<Goods> getAllGoods() {
		return this.goodsDao.getAllEntry();
	}

	public Goods getGoodsById(Serializable id) {
		return (Goods)this.goodsDao.getEntryById(id);
	}

}