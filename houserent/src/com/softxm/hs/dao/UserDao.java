package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Telectricmoney;
import com.softxm.hs.model.Ttip;
import com.softxm.hs.model.Tuserinfo;

public interface UserDao {

	Tuserinfo getUserByUserName(String uiusername);

	PageModel getUserList(int currentPage, int pageSize, Tuserinfo tuserinfo);

	void newUser(Tuserinfo tuserinfo);

	Tuserinfo getUserByUserId(Long uiid);

	void updateUser(Tuserinfo tuserinfo);

	void deleteUser(Tuserinfo tuserinfo);

	void lockUser(Long uiid, String string);

	int queryNoticeNum(Long uiid);

	int queryEmailNum(Long uiid);

	Ttip getUserTip(Long uiid);

	void updateUserTip(Ttip ttip);

	void updatePassword(String newpassword, Long uiid);

	void updateUserMessage(Tuserinfo tuserinfo);

	List<Tuserinfo> getAllUser();

	void newElec(Telectricmoney telectricmoney);

	boolean userIsLive(String uiusername);

	String addMoney(Tuserinfo tuserinfo);

	Tuserinfo getUserByEmid(Long emid);

	void updateMoney(Long uiid, double money);

	Tuserinfo getUserByWmid(Long wmid);

	Tuserinfo getUserByHmid(Long hmid);

	void changeMoneyZero(Long uiid);

	boolean getFamilyType(Long ddid);

	boolean getFatherFamilyType(Long ddid);

}
