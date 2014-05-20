package com.softxm.hs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.EmailDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.EMailUser;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Temail;
import com.softxm.hs.model.Temailattach;
import com.softxm.hs.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
	@Autowired
	private EmailDao emailDao;

	@Override
	public List<EMailUser> queryAllDD() {

		return emailDao.queryAllDD();
	}

	@Override
	public PageModel queryEMailUserModel(Object userid, EMailUser emailuser,
			int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return emailDao.queryEMailUserModel(userid, emailuser, currentPage,
				pageSize);
	}

	@Override
	public void saveEMail(Temail temail) {
		emailDao.saveEMail(temail);
	}

	@Override
	public void saveEMailTemp(Temail temail) {
		emailDao.saveEMailTemp(temail);
	}

	@Override
	public PageModel querySendEmail(Object userid, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return emailDao.querySendEmail(userid, currentPage, pageSize);
	}

	@Override
	public PageModel queryDraftEmail(Long uiid, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return emailDao.queryDraftEmail(uiid, currentPage, pageSize);
	}

	@Override
	public PageModel queryGcEMail(Long uiid, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return emailDao.queryGcEMail(uiid, currentPage, pageSize);
	}

	@Override
	public PageModel queryReceieveEmail(Long uiid, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return emailDao.queryReceieveEmail(uiid, currentPage, pageSize);
	}

	@Override
	public Temail queryEMail(Long eid) {

		return emailDao.queryEMail(eid);
	}

	@Override
	public void delEmail(Long umid) {
		// TODO Auto-generated method stub
		emailDao.delEmail(umid);
	}

	@Override
	public void saveDEMail(Temail temail) {
		emailDao.saveDEMail(temail);
	}

	@Override
	public void delAttcha(Long eaid) {
		emailDao.delAttcha( eaid);
	}

	@Override
	public Temailattach getEMaileAttachById(Long eaid) {
		// TODO Auto-generated method stub
		return emailDao.getEMaileAttachById(eaid);
	}

	@Override
	public void relEmail(long parseLong) {
		emailDao.relEmail(parseLong);
	}

	@Override
	public void delFakeEmail(long parseLong) {
		emailDao.delFakeEmail(parseLong);
	}

	@Override
	public void changeRead(Long umid) {
		emailDao.changeRead(umid);
	}

	@Override
	public void FWEMail(Temail temail) {
		emailDao.FWEMail(temail);
	}
}
