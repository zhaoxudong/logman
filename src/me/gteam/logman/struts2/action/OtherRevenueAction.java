package me.gteam.logman.struts2.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import me.gteam.logman.domain.Otherin;
import me.gteam.logman.service.OtherinService;
@Controller("otherrevenueAction")
@Scope("prototype")
public class OtherRevenueAction extends BaseAction<Otherin>{

	@Resource(name="otherinService")
	private OtherinService otherinService;
	
	public String addOtherrevenueUI() {
		return "addOtherrevenueUI";
		
	}
	
	public String listOtherrevenueUI() {
		return listOtherrevenue();
	}
	
	public String manageOtherrevenueUI() {
		return manageOtherrevenue();
	}
	
	public String addOtherrevenue() {
		Otherin otherin =new Otherin();
		BeanUtils.copyProperties(this.getModel(), otherin);
		this.otherinService.saveOtherin(otherin);
		return SUCCESS;
		
	}
	
	public String listOtherrevenue(){
		Collection otherinCollection = this.otherinService.getAllOtherin();
		ActionContext.getContext().put("otherinCollection", otherinCollection);
		return "listOtherrevenueUI";
	}
	
	public String manageOtherrevenue() {
		Collection otherinCollection = this.otherinService.getAllOtherin();
		ActionContext.getContext().put("otherinCollection", otherinCollection);
		return "manageOtherrevenueUI";
	}
	
	public String updateOtherrevenue() {
		Otherin otherin=this.otherinService.getOtherinById(this.getModel().getInId());
		BeanUtils.copyProperties(this.getModel(),otherin);
		this.otherinService.updateOtherin(otherin);
		System.out.println(otherin.getAmount());
		System.out.println(this.getModel().getAmount());
		return SUCCESS;
	}
	
	public String editOtherrevenue() {
		return SUCCESS;
	}
	
	public String deleteOtherrevenue() {
		return SUCCESS;
	}
	
}
