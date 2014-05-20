package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Twatermoney;

public interface WaterMoneyDao {

	PageModel getWatermoneyList(int currentPage, int pageSize,
			Twatermoney twatermoney);

	void newWater(Twatermoney twatermoney);

	void isrevice(Long wmid);

	void delWaterMoney(Long wmid);

	Twatermoney getWaterMoneyById(Long wmid);

	void updateWater(Twatermoney twatermoney);

	PageModel getPersonWater(int currentPage, int pageSize,
			Twatermoney twatermoney);

	List<Twatermoney> getAllWaterByUserId(Long uiid);

	List<Twatermoney> getAllWater();

	List<Twatermoney> getDate(Long uiid);

}
