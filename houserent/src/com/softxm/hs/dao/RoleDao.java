package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Trole;

public interface RoleDao {

	PageModel getRoles(int currentPage, int pageSize, Trole trole);

	void newRole(Trole trole);

	Trole getRole(Long rid);

	void updateRole(Trole trole);

	void deleteRole(Trole trole);

	List<Trole> getAllRoles();

	boolean roleIsOnly(String rname);

	boolean roleIsOnly(String rname, Long rid);

	boolean islive(Long rid);


}
