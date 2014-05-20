package com.softxm.hs.service;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tcontract;

public interface ContractService {

	PageModel contractList(int currentPage, int pageSize, Tcontract tcontract);

	void newContract(Tcontract tcontract);

	Tcontract getcontract(Long cid);

	Tcontract getcontractByUiid(Long uiid);

	void delcontract(Long cid);

}
