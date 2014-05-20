package com.softxm.hs.model;

import java.util.Date;

/**
 * Thousemoney entity. @author MyEclipse Persistence Tools
 */

public class Thousemoney implements java.io.Serializable {

	// Fields

	private Long hmid;
	private Long uiid;
	private Date hmtime;//交钱时间
	private Date husertime;//发布时间
	private Short hmmoney;
	private Date starttime;
	private Date endtime;

	private String uiusername;

	private Tuserinfo tuserinfo;
	// Constructors
	public String getTime()
	{
		return (husertime.getYear()+1900)+"年"+(husertime.getMonth()+1)+"月";
	}
	/** default constructor */
	public Thousemoney() {
	}

	/** full constructor */
	

	public Date getEndtime() {
		return endtime;
	}

	public Long getHmid() {
		return this.hmid;
	}
	public Short getHmmoney() {
		return this.hmmoney;
	}
	public Date getHmtime() {
		return this.hmtime;
	}

	public Date getHusertime() {
		return this.husertime;
	}

	public Date getStarttime() {
		return starttime;
	}

	public Tuserinfo getTuserinfo() {
		return tuserinfo;
	}

	public Long getUiid() {
		return this.uiid;
	}

	// Property accessors

	public String getUiusername() {
		return uiusername;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public void setHmid(Long hmid) {
		this.hmid = hmid;
	}

	public void setHmmoney(Short hmmoney) {
		this.hmmoney = hmmoney;
	}

	public void setHmtime(Date hmtime) {
		this.hmtime = hmtime;
	}

	public void setHusertime(Date husertime) {
		this.husertime = husertime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public void setTuserinfo(Tuserinfo tuserinfo) {
		this.tuserinfo = tuserinfo;
	}

	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}

	public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}

}