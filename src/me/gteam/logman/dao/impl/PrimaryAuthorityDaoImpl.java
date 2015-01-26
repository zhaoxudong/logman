package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.PrimaryAuthorityDao;
import me.gteam.logman.domain.PrimaryAuthority;

@Repository("primaryAuthorityDao")
public class PrimaryAuthorityDaoImpl extends BaseDaoImpl<PrimaryAuthority> implements PrimaryAuthorityDao<PrimaryAuthority>{

}