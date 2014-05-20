package com.softxm.hs.service.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.RoleDao;
import com.softxm.hs.dao.UserDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Trole;
import com.softxm.hs.model.Ttip;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	@Autowired
	private RoleDao roleDao;

	public Tuserinfo getUserByUserName(String uiusername) {
		return dao.getUserByUserName(uiusername);
	}

	@Override
	public PageModel getUserList(int currentPage, int pageSize,
			Tuserinfo tuserinfo) {
		return dao.getUserList(currentPage, pageSize, tuserinfo);

	}

	@Override
	public List<Trole> getAllRoles() {
		// TODO Auto-generated method stub
		return roleDao.getAllRoles();
	}

	@Override
	public void newUser(Tuserinfo tuserinfo) {
		Set<String> role = tuserinfo.getTroles();
		Set roles = new HashSet();
		Iterator<String> iterator = role.iterator();
		while (iterator.hasNext()) {
			Trole r = new Trole();
			r.setRid(Long.valueOf(iterator.next()));
			roles.add(r);
		}

		Ttip tip = new Ttip();
		tip.setTemail("0");
		tip.setTnorice("0");
		tip.setTshow("0");
		tip.setTtime(30);
		tip.setTuserinfo(tuserinfo);

		tuserinfo.setTroles(roles);
		tuserinfo.setTtip(tip);
		tuserinfo.setUiisdel("0");
		tuserinfo.setUiislock("0");
		tuserinfo.setUitime(new Date());
		dao.newUser(tuserinfo);
	}

	@Override
	public Tuserinfo getUserByUserId(Long uiid) {
		return dao.getUserByUserId(uiid);
	}

	@Override
	public void updateUser(Tuserinfo tuserinfo) {
		Set<String> role = tuserinfo.getTroles();
		Set roles = new HashSet();
		Iterator<String> iterator = role.iterator();
		while (iterator.hasNext()) {
			Trole r = new Trole();
			r.setRid(Long.valueOf(iterator.next()));
			roles.add(r);
		}
		tuserinfo.setTroles(roles);

		dao.updateUser(tuserinfo);
	}

	@Override
	public void deleteUser(Tuserinfo tuserinfo) {
		dao.deleteUser(tuserinfo);
	}

	@Override
	public void updateLock(Tuserinfo tuserinfo) {
		if (tuserinfo.getUiislock().equals("0")) {
			dao.lockUser(tuserinfo.getUiid(),"1");
		} else {
			dao.lockUser(tuserinfo.getUiid(),"0");
		}
	}

	@Override
	public int queryEmailNum(Long uiid) {
		return dao.queryEmailNum(uiid);
	}

	@Override
	public int queryNoticeNum(Long uiid) {
		return dao.queryNoticeNum(uiid);
	}

	@Override
	public Ttip getuserTip(Long uiid) {
		
		return dao.getUserTip(uiid);
	}

	@Override
	public void updateUserTip(Ttip ttip) {
		dao.updateUserTip(ttip);
	}

	@Override
	public void updatePassword(String newpassword, Long uiid) {
		dao.updatePassword( newpassword,  uiid);
	}

	@Override
	public void updateUserMessage(Tuserinfo tuserinfo) {
		dao.updateUserMessage(tuserinfo);
	}

	@Override
	public boolean userIsLive(String uiusername) {
		return dao.userIsLive( uiusername);
	}

	@Override
	public String addmoney(Tuserinfo tuserinfo) {
		String pw1 = tuserinfo.getUipassword();
		String pw2 = tuserinfo.getPasswordtemp();
		String username = tuserinfo.getUiusername();
		Tuserinfo temp=dao.getUserByUserName(username);
		if(temp==null)
		{
			return "用户不存在";
		}
		if(!pw1.equals(pw2))
		{
			return "两次密码不一致";
		}
		if(!temp.getUipassword().equals(pw1))
		{
			return "密码错误";
		}
		double money =temp.getUimoney()+tuserinfo.getUimoney();
		tuserinfo.setUimoney(money);
		return dao.addMoney(tuserinfo);
	}

	@Override
	public void changeMoneyZero(Long uiid) {
		dao.changeMoneyZero( uiid);
	}

}
