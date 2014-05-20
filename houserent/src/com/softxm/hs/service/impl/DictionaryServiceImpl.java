package com.softxm.hs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.DictionaryDao;
import com.softxm.hs.dao.UserDao;
import com.softxm.hs.model.Tdictionary;
import com.softxm.hs.service.DictionaryService;

@Service
public class DictionaryServiceImpl implements DictionaryService {
	@Autowired
	private DictionaryDao dictionaryDao;
	@Autowired
	private UserDao userDao;

	@Override
	public List<Tdictionary> getAllDictionary() {

		return dictionaryDao.getAllDictionary();
	}

	@Override
	public List<Tdictionary> getFatherDictionary() {
		// TODO Auto-generated method stub
		return dictionaryDao.getFatherDictionary();
	}

	@Override
	public void newDictionary(Tdictionary tdictionary) {
		dictionaryDao.newDictionary(tdictionary);
	}

	@Override
	public Tdictionary getOneDictionary(Long ddid) {
		// TODO Auto-generated method stub
		return dictionaryDao.getOneDictionary(ddid);
	}

	@Override
	public void update(Tdictionary tdictionary) {
		dictionaryDao.updateDic(tdictionary);
	}

	@Override
	public String deleteDic(Tdictionary tdictionary) {
		if (tdictionary.getDfatherid() == 0L) {
			if (userDao.getFatherFamilyType(tdictionary.getDdid())) {
				dictionaryDao.delSonDic(tdictionary.getDdid());
				return "删除成功";
			}
			return "删除失败，该数据字典正在使用中";
		}
		if (userDao.getFamilyType(tdictionary.getDdid())) {
			dictionaryDao.deldic(tdictionary.getDdid());
			return "删除成功";
		}
		return "删除失败，该数据字典正在使用中";
	}

	@Override
	public List<Tdictionary> getFamilyDic() {

		return dictionaryDao.getFamilyDic();
	}

	@Override
	public boolean dicIsOnly(Long dfatherid, String dname) {

		return dictionaryDao.dicIsOnly(dfatherid, dname);

	}

	@Override
	public boolean dicIsOnly(String trim, Long dfatherid, Long ddid) {
		// TODO Auto-generated method stub
		return dictionaryDao.dicIsOnly(dfatherid, trim, ddid);
	}
}
