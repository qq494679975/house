package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.FamilyDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.FamilyTemp;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tdictionary;
import com.softxm.hs.model.Tuserfamily;

@Repository
public class FamilyDaoImpl extends BaseDao implements FamilyDao{

	@Override
	public List<Tuserfamily> getAllFamilies(Long uiid) {
		List params= new ArrayList();
		params.add(uiid);
		String sql ="select t.*,td.dname from tuserfamily t join tdictionary td on t.ufrole=td.did where t.uiid=?";
		return queryForJavaBeanList(sql, Tuserfamily.class, params);
	}

	@Override
	public List<Tdictionary> getFamilyRole() {
		return queryObjects("from Tdictionary t where t.dfatherid=6");
	}

	@Override
	public void newFamily(Tuserfamily tuserfamily) {
		saveObject(tuserfamily);
	}

	@Override
	public Tuserfamily getFamilyById(Long ufid) {
		
		return (Tuserfamily) queryOneObject("from Tuserfamily t where t.ufid=? ", ufid);
	}

	@Override
	public void updateFamily(Tuserfamily tuserfamily) {
		updateAll(tuserfamily);
	}

	@Override
	public void deleteFamily(Long ufid) {
		deleteObejct("delete Tuserfamily t where t.ufid =?",ufid);
	}

	@Override
	public PageModel getAllFamilyList(int currentPage, int pageSize,
			Tuserfamily tuserfamily) {
		StringBuilder querySql = new StringBuilder("select distinct t1.uiusername,t1.uiid,t1.uitime,t1.uiphone,t3.dname,t4.money " +
				" from tuserinfo t1  " +
				" join tdictionary t3 on t1.uifamilytype=t3.did " +
				" left join tuserfamily t2 on t1.uiid = t2.uiid  " +
				" left join (select sum(ufmoney) money,uiid from tuserfamily group by uiid) t4 on t1.uiid=t4.uiid where 1=1");
		StringBuilder countSql = new StringBuilder("select count(distinct t1.uiusername) " +
				" from tuserinfo t1  " +
				" join tdictionary t3 on t1.uifamilytype=t3.did " +
				" left join tuserfamily t2 on t1.uiid = t2.uiid  " +
				" left join (select sum(ufmoney) money,uiid from tuserfamily group by uiid) t4 on t1.uiid=t4.uiid where 1=1");
		StringBuilder whereSql = new StringBuilder();
		StringBuilder orderSql =new StringBuilder();
		List paramList = new ArrayList();
		
		if(tuserfamily!=null)
		{
			if(tuserfamily.getUiusername()!=null&&tuserfamily.getUiusername().trim().length()>0)
			{
				System.out.println(tuserfamily.getUiusername());
				whereSql.append(" and t1.uiusername like ? ");
				paramList.add("%"+tuserfamily.getUiusername()+"%");
			}
			if(tuserfamily.getUifamilytype()!=null&&!tuserfamily.getUifamilytype().trim().equals("0"))
			{
				
				whereSql.append(" and t3.did=? ");
				paramList.add(tuserfamily.getUifamilytype());
			}
		}
		return queryForPageModel(FamilyTemp.class, currentPage, pageSize, querySql, countSql, whereSql, orderSql, paramList);
	}

}
