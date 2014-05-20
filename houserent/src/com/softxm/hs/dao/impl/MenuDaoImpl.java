package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.MenuDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.Tmenu;

@Repository
public class MenuDaoImpl extends BaseDao implements MenuDao {

	@Override
	public List<Tmenu> getAllMenu(Long uiid) {
		// select u from Userinfo u join u.roles as r where
		// m.troles.tuserinfos.uiid=?
		List<Tmenu> menus = queryObjects(
				"select m from Tmenu m join m.troles as r join r.tuserinfos as u where u.uiid=? order by m.mfatherid,m.morder asc",
				uiid);
		return menus;
	}

	@Override
	public List<Tmenu> getAllMenu() {
		List menus = queryObjects("select t from Tmenu t where t.misdel = '0'  order by t.mfatherid,t.morder asc");
		return menus;
	}

	@Override
	public List<Tmenu> getFatherMenu() {
		List menus = queryObjects("select t from Tmenu t where t.mfatherid=0 and t.misdel = '0' ");
		return menus;
	}

	@Override
	public void newMenu(Tmenu tmenu) {
		tmenu.setMisdel("0");
		saveObject(tmenu);
	}

	@Override
	public Long getMaxmorder(Long mfatherid) {
		Long num = (Long) queryOneObject(
				"select max(t.morder) from Tmenu t where t.misdel='0' and t.mfatherid = ?",
				mfatherid);
		return num;
	}

	@Override
	public Tmenu getOneMenu(Long mid) {

		return (Tmenu) queryOneObject("from Tmenu t where t.mid = ?", mid);
	}

	@Override
	public void updateMenu(Tmenu tmenu) {
		String hql = "update Tmenu t set t.mname =" + tmenu.getMname()
				+ " where t.mid = " + tmenu.getMid();
		updateSome(hql);
	}

	@Override
	public void deleteBigMenu(Long mid) {
		String hql = "update Tmenu t set t.misdel = '1' where t.mid = " + mid;
		noRealDelete(hql);
	}

	@Override
	public void deleteSmallMenu(Long mid) {
		String hql = "update Tmenu t set t.misdel = '1' where t.mfatherid = "
				+ mid;
		noRealDelete(hql);
	}

	@Override
	public Long getMaxMenu(Tmenu tmenu) {
		String hql = "select max(t.morder) from Tmenu t where t.mfatherid = ? and t.morder < ? and t.misdel = '0'";
		return (Long) queryOneObject(hql, tmenu.getMfatherid(),
				tmenu.getMorder());
	}

	@Override
	public void changeMenu(Tmenu tmenu, Long temp) {
		String hql = " update Tmenu t set t.morder = " + tmenu.getMorder()
				+ " where t.mfatherid =" + tmenu.getMfatherid()
				+ " and t.morder = " + temp;
		updateSome(hql);
	}

	@Override
	public void changeMenu(Long temp, Long mid) {
		String hql = "update Tmenu t set t.morder =" + temp + "where t.mid="
				+ mid;
		updateSome(hql);
	}

	@Override
	public Long getMinMenu(Tmenu tmenu) {
		String hql = "select min(t.morder) from Tmenu t where t.mfatherid = ? and t.morder > ? and t.misdel = '0'";
		return (Long) queryOneObject(hql, tmenu.getMfatherid(),
				tmenu.getMorder());
	}

	@Override
	public boolean menuIsOnly(Long mfatherid, String mname) {
		Long count = (Long) queryOneObject(
				"select count(t) from Tmenu t where t.misdel = '0' and t.mfatherid= ? and t.mname = ?",
				mfatherid, mname);
		if (count == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean menuIsOnly(Long mfatherid, String mname, Long mid) {
		System.out.println(mfatherid);
		System.out.println(mname);
		System.out.println(mid);
		Long count = (Long) queryOneObject(
				"select count(t) from Tmenu t where t.misdel = '0' and t.mfatherid= ? and t.mname = ? and t.mid!= ?",
				mfatherid, mname,mid);
		if (count == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean islive(Long mid) {
		 List params = new ArrayList();
		 params.add(mid);
		int count = queryForInt("select count(*) from menurole where mid=? ", params);
		if(count!=0)
			return true;
		else
		return false;
	}

}
