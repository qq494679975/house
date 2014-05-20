package com.softxm.hs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softxm.hs.dao.NoticeDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tnotice;
import com.softxm.hs.model.Tnoticeattach;
import com.softxm.hs.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	NoticeDao noticeDao;

	@Override
	public PageModel getAllNotice(int currentPage,int pageSize,Tnotice tnotice) {
		// TODO Auto-generated method stub
		return noticeDao.getAllNotice(currentPage,pageSize,tnotice);
	}

	@Override
	public void saveNotice(Tnotice tnotice) {
		noticeDao.save(tnotice);
	}

	@Override
	public Tnotice getNoticeById(Long uuid) {
		// TODO Auto-generated method stub
		return noticeDao.getNoticeById(uuid);
	}

	@Override
	public String deleteAttach(Long nnoticeid, Long attachs) {
		String uerlname=noticeDao.deleteAttach(attachs);
		
		int count = noticeDao.getAttachNum(nnoticeid);
		
		if(count==0)
		{
			noticeDao.updateAttachNum(nnoticeid);
		}
		return uerlname;
	}

	@Override
	public Tnoticeattach getAttach(Long attachs) {
		// TODO Auto-generated method stub
		return noticeDao.getAttachById(attachs);
	}

	@Override
	public void updateNotice(Tnotice tnotice) {
		noticeDao.updateNotice(tnotice);
	}

	@Override
	public List<String> deleteNotice(Long nnoticeid) {
		// TODO Auto-generated method stub
		return noticeDao.deleteNotice(nnoticeid);
	}

	@Override
	public void passNotice(Tnotice tnotice) {
		noticeDao.passNotice(tnotice);
	}

	@Override
	public PageModel getPersonNoticePM(int currentPage, int pageSize,
			Tnotice tnotice) {
		// TODO Auto-generated method stub
		return noticeDao.getPersonNoticePM( currentPage,  pageSize,
				 tnotice);
	}

	@Override
	public Tnotice getPersonNoticeById(Tnotice tnotice) {
		noticeDao.updateRead(tnotice.getUiid(),tnotice.getNnoticeid());
		
		return noticeDao.getNoticeById(tnotice.getNnoticeid());
	}
}
