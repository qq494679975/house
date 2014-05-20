package com.softxm.hs.service;


import java.util.List;

import com.softxm.hs.model.Tmenu;

public interface MenuService {

	List<Tmenu> getAllMenu(Long uiid);

	List<Tmenu> getAllMenu();

	List<Tmenu> getFatherMenu();

	void newMenu(Tmenu tmenu);

	Tmenu getOneMenu(Long mid);

	void updateMenu(Tmenu tmenu);

	String delMenu(Tmenu tmenu);

	void upMenu(Tmenu tmenu);

	void downMenu(Tmenu tmenu);

	boolean menuIsOnly(Long mfatherid, String mname);

	boolean menuIsOnly(Long mfatherid, String mname, Long mid);
	
}
