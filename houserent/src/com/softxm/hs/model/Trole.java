package com.softxm.hs.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Trole entity. @author MyEclipse Persistence Tools
 */

public class Trole  implements java.io.Serializable {


    // Fields    

     private Long rid;
     private String rname;
     private String rdetail;
     private String risdel;
     private Set tuserinfos = new HashSet(0);
     private Set tmenus = new HashSet(0);
     private List<Long> roles = new ArrayList();


    // Constructors

    public List<Long> getRoles() {
		return roles;
	}


	public void setRoles(List<Long> roles) {
		this.roles = roles;
	}


	/** default constructor */
    public Trole() {
    }

    
    /** full constructor */
    public Trole(String rname, String rdetail, String risdel, Set tuserinfos, Set tmenus) {
        this.rname = rname;
        this.rdetail = rdetail;
        this.risdel = risdel;
        this.tuserinfos = tuserinfos;
        this.tmenus = tmenus;
    }

   
    // Property accessors

    public Long getRid() {
        return this.rid;
    }
    
    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRname() {
        return this.rname;
    }
    
    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdetail() {
        return this.rdetail;
    }
    
    public void setRdetail(String rdetail) {
        this.rdetail = rdetail;
    }

    public String getRisdel() {
        return this.risdel;
    }
    
    public void setRisdel(String risdel) {
        this.risdel = risdel;
    }

    public Set getTuserinfos() {
        return this.tuserinfos;
    }
    
    public void setTuserinfos(Set tuserinfos) {
        this.tuserinfos = tuserinfos;
    }

    public Set getTmenus() {
        return this.tmenus;
    }
    
    public void setTmenus(Set tmenus) {
        this.tmenus = tmenus;
    }


	@Override
	public String toString() {
		return "Trole [rdetail=" + rdetail + ", rid=" + rid + ", risdel="
				+ risdel + ", rname=" + rname + ", tmenus=" + tmenus
				+ ", tuserinfos=" + tuserinfos + "]";
	}


}