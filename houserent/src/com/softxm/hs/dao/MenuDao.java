package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.Tmenu;

public interface MenuDao {

	List<Tmenu> getAllMenu(Long uiid);

	List<Tmenu> getAllMenu();

	List<Tmenu> getFatherMenu();

	void newMenu(Tmenu tmenu);

	Long getMaxmorder(Long mfatherid);

	Tmenu getOneMenu(Long mid);

	void updateMenu(Tmenu tmenu);

	void deleteSmallMenu(Long mfatherid);

	void deleteBigMenu(Long mid);

	Long getMaxMenu(Tmenu tmenu);

	void changeMenu(Tmenu tmenu, Long temp);

	void changeMenu(Long temp, Long mid);

	Long getMinMenu(Tmenu tmenu);

	boolean menuIsOnly(Long mfatherid, String mname);

	boolean menuIsOnly(Long mfatherid, String mname, Long mid);

	boolean islive(Long mid);




}
