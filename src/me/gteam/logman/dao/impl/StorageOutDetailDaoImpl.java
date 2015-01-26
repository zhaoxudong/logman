package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.StorageOutDetailDao;
import me.gteam.logman.domain.StorageOutDetail;

@Repository("storageOutDetailDao")
public class StorageOutDetailDaoImpl extends BaseDaoImpl<StorageOutDetail> implements StorageOutDetailDao<StorageOutDetail>{

}