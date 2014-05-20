package com.softxm.hs.service;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Thousemoney;
import com.softxm.hs.model.Tuserinfo;

public interface HouseMService {

	PageModel getHouseList(Thousemoney thousemoney, int currentPage,
			int pageSize);

	List<Tuserinfo> getAllUser();

	void newHouseM(Thousemoney thousemoney);

	Thousemoney getHouseMById(Long hmid);

	void updateHouseM(Thousemoney thousemoney);

	void delHouseM(Long hmid);

	String isReviceHouseMoney(Long hmid);

	PageModel getPersonHouse(Thousemoney thousemoney, int currentPage,
			int pageSize);

	List<Thousemoney> getAllHouse();

	List<Thousemoney> getAllHouseByUserId(Long uiid);

}
