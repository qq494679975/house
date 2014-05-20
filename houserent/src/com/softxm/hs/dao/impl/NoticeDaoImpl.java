package com.softxm.hs.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.NoticeDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tnotice;
import com.softxm.hs.model.Tnoticeattach;

@Repository
public class NoticeDaoImpl extends BaseDao implements NoticeDao {

	@Override
	public PageModel getAllNotice(int currentPage, int pageSize, Tnotice tnotice) {
		StringBuilder queryHql = new StringBuilder(
				"select u from Tnotice u where 1=1 ");
		StringBuilder countHql = new StringBuilder(
				"select count(u) from Tnotice u where 1=1 ");
		StringBuilder whereHql = new StringBuilder();
		String orderHql = " order by u.nrelestime desc ";
		List paramList = new ArrayList();
		if (tnotice != null) {
			if (tnotice.getNtitle() != null
					&& tnotice.getNtitle().trim().length() > 0) {
				whereHql.append(" and u.ntitle like ? ");
				paramList.add("%" + tnotice.getNtitle().trim() + "%");
			}
		}

		return queryPageModel(currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public void save(Tnotice tnotice) {
		saveObject(tnotice);
	}

	@Override
	public Tnotice getNoticeById(Long uuid) {
		return (Tnotice) queryOneObject("from Tnotice t where t.nnoticeid = ?",
				uuid);
	}

	@Override
	public String deleteAttach(Long attachs) {
		String a = (String) queryOneObject(
				"select t.naurl from Tnoticeattach t where t.naattachid=?",
				attachs);
		System.out.println(a);
		deleteObejct("delete Tnoticeattach t where t.naattachid=? ", attachs);
		return a;
	}

	@Override
	public int getAttachNum(Long nnoticeid) {
		System.out.println(nnoticeid);
		Long a = (Long) queryOneObject(
				"select count(t) from Tnoticeattach t where t.nnoticeid=?",
				nnoticeid);
		System.out.println(a);
		return Integer.valueOf(a.toString());
	}

	@Override
	public void updateAttachNum(Long nnoticeid) {
		updateSome("update Tnotice t set t.nhasattach='0' where t.nnoticeid="
				+ nnoticeid);
	}

	@Override
	public Tnoticeattach getAttachById(Long attachs) {
		// TODO Auto-generated method stub
		System.out.println(attachs);
		return (Tnoticeattach) queryOneObject(
				"select t from Tnoticeattach t where t.naattachid= ?", attachs);
	}

	@Override
	public void updateNotice(Tnotice tnotice) {
		updateAll(tnotice);
	}

	@Override
	public List<String> deleteNotice(Long nnoticeid) {
		List<String> url = queryObjects(
				"select t.naurl from Tnoticeattach t where t.nnoticeid=?",
				nnoticeid);
		deleteObejct("delete from Tnoticeattach t where t.nnoticeid=?",
				nnoticeid);
		deleteObejct("delete from Tnotice t where t.nnoticeid=?", nnoticeid);
		return url;
	}

	@Override
	public void passNotice(Tnotice tnotice) {
		deleteObejct(
				"update Tnotice t set t.tuuiid=?,t.ispass=? ,t.npasstime= ? where t.nnoticeid =?",
				tnotice.getTuuiid(), tnotice.getIspass(), new java.util.Date(),
				tnotice.getNnoticeid());
		if (tnotice.getIspass().equals("1")) {
			List<Long> userids = queryObjects("select t.uiid from Tuserinfo t where t.uiisdel='0'");
			System.out.println(userids);
			for (int i = 0; i < userids.size(); i++) {
				useSqlUpdate("insert into tusernotice values (?,?,?)", userids
						.get(i), tnotice.getNnoticeid(), '0');
			}
		}
	}

	@Override
	public PageModel getPersonNoticePM(int currentPage, int pageSize,
			Tnotice tnotice) {
		StringBuilder queryHql = new StringBuilder(
				"select u.ntitle,u.npasstime,u.nouttime,u.nnoticeid,t1.idread,t2.uiusername "
						+ " from tnotice u "
						+ " join tusernotice t1 on u.nnoticeid=t1.nnoticeid "
						+ " join tuserinfo t2 on u.uiid=t2.uiid where 1=1 and t1.uiid="+tnotice.getUiid()+"and u.nouttime >=to_date(to_char(sysdate,'yyyy-mm-dd'),'yyyy-mm-dd')");
		StringBuilder countHql = new StringBuilder("select count(*) "
				+ " from tnotice u "
				+ " join tusernotice t1 on u.nnoticeid=t1.nnoticeid "
				+ " join tuserinfo t2 on u.uiid=t2.uiid where 1=1 and t1.uiid="+tnotice.getUiid()+"and u.nouttime >=to_date(to_char(sysdate,'yyyy-mm-dd'),'yyyy-mm-dd')");
		StringBuilder whereHql = new StringBuilder();
		StringBuilder orderHql = new StringBuilder(" order by u.nistop,u.nouttime desc");
		List paramList = new ArrayList();
		if (tnotice != null) {
			if (tnotice.getNtitle() != null
					&& tnotice.getNtitle().trim().length() > 0) {
				whereHql.append(" and u.ntitle like ? ");
				paramList.add("%" + tnotice.getNtitle().trim() + "%");
			}
			if (tnotice.getStarttime() != null) {
				whereHql.append(" and u.nouttime >= ?");
				paramList.add(tnotice.getStarttime());
			}
			
			if (tnotice.getEndtime() != null) {
				whereHql.append(" and u.nouttime <= ?");
				paramList.add(tnotice.getEndtime());
			}
		}
		
		return queryForPageModel(Tnotice.class,currentPage, pageSize, queryHql, countHql,
				whereHql, orderHql, paramList);
	}

	@Override
	public void updateRead(Long uiid, Long nnoticeid) {
		useSqlUpdate("update tusernotice set idread=1 where nnoticeid ="+nnoticeid+" and uiid = "+uiid);
	}
}
