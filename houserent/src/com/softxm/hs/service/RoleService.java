package com.softxm.hs.service;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tmenu;
import com.softxm.hs.model.Trole;

public interface RoleService {

	PageModel getRoles(int currentPage, int pageSize, Trole trole);

	List<Tmenu> getAllMenus();

	void newRole(Trole trole);

	Trole getRole(Long rid);

	void updateRole(Trole trole);

	String deleteRole(Trole trole);

	boolean roleIsOnly(String rname);

	boolean roleIsOnly(String rname, Long rid);


	

}
