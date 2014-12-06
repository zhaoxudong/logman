package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.OrdersDao;
import me.gteam.logman.domain.Orders;
import me.gteam.logman.service.OrdersService;

@Service("ordersService")
public class OrdersServiceImpl implements OrdersService{
	@Resource(name="ordersDao")
	private OrdersDao ordersDao;
	@Override
	public void saveOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.ordersDao.saveEntry(orders);
	}

	@Override
	public void updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.ordersDao.updateEntry(orders);
	}

	@Override
	public void deleteOrderByID(Serializable id, String deleteMode) {
		// TODO Auto-generated method stub
		this.ordersDao.deleteEntry(id);
	}

	@Override
	public Collection<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return this.ordersDao.getAllEntry();
	}

	@Override
	public Orders getOrdersById(Serializable id) {
		// TODO Auto-generated method stub
		return (Orders)this.ordersDao.getEntryById(id);
	}

}
