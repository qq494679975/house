package com.softxm.hs.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;

import org.apache.struts2.StrutsStatics;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.EMailUser;
import com.softxm.hs.model.FileUpModel;
import com.softxm.hs.model.Temail;
import com.softxm.hs.model.Temailattach;
import com.softxm.hs.service.EmailService;

public class EmailAction extends BaseWebAction implements ModelDriven<Temail> {
	private Temail temail = new Temail();
	@Autowired
	private EmailService emailService;

	private EMailUser emailuser;
	private List<EMailUser> userDD;
	private FileUpModel fileModel;
	//批量删除
	private String esids;
	//附件
	private Temailattach temailattach;
	/**
	 * 删除邮件 发件箱  邮件列表页面
	 * @return
	 * @throws Exception
	 */
	public String delEmail() throws Exception {
		emailService.delEmail(temail.getUmid());
		return success("删除单个邮件成功", false, "oa17");
	}

	/**
	 * 删除邮件 发件箱  邮件列表页面 批量删除
	 * @return
	 * @throws Exception
	 */
	public String delMoreEmail() throws Exception {
		String[] ids = esids.split(",");
		for (int i = 0; i < ids.length; i++) {
			emailService.delEmail(Long.parseLong(ids[i]));
		}
		return success("删除多个邮件成功", false, "oa17");
	}

	/**
	 * 删除邮件 发件箱 查看邮件页面
	 */
	public String delSeeEmail() throws Exception {
		emailService.delEmail(temail.getUmid());
		return success("删除单个邮件成功", true, "oa17");
	}

	/**
	 *   草稿箱  删除单个邮件
	 */
	public String draft_delEmail() throws Exception {
		emailService.delEmail(temail.getUmid());
		return success("删除单个邮件成功", false, "oa19");
	}

	/**
	 *  草稿箱 删除多个邮件 
	 */
	public String draft_delMoreEmail() throws Exception {
		String[] ids = esids.split(",");
		for (int i = 0; i < ids.length; i++) {
			emailService.delEmail(Long.parseLong(ids[i]));
		}
		return success("删除多个邮件成功", false, "oa19");
	}

	/**
	 *草稿箱  编辑邮件 
	 * @param emailuser
	 */
	public String draftESeeEmail() throws Exception {
		temail = emailService.queryEMail(temail.getUmid());
		return "draftESeeEmail";
	}

	public EMailUser getEmailuser() {
		return emailuser;
	}

	public String getEsids() {
		return esids;
	}

	public FileUpModel getFileModel() {
		return fileModel;
	}

	@Override
	public Temail getModel() {
		return temail;
	}

