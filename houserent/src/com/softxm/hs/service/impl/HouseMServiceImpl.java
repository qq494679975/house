package com.softxm.hs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.HouseMDao;
import com.softxm.hs.dao.UserDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Thousemoney;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.service.HouseMService;

@Service
public class HouseMServiceImpl implements HouseMService{

	@Autowired
	private HouseMDao houseMDao;
	@Autowired
	private UserDao userDao;
	@Override
	public PageModel getHouseList(Thousemoney thousemoney, int currentPage,
			int pageSize) {
		// TODO Auto-generated method stub
		return houseMDao.getHouseList( thousemoney,  currentPage,
				 pageSize);
	}

	@Override
	public List<Tuserinfo> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public void newHouseM(Thousemoney thousemoney) {
		houseMDao.newHouseM(thousemoney);
	}

	@Override
	public Thousemoney getHouseMById(Long hmid) {
		// TODO Auto-generated method stub
		return houseMDao.getHouseMById( hmid);
	}

	@Override
	public void updateHouseM(Thousemoney thousemoney) {
		houseMDao.updateHouseM( thousemoney);
	}

	@Override
	public void delHouseM(Long hmid) {
		houseMDao.delHouseM( hmid);
	}

	@Override
	public String isReviceHouseMoney(Long hmid) {
		Tuserinfo tuserinfo = userDao.getUserByHmid(hmid);
		
		Thousemoney thousemoney = houseMDao.getHouseMById( hmid);
		
		double money = tuserinfo.getUimoney()-thousemoney.getHmmoney();
		if(money<0)
		{
			return "账户余额不足";
		}
		
		userDao.updateMoney(tuserinfo.getUiid(), money);
		
		return houseMDao.isReviceHouseMoney(hmid);
	}

	@Override
	public PageModel getPersonHouse(Thousemoney thousemoney, int currentPage,
			int pageSize) {
		// TODO Auto-generated method stub
		return houseMDao.getPersonHouse( thousemoney,  currentPage,
				 pageSize) ;
	}

	@Override
	public List<Thousemoney> getAllHouse() {
		
		return houseMDao.getAllHouse();
	}

	@Override
	public List<Thousemoney> getAllHouseByUserId(Long uiid) {
		// TODO Auto-generated method stub
		return houseMDao.getAllHouseByUserId( uiid);
	}
}
