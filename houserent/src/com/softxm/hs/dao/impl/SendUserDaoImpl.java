package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.SendUserDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tsenduser;

@Repository
public class SendUserDaoImpl extends BaseDao implements SendUserDao {

	@Override
	public String saveSendUser(Tsenduser tsenduser) {
		tsenduser.setSutime(new Date());
		tsenduser.setSustatus("0");
		saveObject(tsenduser);
		return "true";
	}

	@Override
	public PageModel sendUserList(int currentPage, int pageSize,
			Tsenduser tsenduser) {
		StringBuilder queryHql = new StringBuilder(
				"select u from Tsenduser u where 1=1 ");
		StringBuilder countHql = new StringBuilder(
				"select count(u) from Tsenduser u where 1=1 ");
		StringBuilder whereHql = new StringBuilder();
		String orderHql = " order by u.sustatus,u.sutime desc ";
		List paramList = new ArrayList();
		if (tsenduser != null) {
			if (tsenduser.getSuusername() != null
					&& tsenduser.getSuusername().trim().length() > 0) {
				whereHql.append(" and u.suusername like ? ");
				paramList.add("%" + tsenduser.getSuusername().trim() + "%");
			}
			if (tsenduser.getStarttime() != null) {
				whereHql.append(" and u.sutime >= ?");
				paramList.add(tsenduser.getStarttime());
			}

			if (tsenduser.getEndtime() != null) {
				whereHql.append(" and u.sutime <= ?");
				paramList.add(tsenduser.getEndtime());
			}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public void sendUserPass(Tsenduser tsenduser) {
		updateSome("update Tsenduser t set t.uiid=" + tsenduser.getUiid()
				+ ",t.supasstime=sysdate,t.sustatus='"
				+ tsenduser.getSustatus() + "' where t.suid="
				+ tsenduser.getSuid());
	}

	@Override
	public Tsenduser getSendUserOrder(Long suid) {
		List params = new ArrayList();
		params.add(suid);
		Tsenduser temp=null;
		try{
			temp=(Tsenduser)queryForJavaBean(
					"select t.*,tu.uiusername from tsenduser t join tuserinfo tu on t.uiid=tu.uiid where t.suid=?",
					Tsenduser.class,params );
		}catch(Exception e){
			temp=(Tsenduser)queryForJavaBean(
					"select t.* from tsenduser t where t.suid=?",
					Tsenduser.class,params );
		}
		
		return temp;
	}

	@Override
	public void deleteSendUserOrder(Long suid) {
		deleteObejct("delete Tsenduser where suid = ?", suid);
	}
}
