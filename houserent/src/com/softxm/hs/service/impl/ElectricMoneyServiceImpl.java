package com.softxm.hs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.ElectricMoneyDao;
import com.softxm.hs.dao.UserDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Telectricmoney;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.model.Twatermoney;
import com.softxm.hs.service.ElectricMoneyService;

@Service
public class ElectricMoneyServiceImpl implements ElectricMoneyService {
	@Autowired
	private ElectricMoneyDao electricMoneyDao;
	@Autowired
	private UserDao userDao;

	@Override
	public PageModel electricmoneyList(int currentPage, int pageSize,
			Telectricmoney telectricmoney) {
		// TODO Auto-generated method stub
		return electricMoneyDao.electricmoneyList(currentPage, pageSize,
				telectricmoney);
	}

	@Override
	public Telectricmoney getElectricById(Long emid) {
		// TODO Auto-generated method stub
		return electricMoneyDao.getElectricById(emid);
	}

	@Override
	public List<Tuserinfo> getUsernamelist() {
		return userDao.getAllUser();
	}

	@Override
	public void newElec(Telectricmoney telectricmoney) {
		userDao.newElec(telectricmoney);
	}

	@Override
	public void delElec(Long emid) {
		electricMoneyDao.delElec(emid);
	}

	@Override
	public String  isrevice(Long emid) {
		Tuserinfo tuserinfo = userDao.getUserByEmid(emid);
		
		Telectricmoney telectricmoney = electricMoneyDao.getElectricById(emid);
		
		double money = tuserinfo.getUimoney()-telectricmoney.getEmmoney();
		
		if(money<0)
		{
			return "用户余额不足";
		}
		else
		{
			userDao.updateMoney(tuserinfo.getUiid(),money);
		}
		electricMoneyDao.isrevice(emid);
		return "缴费成功";
	}

	@Override
	public void UpdtaetElectric(Telectricmoney telectricmoney) {
		electricMoneyDao.UpdtaetElectric(telectricmoney);
	}

	@Override
	public PageModel getPersonList(int currentPage, int pageSize,
			Telectricmoney telectricmoney) {
		// TODO Auto-generated method stub
		return electricMoneyDao.getPersonList(currentPage, pageSize,
				telectricmoney);
	}

	@Override
	public List<Telectricmoney> getAllWaterByUserId(Long uiid) {
		return electricMoneyDao.getAllWaterByUserId( uiid);
	}

	@Override
	public List<Telectricmoney> getAllWater() {
		return electricMoneyDao.getAllWater();
	}

	@Override
	public List<Telectricmoney> getData(Long uiid) {
		
		return electricMoneyDao.getData( uiid);
	}
}
