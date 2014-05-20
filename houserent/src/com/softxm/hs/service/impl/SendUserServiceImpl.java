package com.softxm.hs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.SendUserDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tsenduser;
import com.softxm.hs.service.SendUserService;

@Service
public class SendUserServiceImpl implements SendUserService{
	@Autowired
	private SendUserDao sendUserDao;

	@Override
	public String saveSendUser(Tsenduser tsenduser) {
		return sendUserDao.saveSendUser(tsenduser);
	}

	@Override
	public PageModel sendUserList(int currentPage, int pageSize,
			Tsenduser tsenduser) {
		
		return sendUserDao.sendUserList( currentPage,  pageSize,
				 tsenduser);
	}

	@Override
	public void sendUserPass(Tsenduser tsenduser) {
		sendUserDao.sendUserPass( tsenduser);
	}

	@Override
	public Tsenduser getSendUserOrder(Long suid) {
		// TODO Auto-generated method stub
		return sendUserDao.getSendUserOrder( suid);
	}

	@Override
	public void deleteSendUserOrder(Long suid) {
		sendUserDao.deleteSendUserOrder( suid);
	}
}
