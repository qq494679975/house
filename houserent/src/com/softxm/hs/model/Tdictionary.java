package com.softxm.hs.model;



/**
 * Tdictionary entity. @author MyEclipse Persistence Tools
 */

public class Tdictionary  implements java.io.Serializable {


    // Fields    

     private Long ddid;
     private String dname;
     private Long dfatherid;
     private String ddel;


    // Constructors

    public String getDdel() {
		return ddel;
	}


	public void setDdel(String ddel) {
		this.ddel = ddel;
	}


	/** default constructor */
    public Tdictionary() {
    }

    
    /** full constructor */
    public Tdictionary(String dname, Long dfatherid) {
        this.dname = dname;
        this.dfatherid = dfatherid;
    }

   
    // Property accessors



    public String getDname() {
        return this.dname;
    }
    
    public Long getDdid() {
		return ddid;
	}


	public void setDdid(Long ddid) {
		this.ddid = ddid;
	}


	public void setDname(String dname) {
        this.dname = dname;
    }

    public Long getDfatherid() {
        return this.dfatherid;
    }
    
    public void setDfatherid(Long dfatherid) {
        this.dfatherid = dfatherid;
    }
   








}