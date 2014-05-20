package com.softxm.hs.dao.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.softxm.hs.dao.EmailDao;
import com.softxm.hs.dao.common.BaseDao;
import com.softxm.hs.model.EMailPageModelTemp;
import com.softxm.hs.model.EMailUser;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Temail;
import com.softxm.hs.model.Temailattach;

@Repository
public class EmailDaoImpl extends BaseDao implements EmailDao {

	@Override
	public List<EMailUser> queryAllDD() {
		String sql = "select td.dname,td.did from Tdictionary td where td.ddel='0'and td.dfatherid=1";
		return queryForJavaBeanList(sql, EMailUser.class, null);
	}

	@Override
	public PageModel queryEMailUserModel(Object userid, EMailUser emailuser,
			int currentPage, int pageSize) {
		StringBuilder countSql = new StringBuilder(
				"select count(*) from tuserinfo tu join tdictionary td on tu.uifamilytype=td.did  where tu.uiisdel=0 and tu.uiid != ?");
		List paramList = new ArrayList();
		StringBuilder orderSql = new StringBuilder();
		StringBuilder whereSql = new StringBuilder();
		StringBuilder querySql = new StringBuilder(
				"select td.did,td.dname,tu.uiusername,tu.uiid from tuserinfo tu join tdictionary td on tu.uifamilytype=td.did  where tu.uiisdel=0 and tu.uiid != ?");
		paramList.add(userid);
		if (emailuser != null) {
			if (emailuser.getDid() > 0) {
				whereSql.append(" and td.did = ?");
				paramList.add(emailuser.getDid());
			}
		}
		return queryForPageModel(EMailUser.class, currentPage, pageSize,
				querySql, countSql, whereSql, orderSql, paramList);
	}

	@Override
	public void saveEMail(Temail eMail) {
		// 保存邮件
		List params;
		String sql = "select SEQ_EMAIL.Nextval from dual";
		int emailid = queryForInt(sql, null);
		System.out.println(eMail);
		sql = "insert into temail(eid,etitle,emessage,etime,ehasattach,efromuser,etouser) values (?,?,?,sysdate,?,?,?)";
		params = new ArrayList();
		params.add(emailid);
		params.add(eMail.getEtitle());
		params.add(eMail.getEmessage());
		params.add(eMail.getEhasattach());
		params.add(eMail.getEfromuser());
		params.add(eMail.getEtouser());
		update(sql, params);

		// 保存附件
		sql = "insert into temailattach(eaid,eid,eaname,eaurl) values(SEQ_EMAILATTACH.Nextval,?,?,?)";
		if (eMail.getTemailattachs() != null) {
			Iterator<Temailattach> j = eMail.getTemailattachs().iterator();
			while (j.hasNext()) {
				Temailattach temp = j.next();
				params = new ArrayList();
				params.add(emailid);
				params.add(temp.getEaname());
				params.add(temp.getEaurl());
				update(sql, params);
			}
		}
		// 保存发件人邮件状态
		sql = "select uiid from tuserinfo where uiusername=? and uiisdel ='0'";
		params = new ArrayList();
		params.add(eMail.getEfromuser());
		int fromuserid = queryForInt(sql, params);

		sql = "insert into tuseremail(umid,uiid,eid,umaddress,umisread) values(SEQ_EMAILSTATUS.Nextval,?,?,'1','0')";
		params = new ArrayList();
		params.add(fromuserid);
		params.add(emailid);
		update(sql, params);
		// 保存收件人邮箱状态
		String[] toUsers = null;
		try {
			toUsers = eMail.getEtouser().split(",");
		} catch (Exception e) {
			toUsers = new String[] { eMail.getEtouser() };
		}
		System.out.println(toUsers[0]);
		for (int i = 0; i < toUsers.length; i++) {
			sql = "select uiid from tuserinfo where uiusername=? and uiisdel = '0'";
			params = new ArrayList();
			params.add(toUsers[i]);
			int touserid = queryForInt(sql, params);

			sql = "insert into tuseremail(umid,uiid,eid,umaddress,umisread) values(SEQ_EMAILSTATUS.Nextval,?,?,'2','0')";
			params = new ArrayList();
			params.add(touserid);
			params.add(emailid);
			update(sql, params);
		}
	}

