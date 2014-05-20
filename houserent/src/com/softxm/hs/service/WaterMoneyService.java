package com.softxm.hs.service;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.model.Twatermoney;

public interface WaterMoneyService {

	PageModel getWatermoneyList(int currentPage, int pageSize,
			Twatermoney twatermoney);

	List<Tuserinfo> getAllUser();

	void newWater(Twatermoney twatermoney);

	String isrevice(Long wmid);

	void delWaterMoney(Long wmid);

	Twatermoney getWaterMoneyById(Long wmid);

	void updateWater(Twatermoney twatermoney);

	PageModel getPersonWater(int currentPage, int pageSize,
			Twatermoney twatermoney);

	List<Twatermoney> getAllWaterByUserId(Long uiid);

	List<Twatermoney> getAllWater();

	List<Twatermoney> getDate(Long uiid);

}
