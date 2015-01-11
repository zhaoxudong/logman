package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.OilinventoryDao;
import me.gteam.logman.domain.Oilinventory;

@Repository("oilinventoryDao")
public class OilinventoryDaoImpl extends BaseDaoImpl<Oilinventory> implements OilinventoryDao<Oilinventory>{

}