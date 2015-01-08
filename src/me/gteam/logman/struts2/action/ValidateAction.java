package me.gteam.logman.struts2.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.apache.struts2.ServletActionContext;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import me.gteam.logman.domain.PrimaryAuthority;
import me.gteam.logman.domain.SecondAuthority;
import me.gteam.logman.domain.ThirdAuthority;
import me.gteam.logman.domain.User;
import me.gteam.logman.domain.UserAuthority;
import me.gteam.logman.service.OrdersService;
import me.gteam.logman.service.ThirdAuthorityService;
import me.gteam.logman.service.UserAuthorityService;
import me.gteam.logman.service.UserService;

@Controller("validateAction")
@Scope("prototype")
public class ValidateAction extends BaseAction<User> {
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="thirdAuthorityService")
	private ThirdAuthorityService thirdAuthorityService;
	@Resource(name="userAuthorityService")
	private UserAuthorityService userAuthorityService;
	public String login() {
		User user =new User();
		BeanUtils.copyProperties(this.getModel(), user);
		//To The UI
		ArrayList<PrimaryAuthority> authorityList = new ArrayList<PrimaryAuthority>();
		try {
			User userInDB = userService.getUserByName(user.getUserName());
			Set<UserAuthority> userAuthorities2 = userInDB.getUserAuthorities();
			List<UserAuthority> userAuthorities = new ArrayList<UserAuthority>();
			userAuthorities.addAll(userAuthorities2);
			for(UserAuthority userAuthority:userAuthorities ){
				SecondAuthority secondAuthority = userAuthority.getThirdAuthority().getSecondAuthority();
				PrimaryAuthority primaryAuthority = secondAuthority.getPrimaryAuthority();
				if(authorityList.size()==0){
					SecondAuthority secondAuthority2 = new SecondAuthority(secondAuthority.getSecId(),secondAuthority.getSecAuthority());
					PrimaryAuthority primaryAuthority2 = new PrimaryAuthority(primaryAuthority.getPriId(),primaryAuthority.getPriAuthority());
					primaryAuthority2.getSecondAuthorities().add(secondAuthority2);
					authorityList.add(primaryAuthority2);
				}else {
					boolean primaryAuthorityAlready = false ;
					boolean secondAuthorityAlready = false ;
					for(int i = 0 ;i<authorityList.size();i++){
						PrimaryAuthority primaryAuthority3 = authorityList.get(i);
						if(primaryAuthority3.getPriId()==primaryAuthority.getPriId()){
							primaryAuthorityAlready = true ;
							Set<SecondAuthority> secondAuthorities = primaryAuthority3.getSecondAuthorities();
							for(SecondAuthority secondAuthority3:secondAuthorities){
								if(secondAuthority3.getSecId()==secondAuthority.getSecId()){
									secondAuthorityAlready = true ;
								}
							}
							if(secondAuthorityAlready==false){
								SecondAuthority secondAuthority4 = new SecondAuthority(secondAuthority.getSecId(),secondAuthority.getSecAuthority());
								authorityList.get(i).getSecondAuthorities().add(secondAuthority4);
							}
						}
					}
					if(primaryAuthorityAlready==false){
						SecondAuthority secondAuthority2 = new SecondAuthority(secondAuthority.getSecId(),secondAuthority.getSecAuthority());
						PrimaryAuthority primaryAuthority2 = new PrimaryAuthority(primaryAuthority.getPriId(),primaryAuthority.getPriAuthority());
						primaryAuthority2.getSecondAuthorities().add(secondAuthority2);
						authorityList.add(primaryAuthority2);
					}
				}
				
			}
			ActionContext.getContext().put("authorityList",authorityList);
			ActionContext.getContext().getSession().put("user", userInDB);
			
			return "success";
		} catch (Exception e) {
			this.addFieldError(ERROR, "用户名或密码错误，请重新登录");
			return "login";
		}
	}
	public String getThirdAuthorityById() {
		Map map =ActionContext.getContext().getParameters();
		String[] strings = (String[])map.get("secId");
		User user = (User)ActionContext.getContext().getSession().get("user");
		List<ThirdAuthority> thirdAuthorities = this.thirdAuthorityService.getThirdAuthoritiesBySecId(strings[0]);
		List<ThirdAuthority> thirdAuthorities2=new ArrayList<ThirdAuthority>();
		for(ThirdAuthority thirdAuthority:thirdAuthorities){
			if(this.userAuthorityService.getThirdAuthorityByUserIdAndThiId(user.getUserId(), thirdAuthority.getThiId())!=null){
				thirdAuthorities2.add(this.userAuthorityService.getThirdAuthorityByUserIdAndThiId(user.getUserId(), thirdAuthority.getThiId()));
			}
		}
		ActionContext.getContext().put("thirdAuthorities",thirdAuthorities2);
		return "showThirdAuthorities";
	}
}
