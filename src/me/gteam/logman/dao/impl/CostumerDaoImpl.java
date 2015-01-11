package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.CostumerDao;
import me.gteam.logman.domain.Costumer;

@Repository("costumerDao")
public class CostumerDaoImpl extends BaseDaoImpl<Costumer> implements CostumerDao<Costumer>{

}