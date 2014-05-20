package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Thousemoney;

public interface HouseMDao {

	PageModel getHouseList(Thousemoney thousemoney, int currentPage,
			int pageSize);

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
