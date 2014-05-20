package com.softxm.hs.dao;

import java.util.List;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tnotice;
import com.softxm.hs.model.Tnoticeattach;

public interface NoticeDao {

	PageModel getAllNotice(int currentPage,int pageSize,Tnotice tnotice);

	void save(Tnotice tnotice);

	Tnotice getNoticeById(Long uuid);

	String deleteAttach(Long attachs);

	int getAttachNum(Long nnoticeid);

	void updateAttachNum(Long nnoticeid);

	Tnoticeattach getAttachById(Long attachs);

	void updateNotice(Tnotice tnotice);

	List<String> deleteNotice(Long nnoticeid);

	void passNotice(Tnotice tnotice);

	PageModel getPersonNoticePM(int currentPage, int pageSize, Tnotice tnotice);

	void updateRead(Long uiid, Long nnoticeid);

}
