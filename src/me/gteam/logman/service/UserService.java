package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.User;

public interface UserService {
	public void saveUser(User user);

	public void updateUser(User user);

	public void deleteUserByID(Serializable id,String deleteMode);

	public Collection<User> getAllUsers();

	public User getUserById(Serializable id);
	
	public User getUserByName(String name);
}
