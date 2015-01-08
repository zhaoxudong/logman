package me.gteam.logman.dao.impl;

import me.gteam.logman.dao.PrimaryAuthorityDao;
import me.gteam.logman.domain.PrimaryAuthority;

import org.springframework.stereotype.Repository;

@Repository("primaryAuthorityDao")
public class PrimaryAuthorityDaoImpl extends BaseDaoImpl<PrimaryAuthority> implements PrimaryAuthorityDao<PrimaryAuthority>{

}
