package com.softxm.hs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.UserDao;
import com.softxm.hs.dao.WaterMoneyDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.model.Twatermoney;
import com.softxm.hs.service.WaterMoneyService;

@Service
public class WaterMoneyServiceImpl implements WaterMoneyService {
	@Autowired
	private WaterMoneyDao waterMoneyDao;
	@Autowired
	private UserDao userDao;

	@Override
	public PageModel getWatermoneyList(int currentPage, int pageSize,
			Twatermoney twatermoney) {
		// TODO Auto-generated method stub
		return waterMoneyDao.getWatermoneyList(currentPage, pageSize,
				twatermoney);
	}

	@Override
	public List<Tuserinfo> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public void newWater(Twatermoney twatermoney) {
		waterMoneyDao.newWater(twatermoney);
	}

	@Override
	public String isrevice(Long wmid) {
		Tuserinfo tuserinfo = userDao.getUserByWmid(wmid);
		
		Twatermoney twatermoney = waterMoneyDao.getWaterMoneyById(wmid);
		
		double money = tuserinfo.getUimoney()-twatermoney.getWmmoney();
		if(money<0)
		{
			return "用户余额不足";
		}
		tuserinfo.setUimoney(money);
		
		userDao.updateMoney(tuserinfo.getUiid(), money);
		
		waterMoneyDao.isrevice(wmid);
		return "缴费成功";
	}

	@Override
	public void delWaterMoney(Long wmid) {
		waterMoneyDao.delWaterMoney(wmid);
	}

	@Override
	public Twatermoney getWaterMoneyById(Long wmid) {
		// TODO Auto-generated method stub
		return waterMoneyDao.getWaterMoneyById(wmid);
	}

	@Override
	public void updateWater(Twatermoney twatermoney) {
		waterMoneyDao.updateWater(twatermoney);
	}

	@Override
	public PageModel getPersonWater(int currentPage, int pageSize,
			Twatermoney twatermoney) {
		// TODO Auto-generated method stub
		return waterMoneyDao.getPersonWater(currentPage, pageSize, twatermoney);
	}

	@Override
	public List<Twatermoney> getAllWaterByUserId(Long uiid) {
		// TODO Auto-generated method stub
		return waterMoneyDao.getAllWaterByUserId(uiid);
	}

	@Override
	public List<Twatermoney> getAllWater() {
		// TODO Auto-generated method stub
		return waterMoneyDao.getAllWater();
	}

	@Override
	public List<Twatermoney> getDate(Long uiid) {
		// TODO Auto-generated method stub
		return waterMoneyDao.getDate( uiid);
	}
}
