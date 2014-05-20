package com.softxm.hs.model;



/**
 * Tuserfamily entity. @author MyEclipse Persistence Tools
 */

public class Tuserfamily  implements java.io.Serializable {


    // Fields    

     private Long ufid;
     private Tuserinfo tuserinfo;
     private Long ufrole; //家庭角色
     private String dname;//家庭角色名字
  
	private Double ufmoney;//收入
     private String ufname;//名字
     private String ufjob;//工作
     private String ufphone;//电话
     private String ufidcard;//身份证
     //总的家庭信息列表参数
     private String uiusername;
     private String uifamilytype;
     private Long uiid;
    // Constructors


	public Long getUiid() {
		return uiid;
	}


	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}


	/** default constructor */
    public Tuserfamily() {
    }


	/** full constructor */
    public Tuserfamily(Tuserinfo tuserinfo, Long ufrole, Double ufmoney, String ufname, String ufjob, String ufphone) {
        this.tuserinfo = tuserinfo;
        this.ufrole = ufrole;
        this.ufmoney = ufmoney;
        this.ufname = ufname;
        this.ufjob = ufjob;
        this.ufphone = ufphone;
    }


	public String getDname() {
		return dname;
	}

	public Tuserinfo getTuserinfo() {
        return this.tuserinfo;
    }


	public Long getUfid() {
        return this.ufid;
    }


	public String getUfidcard() {
		return ufidcard;
	}


	public String getUfjob() {
        return this.ufjob;
    }

    
    public Double getUfmoney() {
        return this.ufmoney;
    }


	public String getUfname() {
        return this.ufname;
    }


	public String getUfphone() {
        return this.ufphone;
    }

   
    // Property accessors

    public Long getUfrole() {
        return this.ufrole;
    }
    
    public String getUifamilytype() {
		return uifamilytype;
	}

    public String getUiusername() {
		return uiusername;
	}
    
    public void setDname(String dname) {
		this.dname = dname;
	}

    public void setTuserinfo(Tuserinfo tuserinfo) {
        this.tuserinfo = tuserinfo;
    }
    
    public void setUfid(Long ufid) {
        this.ufid = ufid;
    }

    public void setUfidcard(String ufidcard) {
		this.ufidcard = ufidcard;
	}
    
    public void setUfjob(String ufjob) {
        this.ufjob = ufjob;
    }

    public void setUfmoney(Double ufmoney) {
        this.ufmoney = ufmoney;
    }
    
    public void setUfname(String ufname) {
        this.ufname = ufname;
    }

    public void setUfphone(String ufphone) {
        this.ufphone = ufphone;
    }
    
    public void setUfrole(Long ufrole) {
        this.ufrole = ufrole;
    }

    public void setUifamilytype(String uifamilytype) {
		this.uifamilytype = uifamilytype;
	}
    
    public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}
   
}