	@Override
	public void saveEMailTemp(Temail eMail) {

		// 保存邮件
		List params;
		String sql = "select SEQ_EMAIL.Nextval from dual";
		int emailid = queryForInt(sql, null);

		sql = "insert into temail(eid,etitle,emessage,etime,ehasattach,efromuser,etouser) values (?,?,?,sysdate,?,?,?)";
		params = new ArrayList();
		params.add(emailid);
		params.add(eMail.getEtitle());
		params.add(eMail.getEmessage());
		params.add(eMail.getEhasattach());
		params.add(eMail.getEfromuser());
		params.add(eMail.getEtouser());// .replace(",", "|")
		update(sql, params);

		// 保存附件
		sql = "insert into temailattach(eaid,eid,eaname,eaurl) values(SEQ_EMAILATTACH.Nextval,?,?,?)";
		if (eMail.getTemailattachs() != null) {
			Iterator<Temailattach> j = eMail.getTemailattachs().iterator();
			while (j.hasNext()) {
				Temailattach temp = j.next();
				params = new ArrayList();
				params.add(emailid);
				params.add(temp.getEaname());
				params.add(temp.getEaurl());
				update(sql, params);
			}
		}
		// 保存发件人邮件状态
		sql = "select uiid from tuserinfo where uiusername=? and uiisdel = '0'";
		params = new ArrayList();
		params.add(eMail.getEfromuser());
		int fromuserid = queryForInt(sql, params);

		sql = "insert into tuseremail(umid,uiid,eid,umaddress,umisread) values(SEQ_EMAILSTATUS.Nextval,?,?,'3','0')";
		params = new ArrayList();
		params.add(fromuserid);
		params.add(emailid);
		update(sql, params);
	}

	@Override
	public PageModel querySendEmail(Object userid, int currentPage, int pageSize) {
		// 发件箱 1 收件箱 2 草稿箱 3 垃圾箱 4
		StringBuilder countSql = new StringBuilder(
				"select count(*) from tuseremail ts join temail te on ts.eid=te.eid where ts.uiid =? and ts.umaddress='1' ");
		List paramList = new ArrayList();
		StringBuilder orderSql = new StringBuilder("order by te.etime desc ");
		StringBuilder whereSql = new StringBuilder();
		StringBuilder querySql = new StringBuilder(
				"select * from tuseremail ts join temail te on ts.eid=te.eid where ts.uiid =? and ts.umaddress='1' ");
		paramList.add(userid);

		return queryForPageModel(EMailPageModelTemp.class, currentPage,
				pageSize, querySql, countSql, whereSql, orderSql, paramList);
	}

	@Override
	public PageModel queryDraftEmail(Long uiid, int currentPage, int pageSize) {
		StringBuilder countSql = new StringBuilder(
				"select count(*) from tuseremail ts join temail te on ts.eid=te.eid where ts.uiid =? and ts.umaddress='3' ");
		List paramList = new ArrayList();
		StringBuilder orderSql = new StringBuilder("order by te.etime desc");
		StringBuilder whereSql = new StringBuilder();
		StringBuilder querySql = new StringBuilder(
				"select * from tuseremail ts join temail te on ts.eid=te.eid where ts.uiid =? and ts.umaddress='3'  ");
		paramList.add(uiid);

		return queryForPageModel(EMailPageModelTemp.class, currentPage,
				pageSize, querySql, countSql, whereSql, orderSql, paramList);
	}

	@Override
	public PageModel queryGcEMail(Long uiid, int currentPage, int pageSize) {
		StringBuilder countSql = new StringBuilder(
				"select count(*) from tuseremail ts join temail te on ts.eid=te.eid where ts.uiid =? and ts.umaddress='4'  ");
		List paramList = new ArrayList();
		StringBuilder orderSql = new StringBuilder("order by te.etime desc ");
		StringBuilder whereSql = new StringBuilder();
		StringBuilder querySql = new StringBuilder(
				"select * from tuseremail ts join temail te on ts.eid=te.eid where ts.uiid =? and ts.umaddress='4'  ");
		paramList.add(uiid);

		return queryForPageModel(EMailPageModelTemp.class, currentPage,
				pageSize, querySql, countSql, whereSql, orderSql, paramList);
	}

