package me.gteam.logman.dao.impl;

import me.gteam.logman.dao.SecondAuthorityDao;
import me.gteam.logman.domain.SecondAuthority;

import org.springframework.stereotype.Repository;

@Repository("secondAuthorityDao")
public class SecondAuthorityDaoImpl extends BaseDaoImpl<SecondAuthority> implements SecondAuthorityDao<SecondAuthority>{

}
