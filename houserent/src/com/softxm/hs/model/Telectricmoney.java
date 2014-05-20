package com.softxm.hs.model;

import java.util.Date;

/**
 * Telectricmoney entity. @author MyEclipse Persistence Tools
 */

public class Telectricmoney implements java.io.Serializable {

	// Fields

	private Long emid;
	private Tuserinfo tuserinfo;
	private Date emtime;// 交电时间
	private Date emusertime;
	private Double emmoney;
	private Double emnum;
	private Long uiid;
	private String uiusername;
	private Double emmoneybyone;// 每度多少钱

	public Double getOnemoney() {
		return emmoney/emnum;
	}
	
	public Double getEmmoneybyone() {
		return emmoneybyone;
	}
	
	public String getTime()
	{
		return (emusertime.getYear()+1900)+"年"+(emusertime.getMonth()+1)+"月";
	}
	@Override
	public String toString() {
		return "Telectricmoney [emid=" + emid + ", emmoney=" + emmoney
				+ ", emmoneybyone=" + emmoneybyone + ", emnum=" + emnum
				+ ", emtime=" + emtime + ", emusertime=" + emusertime
				+ ", endtime=" + endtime + ", starttime=" + starttime
				+ ", uiid=" + uiid + ", uiusername=" + uiusername + "]";
	}

	public void setEmmoneybyone(Double emmoneybyone) {
		this.emmoneybyone = emmoneybyone;
	}

	private java.sql.Date starttime;

	private java.sql.Date endtime;

	// Constructors
	/** default constructor */
	public Telectricmoney() {
	}

	public Long getEmid() {
		return this.emid;
	}

	public Double getEmmoney() {
		return this.emmoney;
	}

	// Property accessors

	public Double getEmnum() {
		return this.emnum;
	}

	public Date getEmtime() {
		return emtime;
	}

	public Date getEmusertime() {
		return this.emusertime;
	}

	public java.sql.Date getEndtime() {
		return endtime;
	}

	public java.sql.Date getStarttime() {
		return starttime;
	}

	public Tuserinfo getTuserinfo() {
		return this.tuserinfo;
	}

	public Long getUiid() {
		return uiid;
	}

	public String getUiusername() {
		return uiusername;
	}

	public void setEmid(Long emid) {
		this.emid = emid;
	}

	public void setEmmoney(Double emmoney) {
		this.emmoney = emmoney;
	}

	public void setEmnum(Double emnum) {
		this.emnum = emnum;
	}

	public void setEmtime(Date emtime) {
		this.emtime = emtime;
	}

	public void setEmusertime(Date emusertime) {
		this.emusertime = emusertime;
	}

	public void setEndtime(java.sql.Date endtime) {
		this.endtime = endtime;
	}

	public void setStarttime(java.sql.Date starttime) {
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