	public Temailattach getTemailattach() {
		return temailattach;
	}
	public Map<Integer, String> getUserDD() {
		Map ddmap = new HashMap();
		for (int i = 0; i < userDD.size(); i++) {
			ddmap.put(userDD.get(i).getDid(), userDD.get(i).getDname());
		}
		return ddmap;
	}
	/**
	 * 查看邮件：发件箱 
	 * @param emailuser
	 */
	public String outboxlist() throws Exception {
		pageModel = emailService.querySendEmail(findLoginUser().getUiid(),
				currentPage, pageSize);
		return "outboxlist";
	}
	/**
	 * 查找邮件:草稿箱
	 */
	public String queryDraftEMail() throws Exception {
		pageModel = emailService.queryDraftEmail(findLoginUser().getUiid(),
				currentPage, pageSize);
		return "queryDraftEMail";
	}
	/**
	 * 查找邮件：垃圾箱
	 */
	public String queryGCEMail() throws Exception {
		pageModel = emailService.queryGcEMail(findLoginUser().getUiid(), currentPage,
				pageSize);
		return "queryGCEMail";
	}
	/**
	 * 发邮件用的读取用户信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public String readDD() throws Exception {
		userDD = emailService.queryAllDD();
		pageModel = emailService.queryEMailUserModel(findLoginUser().getUiid(),
				emailuser, currentPage, pageSize);
		return "readDD";
	}
	/**
	 * 查找邮件:收件箱
	 */
	public String receieveEMail() throws Exception {
		pageModel = emailService.queryReceieveEmail(findLoginUser().getUiid(),
				currentPage, pageSize);
		return "receieveEMail";
	}
	/**
	 * 保存是草稿箱
	 * @return
	 * @throws Exception
	 */
	public String saveEMailTemp() throws Exception {
		if (fileModel != null) {
			for(int i =0;i<fileModel.getAttach().size();i++)
			{
				if(fileModel.getAttach().get(i).length()>1024*1024*5)
				{
					this.addFieldError("fileerror","文件太大:单个文件不能大于5M");
					return "input";
				}
			}
			fileModel.uploadFile();
			List<String> oldnames = fileModel.getAttachFileName();
			List<String> newnames = fileModel.getAttachNewFileName();
			Set<Temailattach> attachs = new HashSet<Temailattach>();
			if (oldnames != null) {
				for (int i = 0; i < oldnames.size(); i++) {
					Temailattach attach = new Temailattach();
					attach.setEaname(oldnames.get(i));
					attach.setEaurl(newnames.get(i));
					attachs.add(attach);
				}
				temail.setTemailattachs(attachs);
				temail.setEhasattach("1");
			}
		} else {
			temail.setEhasattach("0");
		}
		temail.setEtouser(emailuser.getUiusername());
		temail.setEfromuser(findLoginUser().getUiusername());
		emailService.saveEMailTemp(temail);
		return success("保存至草稿箱", true, "null");
	}
	/**
	 * 查看单个邮件 发件箱
	 */
	public String seeEmail() throws Exception {
		temail = emailService.queryEMail(temail.getUmid());
		System.out.println("aaa"+temail.getTemailattachs());
		return "seeEmail";
	}
	/**
	 * 发送邮件
	 */
	public String sendEMail() throws Exception {
		if (fileModel != null) {
			for (int i = 0; i < fileModel.getAttach().size(); i++) {
				if (fileModel.getAttach().get(i).length() > 1024 * 1024 * 5) {
					this.addFieldError("fileerror", "文件太大:单个文件不能大于5M");
					return "input";
				}
			}

			fileModel.uploadFile();

			List<String> oldnames = fileModel.getAttachFileName();
			List<String> newnames = fileModel.getAttachNewFileName();
			Set<Temailattach> attachs = new HashSet<Temailattach>();
			if (oldnames != null) {
				for (int i = 0; i < oldnames.size(); i++) {
					Temailattach attach = new Temailattach();
					attach.setEaname(oldnames.get(i));
					attach.setEaurl(newnames.get(i));
					attachs.add(attach);
				}

				temail.setTemailattachs(attachs);
				temail.setEhasattach("1");
			}
		} else {
			temail.setEhasattach("0");
		}
		temail.setEtouser(emailuser.getUiusername());
		temail.setEfromuser(findLoginUser().getUiusername());
		emailService.saveEMail(temail);
		return success("发送成功", true, "null");
	}
	/**
	 * 草稿箱:发送邮件
	 * @param emailuser
	 */
	public String sendDEMail() throws Exception {
		if (fileModel != null) {
			for(int i =0;i<fileModel.getAttach().size();i++)
			{
				if(fileModel.getAttach().get(i).length()>1024*1024*5)
				{
					this.addFieldError("fileerror","文件太大:单个文件不能大于5M");
					return "input";
				}
			}
			// 保存文件
			fileModel.uploadFile();
			// 把数据写到表里面
			List<String> oldnames = fileModel.getAttachFileName();
			List<String> newnames = fileModel.getAttachNewFileName();
			Set<Temailattach> attachs = new HashSet<Temailattach>();
			if (oldnames != null) {
				for (int i = 0; i < oldnames.size(); i++) {
					Temailattach attach = new Temailattach();
					attach.setEaname(oldnames.get(i));
					attach.setEaurl(newnames.get(i));
					attachs.add(attach);
				}
				// 得到附件信息
				temail.setTemailattachs(attachs);
				// 得到是否有附件
				temail.setEhasattach("1");
			}
		} else {
			temail.setEhasattach("0");
		}
		temail.setEtouser(emailuser.getUiusername());
		temail.setEfromuser(findLoginUser().getUiusername());
		emailService.saveDEMail(temail);
		return success("发送成功", true, "oa19");
	}
	/**
	 * 草稿箱 草稿页面 删除附件
	 * @return
	 * @throws Exception
	 */
	public String delOneEmailAttach() throws Exception {
		emailService.delAttcha(temailattach.getEaid());
		return success("删除成功", false, "emailedit");
	}
	/**
	 * 草稿箱 草稿页面 下载附件
	 * @param emailuser
	 */
	public String downAttache() throws Exception {
		temailattach = emailService.getEMaileAttachById(temailattach.getEaid());
		return "downattach";
	}
	
