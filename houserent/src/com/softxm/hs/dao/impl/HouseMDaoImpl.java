package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.HouseMDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Thousemoney;
import com.softxm.hs.model.Tuserinfo;
@Repository
public class HouseMDaoImpl extends BaseDao implements HouseMDao{

	@Override
	public PageModel getHouseList(Thousemoney thousemoney, int currentPage,
			int pageSize) {
		StringBuilder countHql = new StringBuilder(
				"select count(tw) from Thousemoney tw join tw.tuserinfo tu where 1=1");
		List paramList = new ArrayList();
		String orderHql = new String(" order by tw.husertime desc");
		StringBuilder whereHql = new StringBuilder();
		StringBuilder queryHql = new StringBuilder(
				"select tw  from Thousemoney tw join tw.tuserinfo tu  where 1=1");
		if (thousemoney != null) {
			if (thousemoney.getUiusername() != null
					&& thousemoney.getUiusername().length() > 0) {
				whereHql.append(" and tu.uiusername like ?");
				paramList.add("%" + thousemoney.getUiusername() + "%");
			}
			if (thousemoney.getStarttime() != null) {
				whereHql.append(" and tw.husertime > ?");
				paramList.add(thousemoney.getStarttime());
			}
			if (thousemoney.getEndtime() != null) {
				whereHql.append(" and tw.husertime < ?");
				paramList.add(thousemoney.getEndtime());
			}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public void newHouseM(Thousemoney thousemoney) {
		Tuserinfo tuserinfo = new Tuserinfo();
		tuserinfo.setUiid(thousemoney.getUiid());
		
		thousemoney.setTuserinfo(tuserinfo);
		thousemoney.setHusertime(new Date());
		saveObject(thousemoney);
	}

	@Override
	public Thousemoney getHouseMById(Long hmid) {
	
		return	(Thousemoney) queryOneObject("from Thousemoney t where t.hmid = ?", hmid);
	}

	@Override
	public void updateHouseM(Thousemoney thousemoney) {
		updateAll(thousemoney);
	}

	@Override
	public void delHouseM(Long hmid) {
		deleteObejct("delete Thousemoney t where t.hmid = ?", hmid);
	}

	@Override
	public String isReviceHouseMoney(Long hmid) {
		updateSome("update Thousemoney t set t.hmtime = sysdate where t.hmid = ?", hmid);
		return "房租缴费成功";
	}

	@Override
	public PageModel getPersonHouse(Thousemoney thousemoney, int currentPage,
			int pageSize) {
		StringBuilder countHql = new StringBuilder(
				"select count(tw) from Thousemoney tw join tw.tuserinfo tu where 1=1 and tu.uiid= ?");
		List paramList = new ArrayList();
		String orderHql = new String(" order by tw.husertime desc");
		StringBuilder whereHql = new StringBuilder();
		StringBuilder queryHql = new StringBuilder(
				"select tw  from Thousemoney tw join tw.tuserinfo tu  where 1=1 and tu.uiid= ?");
		paramList.add(thousemoney.getUiid());
		if (thousemoney != null) {
			if (thousemoney.getStarttime() != null) {
				whereHql.append(" and tw.husertime > ?");
				paramList.add(thousemoney.getStarttime());
			}
			if (thousemoney.getEndtime() != null) {
				whereHql.append(" and tw.husertime < ?");
				paramList.add(thousemoney.getEndtime());
			}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public List<Thousemoney> getAllHouse() {
		return queryObjects("select t from Thousemoney t join t.tuserinfo tu where tu.uiisdel='0' order by tu.uiid");
	}

	@Override
	public List<Thousemoney> getAllHouseByUserId(Long uiid) {
		return queryObjects("select t from Thousemoney t join t.tuserinfo e where e.uiid =? order by t.husertime desc", uiid);
	}

}
