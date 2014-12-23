package me.gteam.logman.struts2.action;

import java.util.Collection;

import javax.annotation.Resource;

import me.gteam.logman.domain.Orders;
import me.gteam.logman.service.OrdersService;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

@Controller("ordersAction")
@Scope("prototype")
public class OrdersAction extends BaseAction<Orders>{
	@Resource(name="ordersService")
	private OrdersService ordersService;
	
	public String addOrders(){
		Orders orders = new Orders();
		BeanUtils.copyProperties(this.getModel(), orders);
		this.ordersService.saveOrders(orders);
		return SUCCESS;
	}
}
