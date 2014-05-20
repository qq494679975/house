package com.softxm.hs.model;



/**
 * Temailattach entity. @author MyEclipse Persistence Tools
 */

public class Temailattach  implements java.io.Serializable {


    // Fields    

     private Long eaid;
     private Temail temail;
     private String eaname;
     private String eaurl;


    // Constructors

    /** default constructor */
    public Temailattach() {
    }

    
    /** full constructor */
    public Temailattach(Temail temail, String eaname, String eaurl) {
        this.temail = temail;
        this.eaname = eaname;
        this.eaurl = eaurl;
    }

   
    // Property accessors

    public Long getEaid() {
        return this.eaid;
    }
    
    public void setEaid(Long eaid) {
        this.eaid = eaid;
    }

    public Temail getTemail() {
        return this.temail;
    }
    
    public void setTemail(Temail temail) {
        this.temail = temail;
    }

    public String getEaname() {
        return this.eaname;
    }
    
    public void setEaname(String eaname) {
        this.eaname = eaname;
    }

    public String getEaurl() {
        return this.eaurl;
    }
    
    public void setEaurl(String eaurl) {
        this.eaurl = eaurl;
    }
   








}