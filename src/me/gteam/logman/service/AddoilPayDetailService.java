package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.AddoilPayDetail;

public interface AddoilPayDetailService {

	public void saveAddoilPayDetail(AddoilPayDetail addoilPayDetail);

	public void updateAddoilPayDetail(AddoilPayDetail addoilPayDetail);

	public void deleteAddoilPayDetailByID(Serializable id,String deleteMode);

	public Collection<AddoilPayDetail> getAllAddoilPayDetail();

	public AddoilPayDetail getAddoilPayDetailById(Serializable id);
}