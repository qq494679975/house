package com.softxm.hs.service;

import java.util.List;

import com.softxm.hs.model.Tdictionary;

public interface DictionaryService {

	List<Tdictionary> getAllDictionary();

	List<Tdictionary> getFatherDictionary();

	void newDictionary(Tdictionary tdictionary);

	Tdictionary getOneDictionary(Long ddid);

	void update(Tdictionary tdictionary);

	String deleteDic(Tdictionary tdictionary);

	List<Tdictionary> getFamilyDic();

	boolean dicIsOnly(Long dfatherid,String dname);

	boolean dicIsOnly(String trim, Long dfatherid, Long ddid);

}
