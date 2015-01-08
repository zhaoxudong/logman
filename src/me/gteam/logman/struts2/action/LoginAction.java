package me.gteam.logman.struts2.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{
	ActionContext context;
	Map request;
	Map session;
	Map application;
	public String getThirdAuthorityById() throws Exception {
		context=ActionContext.getContext();
		request=(Map) context.get("request");
		session=context.getSession();
		application=context.getApplication();
		
		
		return SUCCESS;
	}


}
