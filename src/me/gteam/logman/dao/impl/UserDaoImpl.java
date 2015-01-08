package me.gteam.logman.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.UserDao;
import me.gteam.logman.domain.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao<User>{

	public List getEntryByName(String name) {
		
		return this.hibernateTemplate.find("from User user where user.userName='"+name+"'");
	
	}
}
