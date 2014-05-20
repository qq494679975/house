package com.softxm.hs.model;

import java.util.Date;

public class EMailPageModelTemp {
	private String efromuser;//发件人
	private String etouser;//收件人
	private Date etime;//时间
	private int umid;//邮箱状态表的id
	private int umisread;//是否已读
	private String etitle;//邮件主题
	public String getEfromuser() {
		return efromuser;
	}
	public void setEfromuser(String efromuser) {
		this.efromuser = efromuser;
	}
	public String getEtouser() {
		return etouser;
	}
	public void setEtouser(String etouser) {
		this.etouser = etouser;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	public int getUmid() {
		return umid;
	}
	public void setUmid(int umid) {
		this.umid = umid;
	}
	public int getUmisread() {
		return umisread;
	}
	public void setUmisread(int umisread) {
		this.umisread = umisread;
	}
	public String getEtitle() {
		return etitle;
	}
	public void setEtitle(String etitle) {
		this.etitle = etitle;
	}
	
}
