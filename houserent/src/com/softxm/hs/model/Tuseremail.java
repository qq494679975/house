package com.softxm.hs.model;



/**
 * Tuseremail entity. @author MyEclipse Persistence Tools
 */

public class Tuseremail  implements java.io.Serializable {


    // Fields    

     private Long umid;
     private Tuserinfo tuserinfo;
     private Temail temail;
     private String umaddress;
     private String umisread;


    // Constructors

    /** default constructor */
    public Tuseremail() {
    }

    
    /** full constructor */
    public Tuseremail(Tuserinfo tuserinfo, Temail temail, String umaddress, String umisread) {
        this.tuserinfo = tuserinfo;
        this.temail = temail;
        this.umaddress = umaddress;
        this.umisread = umisread;
    }

   
    // Property accessors

    public Long getUmid() {
        return this.umid;
    }
    
    public void setUmid(Long umid) {
        this.umid = umid;
    }

    public Tuserinfo getTuserinfo() {
        return this.tuserinfo;
    }
    
    public void setTuserinfo(Tuserinfo tuserinfo) {
        this.tuserinfo = tuserinfo;
    }

    public Temail getTemail() {
        return this.temail;
    }
    
    public void setTemail(Temail temail) {
        this.temail = temail;
    }

    public String getUmaddress() {
        return this.umaddress;
    }
    
    public void setUmaddress(String umaddress) {
        this.umaddress = umaddress;
    }

    public String getUmisread() {
        return this.umisread;
    }
    
    public void setUmisread(String umisread) {
        this.umisread = umisread;
    }
   








}