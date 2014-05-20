package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.Tdictionary;

public interface DictionaryDao {

	List<Tdictionary> getAllDictionary();

	List<Tdictionary> getFatherDictionary();

	void newDictionary(Tdictionary tdictionary);

	Tdictionary getOneDictionary(Long ddid);

	void updateDic(Tdictionary tdictionary);

	void delSonDic(Long ddid);

	void deldic(Long ddid);

	List<Tdictionary> getFamilyDic();

	boolean dicIsOnly(Long dfatherid,String dname);

	boolean dicIsOnly(Long dfatherid, String trim, Long ddid);

}
