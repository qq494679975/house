package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.ContractDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.EMailUser;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tcontract;
import com.softxm.hs.model.Tuserinfo;
@Repository
public class ContractDaoImpl extends BaseDao implements ContractDao {

	@Override
	public PageModel contractList(int currentPage, int pageSize,
			Tcontract tcontract) {
		StringBuilder queryHql = new StringBuilder("select t from Tcontract t join t.tuserinfo where 1=1 ");
		StringBuilder countHql = new StringBuilder("select count(t) from Tcontract t join t.tuserinfo where 1=1 ");
		StringBuilder whereHql = new StringBuilder();
		String orderHql = new String();
		
		List paramList = new ArrayList();
		if (tcontract != null) {
				if(tcontract.getCuser()!=null&&tcontract.getCuser().trim().length()>0)
				{
					whereHql.append(" and t.cuser like ?");
					paramList.add("%"+tcontract.getCuser()+"%");
				}
				if(tcontract.getStarttime()!=null)
				{
					whereHql.append(" and t.cbegintime > ?");
					paramList.add(tcontract.getStarttime());
				}
				if(tcontract.getEndtime()!=null)
				{
					whereHql.append(" and t.cbegintime < ?");
					paramList.add(tcontract.getEndtime());
				}
		}
		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public void newContract(Tcontract tcontract) {
		Long uiid = (Long) queryOneObject("select t.uiid from Tuserinfo t where t.uiusername = ?", tcontract.getUiusername());
		Tuserinfo tuserinfo = new Tuserinfo();
		tuserinfo.setUiid(uiid);
		tcontract.setTuserinfo(tuserinfo);
		tcontract.setCbegintime(new Date());
		saveObject(tcontract);
	}

	@Override
	public Tcontract getcontract(Long cid) {
		
		return (Tcontract) queryOneObject("from Tcontract t where t.cid = ?", cid);
	}

	@Override
	public Tcontract getcontractByUiid(Long uiid) {
		// TODO Auto-generated method stub
		return (Tcontract) queryOneObject("from Tcontract t where t.tuserinfo.uiid = ?", uiid);
	}

	@Override
	public void delcontract(Long cid) {
		deleteObejct("delete Tcontract t where t.cid = ? ", cid);
	}

}
