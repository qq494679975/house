package com.softxm.hs.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;

import org.apache.struts2.StrutsStatics;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.FileUpModel;
import com.softxm.hs.model.Tnotice;
import com.softxm.hs.model.Tnoticeattach;
import com.softxm.hs.service.NoticeService;

public class NoticeAction extends BaseWebAction implements ModelDriven<Tnotice> {
	private Tnotice tnotice = new Tnotice();
	@Autowired
	NoticeService noticeService;
	// 文件上传需要的
	private FileUpModel fileModel;
	// 下载文件需要的
	private Tnoticeattach tnoticeattach;
	private Long attachs;

	public void setTnoticeattach(Tnoticeattach tnoticeattach) {
		this.tnoticeattach = tnoticeattach;
	}

	public Tnoticeattach getTnoticeattach() {
		return tnoticeattach;
	}

	public Long getAttachs() {
		return attachs;
	}

	public void setAttachs(Long attachs) {
		this.attachs = attachs;
	}

	public FileUpModel getFileModel() {
		return fileModel;
	}

	public void setFileModel(FileUpModel fileModel) {
		this.fileModel = fileModel;
	}

	@Override
	public Tnotice getModel() {
		return tnotice;
	}

	/**
	 * 公告列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public String noticelist() throws Exception {
		pageModel = noticeService.getAllNotice(currentPage, pageSize, tnotice);
		return "noticelist";
	}

	/**
	 * 新建公告
	 */
	public String newNotice() throws Exception {
		if (fileModel != null) {
			System.out.println("aaaa");
			for (int i = 0; i < fileModel.getAttach().size(); i++) {
				if (fileModel.getAttach().get(i).length() > 1024 * 1024 * 5) {
					this.addFieldError("fileerror", "文件太大:单个文件不能大于5M");
					return "input";
				}
			}
			// 保存文件
			fileModel.uploadFile();
			// 把数据写到表里面
			List<String> oldnames = fileModel.getAttachFileName();
			List<String> newnames = fileModel.getAttachNewFileName();
			Set<Tnoticeattach> attachs = new HashSet<Tnoticeattach>();
			if (oldnames != null) {
				for (int i = 0; i < oldnames.size(); i++) {
					Tnoticeattach attach = new Tnoticeattach();
					attach.setNaname(oldnames.get(i));
					attach.setNaurl(newnames.get(i));
					attach.setTnotice(tnotice);
					attachs.add(attach);
				}
				// 得到附件信息
				tnotice.setTnoticeattachs(attachs);
				// 得到是否有附件
				tnotice.setNhasattach("1");
			}
		} else {
			tnotice.setNhasattach("0");
		}
		// 得到userid
		tnotice.setIspass("0");
		tnotice.setUiid(findLoginUser().getUiid());
		tnotice.setNrelestime(new Date());
		noticeService.saveNotice(tnotice);

		return success("添加公告成功", true, "oa7");
	}

	/**
	 * 修改公告
	 */
	public String toUpdatePage() throws Exception {
		tnotice = noticeService.getNoticeById(tnotice.getNnoticeid());
		return "toUpdatePage";
	}

	/**
	 * 删除附件
	 */
	public String delAttach() throws Exception {
		System.out.println(attachs);
		String url = noticeService
				.deleteAttach(tnotice.getNnoticeid(), attachs);
		FileUpModel.deleteAttach(url);
		return success("删除成功", false, "noticeedit");
	}

	/**
	 * 下载附件
	 */
	public String downAttach() throws Exception {
		 tnoticeattach = noticeService.getAttach(attachs);
		return "downattach";
	}
	/**
	 * 与配置文件中的 <param name="inputName">file</param>对应
	 * 
	 * @return
	 */
	public InputStream getFile() {
		ServletContext servletContext = (ServletContext) ActionContext
				.getContext().get(StrutsStatics.SERVLET_CONTEXT);
		String filedir = servletContext.getRealPath("/file");
		String fullpath = filedir + "/" + tnoticeattach.getNaurl();
		try {
			return new FileInputStream(new File(fullpath));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	/**
	 * 与配置文件中<param
	 * name="contentDisposition">attachment;filename="${fileName}"</param>
	 * 的${fileName}对应
	 * 
	 * @return
	 */
	public String getFileName() {
		String filename = tnoticeattach.getNaname();
		try {
			return new String(filename.getBytes("GBK"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			return filename;
		}
	}
	/**
	 * 更新公告
	 */
	public String updateNotice()throws Exception 
	{
		if (fileModel != null) {
			System.out.println("aaaa");
			for (int i = 0; i < fileModel.getAttach().size(); i++) {
				if (fileModel.getAttach().get(i).length() > 1024 * 1024 * 5) {
					this.addFieldError("fileerror", "文件太大:单个文件不能大于5M");
					return "input";
				}
			}
			// 保存文件
			fileModel.uploadFile();
			// 把数据写到表里面
			List<String> oldnames = fileModel.getAttachFileName();
			List<String> newnames = fileModel.getAttachNewFileName();
			Set<Tnoticeattach> attachs = new HashSet<Tnoticeattach>();
			if (oldnames != null) {
				for (int i = 0; i < oldnames.size(); i++) {
					Tnoticeattach attach = new Tnoticeattach();
					attach.setNaname(oldnames.get(i));
					attach.setNaurl(newnames.get(i));
					attach.setTnotice(tnotice);
					attachs.add(attach);
				}
				// 得到附件信息
				tnotice.setTnoticeattachs(attachs);
				// 得到是否有附件
				tnotice.setNhasattach("1");
			}
		} 
		// 得到userid
		tnotice.setIspass("0");
		tnotice.setUiid(findLoginUser().getUiid());
		tnotice.setNrelestime(new Date());
		noticeService.updateNotice(tnotice);
		return success("更新成功", true, "oa7");
	}
	/**
	 * 删除公告
	 */
	public String delNotice()throws Exception
	{
		List<String> url =noticeService.deleteNotice(tnotice.getNnoticeid());
		for(int i =0;i<url.size();i++)
		{
			FileUpModel.deleteAttach(url.get(i));
		}
		return success("删除成功", false, "oa7");
	}
	/**
	 * 审核公告
	 */
	public String passNotice() throws Exception
	{
		tnotice.setTuuiid(findLoginUser().getUiid());
		noticeService.passNotice(tnotice);
		return success("审核操作成功，立即生效", true, "oa7");
	}
	/**
	 * 查看公告
	 */
	public String showNotice()throws Exception
	{
		tnotice=noticeService.getNoticeById(tnotice.getNnoticeid());
		return "showNotice";
	}
	/**
	 * 查看个人公告列表
	 */
	public String personNoticeList()
	{
		tnotice.setUiid(findLoginUser().getUiid());
		pageModel=noticeService.getPersonNoticePM(this.currentPage,this.pageSize,tnotice);
		return "personNoticeList";
	}
	/**
	 * 修改个人公告
	 */
	public String seeNoticeP()
	{
		tnotice.setUiid(findLoginUser().getUiid());
		tnotice=noticeService.getPersonNoticeById(tnotice);
		return "seeNoticeP";
	}
	
}
