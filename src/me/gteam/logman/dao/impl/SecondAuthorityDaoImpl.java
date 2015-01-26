package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.SecondAuthorityDao;
import me.gteam.logman.domain.SecondAuthority;

@Repository("secondAuthorityDao")
public class SecondAuthorityDaoImpl extends BaseDaoImpl<SecondAuthority> implements SecondAuthorityDao<SecondAuthority>{

}