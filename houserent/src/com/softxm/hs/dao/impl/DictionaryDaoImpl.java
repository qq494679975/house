package com.softxm.hs.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.DictionaryDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.Tdictionary;
@Repository
public class DictionaryDaoImpl  extends BaseDao implements DictionaryDao {

	@Override
	public List<Tdictionary> getAllDictionary() {
		String hql="from Tdictionary t where t.ddel = '0'";
		return queryObjectsEhCache(hql);
	}

	@Override
	public List<Tdictionary> getFatherDictionary() {
		String hql="from Tdictionary t where t.dfatherid = 0 and t.ddel = '0'";
		return queryObjects(hql);
	}

	@Override
	public void newDictionary(Tdictionary tdictionary) {
		tdictionary.setDdel("0");
		saveObject(tdictionary);
	}

	@Override
	public Tdictionary getOneDictionary(Long ddid) {
		// TODO Auto-generated method stub
		return (Tdictionary) queryOneObject("from Tdictionary where did = ?", ddid);
	}

	@Override
	public void updateDic(Tdictionary tdictionary) {
		tdictionary.setDdel("0");
		updateAll(tdictionary);
	}

	@Override
	public void delSonDic(Long ddid) {
		String hql = "update Tdictionary t set t.ddel= '1' where t.dfatherid = "+ddid;
		noRealDelete(hql);
		 hql = "update Tdictionary t set t.ddel= '1' where t.ddid = "+ddid;
		noRealDelete(hql);
	}

	@Override
	public void deldic(Long ddid) {
		String hql = "update Tdictionary t set t.ddel= '1' where t.ddid = "+ddid;
		noRealDelete(hql);
	}

	@Override
	public List<Tdictionary> getFamilyDic() {
		String hql = "from Tdictionary t where  t.ddel= '0' and t.dfatherid = 1" ;
		return queryObjects(hql);
	}

	@Override
	public boolean dicIsOnly(Long dfatherid,String dname) {
		long count = (Long) queryOneObject("select count(t) from Tdictionary t where  t.ddel= '0'and t.dfatherid = ? and t.dname = ?", dfatherid,dname);
		if(count==0)
		return true;
		else 
		return false;
	}

	@Override
	public boolean dicIsOnly(Long dfatherid, String trim, Long ddid) {
		long count = (Long) queryOneObject("select count(t) from Tdictionary t where  t.ddel= '0'and t.dfatherid = ? and t.dname = ? and t.ddid != ?", dfatherid,trim,ddid);
		if(count==0)
		return true;
		else 
		return false;
	}

}
