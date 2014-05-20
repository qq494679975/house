package com.softxm.hs.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tuserinfo entity. @author MyEclipse Persistence Tools
 */

public class Tuserinfo implements java.io.Serializable {

	// Fields
	private String code;
	private String passwordtemp;
	private String newpassword;

	private Long uiid;

	private String uiusername;

	private String uipassword;

	private String uiemail;

	private String uifrom;

	private String uiphone;

	private Date uitime;
	private String uirealname;
	private String uifamilytype;
	private double uimoney;

	private String uiisdel;

	private String uiislock;

	private Set tuseremails = new HashSet(0);// 邮件
	private Set twatermoneies = new HashSet(0);// 水费
	private Set troles = new HashSet(0);// 用户角色
	private Set telectricmoneies = new HashSet(0);// 电费
	private Set tuserfamilies = new HashSet(0);// 家庭信息
	private Set thousemoneies = new HashSet(0);// 房租
	public Set getThousemoneies() {
		return thousemoneies;
	}

	public void setThousemoneies(Set thousemoneies) {
		this.thousemoneies = thousemoneies;
	}

	private Ttip ttip;// 小贴士
	private Tcontract tcontract;// 合同信息
	/** default constructor */
	public Tuserinfo() {
	}

	/** full constructor */

	public String getCode() {
		return code;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public String getPasswordtemp() {
		return passwordtemp;
	}

	public Tcontract getTcontract() {
		return tcontract;
	}

	public Set getTelectricmoneies() {
		return this.telectricmoneies;
	}

	public Set getTroles() {
		return this.troles;
	}

	public Ttip getTtip() {
		return ttip;
	}

	public Set getTuseremails() {
		return this.tuseremails;
	}

	public Set getTuserfamilies() {
		return tuserfamilies;
	}

	public Set getTwatermoneies() {
		return this.twatermoneies;
	}

	// Constructors

	public String getUiemail() {
		return this.uiemail;
	}

	// Property accessors

	public String getUifamilytype() {
		return this.uifamilytype;
	}

	public String getUifrom() {
		return this.uifrom;
	}

	public Long getUiid() {
		return this.uiid;
	}

	public String getUiisdel() {
		return this.uiisdel;
	}

	public String getUiislock() {
		return this.uiislock;
	}

	public double getUimoney() {
		return uimoney;
	}

	public String getUipassword() {
		return this.uipassword;
	}

	public String getUiphone() {
		return this.uiphone;
	}

	public String getUirealname() {
		return uirealname;
	}

	public Date getUitime() {
		return this.uitime;
	}

	public String getUiusername() {
		return uiusername;
	}

	public Object getUserid() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public void setPasswordtemp(String passwordtemp) {
		this.passwordtemp = passwordtemp;
	}

	public void setTcontract(Tcontract tcontract) {
		this.tcontract = tcontract;
	}

	public void setTelectricmoneies(Set telectricmoneies) {
		this.telectricmoneies = telectricmoneies;
	}

	public void setTroles(Set troles) {
		this.troles = troles;
	}

	public void setTtip(Ttip ttip) {
		this.ttip = ttip;
	}

	public void setTuseremails(Set tuseremails) {
		this.tuseremails = tuseremails;
	}

	public void setTuserfamilies(Set tuserfamilies) {
		this.tuserfamilies = tuserfamilies;
	}

	public void setTwatermoneies(Set twatermoneies) {
		this.twatermoneies = twatermoneies;
	}

	public void setUiemail(String uiemail) {
		this.uiemail = uiemail;
	}

	public void setUifamilytype(String uifamilytype) {
		this.uifamilytype = uifamilytype;
	}

	public void setUifrom(String uifrom) {
		this.uifrom = uifrom;
	}

	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}

	public void setUiisdel(String uiisdel) {
		this.uiisdel = uiisdel;
	}

	public void setUiislock(String uiislock) {
		this.uiislock = uiislock;
	}

	public void setUimoney(double uimoney) {
		this.uimoney = uimoney;
	}

	public void setUipassword(String uipassword) {
		this.uipassword = uipassword;
	}

	public void setUiphone(String uiphone) {
		this.uiphone = uiphone;
	}

	public void setUirealname(String uirealname) {
		this.uirealname = uirealname;
	}

	public void setUitime(Date uitime) {
		this.uitime = uitime;
	}

	public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}

	@Override
	public String toString() {
		return "Tuserinfo [ttip=" + ttip + ", uifrom=" + uifrom + ", uiid="
				+ uiid + ", uiisdel=" + uiisdel + ", uiislock=" + uiislock
				+ ", uipassword=" + uipassword + ", uiphone=" + uiphone
				+ ", uirealname=" + uirealname + ", uitime=" + uitime
				+ ", uiusername=" + uiusername + ", fiamlytype=" + uifamilytype
				+ "]";
	}

}