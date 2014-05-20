package com.softxm.hs.model;

public class EMailUser {
	private Long uiid;
	private String dname;
	private String uiusername;
	private Long did;
	public Long getUiid() {
		return uiid;
	}
	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getUiusername() {
		return uiusername;
	}
	public void setUiusername(String uiusername) {
		this.uiusername = uiusername;
	}
	public Long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "EMailUser [did=" + did + ", dname=" + dname + ", uiid=" + uiid
				+ ", uiusername=" + uiusername + "]";
	}

}
