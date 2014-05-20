package com.softxm.hs.model;

import java.util.Date;


/**
 * Tcontract entity. @author MyEclipse Persistence Tools
 */

public class Tcontract  implements java.io.Serializable {


    // Fields    

     private Long cid;
     private Tuserinfo tuserinfo;
     private String cmessage;
     private Date cbegintime;
     private String cboss;
     private String cuser;
     private String contractyear;
     
     private Date starttime;
     private Date endtime;
     
     private String uiusername;


	public String getUiusername() {
		return uiusername;
	}


	public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}


	/** default constructor */
    public Tcontract() {
    }


	public Date getCbegintime() {
        return this.cbegintime;
    }


	public String getCboss() {
        return this.cboss;
    }

	public Long getCid() {
        return this.cid;
    }

    // Constructors

    public String getCmessage() {
        return this.cmessage;
    }


	public String getContractyear() {
		return contractyear;
	}


	public String getCuser() {
        return this.cuser;
    }

  
   
    // Property accessors

    public Date getEndtime() {
		return endtime;
	}
    
    public Date getStarttime() {
		return starttime;
	}

    public Tuserinfo getTuserinfo() {
        return this.tuserinfo;
    }
    
    public void setCbegintime(Date cbegintime) {
        this.cbegintime = cbegintime;
    }

  

    public void setCboss(String cboss) {
        this.cboss = cboss;
    }
    
    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setCmessage(String cmessage) {
        this.cmessage = cmessage;
    }
    
    public void setContractyear(String contractyear) {
		this.contractyear = contractyear;
	}

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }
    
    public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

    public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
    
    public void setTuserinfo(Tuserinfo tuserinfo) {
        this.tuserinfo = tuserinfo;
    }
   








}