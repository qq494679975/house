package com.softxm.hs.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Tnotice entity. @author MyEclipse Persistence Tools
 */

public class Tnotice  implements java.io.Serializable {


    // Fields    

     private Long nnoticeid;
     private Long uiid;//创建人
     private Long tuuiid;//审核人
     private String ntitle;
     private String ntext;
     private String ispass;
     private Date nrelestime;//创建时间
     private Date npasstime;//通过时间
     private java.sql.Date nouttime;//有效期
     private String nistop;
     private String nhasattach;
     private Set tnoticeattachs = new HashSet(0);
     //个人公告
     private java.sql.Date starttime;
     private java.sql.Date endtime;
     private String idread;
     private String uiusername;

    // Constructors

    public String getIdread() {
		return idread;
	}


	public void setIdread(String idread) {
		this.idread = idread;
	}


	public String getUiusername() {
		return uiusername;
	}


	public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}


	public java.sql.Date getStarttime() {
		return starttime;
	}


	public void setStarttime(java.sql.Date starttime) {
		this.starttime = starttime;
	}


	public java.sql.Date getEndtime() {
		return endtime;
	}


	public void setEndtime(java.sql.Date endtime) {
		this.endtime = endtime;
	}


	/** default constructor */
    public Tnotice() {
    }


	public Long getNnoticeid() {
		return nnoticeid;
	}



	public Long getUiid() {
		return uiid;
	}


	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}


	public Long getTuuiid() {
		return tuuiid;
	}


	public void setTuuiid(Long tuuiid) {
		this.tuuiid = tuuiid;
	}


	public String getNtitle() {
		return ntitle;
	}


	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}


	public String getNtext() {
		return ntext;
	}


	public void setNtext(String ntext) {
		this.ntext = ntext;
	}


	public String getIspass() {
		return ispass;
	}


	public void setIspass(String ispass) {
		this.ispass = ispass;
	}


	public Date getNrelestime() {
		return nrelestime;
	}


	public void setNrelestime(Date nrelestime) {
		this.nrelestime = nrelestime;
	}


	public Date getNpasstime() {
		return npasstime;
	}


	public void setNpasstime(Date npasstime) {
		this.npasstime = npasstime;
	}


	public java.sql.Date getNouttime() {
		return nouttime;
	}


	public void setNouttime(java.sql.Date nouttime) {
		this.nouttime = nouttime;
	}


	public String getNistop() {
		return nistop;
	}


	public void setNistop(String nistop) {
		this.nistop = nistop;
	}


	public String getNhasattach() {
		return nhasattach;
	}


	public void setNhasattach(String nhasattach) {
		this.nhasattach = nhasattach;
	}


	public Set getTnoticeattachs() {
		return tnoticeattachs;
	}


	public void setTnoticeattachs(Set tnoticeattachs) {
		this.tnoticeattachs = tnoticeattachs;
	}


	public void setNnoticeid(Long nnoticeid) {
		this.nnoticeid = nnoticeid;
	}


	@Override
	public String toString() {
		return "Tnotice [ispass=" + ispass + ", nhasattach=" + nhasattach
				+ ", nistop=" + nistop + ", nnoticeid=" + nnoticeid
				+ ", nouttime=" + nouttime + ", npasstime=" + npasstime
				+ ", nrelestime=" + nrelestime + ", ntext=" + ntext
				+ ", ntitle=" + ntitle + ", tuuiid=" + tuuiid + ", uuid="
				+ uiid + "]";
	}
	
}