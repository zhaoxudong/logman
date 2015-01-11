package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.ShouldReceivepay;

public interface ShouldReceivepayService {

	public void saveShouldReceivepay(ShouldReceivepay shouldReceivepay);

	public void updateShouldReceivepay(ShouldReceivepay shouldReceivepay);

	public void deleteShouldReceivepayByID(Serializable id,String deleteMode);

	public Collection<ShouldReceivepay> getAllShouldReceivepay();

	public ShouldReceivepay getShouldReceivepayById(Serializable id);
}