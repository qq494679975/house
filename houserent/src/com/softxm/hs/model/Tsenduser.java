package com.softxm.hs.model;

import java.util.Date;


/**
 * Tsenduser entity. @author MyEclipse Persistence Tools
 */

public class Tsenduser  implements java.io.Serializable {


    // Fields    

     private Long suid;
     private Long uiid;
     private String suusername;

     private String uiusername;

	private String suphone;
	private String sumessage;


	private String sustatus;


	private Date sutime;
     private Date supasstime;
     private java.sql.Date starttime;
     private java.sql.Date endtime;
     /** default constructor */
    public Tsenduser() {
    }
     /** full constructor */
    public Tsenduser(String suusername, String suphone, String sumessage, String sustatus, Date sutime, Date supasstime) {
        this.suusername = suusername;
        this.suphone = suphone;
        this.sumessage = sumessage;
        this.sustatus = sustatus;
        this.sutime = sutime;
        this.supasstime = supasstime;
    }
     
     public java.sql.Date getEndtime() {
		return endtime;
	}


    // Constructors

    


	public java.sql.Date getStarttime() {
		return starttime;
	}

    
    public Long getSuid() {
        return this.suid;
    }


	public String getSumessage() {
        return this.sumessage;
    }


	public Date getSupasstime() {
        return this.supasstime;
    }


	public String getSuphone() {
        return this.suphone;
    }

   
    // Property accessors

    public String getSustatus() {
        return this.sustatus;
    }
    
    public Date getSutime() {
        return this.sutime;
    }

    public String getSuusername() {
        return this.suusername;
    }
    
    public Long getUiid() {
		return uiid;
	}

    public void setEndtime(java.sql.Date endtime) {
		this.endtime = endtime;
	}
    

    public String getUiusername() {
		return uiusername;
	}
	public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}
	public void setStarttime(java.sql.Date starttime) {
		this.starttime = starttime;
	}
    
    public void setSuid(Long suid) {
        this.suid = suid;
    }

    public void setSumessage(String sumessage) {
        this.sumessage = sumessage;
    }
    
    public void setSupasstime(Date supasstime) {
        this.supasstime = supasstime;
    }

    public void setSuphone(String suphone) {
        this.suphone = suphone;
    }

    public void setSustatus(String sustatus) {
        this.sustatus = sustatus;
    }
    
    public void setSutime(Date sutime) {
        this.sutime = sutime;
    }

    public void setSuusername(String suusername) {
        this.suusername = suusername;
    }
    
    public void setUiid(Long uiid) {
		this.uiid = uiid;
	}


	@Override
	public String toString() {
		return "Tsenduser [suid=" + suid + ", sumessage=" + sumessage
				+ ", supasstime=" + supasstime 
				+ ", suphone=" + suphone + ", sustatus=" + sustatus
				+ ", sutime=" + sutime + ", suusername=" + suusername + "]";
	}
   








}