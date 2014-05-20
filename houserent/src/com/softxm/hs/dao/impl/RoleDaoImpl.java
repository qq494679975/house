package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.RoleDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tmenu;
import com.softxm.hs.model.Trole;

@Repository
public class RoleDaoImpl extends BaseDao implements RoleDao {

	@Override
	public PageModel getRoles(int currentPage, int pageSize, Trole trole) {
		StringBuilder queryHql = new StringBuilder(
				"select u from Trole u where 1=1 and u.risdel='0'");
		StringBuilder countHql = new StringBuilder(
				"select count(u) from Trole u where 1=1 and u.risdel='0'");
		StringBuilder whereHql = new StringBuilder();
		String orderHql = " order by u.rname";
		List paramList = new ArrayList();
		if (trole != null) {
			if (trole.getRname() != null
					&& trole.getRname().trim().length() > 0) {
				whereHql.append(" and u.rname like ?");
				paramList.add("%" + trole.getRname().trim() + "%");
			}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public void newRole(Trole trole) {
		trole.setRisdel("0");
		for (int i = 0; i < trole.getRoles().size(); i++) {
			Tmenu m = new Tmenu();
			m.setMid(trole.getRoles().get(i));
			trole.getTmenus().add(m);
		}
		saveObject(trole);
	}

	@Override
	public Trole getRole(Long rid) {

		return (Trole) queryOneObject(
				"select tr from Trole tr left join tr.tmenus where tr.rid= ?",
				rid);
	}

	@Override
	public void updateRole(Trole trole) {
		trole.setRisdel("0");
		for (int i = 0; i < trole.getRoles().size(); i++) {
			Tmenu m = new Tmenu();
			m.setMid(trole.getRoles().get(i));
			trole.getTmenus().add(m);
		}
		updateAll(trole);
	}

	@Override
	public void deleteRole(Trole trole) {
		noRealDelete("update Trole t set t.risdel = '1' where t.rid = "
				+ trole.getRid());
	}

	@Override
	public List<Trole> getAllRoles() {

		return queryObjects("from Trole t where t.risdel='0'");
	}

	@Override
	public boolean roleIsOnly(String rname) {
		Long count = (Long) queryOneObject(
				"select count(t) from Trole t where t.risdel='0' and t.rname=?",
				rname);
		if (count == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean roleIsOnly(String rname, Long rid) {
		Long count = (Long) queryOneObject(
				"select count(t) from Trole t where t.risdel='0' and t.rname=? and t.rid !=?",
				rname, rid);
		if (count == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean islive(Long rid) {
		List params = new ArrayList();
		params.add(rid);

		int count = queryForInt("select count(*) from user_role where rid = ?",
				params);
		if (count != 0) {
			return true;
		} else {
			return false;
		}
	}

}
