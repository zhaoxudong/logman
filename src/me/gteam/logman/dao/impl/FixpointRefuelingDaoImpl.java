package me.gteam.logman.dao.impl;

import org.springframework.stereotype.Repository;

import me.gteam.logman.dao.FixpointRefuelingDao;
import me.gteam.logman.domain.FixpointRefueling;

@Repository("fixpointRefuelingDao")
public class FixpointRefuelingDaoImpl extends BaseDaoImpl<FixpointRefueling> implements FixpointRefuelingDao<FixpointRefueling>{

}