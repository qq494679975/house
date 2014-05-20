package com.softxm.hs.model;
/**
 * 总的家庭信息的模板
 * @author DA
 *
 */

public class FamilyTemp {
	private String uiusername;//账号
	private String uiphone;//联系电话
	private String dname;//家庭类型
	private Double money;//家庭收入
	private Long uiid;
	private java.util.Date uitime;
	public java.util.Date getUitime() {
		return uitime;
	}
	public void setUitime(java.util.Date uitime) {
		this.uitime = uitime;
	}
	public Long getUiid() {
		return uiid;
	}
	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}
	public String getUiusername() {
		return uiusername;
	}
	public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}
	public String getUiphone() {
		return uiphone;
	}
	public void setUiphone(String uiphone) {
		this.uiphone = uiphone;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "FamilyTemp [dname=" + dname + ", money=" + money + ", uiphone="
				+ uiphone + ", uiusername=" + uiusername + "]";
	}
	
}
