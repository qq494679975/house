package com.softxm.hs.model;



/**
 * Tnoticeattach entity. @author MyEclipse Persistence Tools
 */

public class Tnoticeattach  implements java.io.Serializable {


    // Fields    

     private Long naattachid;
     private Tnotice tnotice;
     private String naname;
     private String naurl;
     private Long nnoticeid;


    // Constructors

    public Long getNnoticeid() {
		return nnoticeid;
	}


	public void setNnoticeid(Long nnoticeid) {
		this.nnoticeid = nnoticeid;
	}


	/** default constructor */
    public Tnoticeattach() {
    }

    
    /** full constructor */
    public Tnoticeattach(Tnotice tnotice, String naname, String naurl) {
        this.tnotice = tnotice;
        this.naname = naname;
        this.naurl = naurl;
    }

   
    // Property accessors

    public Long getNaattachid() {
        return this.naattachid;
    }
    
    public void setNaattachid(Long naattachid) {
        this.naattachid = naattachid;
    }

    public Tnotice getTnotice() {
        return this.tnotice;
    }
    
    public void setTnotice(Tnotice tnotice) {
        this.tnotice = tnotice;
    }

    public String getNaname() {
        return this.naname;
    }
    
    public void setNaname(String naname) {
        this.naname = naname;
    }

    public String getNaurl() {
        return this.naurl;
    }
    
    public void setNaurl(String naurl) {
        this.naurl = naurl;
    }
   








}