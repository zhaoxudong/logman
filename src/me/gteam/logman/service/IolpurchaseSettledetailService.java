package me.gteam.logman.service;

import java.io.Serializable;
import java.util.Collection;

import me.gteam.logman.domain.IolpurchaseSettledetail;

public interface IolpurchaseSettledetailService {

	public void saveIolpurchaseSettledetail(IolpurchaseSettledetail iolpurchaseSettledetail);

	public void updateIolpurchaseSettledetail(IolpurchaseSettledetail iolpurchaseSettledetail);

	public void deleteIolpurchaseSettledetailByID(Serializable id,String deleteMode);

	public Collection<IolpurchaseSettledetail> getAllIolpurchaseSettledetail();

	public IolpurchaseSettledetail getIolpurchaseSettledetailById(Serializable id);
}