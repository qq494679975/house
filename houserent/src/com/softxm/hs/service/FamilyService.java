package com.softxm.hs.service;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tdictionary;
import com.softxm.hs.model.Tuserfamily;

public interface FamilyService {

	List<Tuserfamily> getAllFamilies(Long uiid);

	List<Tdictionary> getFamilyRole();

	void newFamily(Tuserfamily tuserfamily);

	Tuserfamily getFamilyById(Long ufid);

	void updateFamily(Tuserfamily tuserfamily);

	void deleteFamily(Long ufid);

	List<Tdictionary> getFamilyDic();

	PageModel getAllFamilyList(int currentPage, int pageSize,
			Tuserfamily tuserfamily);

}
