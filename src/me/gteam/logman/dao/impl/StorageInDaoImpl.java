package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.StorageInDao;
import me.gteam.logman.domain.StorageIn;

@Repository("storageInDao")
public class StorageInDaoImpl extends BaseDaoImpl<StorageIn> implements StorageInDao<StorageIn>{

}