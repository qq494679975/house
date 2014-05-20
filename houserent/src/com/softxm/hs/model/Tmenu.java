package com.softxm.hs.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Tmenu entity. @author MyEclipse Persistence Tools
 */

public class Tmenu  implements java.io.Serializable {


    // Fields    
	
     private Long mid;
     private String mname;
     private String murl;
     private Long morder;
     private Long mfatherid;
     private String misdel;
     private Set troles = new HashSet(0);


    // Constructors

    /** default constructor */
    public Tmenu() {
    }

    
    /** full constructor */
    public Tmenu(String mname, String murl, Long morder, Long mfatherid, String misdel, Set troles) {
        this.mname = mname;
        this.murl = murl;
        this.morder = morder;
        this.mfatherid = mfatherid;
        this.misdel = misdel;
        this.troles = troles;
    }

   
    // Property accessors

    public Long getMid() {
        return this.mid;
    }
    
    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMname() {
        return this.mname;
    }
    
    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMurl() {
        return this.murl;
    }
    
    public void setMurl(String murl) {
        this.murl = murl;
    }

    public Long getMorder() {
        return this.morder;
    }
    
    public void setMorder(Long morder) {
        this.morder = morder;
    }

    public Long getMfatherid() {
        return this.mfatherid;
    }
    
    public void setMfatherid(Long mfatherid) {
        this.mfatherid = mfatherid;
    }

    public String getMisdel() {
        return this.misdel;
    }
    
    public void setMisdel(String misdel) {
        this.misdel = misdel;
    }

    public Set getTroles() {
        return this.troles;
    }
    
    public void setTroles(Set troles) {
        this.troles = troles;
    }


	@Override
	public String toString() {
		return "Tmenu [mfatherid=" + mfatherid + ", mid=" + mid + ", misdel="
				+ misdel + ", mname=" + mname + ", morder=" + morder
				+ ", murl=" + murl + "]";
	}
   
}