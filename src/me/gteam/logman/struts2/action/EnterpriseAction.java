package me.gteam.logman.struts2.action;

import me.gteam.logman.domain.Enterprise;
import me.gteam.logman.service.EnterpriseService;

import com.opensymphony.xwork2.ActionSupport;

public class EnterpriseAction extends ActionSupport{
	
	private EnterpriseService enterpriseService;

	public EnterpriseService getEnterpriseService() {
		return enterpriseService;
	}

	public void setEnterpriseService(EnterpriseService enterpriseService) {
		this.enterpriseService = enterpriseService;
	}
	
	public String saveEnterprise(){
		Enterprise enterprise = new Enterprise("aa","bb");
		enterpriseService.saveEnterprise(enterprise);
		return SUCCESS;
	}

}
