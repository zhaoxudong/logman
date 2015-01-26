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

	public void saveOrders(Orders orders) {
		this.ordersDao.saveEntry(orders);
	}

	public void updateOrders(Orders orders){
		this.ordersDao.updateEntry(orders);
	}

	public void deleteOrdersByID(Serializable id, String deleteMode) {
		this.ordersDao.deleteEntry(id);
	}

	public Collection<Orders> getAllOrders() {
		return this.ordersDao.getAllEntry();
	}

	public Orders getOrdersById(Serializable id) {
		return (Orders)this.ordersDao.getEntryById(id);
	}

}