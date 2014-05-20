package com.softxm.hs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.DictionaryDao;
import com.softxm.hs.dao.FamilyDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tdictionary;
import com.softxm.hs.model.Tuserfamily;
import com.softxm.hs.service.FamilyService;

@Service
public class FamilyServiceImpl implements FamilyService {
	@Autowired
	private FamilyDao familyDao;
	@Autowired
	private DictionaryDao dictionaryDao;

	@Override
	public List<Tuserfamily> getAllFamilies(Long uiid) {
		// TODO Auto-generated method stub
		return familyDao.getAllFamilies(uiid);
	}

	@Override
	public List<Tdictionary> getFamilyRole() {
		// TODO Auto-generated method stub
		return familyDao.getFamilyRole();
	}

	@Override
	public void newFamily(Tuserfamily tuserfamily) {
		familyDao.newFamily(tuserfamily);
	}

	@Override
	public Tuserfamily getFamilyById(Long ufid) {
		// TODO Auto-generated method stub
		return familyDao.getFamilyById(ufid);
	}

	@Override
	public void updateFamily(Tuserfamily tuserfamily) {
		familyDao.updateFamily(tuserfamily);
	}

	@Override
	public void deleteFamily(Long ufid) {
		familyDao.deleteFamily(ufid);
	}

	@Override
	public List<Tdictionary> getFamilyDic() {
		// TODO Auto-generated method stub
		return dictionaryDao.getFamilyDic();
	}

	@Override
	public PageModel getAllFamilyList(int currentPage, int pageSize,
			Tuserfamily tuserfamily) {
		// TODO Auto-generated method stub
		return familyDao.getAllFamilyList(currentPage, pageSize, tuserfamily);
	}
}
