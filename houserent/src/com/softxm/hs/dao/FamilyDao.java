package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tdictionary;
import com.softxm.hs.model.Tuserfamily;

public interface FamilyDao {

	List<Tuserfamily> getAllFamilies(Long uiid);

	List<Tdictionary> getFamilyRole();

	void newFamily(Tuserfamily tuserfamily);

	Tuserfamily getFamilyById(Long ufid);

	void updateFamily(Tuserfamily tuserfamily);

	void deleteFamily(Long ufid);

	PageModel getAllFamilyList(int currentPage, int pageSize,
			Tuserfamily tuserfamily);

}
