package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.WaterMoneyDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.model.Twatermoney;
import com.softxm.hs.service.WaterMoneyService;

@Repository
public class WaterMoneyDaoImpl extends BaseDao implements WaterMoneyDao {
	@Autowired
	private WaterMoneyService waterMoneyService;

	@Override
	public PageModel getWatermoneyList(int currentPage, int pageSize,
			Twatermoney twatermoney) {
		StringBuilder countHql = new StringBuilder(
				"select count(tw) from Twatermoney tw join tw.tuserinfo tu where 1=1");
		List paramList = new ArrayList();
		String orderHql = new String(" order by tw.wmusertime desc");
		StringBuilder whereHql = new StringBuilder();
		StringBuilder queryHql = new StringBuilder(
				"select tw  from Twatermoney tw join tw.tuserinfo tu  where 1=1");
		if (twatermoney != null) {
			if (twatermoney.getUiusername() != null
					&& twatermoney.getUiusername().length() > 0) {
				whereHql.append(" and tu.uiusername like ?");
				paramList.add("%" + twatermoney.getUiusername() + "%");
			}
			if (twatermoney.getStarttime() != null) {
				whereHql.append(" and tw.wmusertime > ?");
				paramList.add(twatermoney.getStarttime());
			}
			if (twatermoney.getEndtime() != null) {
				whereHql.append(" and tw.wmusertime < ?");
				paramList.add(twatermoney.getEndtime());
			}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public void newWater(Twatermoney twatermoney) {
		Tuserinfo tuserinfo = new Tuserinfo();
		tuserinfo.setUiid(twatermoney.getUiid());

		twatermoney.setTuserinfo(tuserinfo);
		twatermoney.setWmmoney(twatermoney.getWmnum()
				* twatermoney.getOnewatermoney());
		twatermoney.setWmusertime(new Date());
		saveObject(twatermoney);
	}

	@Override
	public void isrevice(Long wmid) {
		updateSome(
				"update Twatermoney t set t.wmtime = sysdate where t.wmid=?",
				wmid);
	}

	@Override
	public void delWaterMoney(Long wmid) {
		deleteObejct("delete Twatermoney t where t.wmid=?", wmid);
	}

	@Override
	public Twatermoney getWaterMoneyById(Long wmid) {
		// TODO Auto-generated method stub
		return (Twatermoney) queryOneObject(
				"select t from Twatermoney t where t.wmid=? ", wmid);
	}

	@Override
	public void updateWater(Twatermoney twatermoney) {
		System.out.println(twatermoney.getWmnum());
		System.out.println(twatermoney.getWmnum()
				* twatermoney.getOnewatermoney());
		System.out.println(twatermoney.getWmid());
		updateSome(
				"update Twatermoney t set t.wmnum=?,t.wmmoney=? where t.wmid=?",
				twatermoney.getWmnum(), twatermoney.getWmnum()
						* twatermoney.getOnewatermoney(), twatermoney.getWmid());
	}

	@Override
	public PageModel getPersonWater(int currentPage, int pageSize,
			Twatermoney twatermoney) {
		StringBuilder countHql = new StringBuilder(
				"select count(tw) from Twatermoney tw join tw.tuserinfo tu where 1=1 and tu.uiid = ?");
		List paramList = new ArrayList();
		String orderHql = new String(" order by tw.wmusertime desc");
		StringBuilder whereHql = new StringBuilder();
		StringBuilder queryHql = new StringBuilder(
				"select tw  from Twatermoney tw join tw.tuserinfo tu  where 1=1 and tu.uiid = ?");
		paramList.add(twatermoney.getUiid());
		if (twatermoney != null) {
			if (twatermoney.getStarttime() != null) {
				whereHql.append(" and tw.wmusertime > ?");
				paramList.add(twatermoney.getStarttime());
			}
			if (twatermoney.getEndtime() != null) {
				whereHql.append(" and tw.wmusertime < ?");
				paramList.add(twatermoney.getEndtime());
			}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public List<Twatermoney> getAllWaterByUserId(Long uiid) {
		
		return queryObjects("select t from Twatermoney t join t.tuserinfo tu where tu.uiid = ? order by t.wmusertime desc", uiid);
	}

	@Override
	public List<Twatermoney> getAllWater() {
		// TODO Auto-generated method stub
		return queryObjects("select t from Twatermoney t join t.tuserinfo tu where tu.uiisdel = '0' order by tu.uiid ");
	}

	@Override
	public List<Twatermoney> getDate(Long uiid) {
		List params = new ArrayList();
		params.add(uiid);
		
		List<Twatermoney> a =queryForJavaBeanList("" +
				"select * from (select m.*, rownum num from ( " +
				"select * from twatermoney t join tuserinfo tu on t.uiid=tu.uiid where tu.uiid = ?  order by wmusertime desc" +
				") m where rownum <=10) where num >0", Twatermoney.class, params);
		return a;
	}
}