	@Override
	public PageModel queryReceieveEmail(Long uiid, int currentPage, int pageSize) {
		StringBuilder countSql = new StringBuilder(
				"select count(*) from tuseremail ts join temail te on ts.eid=te.eid where ts.uiid =? and ts.umaddress='2' ");
		List paramList = new ArrayList();
		StringBuilder orderSql = new StringBuilder("order by te.etime desc ");
		StringBuilder whereSql = new StringBuilder();
		StringBuilder querySql = new StringBuilder(
				"select * from tuseremail ts join temail te on ts.eid=te.eid where ts.uiid =? and ts.umaddress='2'  ");
		paramList.add(uiid);

		return queryForPageModel(EMailPageModelTemp.class, currentPage,
				pageSize, querySql, countSql, whereSql, orderSql, paramList);
	}

	@Override
	public Temail queryEMail(Long eid) {
		String sql = "select * from tuseremail tt join temail te on tt.eid=te.eid where tt.umid = ?";
		List params = new ArrayList();
		params.add(eid);
		Temail email = (Temail) queryForJavaBean(sql, Temail.class, params);

		sql = "select * from tuseremail tt join temailattach te on tt.eid=te.eid where tt.umid = ?";
		params = new ArrayList();
		params.add(eid);
		List listtemp = queryForJavaBeanList(sql, Temailattach.class, params);
		Set set = new HashSet();
		for (int i = 0; i < listtemp.size(); i++) {
			set.add(listtemp.get(i));
		}
		email.setTemailattachs(set);
		return email;
	}

	@Override
	public void delEmail(Long esid) {
		/**
		 * 物理删除邮件
		 */
		// 得到邮件ID
		String sql = "select eid from tuseremail where umid= ? ";
		List params = new ArrayList();
		params.add(esid);
		int eid = queryForInt(sql, params);
		// 删除状态
		sql = "delete tuseremail where umid = ? ";
		params = new ArrayList();
		params.add(esid);
		update(sql, params);
		// 查询状态数目
		sql = "select count(*) from tuseremail where eid=?";
		params = new ArrayList();
		params.add(eid);
		int count = queryForInt(sql, params);

		if (count == 0) {
			// 找到所有附件的信息
			sql = "select * from temailattach where eid = ?";
			params = new ArrayList();
			params.add(eid);
			List<Temailattach> attachs = queryForJavaBeanList(sql,
					Temailattach.class, params);
			// 删除附件表信息
			sql = "delete temailattach where eid = ?";
			params = new ArrayList();
			params.add(eid);
			update(sql, params);
			// 删除邮箱信息
			sql = "delete temail where eid = ? ";
			params = new ArrayList();
			params.add(eid);
			update(sql, params);
			// 删除物理路径上的邮件
			// 判断是否有
			for (int i = 0; i < attachs.size(); i++) {
				sql = "select count(*) from tuseremail ts join temailattach tl on ts.eid=tl.eid where tl.eaurl = ?";
				params = new ArrayList();
				params.add(attachs.get(i).getEaurl());
				int canDel = queryForInt(sql, params);
				if (canDel == 0) {
					File file = new File(EmailDaoImpl.class.getResource(
							"../../../../../../../file/").getPath()
							+ attachs.get(i).getEaurl());

					if (file.isFile()) {
						file.delete();
					}
				}
			}
		}
	}

