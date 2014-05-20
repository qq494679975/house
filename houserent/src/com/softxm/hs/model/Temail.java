package com.softxm.hs.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Temail entity. @author MyEclipse Persistence Tools
 */

public class Temail  implements java.io.Serializable {


    // Fields    

     private Long eid;
     private String etitle;
     private String emessage;
     private Date etime;
     private String ehasattach;
     private String efromuser;
     private String etouser;
     private Set temailattachs = new HashSet(0);
     private Set tuseremails = new HashSet(0);
     private Long umid;//状态id


    // Constructors



	public Long getUmid() {
		return umid;
	}


	public void setUmid(Long umid) {
		this.umid = umid;
	}


	/** default constructor */
    public Temail() {
    }

    
    /** full constructor */
    public Temail(String etitle, String emessage, Date etime, String ehasattach, String efromuser, String etouser, Set temailattachs, Set tuseremails) {
        this.etitle = etitle;
        this.emessage = emessage;
        this.etime = etime;
        this.ehasattach = ehasattach;
        this.efromuser = efromuser;
        this.etouser = etouser;
        this.temailattachs = temailattachs;
        this.tuseremails = tuseremails;
    }

   
    // Property accessors

    public Long getEid() {
        return this.eid;
    }
    
    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getEtitle() {
        return this.etitle;
    }
    
    public void setEtitle(String etitle) {
        this.etitle = etitle;
    }

    public String getEmessage() {
        return this.emessage;
    }
    
    public void setEmessage(String emessage) {
        this.emessage = emessage;
    }

    public Date getEtime() {
        return this.etime;
    }
    
    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public String getEhasattach() {
        return this.ehasattach;
    }
    
    public void setEhasattach(String ehasattach) {
        this.ehasattach = ehasattach;
    }

    public String getEfromuser() {
        return this.efromuser;
    }
    
    public void setEfromuser(String efromuser) {
        this.efromuser = efromuser;
    }

    public String getEtouser() {
        return this.etouser;
    }
    
    public void setEtouser(String etouser) {
        this.etouser = etouser;
    }

    public Set getTemailattachs() {
        return this.temailattachs;
    }
    
    public void setTemailattachs(Set temailattachs) {
        this.temailattachs = temailattachs;
    }

    public Set getTuseremails() {
        return this.tuseremails;
    }
    
    public void setTuseremails(Set tuseremails) {
        this.tuseremails = tuseremails;
    }
   








}