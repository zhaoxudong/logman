package me.gteam.logman.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.gteam.logman.dao.UserDao;
import me.gteam.logman.domain.User;
import me.gteam.logman.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource(name="userDao")
	private UserDao userDao;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.saveEntry(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateEntry(user);
	}

	@Override
	public void deleteUserByID(Serializable id, String deleteMode) {
		// TODO Auto-generated method stub
		this.userDao.deleteEntry(id);
	}

	@Override
	public Collection<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.userDao.getAllEntry();
	}

	@Override
	public User getUserById(Serializable id) {
		// TODO Auto-generated method stub
		return this.getUserById(id);
	}

	@Override
	public User getUserByName(String name) {
		List list = this.userDao.getEntryByName(name);
		User user=(User)list.get(0);
		return user;
	}
	
	
	

}
