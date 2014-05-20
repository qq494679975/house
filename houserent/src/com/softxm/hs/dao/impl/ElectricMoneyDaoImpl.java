package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.ElectricMoneyDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Telectricmoney;
import com.softxm.hs.model.Twatermoney;

@Repository
public class ElectricMoneyDaoImpl extends BaseDao implements ElectricMoneyDao {

	@Override
	public PageModel electricmoneyList(int currentPage, int pageSize,
			Telectricmoney telectricmoney) {
		StringBuilder countHql = new StringBuilder(
				"select count(tw) from Telectricmoney tw join tw.tuserinfo tu where 1=1");
		List paramList = new ArrayList();
		String orderHql = new String(" order by tw.emusertime desc");
		StringBuilder whereHql = new StringBuilder();
		StringBuilder queryHql = new StringBuilder(
				"select tw  from Telectricmoney tw join tw.tuserinfo tu  where 1=1");
		if (telectricmoney != null) {
			if (telectricmoney.getUiusername() != null
					&& telectricmoney.getUiusername().length() > 0) {
				whereHql.append(" and tu.uiusername like ?");
				paramList.add("%" + telectricmoney.getUiusername() + "%");
			}
			if (telectricmoney.getStarttime() != null) {
				whereHql.append(" and tw.emusertime > ?");
				paramList.add(telectricmoney.getStarttime());
			}
			if (telectricmoney.getEndtime() != null) {
				whereHql.append(" and tw.emusertime < ?");
				paramList.add(telectricmoney.getEndtime());
			}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public Telectricmoney getElectricById(Long emid) {
		return (Telectricmoney) queryOneObject(
				" select t from Telectricmoney t where t.emid = ? ", emid);
	}

	@Override
	public void delElec(Long emid) {
		deleteObejct("delete Telectricmoney t where t.emid = ?", emid);
	}

	@Override
	public void isrevice(Long emid) {
		updateSome("update Telectricmoney t set t.emtime=sysdate where t.emid = "
				+ emid);
	}

	@Override
	public void UpdtaetElectric(Telectricmoney telectricmoney) {
		updateSome(
				"update Telectricmoney t set t.emnum = ?,t.emmoney = ? where t.emid = ?",
				telectricmoney.getEmnum(), telectricmoney.getEmnum()
						* telectricmoney.getEmmoneybyone(), telectricmoney
						.getEmid());
	}

	@Override
	public PageModel getPersonList(int currentPage, int pageSize,
			Telectricmoney telectricmoney) {
		StringBuilder countHql = new StringBuilder(
				"select count(tw) from Telectricmoney tw join tw.tuserinfo tu where 1=1 and tu.uiid=?");
		List paramList = new ArrayList();
		String orderHql = new String(" order by tw.emusertime desc");
		StringBuilder whereHql = new StringBuilder();
		StringBuilder queryHql = new StringBuilder(
				"select tw  from Telectricmoney tw join tw.tuserinfo tu  where 1=1 and tu.uiid=?");
		paramList.add(telectricmoney.getUiid());
		if (telectricmoney != null) { 
			if (telectricmoney.getStarttime() != null) {
				whereHql.append(" and tw.emusertime > ?");
				paramList.add(telectricmoney.getStarttime());
			}
			if (telectricmoney.getEndtime() != null) {
				whereHql.append(" and tw.emusertime < ?");
				paramList.add(telectricmoney.getEndtime());
			}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public List<Telectricmoney> getAllWaterByUserId(Long uiid) {
		// TODO Auto-generated method stub
		return queryObjects("select t from Telectricmoney t join t.tuserinfo tu where tu.uiid=? order by t.emusertime desc", uiid);
	}

	@Override
	public List<Telectricmoney> getAllWater() {
		// TODO Auto-generated method stub
		return queryObjects("select t from Telectricmoney t join t.tuserinfo tu where tu.uiisdel='0' order by tu.uiid");
	}

	@Override
	public List<Telectricmoney> getData(Long uiid) {
		List params = new ArrayList();
		params.add(uiid);
		List<Telectricmoney> a =queryForJavaBeanList("select * from (select m.*, rownum num from ( " +
				"select * from telectricmoney t join tuserinfo tu on t.uiid=tu.uiid where tu.uiid = ?  order by emusertime desc" +
				") m where rownum <=10) where num >0", Telectricmoney.class, params);
		return a;
	}

}
