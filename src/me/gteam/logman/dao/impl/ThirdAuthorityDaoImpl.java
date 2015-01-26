package me.gteam.logman.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.ThirdAuthorityDao;
import me.gteam.logman.domain.ThirdAuthority;

@Repository("thirdAuthorityDao")
public class ThirdAuthorityDaoImpl extends BaseDaoImpl<ThirdAuthority> implements ThirdAuthorityDao<ThirdAuthority>{
	@Override
	public List<ThirdAuthority> getThirdAuthoritiesBySecId(String secId) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from ThirdAuthority thirdAuthority where thirdAuthority.secondAuthority.secId="+secId);
	}
}