package com.softxm.hs.model;

import java.util.Date;

/**
 * Twatermoney entity. @author MyEclipse Persistence Tools
 */

public class Twatermoney implements java.io.Serializable {

	// Fields

	private Long wmid;
	private Tuserinfo tuserinfo;
	private Date wmtime;//表示浇水时间
	private Date wmusertime;//时间
	private Double wmmoney;//金钱
	private Double wmnum;//顿数
	private java.sql.Date starttime;
	private java.sql.Date endtime;
	private String uiusername;
	private Double onewatermoney;//每吨多少钱
	private Long uiid;
	public Double getOnemoney() {
		return wmmoney/wmnum;
	}
	// Constructors
	
	public String getTime()
	{
		return (wmusertime.getYear()+1900)+"年"+(wmusertime.getMonth()+1)+"月";
	}
	
	public Long getUiid() {
		return uiid;
	}

	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}

	public Double getOnewatermoney() {
		return onewatermoney;
	}

	public void setOnewatermoney(Double onewatermoney) {
		this.onewatermoney = onewatermoney;
	}

	/** default constructor */
	public Twatermoney() {
	}

	/** full constructor */
	
	public java.sql.Date getEndtime() {
		return endtime;
	}

	public java.sql.Date getStarttime() {
		return starttime;
	}

	public Tuserinfo getTuserinfo() {
		return this.tuserinfo;
	}

	public String getUiusername() {
		return uiusername;
	}

	public Long getWmid() {
		return this.wmid;
	}

	public Double getWmmoney() {
		return this.wmmoney;
	}

	// Property accessors

	public Double getWmnum() {
		return this.wmnum;
	}


	public Date getWmusertime() {
		return this.wmusertime;
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

	public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}

	public void setWmid(Long wmid) {
		this.wmid = wmid;
	}

	public void setWmmoney(Double wmmoney) {
		this.wmmoney = wmmoney;
	}

	public void setWmnum(Double wmnum) {
		this.wmnum = wmnum;
	}


	public Date getWmtime() {
		return wmtime;
	}

	public void setWmtime(Date wmtime) {
		this.wmtime = wmtime;
	}

	public void setWmusertime(Date wmusertime) {
		this.wmusertime = wmusertime;
	}

}