	/**
	 * 
	 * @return
	 */
	public InputStream getFile() {
		ServletContext servletContext = (ServletContext) ActionContext
				.getContext().get(StrutsStatics.SERVLET_CONTEXT);
		String filedir = servletContext.getRealPath("/file");
		String fullpath = filedir + "/" + temailattach.getEaurl();
		try {
			return new FileInputStream(new File(fullpath));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getFileName() {
		String filename = temailattach.getEaname();
		try {
			return new String(filename.getBytes("GBK"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			return filename;
		}
	}
	/**
	 * 垃圾箱 彻底删除邮件 
	 * @return
	 * @throws Exception
	 */
	public String delGCMoreEmail() throws Exception {
		String[] ids = esids.split(",");
		for (int i = 0; i < ids.length; i++) {
			emailService.delEmail(Long.parseLong(ids[i]));
		}
		return success("删除成功", false, "oa18");
	}
	/**
	 * 垃圾箱 批量恢复到收件箱
	 * @param emailuser
	 */
	public String relGCtMoreEmail() throws Exception {
		String[] ids = esids.split(",");
		for (int i = 0; i < ids.length; i++) {
			emailService.relEmail(Long.parseLong(ids[i]));
		}
		return success("恢复到收件箱成功", false, "oa18");
	}
	/**
	 * 垃圾箱  彻底删除邮件
	 * @param emailuser
	 */
	public String delGCEmail() throws Exception {
		emailService.delEmail(temail.getUmid());
		return success("删除成功", false, "oa18");
	}
	/**
	 * 垃圾箱 进入页面
	 * @param emailuser
	 */
	public String seeGCEmail() throws Exception {
		temail = emailService.queryEMail(temail.getUmid());
		return "seeGCEmail";
	}
	/**
	 * 垃圾箱  恢复到收件箱
	 * @param emailuser
	 */
	public String relGCSeetEmail() throws Exception {
		emailService.relEmail(temail.getUmid());
		return success("恢复到收件箱成功", true, "oa18");
	}
	/**
	 * 垃圾箱 彻底删除
	 * @param emailuser
	 */
	public String delGCSeeEmail() throws Exception {
		emailService.delEmail(temail.getUmid());
		return success("删除成功", true, "oa18");
	}
	/**
	 * 垃圾箱 恢复到收件箱
	 * @param emailuser
	 */
	public String relGCtEmail() throws Exception {
		emailService.relEmail(temail.getUmid());
		return success("恢复到收件箱成功", false, "oa18");
	}
	/**
	 * 收件箱 批量放入垃圾箱
	 * @param emailuser
	 */
	public String delGetMoreEmail() throws Exception {
		String[] ids = esids.split(",");
		for (int i = 0; i < ids.length; i++) {
			emailService.delFakeEmail(Long.parseLong(ids[i]));
		}
		return success("删除多个邮件成功,如果需要恢复，请到垃圾箱查找", false, "oa16");
	}
	/**
	 * 收件箱 批量彻底删除
	 * @param emailuser
	 */
	public String delGetrealEmail() throws Exception {
		String[] ids = esids.split(",");
		for (int i = 0; i < ids.length; i++) {
			emailService.delEmail(Long.parseLong(ids[i]));
		}
		return success("删除多个邮件成功", false, "oa16");
	}
	/**
	 * 收件箱 进入页面
	 * @param emailuser
	 */
	public String seeGetEmail() throws Exception {
		emailService.changeRead(temail.getUmid());
		temail = emailService.queryEMail(temail.getUmid());
		return "seeGetEmail";
	}
	/**
	 * 收件箱   转入垃圾箱
	 * @param emailuser
	 */
	public String delGetEmail() throws Exception {
		emailService.delFakeEmail(temail.getUmid());
		return success("删除单个邮件成功,如果需要恢复，请到垃圾箱查找", false, "oa16");
	}
	/**
	 * 收件箱  彻底删除
	 * @param emailuser
	 */
	public String delrealEmail() throws Exception {
		emailService.delEmail(temail.getUmid());
		return success("删除单个邮件成功", false, "oa16");
	}
	/**
	 * 收件箱 回复
	 * @param emailuser
	 */
	public String backGetEmail() throws Exception {
		temail = emailService.queryEMail(temail.getUmid());
		return "backgetemail";
	}
	/**
	 * 收件箱 转发
	 * @param emailuser
	 */
	public String tranGetEMail() throws Exception {
		temail = emailService.queryEMail(temail.getUmid());
		return "trangetemail";
	}
	/**
	 * 收件箱 转入垃圾箱
	 * @param emailuser
	 */
	public String delGetseeEmail() throws Exception {
		emailService.delFakeEmail(temail.getUmid());
		return success("删除单个邮件成功,如果需要恢复，请到垃圾箱查找", true, "oa16");
	}
	/**
	 * 收件箱 彻底删除
	 * @param emailuser
	 */
	public String delrealseeEmail() throws Exception {
		emailService.delEmail(temail.getUmid());
		return success("删除成功", true, "oa16");
	}
	/**
	 * 收件箱 转发
	 * @param emailuser
	 */
	public String tranEMail() throws Exception
	{
		temail.setEtouser(emailuser.getUiusername());
		temail.setEfromuser(findLoginUser().getUiusername());
		emailService.FWEMail(temail);
		return success("转发成功", true, "null");
	}
	public void setEmailuser(EMailUser emailuser) {
		this.emailuser = emailuser;
	}
	public void setEsids(String esids) {
		this.esids = esids;
	}
	public void setFileModel(FileUpModel fileModel) {
		this.fileModel = fileModel;
	}
	public void setTemailattach(Temailattach temailattach) {
		this.temailattach = temailattach;
	}
	
}
