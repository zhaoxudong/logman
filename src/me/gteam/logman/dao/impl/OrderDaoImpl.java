package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.OrdersDao;
import me.gteam.logman.domain.Orders;

@Repository("orderDao")
public class OrderDaoImpl extends BaseDaoImpl<Orders> implements OrdersDao<Orders>{

}