	@Override
	public void saveDEMail(Temail eMail) {
		// 查找邮件附件状态
		String sql = "select ehasattach from temail where eid =? ";
		List params = new ArrayList();
		params.add(eMail.getEid());
		int count = queryForInt(sql, params);
		if (count == 1) {
			eMail.setEhasattach(String.valueOf(count));
		}
		// 保存邮件
		sql = "update temail set etitle=?,emessage =?,ehasattach =?,etouser=?,etime=sysdate where eid = ?";
		params = new ArrayList();
		params.add(eMail.getEtitle());
		params.add(eMail.getEmessage());
		params.add(eMail.getEhasattach());
		params.add(eMail.getEtouser());
		params.add(eMail.getEid());
		update(sql, params);

		// 保存附件
		sql = "insert into temailattach(eaid,eid,eaname,eaurl) values(SEQ_EMAILATTACH.Nextval,?,?,?)";
		if (eMail.getTemailattachs() != null) {
			Iterator<Temailattach> j = eMail.getTemailattachs().iterator();
			while (j.hasNext()) {
				Temailattach temp = j.next();
				params = new ArrayList();
				params.add(eMail.getEid());
				params.add(temp.getEaname());
				params.add(temp.getEaurl());
				update(sql, params);
			}
		}
		// 删除草稿箱保存的发件人的状态
		sql = "delete tuseremail  where eid =?";
		params = new ArrayList();
		params.add(eMail.getEid());
		update(sql, params);
		// 保存发件人邮件状态
		sql = "select uiid from tuserinfo where uiusername= ? and uiisdel ='0'";
		params = new ArrayList();
		params.add(eMail.getEfromuser());
		int fromuserid = queryForInt(sql, params);

		sql = "insert into tuseremail(umid,uiid,eid,umaddress,umisread) values(SEQ_EMAILSTATUS.Nextval,?,?,'1','0')";
		params = new ArrayList();
		params.add(fromuserid);
		params.add(eMail.getEid());
		update(sql, params);
		// 保存收件人邮箱状态
		String[] toUsers = null;
		try {
			toUsers = eMail.getEtouser().split(",");
		} catch (Exception e) {
			toUsers = new String[] { eMail.getEtouser() };
		}
		System.out.println(toUsers[0]);
		for (int i = 0; i < toUsers.length; i++) {
			sql = "select uiid from tuserinfo where uiusername= ? and uiisdel ='0'";
			params = new ArrayList();
			params.add(toUsers[i]);
			int touserid = queryForInt(sql, params);

			sql = "insert into tuseremail(umid,uiid,eid,umaddress,umisread) values(SEQ_EMAILSTATUS.Nextval,?,?,'2','0')";
			params = new ArrayList();
			params.add(touserid);
			params.add(eMail.getEid());
			update(sql, params);
		}
	}

	@Override
	public void delAttcha(Long eoid) {

		// 得到附件所对应的邮件id
		String sql = "select eid from temailattach where eaid = ?";
		List params = new ArrayList();
		params.add(eoid);
		int eid = queryForInt(sql, params);
		// 得到要删除的附件信息
		sql = "select * from temailattach where eaid = ? ";
		params = new ArrayList();
		params.add(eoid);
		Temailattach attach = (Temailattach) queryForJavaBean(sql,
				Temailattach.class, params);
		// 删除数据库的附件信息
		sql = "delete temailattach where eaid = ? ";
		params = new ArrayList();
		params.add(eoid);
		update(sql, params);
		// 删除本地信息
		File file = new File(NoticeDaoImpl.class.getResource(
				"../../../../../../../file/").getPath()
				+ attach.getEaurl());
		if (file.isFile()) {
			file.delete();
		}
		// 判断邮件是不是有附件
		sql = "select count(*) from temailattach where eid= ? ";
		params = new ArrayList();
		params.add(eid);
		int count = queryForInt(sql, params);
		if (count == 0) {
			// 改变邮件的附件信息
			sql = "update temail set ehasattach = '0' where eid=? ";
			params = new ArrayList();
			params.add(eid);
			update(sql, params);
		}

	}

	@Override
	public Temailattach getEMaileAttachById(Long eaid) {
		String sql = "select * from temailattach where eaid = ?";
		List params = new ArrayList();
		params.add(eaid);
		return (Temailattach) queryForJavaBean(sql, Temailattach.class, params);
	}

	@Override
	public void relEmail(long parseLong) {
		String sql = "update tuseremail set umaddress = '2' where umid =? ";
		List params = new ArrayList();
		params.add(parseLong);
		update(sql, params);
	}

	@Override
	public void delFakeEmail(long parseLong) {
		String sql = "update tuseremail set umaddress = '4' where umid =?";
		List params = new ArrayList();
		params.add(parseLong);
		update(sql, params);

	}

	@Override
	public void changeRead(Long umid) {
		String sql = "update tuseremail set umisread ='1'where umid= ?";
		List params = new ArrayList();
		params.add(umid);
		update(sql, params);
	}

	@Override
	public void FWEMail(Temail eMail) {
			String sql = "select * from tuseremail where eid=?";
			List params = new ArrayList();
			params.add(eMail.getEid());
			System.out.println(eMail.getEid());
			List<Temailattach> oldAttach =queryForJavaBeanList(sql, Temailattach.class, params); 
			
			Set set = new HashSet();
			for (int i = 0; i < oldAttach.size(); i++) {
				set.add(oldAttach.get(i));
			}
			
			eMail.setTemailattachs(set);
			
			saveEMail(eMail);
	}
}
