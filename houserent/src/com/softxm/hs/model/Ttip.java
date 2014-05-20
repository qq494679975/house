package com.softxm.hs.model;

/**
 * Ttip entity. @author MyEclipse Persistence Tools
 */

public class Ttip implements java.io.Serializable {

	// Fields

	private Long tid;
	private String tshow;
	private Integer ttime;
	private String tnorice;
	private String temail;
	private Tuserinfo tuserinfo;

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTshow() {
		return tshow;
	}

	public void setTshow(String tshow) {
		this.tshow = tshow;
	}

	public Integer getTtime() {
		return ttime;
	}

	public void setTtime(Integer ttime) {
		this.ttime = ttime;
	}

	public String getTnorice() {
		return tnorice;
	}

	public void setTnorice(String tnorice) {
		this.tnorice = tnorice;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public Tuserinfo getTuserinfo() {
		return tuserinfo;
	}

	public void setTuserinfo(Tuserinfo tuserinfo) {
		this.tuserinfo = tuserinfo;
	}

	@Override
	public String toString() {
		return "Ttip [temail=" + temail + ", tid=" + tid + ", tnorice="
				+ tnorice + ", tshow=" + tshow + ", ttime=" + ttime + "]";
	}

	public Ttip() {
		super();
	}

}