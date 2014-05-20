package com.softxm.hs.service;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tnotice;
import com.softxm.hs.model.Tnoticeattach;

public interface NoticeService {

	PageModel getAllNotice(int currentPage,int pageSize,Tnotice tnotice);

	void saveNotice(Tnotice tnotice);

	Tnotice getNoticeById(Long long1);

	String deleteAttach(Long nnoticeid, Long attachs);

	Tnoticeattach getAttach(Long attachs);

	void updateNotice(Tnotice tnotice);

	List<String> deleteNotice(Long nnoticeid);

	void passNotice(Tnotice tnotice);

	PageModel getPersonNoticePM(int currentPage, int pageSize, Tnotice tnotice);

	Tnotice getPersonNoticeById(Tnotice tnotice);

}
