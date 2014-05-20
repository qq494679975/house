package com.softxm.hs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.MenuDao;
import com.softxm.hs.model.Tmenu;
import com.softxm.hs.service.MenuService;

@Service
public class MenuServiceimpl implements MenuService {
	@Autowired
	private MenuDao dao;

	@Override
	public List<Tmenu> getAllMenu(Long uiid) {
		return dao.getAllMenu(uiid);
	}

	@Override
	public List<Tmenu> getAllMenu() {
		// TODO Auto-generated method stub
		return dao.getAllMenu();
	}

	@Override
	public List<Tmenu> getFatherMenu() {
		// TODO Auto-generated method stub
		return dao.getFatherMenu();
	}

	@Override
	public void newMenu(Tmenu tmenu) {
		if (tmenu.getMfatherid() != null) {
			Long maxmorder = dao.getMaxmorder(tmenu.getMfatherid());
			if (maxmorder == null) {
				maxmorder = 0L;
			}
			tmenu.setMorder(maxmorder + 1L);
		}
		dao.newMenu(tmenu);
	}

	@Override
	public Tmenu getOneMenu(Long mid) {

		return dao.getOneMenu(mid);
	}

	@Override
	public void updateMenu(Tmenu tmenu) {
		dao.updateMenu(tmenu);
	}

	@Override
	public String delMenu(Tmenu tmenu) {
		if(dao.islive(tmenu.getMid()))
		{
			return "不能删除正在使用的菜单";
		}
		if (tmenu.getMfatherid() == 0) {
			
			dao.deleteSmallMenu(tmenu.getMid());
		}
		dao.deleteBigMenu(tmenu.getMid());
		return "删除成功";
	}

	@Override
	public void upMenu(Tmenu tmenu) {
		
		Long temp = dao.getMaxMenu(tmenu);

		dao.changeMenu(tmenu, temp);

		dao.changeMenu(temp, tmenu.getMid());

	}

	@Override
	public void downMenu(Tmenu tmenu) {
		Long temp= dao.getMinMenu(tmenu);
		
		dao.changeMenu(tmenu, temp);

		dao.changeMenu(temp, tmenu.getMid());
	}

	@Override
	public boolean menuIsOnly(Long mfatherid, String mname) {
		// TODO Auto-generated method stub
		return dao.menuIsOnly(mfatherid,mname);
	}

	@Override
	public boolean menuIsOnly(Long mfatherid, String mname, Long mid) {
		
		return dao.menuIsOnly(mfatherid,mname,mid);
	}
}
