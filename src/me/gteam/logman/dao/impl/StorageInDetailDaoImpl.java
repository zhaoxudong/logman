package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.StorageInDetailDao;
import me.gteam.logman.domain.StorageInDetail;

@Repository("storageInDetailDao")
public class StorageInDetailDaoImpl extends BaseDaoImpl<StorageInDetail> implements StorageInDetailDao<StorageInDetail>{

}