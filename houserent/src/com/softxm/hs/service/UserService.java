package com.softxm.hs.service;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Trole;
import com.softxm.hs.model.Ttip;
import com.softxm.hs.model.Tuserinfo;

public interface UserService {
	/**
	 * 利用用户名查找用户
	 * 参数：用户名
	 */
	Tuserinfo getUserByUserName(String uiusername);


	PageModel getUserList(int currentPage, int pageSize, Tuserinfo tuserinfo);


	List<Trole> getAllRoles();


	void newUser(Tuserinfo tuserinfo);


	Tuserinfo getUserByUserId(Long uiid);


	void updateUser(Tuserinfo tuserinfo);


	void deleteUser(Tuserinfo tuserinfo);


	void updateLock(Tuserinfo tuserinfo);


	int queryEmailNum(Long uiid);


	int queryNoticeNum(Long uiid);


	Ttip getuserTip(Long uiid);


	void updateUserTip(Ttip ttip);


	void updatePassword(String newpassword, Long uiid);


	void updateUserMessage(Tuserinfo tuserinfo);


	boolean userIsLive(String uiusername);


	String addmoney(Tuserinfo tuserinfo);


	void changeMoneyZero(Long uiid);

}
