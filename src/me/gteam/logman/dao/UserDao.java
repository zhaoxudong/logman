package me.gteam.logman.dao;

import java.util.List;

public interface UserDao<T> extends  BaseDao<T>{
	public List<T> getEntryByName(String name);
}
