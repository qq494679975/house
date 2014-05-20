package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Telectricmoney;
import com.softxm.hs.model.Twatermoney;

public interface ElectricMoneyDao {

	PageModel electricmoneyList(int currentPage, int pageSize,
			Telectricmoney telectricmoney);

	Telectricmoney getElectricById(Long emid);

	void delElec(Long emid);

	void isrevice(Long emid);

	void UpdtaetElectric(Telectricmoney telectricmoney);

	PageModel getPersonList(int currentPage, int pageSize,
			Telectricmoney telectricmoney);

	List<Telectricmoney> getAllWaterByUserId(Long uiid);

	List<Telectricmoney> getAllWater();

	List<Telectricmoney> getData(Long uiid);


}
