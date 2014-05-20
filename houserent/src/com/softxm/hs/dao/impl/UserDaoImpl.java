package com.softxm.hs.dao.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.UserDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Telectricmoney;
import com.softxm.hs.model.Ttip;
import com.softxm.hs.model.Tuserinfo;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

	public Tuserinfo getUserByUserName(String uiusername) {

		return (Tuserinfo) queryOneObject("select t from Tuserinfo t where t.uiusername=? ", uiusername);
	}

	@Override
	public PageModel getUserList(int currentPage, int pageSize, Tuserinfo tuserinfo) {
		StringBuilder queryHql = new StringBuilder("select u from Tuserinfo u where 1=1 and u.uiisdel='0' ");
		StringBuilder countHql = new StringBuilder("select count(u) from Tuserinfo u where 1=1 and u.uiisdel='0' ");
		StringBuilder whereHql = new StringBuilder();
		String orderHql = " order by u.uiusername";
		List paramList = new ArrayList();
		if (tuserinfo != null) {
			if (tuserinfo.getUiusername() != null && tuserinfo.getUiusername().trim().length() > 0) {
				whereHql.append(" and u.uiusername like ? ");
				paramList.add("%" + tuserinfo.getUiusername().trim() + "%");
			}
			if (tuserinfo.getUirealname() != null && tuserinfo.getUirealname().trim().length() > 0) {
				whereHql.append(" and u.uirealname like ? ");
				paramList.add("%" + tuserinfo.getUirealname().trim() + "%");
			}
			if (tuserinfo.getUifamilytype() != null && !tuserinfo.getUifamilytype().equals("0")) {
				whereHql.append(" and u.uifamilytype = ? ");
				paramList.add(tuserinfo.getUifamilytype());
			}
		}

		return queryPageModel(currentPage, pageSize, queryHql, countHql, whereHql, orderHql, paramList);
	}

	@Override
	public void newUser(Tuserinfo tuserinfo) {
		Serializable i = saveObjectReturnId(tuserinfo);
		tuserinfo.getTtip().setTid((Long) i);
		saveObject(tuserinfo.getTtip());
	}

	@Override
	public Tuserinfo getUserByUserId(Long uiid) {
		System.out.println(uiid);
		return (Tuserinfo) queryOneObject("from Tuserinfo where uiid = ?", uiid);
	}

	@Override
	public void updateUser(Tuserinfo tuserinfo) {
		updateAll(tuserinfo);
		updateSome("update Tuserinfo t set t.uiemail= '" + tuserinfo.getUiemail() + "',t.uifamilytype= '" + tuserinfo.getUifamilytype() + "',t.uifrom = '" + tuserinfo.getUifrom() + "',t.uiphone= '" + tuserinfo.getUiphone() + "',t.uirealname= '" + tuserinfo.getUirealname() + "' where t.uiid= " + tuserinfo.getUiid());
	}

	@Override
	public void deleteUser(Tuserinfo tuserinfo) {
		noRealDelete("update Tuserinfo t set t.uiisdel='1' where t.uiid = " + tuserinfo.getUiid());
	}

	@Override
	public void lockUser(Long uiid, String string) {
		noRealDelete("update Tuserinfo t set t.uiislock='" + string + "' where t.uiid = " + uiid);
	}

	@Override
	public int queryEmailNum(Long uiid) {
		// queryOneObject("select count(t) from ", objects1);
		List params = new ArrayList();
		params.add(uiid);
		int num = queryForInt(" select count(*) from tuseremail where umaddress='2' and umisread = '0' and uiid = ?", params);
		return num;
	}

	@Override
	public int queryNoticeNum(Long uiid) {
		BigDecimal num = (BigDecimal) useSqlQuery("select count(*) from tusernotice where idread='0' and uiid = ?", uiid);
		return num.intValue();
	}

	@Override
	public Ttip getUserTip(Long uiid) {
		return (Ttip) queryOneObject("from Ttip t where t.tid = ?", uiid);
	}

	@Override
	public void updateUserTip(Ttip ttip) {
		updateAll(ttip);
	}

	@Override
	public void updatePassword(String newpassword, Long uiid) {
		updateSome("update Tuserinfo t set t.uipassword ='" + newpassword + "' where t.uiid = " + uiid);
	}

	@Override
	public void updateUserMessage(Tuserinfo tuserinfo) {
		updateSome("update Tuserinfo t set t.uiemail='" + tuserinfo.getUiemail() + "',t.uiphone='" + tuserinfo.getUiphone() + "',t.uirealname='" + tuserinfo.getUirealname() + "',t.uifrom='" + tuserinfo.getUifrom() + "' where t.uiid = " + tuserinfo.getUiid());
	}

	@Override
	public List<Tuserinfo> getAllUser() {
		return queryObjects("select t from Tuserinfo t where t.uiisdel='0' ");
	}

	@Override
	public void newElec(Telectricmoney telectricmoney) {
		telectricmoney.setEmmoney(telectricmoney.getEmmoneybyone() * telectricmoney.getEmnum());// 设置钱数
		Tuserinfo tuserinfo = new Tuserinfo();
		tuserinfo.setUiid(telectricmoney.getUiid());// 设置uiid
		telectricmoney.setTuserinfo(tuserinfo);
		telectricmoney.setEmusertime(new Date());// 设置时间
		saveObject(telectricmoney);
	}

	@Override
	public boolean userIsLive(String uiusername) {
		long count = (Long) queryOneObject("select count(t) from Tuserinfo t where  t.uiisdel= '0' and t.uiusername = ?", uiusername);
		if (count == 0)
			return true;
		else
			return false;
	}

	@Override
	public String addMoney(Tuserinfo tuserinfo) {
		updateSome("update Tuserinfo t set t.uimoney=?  where t.uiusername = ? and t.uiisdel= '0'", tuserinfo.getUimoney(), tuserinfo.getUiusername());
		return "充值成功";
	}

	@Override
	public Tuserinfo getUserByEmid(Long emid) {

		return (Tuserinfo) queryOneObject("select t from Tuserinfo t join t.telectricmoneies e where e.emid=?", emid);
	}

	@Override
	public void updateMoney(Long uiid, double money) {
		updateSome("update Tuserinfo t set t.uimoney = ? where t.uiid = ?", money, uiid);
	}

	@Override
	public Tuserinfo getUserByWmid(Long wmid) {
		return (Tuserinfo) queryOneObject("select t from Tuserinfo t join t.twatermoneies e where e.wmid=?", wmid);

	}

	@Override
	public Tuserinfo getUserByHmid(Long hmid) {
		return (Tuserinfo) queryOneObject("select t from Tuserinfo t join t.thousemoneies e where e.hmid=?", hmid);

	}

	@Override
	public void changeMoneyZero(Long uiid) {
		updateSome("update Tuserinfo t set t.uimoney=0  where t.uiid = ?", uiid);
	}

	@Override
	public boolean getFamilyType(Long ddid) {
		List params = new ArrayList();
		params.add(ddid);
		int num1 = queryForInt("select count(*) from tuserinfo where uifamilytype = ?", params);
		int num2 = queryForInt("select count(*) from tuserfamily where ufrole = ?", params);
		
		if (num1+num2 > 0)
		{
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean getFatherFamilyType(Long ddid) {
		List params = new ArrayList();
		params.add(ddid);
		int num1 = queryForInt("select count(*) from tuserinfo t where t.uifamilytype in (select did from tdictionary where dfatherid = ?) ", params);
		int num2 = queryForInt("select count(*) from tuserfamily t where t.ufrole in (select did from tdictionary where dfatherid = ?) ", params);
		
		if (num1+num2 > 0)
		{
			return false;
		} else {
			return true;
		}
	}
}
