package com.softxm.hs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.ContractDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tcontract;
import com.softxm.hs.service.ContractService;
@Service
public class ContractServiceImpl implements ContractService {
	@Autowired
	private ContractDao contractDao;

	@Override
	public PageModel contractList(int currentPage, int pageSize,
			Tcontract tcontract) {
		// TODO Auto-generated method stub
		return contractDao.contractList(currentPage, pageSize, tcontract);
	}

	@Override
	public void newContract(Tcontract tcontract) {
		contractDao.newContract( tcontract);
	}

	@Override
	public Tcontract getcontract(Long cid) {
		// TODO Auto-generated method stub
		return contractDao.getcontract( cid);
	}

	@Override
	public Tcontract getcontractByUiid(Long uiid) {
		// TODO Auto-generated method stub
		return contractDao.getcontractByUiid( uiid);
	}

	@Override
	public void delcontract(Long cid) {
		contractDao.delcontract(cid);
	}
}
