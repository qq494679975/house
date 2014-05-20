package com.softxm.hs.service;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Telectricmoney;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.model.Twatermoney;

public interface ElectricMoneyService {

	PageModel electricmoneyList(int currentPage, int pageSize,
			Telectricmoney telectricmoney);

	Telectricmoney getElectricById(Long emid);

	List<Tuserinfo> getUsernamelist();

	void newElec(Telectricmoney telectricmoney);

	void delElec(Long emid);

	String isrevice(Long emid);

	void UpdtaetElectric(Telectricmoney telectricmoney);

	PageModel getPersonList(int currentPage, int pageSize,
			Telectricmoney telectricmoney);

	List<Telectricmoney> getAllWaterByUserId(Long uiid);

	List<Telectricmoney> getAllWater();

	List<Telectricmoney> getData(Long uiid);

}
