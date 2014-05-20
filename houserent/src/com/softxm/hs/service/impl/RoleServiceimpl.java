package com.softxm.hs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.MenuDao;
import com.softxm.hs.dao.RoleDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tmenu;
import com.softxm.hs.model.Trole;
import com.softxm.hs.service.RoleService;

@Service
public class RoleServiceimpl implements RoleService{
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private MenuDao menuDao;

	@Override
	public PageModel getRoles(int currentPage, int pageSize, Trole trole) {
		return roleDao.getRoles( currentPage,  pageSize,  trole);
	}

	@Override
	public List<Tmenu> getAllMenus() {
		List<Tmenu> menus = menuDao.getAllMenu();
		return menus;
	}

	@Override
	public void newRole(Trole trole) {
		roleDao.newRole(trole);
	}

	@Override
	public Trole getRole(Long rid) {
		return roleDao.getRole(rid);
	}

	@Override
	public void updateRole(Trole trole) {
		roleDao.updateRole(trole);
	}


	

	@Override
	public String deleteRole(Trole trole) {
		if(roleDao.islive(trole.getRid()))
		{
			return "不能删除正在使用的角色";
		}
		roleDao.deleteRole(trole);
		return "删除成功";
	}

	@Override
	public boolean roleIsOnly(String rname) {
		// TODO Auto-generated method stub
		return roleDao.roleIsOnly(rname);
	}

	@Override
	public boolean roleIsOnly(String rname, Long rid) {
		// TODO Auto-generated method stub
		return roleDao.roleIsOnly(rname,rid);
	}

	
}
