package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.Orders;

public interface OrdersService {

	public void saveOrders(Orders orders);

	public void updateOrders(Orders orders);

	public void deleteOrdersByID(Serializable id,String deleteMode);

	public Collection<Orders> getAllOrders();

	public Orders getOrdersById(Serializable id);
}